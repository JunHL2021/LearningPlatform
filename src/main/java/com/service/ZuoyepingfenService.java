package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.ZuoyepingfenEntity;
import com.entity.view.ZuoyepingfenView;
import com.entity.vo.ZuoyepingfenVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 作业评分
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:44
 */
public interface ZuoyepingfenService extends IService<ZuoyepingfenEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<ZuoyepingfenVO> selectListVO(Wrapper<ZuoyepingfenEntity> wrapper);

    ZuoyepingfenVO selectVO(@Param("ew") Wrapper<ZuoyepingfenEntity> wrapper);

    List<ZuoyepingfenView> selectListView(Wrapper<ZuoyepingfenEntity> wrapper);

    ZuoyepingfenView selectView(@Param("ew") Wrapper<ZuoyepingfenEntity> wrapper);

    PageUtils queryPage(Map<String, Object> params, Wrapper<ZuoyepingfenEntity> wrapper);


}

