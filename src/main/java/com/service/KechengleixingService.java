package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.KechengleixingEntity;
import com.entity.view.KechengleixingView;
import com.entity.vo.KechengleixingVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 课程类型
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:44
 */
public interface KechengleixingService extends IService<KechengleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<KechengleixingVO> selectListVO(Wrapper<KechengleixingEntity> wrapper);

    KechengleixingVO selectVO(@Param("ew") Wrapper<KechengleixingEntity> wrapper);

    List<KechengleixingView> selectListView(Wrapper<KechengleixingEntity> wrapper);

    KechengleixingView selectView(@Param("ew") Wrapper<KechengleixingEntity> wrapper);

    PageUtils queryPage(Map<String, Object> params, Wrapper<KechengleixingEntity> wrapper);


}

