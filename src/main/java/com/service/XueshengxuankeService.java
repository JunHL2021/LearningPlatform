package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.XueshengxuankeEntity;
import com.entity.view.XueshengxuankeView;
import com.entity.vo.XueshengxuankeVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 学生选课
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:44
 */
public interface XueshengxuankeService extends IService<XueshengxuankeEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<XueshengxuankeVO> selectListVO(Wrapper<XueshengxuankeEntity> wrapper);

    XueshengxuankeVO selectVO(@Param("ew") Wrapper<XueshengxuankeEntity> wrapper);

    List<XueshengxuankeView> selectListView(Wrapper<XueshengxuankeEntity> wrapper);

    XueshengxuankeView selectView(@Param("ew") Wrapper<XueshengxuankeEntity> wrapper);

    PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengxuankeEntity> wrapper);


}

