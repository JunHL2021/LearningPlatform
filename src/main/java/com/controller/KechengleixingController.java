package com.controller;

import com.annotation.IgnoreAuth;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.entity.KechengleixingEntity;
import com.entity.view.KechengleixingView;
import com.service.KechengleixingService;
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
 * 课程类型
 * 后端接口
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:44
 */
@RestController
@RequestMapping("/kechengleixing")
public class KechengleixingController {
    @Autowired
    private KechengleixingService kechengleixingService;


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, KechengleixingEntity kechengleixing,
                  HttpServletRequest request) {
        EntityWrapper<KechengleixingEntity> ew = new EntityWrapper<KechengleixingEntity>();

        PageUtils page = kechengleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kechengleixing), params), params));

        return R.ok().put("data", page);
    }

    /**
     * 前端列表
     */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, KechengleixingEntity kechengleixing,
                  HttpServletRequest request) {
        EntityWrapper<KechengleixingEntity> ew = new EntityWrapper<KechengleixingEntity>();

        PageUtils page = kechengleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kechengleixing), params), params));
        return R.ok().put("data", page);
    }


    /**
     * 列表
     */
    @RequestMapping("/lists")
    public R list(KechengleixingEntity kechengleixing) {
        EntityWrapper<KechengleixingEntity> ew = new EntityWrapper<KechengleixingEntity>();
        ew.allEq(MPUtil.allEQMapPre(kechengleixing, "kechengleixing"));
        return R.ok().put("data", kechengleixingService.selectListView(ew));
    }

    /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KechengleixingEntity kechengleixing) {
        EntityWrapper<KechengleixingEntity> ew = new EntityWrapper<KechengleixingEntity>();
        ew.allEq(MPUtil.allEQMapPre(kechengleixing, "kechengleixing"));
        KechengleixingView kechengleixingView = kechengleixingService.selectView(ew);
        return R.ok("查询课程类型成功").put("data", kechengleixingView);
    }

    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        KechengleixingEntity kechengleixing = kechengleixingService.selectById(id);
        return R.ok().put("data", kechengleixing);
    }

    /**
     * 前端详情
     */
    @IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id) {
        KechengleixingEntity kechengleixing = kechengleixingService.selectById(id);
        return R.ok().put("data", kechengleixing);
    }


    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KechengleixingEntity kechengleixing, HttpServletRequest request) {
        //ValidatorUtils.validateEntity(kechengleixing);
        kechengleixingService.insert(kechengleixing);
        return R.ok();
    }

    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KechengleixingEntity kechengleixing, HttpServletRequest request) {
        //ValidatorUtils.validateEntity(kechengleixing);
        kechengleixingService.insert(kechengleixing);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody KechengleixingEntity kechengleixing, HttpServletRequest request) {
        //ValidatorUtils.validateEntity(kechengleixing);
        kechengleixingService.updateById(kechengleixing);//全部更新
        return R.ok();
    }


    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        kechengleixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


}
