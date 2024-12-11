package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.ZiyuanleixingEntity;
import com.entity.view.ZiyuanleixingView;
import com.entity.vo.ZiyuanleixingVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 资源类型
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:43
 */
public interface ZiyuanleixingService extends IService<ZiyuanleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<ZiyuanleixingVO> selectListVO(Wrapper<ZiyuanleixingEntity> wrapper);

    ZiyuanleixingVO selectVO(@Param("ew") Wrapper<ZiyuanleixingEntity> wrapper);

    List<ZiyuanleixingView> selectListView(Wrapper<ZiyuanleixingEntity> wrapper);

    ZiyuanleixingView selectView(@Param("ew") Wrapper<ZiyuanleixingEntity> wrapper);

    PageUtils queryPage(Map<String, Object> params, Wrapper<ZiyuanleixingEntity> wrapper);


}

