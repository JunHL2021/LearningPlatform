package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.SystemintroEntity;
import com.entity.view.SystemintroView;
import com.entity.vo.SystemintroVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 系统简介
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:45
 */
public interface SystemintroDao extends BaseMapper<SystemintroEntity> {

    List<SystemintroVO> selectListVO(@Param("ew") Wrapper<SystemintroEntity> wrapper);

    SystemintroVO selectVO(@Param("ew") Wrapper<SystemintroEntity> wrapper);

    List<SystemintroView> selectListView(@Param("ew") Wrapper<SystemintroEntity> wrapper);

    List<SystemintroView> selectListView(Pagination page, @Param("ew") Wrapper<SystemintroEntity> wrapper);


    SystemintroView selectView(@Param("ew") Wrapper<SystemintroEntity> wrapper);


}
