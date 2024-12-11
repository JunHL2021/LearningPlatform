package com.controller;

import com.annotation.IgnoreAuth;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.entity.KechengziyuanEntity;
import com.entity.view.KechengziyuanView;
import com.service.KechengziyuanService;
import com.service.StoreupService;
import com.utils.MPUtil;
import com.utils.PageUtils;
import com.utils.R;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * 课程资源
 * 后端接口
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:44
 */
@RestController
@RequestMapping("/kechengziyuan")
public class KechengziyuanController {
    @Autowired
    private KechengziyuanService kechengziyuanService;

    @Autowired
    private StoreupService storeupService;


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, KechengziyuanEntity kechengziyuan,
                  HttpServletRequest request) {
        String tableName = request.getSession().getAttribute("tableName").toString();
        if (tableName.equals("jiaoshi")) {
            kechengziyuan.setJiaoshigonghao((String) request.getSession().getAttribute("username"));
        }
        EntityWrapper<KechengziyuanEntity> ew = new EntityWrapper<KechengziyuanEntity>();

        PageUtils page = kechengziyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kechengziyuan), params), params));

        return R.ok().put("data", page);
    }

    /**
     * 前端列表
     */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, KechengziyuanEntity kechengziyuan,
                  HttpServletRequest request) {
        EntityWrapper<KechengziyuanEntity> ew = new EntityWrapper<KechengziyuanEntity>();

        PageUtils page = kechengziyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kechengziyuan), params), params));
        return R.ok().put("data", page);
    }


    /**
     * 列表
     */
    @RequestMapping("/lists")
    public R list(KechengziyuanEntity kechengziyuan) {
        EntityWrapper<KechengziyuanEntity> ew = new EntityWrapper<KechengziyuanEntity>();
        ew.allEq(MPUtil.allEQMapPre(kechengziyuan, "kechengziyuan"));
        return R.ok().put("data", kechengziyuanService.selectListView(ew));
    }

    /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KechengziyuanEntity kechengziyuan) {
        EntityWrapper<KechengziyuanEntity> ew = new EntityWrapper<KechengziyuanEntity>();
        ew.allEq(MPUtil.allEQMapPre(kechengziyuan, "kechengziyuan"));
        KechengziyuanView kechengziyuanView = kechengziyuanService.selectView(ew);
        return R.ok("查询课程资源成功").put("data", kechengziyuanView);
    }

    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        KechengziyuanEntity kechengziyuan = kechengziyuanService.selectById(id);
        kechengziyuan.setClicknum(kechengziyuan.getClicknum() + 1);
        kechengziyuan.setClicktime(new Date());
        kechengziyuanService.updateById(kechengziyuan);
        kechengziyuan = kechengziyuanService.selectView(new EntityWrapper<KechengziyuanEntity>().eq("id", id));
        return R.ok().put("data", kechengziyuan);
    }

    /**
     * 前端详情
     */
    @IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id) {
        KechengziyuanEntity kechengziyuan = kechengziyuanService.selectById(id);
        kechengziyuan.setClicknum(kechengziyuan.getClicknum() + 1);
        kechengziyuan.setClicktime(new Date());
        kechengziyuanService.updateById(kechengziyuan);
        kechengziyuan = kechengziyuanService.selectView(new EntityWrapper<KechengziyuanEntity>().eq("id", id));
        return R.ok().put("data", kechengziyuan);
    }


    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KechengziyuanEntity kechengziyuan, HttpServletRequest request) {
        //ValidatorUtils.validateEntity(kechengziyuan);
        kechengziyuanService.insert(kechengziyuan);
        return R.ok();
    }

    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KechengziyuanEntity kechengziyuan, HttpServletRequest request) {
        //ValidatorUtils.validateEntity(kechengziyuan);
        kechengziyuanService.insert(kechengziyuan);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody KechengziyuanEntity kechengziyuan, HttpServletRequest request) {
        //ValidatorUtils.validateEntity(kechengziyuan);
        kechengziyuanService.updateById(kechengziyuan);//全部更新
        return R.ok();
    }


    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        kechengziyuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 前端智能排序
     */
    @IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params, KechengziyuanEntity kechengziyuan, HttpServletRequest request, String pre) {
        EntityWrapper<KechengziyuanEntity> ew = new EntityWrapper<KechengziyuanEntity>();
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
        params.put("sort", "clicknum");
        params.put("order", "desc");
        PageUtils page = kechengziyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kechengziyuan), params), params));
        return R.ok().put("data", page);
    }


}
