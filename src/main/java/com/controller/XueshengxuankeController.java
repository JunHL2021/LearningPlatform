package com.controller;

import com.annotation.IgnoreAuth;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.entity.XueshengxuankeEntity;
import com.entity.view.XueshengxuankeView;
import com.service.XueshengxuankeService;
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
 * 学生选课
 * 后端接口
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:44
 */
@RestController
@RequestMapping("/xueshengxuanke")
public class XueshengxuankeController {
    @Autowired
    private XueshengxuankeService xueshengxuankeService;


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, XueshengxuankeEntity xueshengxuanke,
                  HttpServletRequest request) {
        String tableName = request.getSession().getAttribute("tableName").toString();
        if (tableName.equals("jiaoshi")) {
            xueshengxuanke.setJiaoshigonghao((String) request.getSession().getAttribute("username"));
        }
        if (tableName.equals("xuesheng")) {
            xueshengxuanke.setXueshengzhanghao((String) request.getSession().getAttribute("username"));
        }
        EntityWrapper<XueshengxuankeEntity> ew = new EntityWrapper<XueshengxuankeEntity>();

        PageUtils page = xueshengxuankeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshengxuanke), params), params));

        return R.ok().put("data", page);
    }

    /**
     * 前端列表
     */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, XueshengxuankeEntity xueshengxuanke,
                  HttpServletRequest request) {
        EntityWrapper<XueshengxuankeEntity> ew = new EntityWrapper<XueshengxuankeEntity>();

        PageUtils page = xueshengxuankeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshengxuanke), params), params));
        return R.ok().put("data", page);
    }


    /**
     * 列表
     */
    @RequestMapping("/lists")
    public R list(XueshengxuankeEntity xueshengxuanke) {
        EntityWrapper<XueshengxuankeEntity> ew = new EntityWrapper<XueshengxuankeEntity>();
        ew.allEq(MPUtil.allEQMapPre(xueshengxuanke, "xueshengxuanke"));
        return R.ok().put("data", xueshengxuankeService.selectListView(ew));
    }

    /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XueshengxuankeEntity xueshengxuanke) {
        EntityWrapper<XueshengxuankeEntity> ew = new EntityWrapper<XueshengxuankeEntity>();
        ew.allEq(MPUtil.allEQMapPre(xueshengxuanke, "xueshengxuanke"));
        XueshengxuankeView xueshengxuankeView = xueshengxuankeService.selectView(ew);
        return R.ok("查询学生选课成功").put("data", xueshengxuankeView);
    }

    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        XueshengxuankeEntity xueshengxuanke = xueshengxuankeService.selectById(id);
        return R.ok().put("data", xueshengxuanke);
    }

    /**
     * 前端详情
     */
    @IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id) {
        XueshengxuankeEntity xueshengxuanke = xueshengxuankeService.selectById(id);
        return R.ok().put("data", xueshengxuanke);
    }


    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XueshengxuankeEntity xueshengxuanke, HttpServletRequest request) {
        //ValidatorUtils.validateEntity(xueshengxuanke);
        xueshengxuankeService.insert(xueshengxuanke);
        return R.ok();
    }

    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XueshengxuankeEntity xueshengxuanke, HttpServletRequest request) {
        //ValidatorUtils.validateEntity(xueshengxuanke);
        xueshengxuankeService.insert(xueshengxuanke);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XueshengxuankeEntity xueshengxuanke, HttpServletRequest request) {
        //ValidatorUtils.validateEntity(xueshengxuanke);
        xueshengxuankeService.updateById(xueshengxuanke);//全部更新
        return R.ok();
    }


    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        xueshengxuankeService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


}
