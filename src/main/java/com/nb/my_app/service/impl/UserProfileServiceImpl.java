package com.nb.my_app.service.impl;

import com.nb.my_app.entity.UserProfile;
import com.nb.my_app.mapper.UserProfileMapper;
import com.nb.my_app.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    private final UserProfileMapper userProfileMapper;

    @Autowired
    public UserProfileServiceImpl(UserProfileMapper userProfileMapper) {
        this.userProfileMapper = userProfileMapper;
    }

    @Override
    public List<UserProfile> getAllUserProfiles() {
        return userProfileMapper.selectAllUserProfiles();
    }
}
