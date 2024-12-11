package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.ChatmessageEntity;
import com.entity.view.ChatmessageView;
import com.entity.vo.ChatmessageVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 消息表
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:44
 */
public interface ChatmessageService extends IService<ChatmessageEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<ChatmessageVO> selectListVO(Wrapper<ChatmessageEntity> wrapper);

    ChatmessageVO selectVO(@Param("ew") Wrapper<ChatmessageEntity> wrapper);

    List<ChatmessageView> selectListView(Wrapper<ChatmessageEntity> wrapper);

    ChatmessageView selectView(@Param("ew") Wrapper<ChatmessageEntity> wrapper);

    PageUtils queryPage(Map<String, Object> params, Wrapper<ChatmessageEntity> wrapper);


}

