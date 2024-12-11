package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.ZiyuanleixingEntity;
import com.entity.view.ZiyuanleixingView;
import com.entity.vo.ZiyuanleixingVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 资源类型
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:43
 */
public interface ZiyuanleixingDao extends BaseMapper<ZiyuanleixingEntity> {

    List<ZiyuanleixingVO> selectListVO(@Param("ew") Wrapper<ZiyuanleixingEntity> wrapper);

    ZiyuanleixingVO selectVO(@Param("ew") Wrapper<ZiyuanleixingEntity> wrapper);

    List<ZiyuanleixingView> selectListView(@Param("ew") Wrapper<ZiyuanleixingEntity> wrapper);

    List<ZiyuanleixingView> selectListView(Pagination page, @Param("ew") Wrapper<ZiyuanleixingEntity> wrapper);


    ZiyuanleixingView selectView(@Param("ew") Wrapper<ZiyuanleixingEntity> wrapper);


}
