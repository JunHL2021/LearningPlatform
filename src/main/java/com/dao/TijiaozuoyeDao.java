package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.TijiaozuoyeEntity;
import com.entity.view.TijiaozuoyeView;
import com.entity.vo.TijiaozuoyeVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 提交作业
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:44
 */
public interface TijiaozuoyeDao extends BaseMapper<TijiaozuoyeEntity> {

    List<TijiaozuoyeVO> selectListVO(@Param("ew") Wrapper<TijiaozuoyeEntity> wrapper);

    TijiaozuoyeVO selectVO(@Param("ew") Wrapper<TijiaozuoyeEntity> wrapper);

    List<TijiaozuoyeView> selectListView(@Param("ew") Wrapper<TijiaozuoyeEntity> wrapper);

    List<TijiaozuoyeView> selectListView(Pagination page, @Param("ew") Wrapper<TijiaozuoyeEntity> wrapper);


    TijiaozuoyeView selectView(@Param("ew") Wrapper<TijiaozuoyeEntity> wrapper);


}
