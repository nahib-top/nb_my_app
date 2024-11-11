package com.nb.my_app.controller;

import com.nb.my_app.entity.UserProfile;
import com.nb.my_app.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserProfileController {


    private final UserProfileService userProfileService;

    @Autowired
    public UserProfileController(UserProfileService userProfileService) {
        this.userProfileService = userProfileService;
    }

    @GetMapping("/user")
    public List<UserProfile> listUsers() {
        return userProfileService.getAllUserProfiles();
    }
}
