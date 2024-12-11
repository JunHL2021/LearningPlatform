package com.controller;

import com.annotation.IgnoreAuth;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.entity.ZuoyepingfenEntity;
import com.entity.view.ZuoyepingfenView;
import com.service.ZuoyepingfenService;
import com.utils.MPUtil;
import com.utils.PageUtils;
import com.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Map;

/**
 * 作业评分
 * 后端接口
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:44
 */
@RestController
@RequestMapping("/zuoyepingfen")
public class ZuoyepingfenController {
    @Autowired
    private ZuoyepingfenService zuoyepingfenService;


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, ZuoyepingfenEntity zuoyepingfen,
                  HttpServletRequest request) {
        String tableName = request.getSession().getAttribute("tableName").toString();
        if (tableName.equals("jiaoshi")) {
            zuoyepingfen.setJiaoshigonghao((String) request.getSession().getAttribute("username"));
        }
        if (tableName.equals("xuesheng")) {
            zuoyepingfen.setXueshengzhanghao((String) request.getSession().getAttribute("username"));
        }
        EntityWrapper<ZuoyepingfenEntity> ew = new EntityWrapper<ZuoyepingfenEntity>();

        PageUtils page = zuoyepingfenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zuoyepingfen), params), params));

        return R.ok().put("data", page);
    }

    /**
     * 前端列表
     */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, ZuoyepingfenEntity zuoyepingfen,
                  HttpServletRequest request) {
        EntityWrapper<ZuoyepingfenEntity> ew = new EntityWrapper<ZuoyepingfenEntity>();

        PageUtils page = zuoyepingfenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zuoyepingfen), params), params));
        return R.ok().put("data", page);
    }


    /**
     * 列表
     */
    @RequestMapping("/lists")
    public R list(ZuoyepingfenEntity zuoyepingfen) {
        EntityWrapper<ZuoyepingfenEntity> ew = new EntityWrapper<ZuoyepingfenEntity>();
        ew.allEq(MPUtil.allEQMapPre(zuoyepingfen, "zuoyepingfen"));
        return R.ok().put("data", zuoyepingfenService.selectListView(ew));
    }

    /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZuoyepingfenEntity zuoyepingfen) {
        EntityWrapper<ZuoyepingfenEntity> ew = new EntityWrapper<ZuoyepingfenEntity>();
        ew.allEq(MPUtil.allEQMapPre(zuoyepingfen, "zuoyepingfen"));
        ZuoyepingfenView zuoyepingfenView = zuoyepingfenService.selectView(ew);
        return R.ok("查询作业评分成功").put("data", zuoyepingfenView);
    }

    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        ZuoyepingfenEntity zuoyepingfen = zuoyepingfenService.selectById(id);
        return R.ok().put("data", zuoyepingfen);
    }

    /**
     * 前端详情
     */
    @IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id) {
        ZuoyepingfenEntity zuoyepingfen = zuoyepingfenService.selectById(id);
        return R.ok().put("data", zuoyepingfen);
    }


    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZuoyepingfenEntity zuoyepingfen, HttpServletRequest request) {
        //ValidatorUtils.validateEntity(zuoyepingfen);
        zuoyepingfenService.insert(zuoyepingfen);
        return R.ok();
    }

    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZuoyepingfenEntity zuoyepingfen, HttpServletRequest request) {
        //ValidatorUtils.validateEntity(zuoyepingfen);
        zuoyepingfenService.insert(zuoyepingfen);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZuoyepingfenEntity zuoyepingfen, HttpServletRequest request) {
        //ValidatorUtils.validateEntity(zuoyepingfen);
        zuoyepingfenService.updateById(zuoyepingfen);//全部更新
        return R.ok();
    }


    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        zuoyepingfenService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


}
