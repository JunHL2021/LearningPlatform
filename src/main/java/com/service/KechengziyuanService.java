package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.KechengziyuanEntity;
import com.entity.view.KechengziyuanView;
import com.entity.vo.KechengziyuanVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 课程资源
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:44
 */
public interface KechengziyuanService extends IService<KechengziyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<KechengziyuanVO> selectListVO(Wrapper<KechengziyuanEntity> wrapper);

    KechengziyuanVO selectVO(@Param("ew") Wrapper<KechengziyuanEntity> wrapper);

    List<KechengziyuanView> selectListView(Wrapper<KechengziyuanEntity> wrapper);

    KechengziyuanView selectView(@Param("ew") Wrapper<KechengziyuanEntity> wrapper);

    PageUtils queryPage(Map<String, Object> params, Wrapper<KechengziyuanEntity> wrapper);


}

