package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.KechengziyuanEntity;
import com.entity.view.KechengziyuanView;
import com.entity.vo.KechengziyuanVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 课程资源
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:44
 */
public interface KechengziyuanDao extends BaseMapper<KechengziyuanEntity> {

    List<KechengziyuanVO> selectListVO(@Param("ew") Wrapper<KechengziyuanEntity> wrapper);

    KechengziyuanVO selectVO(@Param("ew") Wrapper<KechengziyuanEntity> wrapper);

    List<KechengziyuanView> selectListView(@Param("ew") Wrapper<KechengziyuanEntity> wrapper);

    List<KechengziyuanView> selectListView(Pagination page, @Param("ew") Wrapper<KechengziyuanEntity> wrapper);


    KechengziyuanView selectView(@Param("ew") Wrapper<KechengziyuanEntity> wrapper);


}
