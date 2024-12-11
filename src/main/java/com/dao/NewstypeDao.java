package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.NewstypeEntity;
import com.entity.view.NewstypeView;
import com.entity.vo.NewstypeVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 资讯公告分类
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:45
 */
public interface NewstypeDao extends BaseMapper<NewstypeEntity> {

    List<NewstypeVO> selectListVO(@Param("ew") Wrapper<NewstypeEntity> wrapper);

    NewstypeVO selectVO(@Param("ew") Wrapper<NewstypeEntity> wrapper);

    List<NewstypeView> selectListView(@Param("ew") Wrapper<NewstypeEntity> wrapper);

    List<NewstypeView> selectListView(Pagination page, @Param("ew") Wrapper<NewstypeEntity> wrapper);


    NewstypeView selectView(@Param("ew") Wrapper<NewstypeEntity> wrapper);


}
