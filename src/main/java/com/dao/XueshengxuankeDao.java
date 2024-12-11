package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.XueshengxuankeEntity;
import com.entity.view.XueshengxuankeView;
import com.entity.vo.XueshengxuankeVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 学生选课
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:44
 */
public interface XueshengxuankeDao extends BaseMapper<XueshengxuankeEntity> {

    List<XueshengxuankeVO> selectListVO(@Param("ew") Wrapper<XueshengxuankeEntity> wrapper);

    XueshengxuankeVO selectVO(@Param("ew") Wrapper<XueshengxuankeEntity> wrapper);

    List<XueshengxuankeView> selectListView(@Param("ew") Wrapper<XueshengxuankeEntity> wrapper);

    List<XueshengxuankeView> selectListView(Pagination page, @Param("ew") Wrapper<XueshengxuankeEntity> wrapper);


    XueshengxuankeView selectView(@Param("ew") Wrapper<XueshengxuankeEntity> wrapper);


}
