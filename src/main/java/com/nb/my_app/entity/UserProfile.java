package com.nb.my_app.entity;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 用户个人资料实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserProfile {

    // Getter和Setter方法
    private Integer id;
    private Integer deviceId;
    private String gender;
    private Integer age;
    private String university;
    private Float gpa;
    private Integer activeDaysWithin30;
    private Integer questionCnt;
    private Integer answerCnt;

}