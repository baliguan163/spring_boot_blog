package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Userinfo {
    @Id
    @Column(name = "userinfo_id")
    private Integer userinfoId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_sex")
    private Boolean userSex;

    @Column(name = "user_birthday")
    private Date userBirthday;

    @Column(name = "user_job")
    private String userJob;

    @Column(name = "user_post")
    private String userPost;

    @Column(name = "user_place")
    private Integer userPlace;

    @Column(name = "user_image")
    private String userImage;

    @Column(name = "user_recent_login_time")
    private Date userRecentLoginTime;

    @Column(name = "user_PV")
    private Integer userPv;

    @Column(name = "user_introduction")
    private String userIntroduction;

    /**
     * @return userinfo_id
     */
    public Integer getUserinfoId() {
        return userinfoId;
    }

    /**
     * @param userinfoId
     */
    public void setUserinfoId(Integer userinfoId) {
        this.userinfoId = userinfoId;
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return user_sex
     */
    public Boolean getUserSex() {
        return userSex;
    }

    /**
     * @param userSex
     */
    public void setUserSex(Boolean userSex) {
        this.userSex = userSex;
    }

    /**
     * @return user_birthday
     */
    public Date getUserBirthday() {
        return userBirthday;
    }

    /**
     * @param userBirthday
     */
    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    /**
     * @return user_job
     */
    public String getUserJob() {
        return userJob;
    }

    /**
     * @param userJob
     */
    public void setUserJob(String userJob) {
        this.userJob = userJob;
    }

    /**
     * @return user_post
     */
    public String getUserPost() {
        return userPost;
    }

    /**
     * @param userPost
     */
    public void setUserPost(String userPost) {
        this.userPost = userPost;
    }

    /**
     * @return user_place
     */
    public Integer getUserPlace() {
        return userPlace;
    }

    /**
     * @param userPlace
     */
    public void setUserPlace(Integer userPlace) {
        this.userPlace = userPlace;
    }

    /**
     * @return user_image
     */
    public String getUserImage() {
        return userImage;
    }

    /**
     * @param userImage
     */
    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    /**
     * @return user_recent_login_time
     */
    public Date getUserRecentLoginTime() {
        return userRecentLoginTime;
    }

    /**
     * @param userRecentLoginTime
     */
    public void setUserRecentLoginTime(Date userRecentLoginTime) {
        this.userRecentLoginTime = userRecentLoginTime;
    }

    /**
     * @return user_PV
     */
    public Integer getUserPv() {
        return userPv;
    }

    /**
     * @param userPv
     */
    public void setUserPv(Integer userPv) {
        this.userPv = userPv;
    }

    /**
     * @return user_introduction
     */
    public String getUserIntroduction() {
        return userIntroduction;
    }

    /**
     * @param userIntroduction
     */
    public void setUserIntroduction(String userIntroduction) {
        this.userIntroduction = userIntroduction;
    }
}