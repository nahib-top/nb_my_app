package com.nb.my_app.mapper;

import com.nb.my_app.entity.UserProfile;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserProfileMapper {
    /**
     * 查询所有用户个人资料。
     * @return 用户个人资料列表。
     */
    List<UserProfile> selectAllUserProfiles();
}
