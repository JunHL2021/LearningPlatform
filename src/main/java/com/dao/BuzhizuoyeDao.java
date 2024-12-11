package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.BuzhizuoyeEntity;
import com.entity.view.BuzhizuoyeView;
import com.entity.vo.BuzhizuoyeVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 布置作业
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:44
 */
public interface BuzhizuoyeDao extends BaseMapper<BuzhizuoyeEntity> {

    List<BuzhizuoyeVO> selectListVO(@Param("ew") Wrapper<BuzhizuoyeEntity> wrapper);

    BuzhizuoyeVO selectVO(@Param("ew") Wrapper<BuzhizuoyeEntity> wrapper);

    List<BuzhizuoyeView> selectListView(@Param("ew") Wrapper<BuzhizuoyeEntity> wrapper);

    List<BuzhizuoyeView> selectListView(Pagination page, @Param("ew") Wrapper<BuzhizuoyeEntity> wrapper);


    BuzhizuoyeView selectView(@Param("ew") Wrapper<BuzhizuoyeEntity> wrapper);


}
