package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.BanjixinxiEntity;
import com.entity.view.BanjixinxiView;
import com.entity.vo.BanjixinxiVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 班级信息
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:44
 */
public interface BanjixinxiDao extends BaseMapper<BanjixinxiEntity> {

    List<BanjixinxiVO> selectListVO(@Param("ew") Wrapper<BanjixinxiEntity> wrapper);

    BanjixinxiVO selectVO(@Param("ew") Wrapper<BanjixinxiEntity> wrapper);

    List<BanjixinxiView> selectListView(@Param("ew") Wrapper<BanjixinxiEntity> wrapper);

    List<BanjixinxiView> selectListView(Pagination page, @Param("ew") Wrapper<BanjixinxiEntity> wrapper);


    BanjixinxiView selectView(@Param("ew") Wrapper<BanjixinxiEntity> wrapper);


}
