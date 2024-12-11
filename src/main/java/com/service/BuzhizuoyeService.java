package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.BuzhizuoyeEntity;
import com.entity.view.BuzhizuoyeView;
import com.entity.vo.BuzhizuoyeVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 布置作业
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:44
 */
public interface BuzhizuoyeService extends IService<BuzhizuoyeEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<BuzhizuoyeVO> selectListVO(Wrapper<BuzhizuoyeEntity> wrapper);

    BuzhizuoyeVO selectVO(@Param("ew") Wrapper<BuzhizuoyeEntity> wrapper);

    List<BuzhizuoyeView> selectListView(Wrapper<BuzhizuoyeEntity> wrapper);

    BuzhizuoyeView selectView(@Param("ew") Wrapper<BuzhizuoyeEntity> wrapper);

    PageUtils queryPage(Map<String, Object> params, Wrapper<BuzhizuoyeEntity> wrapper);


}

