package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.AboutusEntity;
import com.entity.view.AboutusView;
import com.entity.vo.AboutusVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 关于我们
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:45
 */
public interface AboutusService extends IService<AboutusEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<AboutusVO> selectListVO(Wrapper<AboutusEntity> wrapper);

    AboutusVO selectVO(@Param("ew") Wrapper<AboutusEntity> wrapper);

    List<AboutusView> selectListView(Wrapper<AboutusEntity> wrapper);

    AboutusView selectView(@Param("ew") Wrapper<AboutusEntity> wrapper);

    PageUtils queryPage(Map<String, Object> params, Wrapper<AboutusEntity> wrapper);


}

