package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.BanjixinxiEntity;
import com.entity.view.BanjixinxiView;
import com.entity.vo.BanjixinxiVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 班级信息
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:44
 */
public interface BanjixinxiService extends IService<BanjixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<BanjixinxiVO> selectListVO(Wrapper<BanjixinxiEntity> wrapper);

    BanjixinxiVO selectVO(@Param("ew") Wrapper<BanjixinxiEntity> wrapper);

    List<BanjixinxiView> selectListView(Wrapper<BanjixinxiEntity> wrapper);

    BanjixinxiView selectView(@Param("ew") Wrapper<BanjixinxiEntity> wrapper);

    PageUtils queryPage(Map<String, Object> params, Wrapper<BanjixinxiEntity> wrapper);


}
