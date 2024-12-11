package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.ZuoyepingfenEntity;
import com.entity.view.ZuoyepingfenView;
import com.entity.vo.ZuoyepingfenVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 作业评分
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:44
 */
public interface ZuoyepingfenDao extends BaseMapper<ZuoyepingfenEntity> {

    List<ZuoyepingfenVO> selectListVO(@Param("ew") Wrapper<ZuoyepingfenEntity> wrapper);

    ZuoyepingfenVO selectVO(@Param("ew") Wrapper<ZuoyepingfenEntity> wrapper);

    List<ZuoyepingfenView> selectListView(@Param("ew") Wrapper<ZuoyepingfenEntity> wrapper);

    List<ZuoyepingfenView> selectListView(Pagination page, @Param("ew") Wrapper<ZuoyepingfenEntity> wrapper);


    ZuoyepingfenView selectView(@Param("ew") Wrapper<ZuoyepingfenEntity> wrapper);


}
