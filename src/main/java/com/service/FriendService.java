package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.FriendEntity;
import com.entity.view.FriendView;
import com.entity.vo.FriendVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 好友表
 *
 * @author
 * @email
 * @date 2024-03-27 22:08:45
 */
public interface FriendService extends IService<FriendEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<FriendVO> selectListVO(Wrapper<FriendEntity> wrapper);

    FriendVO selectVO(@Param("ew") Wrapper<FriendEntity> wrapper);

    List<FriendView> selectListView(Wrapper<FriendEntity> wrapper);

    FriendView selectView(@Param("ew") Wrapper<FriendEntity> wrapper);

    PageUtils queryPage(Map<String, Object> params, Wrapper<FriendEntity> wrapper);

    PageUtils queryFriendPage(Map<String, Object> params);


}

