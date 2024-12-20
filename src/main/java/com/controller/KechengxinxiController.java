package com.controller;

import com.annotation.IgnoreAuth;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.entity.KechengxinxiEntity;
import com.entity.StoreupEntity;
import com.entity.view.KechengxinxiView;
import com.service.KechengxinxiService;
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
 * 课程信息
 * 后端接口
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:44
 */
@RestController
@RequestMapping("/kechengxinxi")
public class KechengxinxiController {
    @Autowired
    private KechengxinxiService kechengxinxiService;

    @Autowired
    private StoreupService storeupService;


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, KechengxinxiEntity kechengxinxi,
                  HttpServletRequest request) {
        String tableName = request.getSession().getAttribute("tableName").toString();
        if (tableName.equals("jiaoshi")) {
            kechengxinxi.setJiaoshigonghao((String) request.getSession().getAttribute("username"));
        }
        EntityWrapper<KechengxinxiEntity> ew = new EntityWrapper<KechengxinxiEntity>();

        PageUtils page = kechengxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kechengxinxi), params), params));

        return R.ok().put("data", page);
    }

    /**
     * 前端列表
     */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, KechengxinxiEntity kechengxinxi,
                  HttpServletRequest request) {
        EntityWrapper<KechengxinxiEntity> ew = new EntityWrapper<KechengxinxiEntity>();

        PageUtils page = kechengxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kechengxinxi), params), params));
        return R.ok().put("data", page);
    }


    /**
     * 列表
     */
    @RequestMapping("/lists")
    public R list(KechengxinxiEntity kechengxinxi) {
        EntityWrapper<KechengxinxiEntity> ew = new EntityWrapper<KechengxinxiEntity>();
        ew.allEq(MPUtil.allEQMapPre(kechengxinxi, "kechengxinxi"));
        return R.ok().put("data", kechengxinxiService.selectListView(ew));
    }

    /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KechengxinxiEntity kechengxinxi) {
        EntityWrapper<KechengxinxiEntity> ew = new EntityWrapper<KechengxinxiEntity>();
        ew.allEq(MPUtil.allEQMapPre(kechengxinxi, "kechengxinxi"));
        KechengxinxiView kechengxinxiView = kechengxinxiService.selectView(ew);
        return R.ok("查询课程信息成功").put("data", kechengxinxiView);
    }

    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        KechengxinxiEntity kechengxinxi = kechengxinxiService.selectById(id);
        kechengxinxi.setClicknum(kechengxinxi.getClicknum() + 1);
        kechengxinxi.setClicktime(new Date());
        kechengxinxiService.updateById(kechengxinxi);
        kechengxinxi = kechengxinxiService.selectView(new EntityWrapper<KechengxinxiEntity>().eq("id", id));
        return R.ok().put("data", kechengxinxi);
    }

    /**
     * 前端详情
     */
    @IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id) {
        KechengxinxiEntity kechengxinxi = kechengxinxiService.selectById(id);
        kechengxinxi.setClicknum(kechengxinxi.getClicknum() + 1);
        kechengxinxi.setClicktime(new Date());
        kechengxinxiService.updateById(kechengxinxi);
        kechengxinxi = kechengxinxiService.selectView(new EntityWrapper<KechengxinxiEntity>().eq("id", id));
        return R.ok().put("data", kechengxinxi);
    }


    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KechengxinxiEntity kechengxinxi, HttpServletRequest request) {
        //ValidatorUtils.validateEntity(kechengxinxi);
        kechengxinxiService.insert(kechengxinxi);
        return R.ok();
    }

    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KechengxinxiEntity kechengxinxi, HttpServletRequest request) {
        //ValidatorUtils.validateEntity(kechengxinxi);
        kechengxinxiService.insert(kechengxinxi);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody KechengxinxiEntity kechengxinxi, HttpServletRequest request) {
        //ValidatorUtils.validateEntity(kechengxinxi);
        kechengxinxiService.updateById(kechengxinxi);//全部更新
        return R.ok();
    }


    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        kechengxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 前端智能排序
     */
    @IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params, KechengxinxiEntity kechengxinxi, HttpServletRequest request, String pre) {
        EntityWrapper<KechengxinxiEntity> ew = new EntityWrapper<KechengxinxiEntity>();
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
        PageUtils page = kechengxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kechengxinxi), params), params));
        return R.ok().put("data", page);
    }


    /**
     * 协同算法（按收藏推荐）
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params, KechengxinxiEntity kechengxinxi, HttpServletRequest request) {
        String userId = request.getSession().getAttribute("userId").toString();
        String inteltypeColumn = "kechengleixing";
        List<StoreupEntity> storeups = storeupService.selectList(new EntityWrapper<StoreupEntity>().eq("type", 1).eq("userid", userId).eq("tablename", "kechengxinxi").orderBy("addtime", false));
        List<String> inteltypes = new ArrayList<String>();
        Integer limit = params.get("limit") == null ? 10 : Integer.parseInt(params.get("limit").toString());
        List<KechengxinxiEntity> kechengxinxiList = new ArrayList<KechengxinxiEntity>();
        //去重
        if (storeups != null && storeups.size() > 0) {
            for (StoreupEntity s : storeups) {
                kechengxinxiList.addAll(kechengxinxiService.selectList(new EntityWrapper<KechengxinxiEntity>().eq(inteltypeColumn, s.getInteltype())));
            }
        }
        EntityWrapper<KechengxinxiEntity> ew = new EntityWrapper<KechengxinxiEntity>();
        params.put("sort", "id");
        params.put("order", "desc");
        PageUtils page = kechengxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kechengxinxi), params), params));
        List<KechengxinxiEntity> pageList = (List<KechengxinxiEntity>) page.getList();
        if (kechengxinxiList.size() < limit) {
            int toAddNum = (limit - kechengxinxiList.size()) <= pageList.size() ? (limit - kechengxinxiList.size()) : pageList.size();
            for (KechengxinxiEntity o1 : pageList) {
                boolean addFlag = true;
                for (KechengxinxiEntity o2 : kechengxinxiList) {
                    if (o1.getId().intValue() == o2.getId().intValue()) {
                        addFlag = false;
                        break;
                    }
                }
                if (addFlag) {
                    kechengxinxiList.add(o1);
                    if (--toAddNum == 0) break;
                }
            }
        } else if (kechengxinxiList.size() > limit) {
            kechengxinxiList = kechengxinxiList.subList(0, limit);
        }
        page.setList(kechengxinxiList);
        return R.ok().put("data", page);
    }


}
