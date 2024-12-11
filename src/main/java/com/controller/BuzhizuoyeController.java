package com.controller;

import com.annotation.IgnoreAuth;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.entity.BuzhizuoyeEntity;
import com.entity.view.BuzhizuoyeView;
import com.service.BuzhizuoyeService;
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
 * 布置作业
 * 后端接口
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:44
 */
@RestController
@RequestMapping("/buzhizuoye")
public class BuzhizuoyeController {
    @Autowired
    private BuzhizuoyeService buzhizuoyeService;


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, BuzhizuoyeEntity buzhizuoye,
                  HttpServletRequest request) {
        String tableName = request.getSession().getAttribute("tableName").toString();
        if (tableName.equals("jiaoshi")) {
            buzhizuoye.setJiaoshigonghao((String) request.getSession().getAttribute("username"));
        }
        if (tableName.equals("xuesheng")) {
            buzhizuoye.setXueshengzhanghao((String) request.getSession().getAttribute("username"));
        }
        EntityWrapper<BuzhizuoyeEntity> ew = new EntityWrapper<BuzhizuoyeEntity>();

        PageUtils page = buzhizuoyeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, buzhizuoye), params), params));

        return R.ok().put("data", page);
    }

    /**
     * 前端列表
     */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, BuzhizuoyeEntity buzhizuoye,
                  HttpServletRequest request) {
        EntityWrapper<BuzhizuoyeEntity> ew = new EntityWrapper<BuzhizuoyeEntity>();

        PageUtils page = buzhizuoyeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, buzhizuoye), params), params));
        return R.ok().put("data", page);
    }


    /**
     * 列表
     */
    @RequestMapping("/lists")
    public R list(BuzhizuoyeEntity buzhizuoye) {
        EntityWrapper<BuzhizuoyeEntity> ew = new EntityWrapper<BuzhizuoyeEntity>();
        ew.allEq(MPUtil.allEQMapPre(buzhizuoye, "buzhizuoye"));
        return R.ok().put("data", buzhizuoyeService.selectListView(ew));
    }

    /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BuzhizuoyeEntity buzhizuoye) {
        EntityWrapper<BuzhizuoyeEntity> ew = new EntityWrapper<BuzhizuoyeEntity>();
        ew.allEq(MPUtil.allEQMapPre(buzhizuoye, "buzhizuoye"));
        BuzhizuoyeView buzhizuoyeView = buzhizuoyeService.selectView(ew);
        return R.ok("查询布置作业成功").put("data", buzhizuoyeView);
    }

    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        BuzhizuoyeEntity buzhizuoye = buzhizuoyeService.selectById(id);
        return R.ok().put("data", buzhizuoye);
    }

    /**
     * 前端详情
     */
    @IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id) {
        BuzhizuoyeEntity buzhizuoye = buzhizuoyeService.selectById(id);
        return R.ok().put("data", buzhizuoye);
    }


    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BuzhizuoyeEntity buzhizuoye, HttpServletRequest request) {
        //ValidatorUtils.validateEntity(buzhizuoye);
        buzhizuoyeService.insert(buzhizuoye);
        return R.ok();
    }

    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BuzhizuoyeEntity buzhizuoye, HttpServletRequest request) {
        //ValidatorUtils.validateEntity(buzhizuoye);
        buzhizuoyeService.insert(buzhizuoye);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody BuzhizuoyeEntity buzhizuoye, HttpServletRequest request) {
        //ValidatorUtils.validateEntity(buzhizuoye);
        buzhizuoyeService.updateById(buzhizuoye);//全部更新
        return R.ok();
    }


    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        buzhizuoyeService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


}
