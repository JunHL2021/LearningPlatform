package com.controller;

import com.annotation.IgnoreAuth;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.entity.AboutusEntity;
import com.entity.view.AboutusView;
import com.service.AboutusService;
import com.utils.MPUtil;
import com.utils.PageUtils;
import com.utils.R;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 关于我们
 * 后端接口
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:45
 */
@RestController
@RequestMapping("/aboutus")
public class AboutusController {
    @Autowired
    private AboutusService aboutusService;


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, AboutusEntity aboutus,
                  HttpServletRequest request) {
        EntityWrapper<AboutusEntity> ew = new EntityWrapper<AboutusEntity>();

        PageUtils page = aboutusService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, aboutus), params), params));

        return R.ok().put("data", page);
    }

    /**
     * 前端列表
     */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, AboutusEntity aboutus,
                  HttpServletRequest request) {
        EntityWrapper<AboutusEntity> ew = new EntityWrapper<AboutusEntity>();

        PageUtils page = aboutusService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, aboutus), params), params));
        return R.ok().put("data", page);
    }


    /**
     * 列表
     */
    @RequestMapping("/lists")
    public R list(AboutusEntity aboutus) {
        EntityWrapper<AboutusEntity> ew = new EntityWrapper<AboutusEntity>();
        ew.allEq(MPUtil.allEQMapPre(aboutus, "aboutus"));
        return R.ok().put("data", aboutusService.selectListView(ew));
    }

    /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(AboutusEntity aboutus) {
        EntityWrapper<AboutusEntity> ew = new EntityWrapper<AboutusEntity>();
        ew.allEq(MPUtil.allEQMapPre(aboutus, "aboutus"));
        AboutusView aboutusView = aboutusService.selectView(ew);
        return R.ok("查询关于我们成功").put("data", aboutusView);
    }

    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        AboutusEntity aboutus = aboutusService.selectById(id);
        return R.ok().put("data", aboutus);
    }

    /**
     * 前端详情
     */
    @IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id) {
        AboutusEntity aboutus = aboutusService.selectById(id);
        return R.ok().put("data", aboutus);
    }


    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody AboutusEntity aboutus, HttpServletRequest request) {
        //ValidatorUtils.validateEntity(aboutus);
        aboutusService.insert(aboutus);
        return R.ok();
    }

    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody AboutusEntity aboutus, HttpServletRequest request) {
        //ValidatorUtils.validateEntity(aboutus);
        aboutusService.insert(aboutus);
        return R.ok();
    }


    /**
     * 获取用户密保
     */
    @RequestMapping("/security")
    @IgnoreAuth
    public R security(@RequestParam String username) {
        AboutusEntity aboutus = aboutusService.selectOne(new EntityWrapper<AboutusEntity>().eq("", username));
        return R.ok().put("data", aboutus);
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @IgnoreAuth
    public R update(@RequestBody AboutusEntity aboutus, HttpServletRequest request) {
        //ValidatorUtils.validateEntity(aboutus);
        aboutusService.updateById(aboutus);//全部更新
        return R.ok();
    }


    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        aboutusService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 前端智能排序
     */
    @IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params, AboutusEntity aboutus, HttpServletRequest request, String pre) {
        EntityWrapper<AboutusEntity> ew = new EntityWrapper<AboutusEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
        Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> entry = it.next();
            String key = entry.getKey();
            String newKey = entry.getKey();
            if (pre.endsWith(".")) {
                newMap.put(pre + newKey, entry.getValue());
            } else if (StringUtils.isEmpty(pre)) {
                newMap.put(newKey, entry.getValue());
            } else {
                newMap.put(pre + "." + newKey, entry.getValue());
            }
        }
        params.put("sort", "clicktime");
        params.put("order", "desc");
        PageUtils page = aboutusService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, aboutus), params), params));
        return R.ok().put("data", page);
    }


}
