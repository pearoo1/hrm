package com.zl.hrm.pojo;

import java.time.LocalDateTime;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_table.user_id
     *
     * @mbg.generated Fri Aug 30 14:07:56 CST 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_table.create_date
     *
     * @mbg.generated Fri Aug 30 14:07:56 CST 2019
     */
    private LocalDateTime createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_table.login_name
     *
     * @mbg.generated Fri Aug 30 14:07:56 CST 2019
     */
    private String loginName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_table.login_pwd
     *
     * @mbg.generated Fri Aug 30 14:07:56 CST 2019
     */
    private String loginPwd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_table.user_status
     *
     * @mbg.generated Fri Aug 30 14:07:56 CST 2019
     */
    private Integer userStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_table.user_name
     *
     * @mbg.generated Fri Aug 30 14:07:56 CST 2019
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_table.user_image
     *
     * @mbg.generated Fri Aug 30 14:07:56 CST 2019
     */
    private String userImage;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_table.user_id
     *
     * @return the value of user_table.user_id
     *
     * @mbg.generated Fri Aug 30 14:07:56 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_table.user_id
     *
     * @param userId the value for user_table.user_id
     *
     * @mbg.generated Fri Aug 30 14:07:56 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_table.create_date
     *
     * @return the value of user_table.create_date
     *
     * @mbg.generated Fri Aug 30 14:07:56 CST 2019
     */
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_table.create_date
     *
     * @param createDate the value for user_table.create_date
     *
     * @mbg.generated Fri Aug 30 14:07:56 CST 2019
     */
    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_table.login_name
     *
     * @return the value of user_table.login_name
     *
     * @mbg.generated Fri Aug 30 14:07:56 CST 2019
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_table.login_name
     *
     * @param loginName the value for user_table.login_name
     *
     * @mbg.generated Fri Aug 30 14:07:56 CST 2019
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_table.login_pwd
     *
     * @return the value of user_table.login_pwd
     *
     * @mbg.generated Fri Aug 30 14:07:56 CST 2019
     */
    public String getLoginPwd() {
        return loginPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_table.login_pwd
     *
     * @param loginPwd the value for user_table.login_pwd
     *
     * @mbg.generated Fri Aug 30 14:07:56 CST 2019
     */
    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd == null ? null : loginPwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_table.user_status
     *
     * @return the value of user_table.user_status
     *
     * @mbg.generated Fri Aug 30 14:07:56 CST 2019
     */
    public Integer getUserStatus() {
        return userStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_table.user_status
     *
     * @param userStatus the value for user_table.user_status
     *
     * @mbg.generated Fri Aug 30 14:07:56 CST 2019
     */
    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_table.user_name
     *
     * @return the value of user_table.user_name
     *
     * @mbg.generated Fri Aug 30 14:07:56 CST 2019
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_table.user_name
     *
     * @param userName the value for user_table.user_name
     *
     * @mbg.generated Fri Aug 30 14:07:56 CST 2019
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_table.user_image
     *
     * @return the value of user_table.user_image
     *
     * @mbg.generated Fri Aug 30 14:07:56 CST 2019
     */
    public String getUserImage() {
        return userImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_table.user_image
     *
     * @param userImage the value for user_table.user_image
     *
     * @mbg.generated Fri Aug 30 14:07:56 CST 2019
     */
    public void setUserImage(String userImage) {
        this.userImage = userImage == null ? null : userImage.trim();
    }
}