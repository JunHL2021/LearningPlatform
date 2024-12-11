package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.ChatmessageEntity;
import com.entity.view.ChatmessageView;
import com.entity.vo.ChatmessageVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 消息表
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:44
 */
public interface ChatmessageDao extends BaseMapper<ChatmessageEntity> {

    List<ChatmessageVO> selectListVO(@Param("ew") Wrapper<ChatmessageEntity> wrapper);

    ChatmessageVO selectVO(@Param("ew") Wrapper<ChatmessageEntity> wrapper);

    List<ChatmessageView> selectListView(@Param("ew") Wrapper<ChatmessageEntity> wrapper);

    List<ChatmessageView> selectListView(Pagination page, @Param("ew") Wrapper<ChatmessageEntity> wrapper);


    ChatmessageView selectView(@Param("ew") Wrapper<ChatmessageEntity> wrapper);


}
