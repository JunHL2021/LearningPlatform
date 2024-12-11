package com.controller;

import com.annotation.IgnoreAuth;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.entity.ZiyuanleixingEntity;
import com.entity.view.ZiyuanleixingView;
import com.service.ZiyuanleixingService;
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
 * 资源类型
 * 后端接口
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:43
 */
@RestController
@RequestMapping("/ziyuanleixing")
public class ZiyuanleixingController {
    @Autowired
    private ZiyuanleixingService ziyuanleixingService;


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, ZiyuanleixingEntity ziyuanleixing,
                  HttpServletRequest request) {
        EntityWrapper<ZiyuanleixingEntity> ew = new EntityWrapper<ZiyuanleixingEntity>();

        PageUtils page = ziyuanleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ziyuanleixing), params), params));

        return R.ok().put("data", page);
    }

    /**
     * 前端列表
     */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, ZiyuanleixingEntity ziyuanleixing,
                  HttpServletRequest request) {
        EntityWrapper<ZiyuanleixingEntity> ew = new EntityWrapper<ZiyuanleixingEntity>();

        PageUtils page = ziyuanleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ziyuanleixing), params), params));
        return R.ok().put("data", page);
    }


    /**
     * 列表
     */
    @RequestMapping("/lists")
    public R list(ZiyuanleixingEntity ziyuanleixing) {
        EntityWrapper<ZiyuanleixingEntity> ew = new EntityWrapper<ZiyuanleixingEntity>();
        ew.allEq(MPUtil.allEQMapPre(ziyuanleixing, "ziyuanleixing"));
        return R.ok().put("data", ziyuanleixingService.selectListView(ew));
    }

    /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZiyuanleixingEntity ziyuanleixing) {
        EntityWrapper<ZiyuanleixingEntity> ew = new EntityWrapper<ZiyuanleixingEntity>();
        ew.allEq(MPUtil.allEQMapPre(ziyuanleixing, "ziyuanleixing"));
        ZiyuanleixingView ziyuanleixingView = ziyuanleixingService.selectView(ew);
        return R.ok("查询资源类型成功").put("data", ziyuanleixingView);
    }

    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        ZiyuanleixingEntity ziyuanleixing = ziyuanleixingService.selectById(id);
        return R.ok().put("data", ziyuanleixing);
    }

    /**
     * 前端详情
     */
    @IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id) {
        ZiyuanleixingEntity ziyuanleixing = ziyuanleixingService.selectById(id);
        return R.ok().put("data", ziyuanleixing);
    }


    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZiyuanleixingEntity ziyuanleixing, HttpServletRequest request) {
        //ValidatorUtils.validateEntity(ziyuanleixing);
        ziyuanleixingService.insert(ziyuanleixing);
        return R.ok();
    }

    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZiyuanleixingEntity ziyuanleixing, HttpServletRequest request) {
        //ValidatorUtils.validateEntity(ziyuanleixing);
        ziyuanleixingService.insert(ziyuanleixing);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZiyuanleixingEntity ziyuanleixing, HttpServletRequest request) {
        //ValidatorUtils.validateEntity(ziyuanleixing);
        ziyuanleixingService.updateById(ziyuanleixing);//全部更新
        return R.ok();
    }


    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        ziyuanleixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


}
