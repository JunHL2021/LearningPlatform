package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.TijiaozuoyeEntity;
import com.entity.view.TijiaozuoyeView;
import com.entity.vo.TijiaozuoyeVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 提交作业
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:44
 */
public interface TijiaozuoyeService extends IService<TijiaozuoyeEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<TijiaozuoyeVO> selectListVO(Wrapper<TijiaozuoyeEntity> wrapper);

    TijiaozuoyeVO selectVO(@Param("ew") Wrapper<TijiaozuoyeEntity> wrapper);

    List<TijiaozuoyeView> selectListView(Wrapper<TijiaozuoyeEntity> wrapper);

    TijiaozuoyeView selectView(@Param("ew") Wrapper<TijiaozuoyeEntity> wrapper);

    PageUtils queryPage(Map<String, Object> params, Wrapper<TijiaozuoyeEntity> wrapper);


}

