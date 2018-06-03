package com.wyait.manage.entity;

import java.util.Date;

public class UsersRoleDTO {
    private String id;

    /**
     * 权限状态
     */
    private String authStatus;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 用户名
     */
    private String username;

    private String password;

    /**
     * 性别
     */
    private String sex;

    /**
     * 姓名
     */
    private String name;

    /**
     * 余额
     */
    private Integer balance;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 启动状态
     */
    private Boolean enabled;

    /**
     * 身份证
     */
    private String idCard;

    /**
     * 邀请代码
     */
    private String invitationCode;

    /**
     * 邀请次数
     */
    private Integer invitationCount;

    /**
     * 学校id
     */
    private String schoolId;

    /**
     * 头像
     */
    private String photo;

    private String openId;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取权限状态
     *
     * @return auth_status - 权限状态
     */
    public String getAuthStatus() {
        return authStatus;
    }

    /**
     * 设置权限状态
     *
     * @param authStatus 权限状态
     */
    public void setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
    }

    /**
     * 获取手机号
     *
     * @return mobile - 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号
     *
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取余额
     *
     * @return balance - 余额
     */
    public Integer getBalance() {
        return balance;
    }

    /**
     * 设置余额
     *
     * @param balance 余额
     */
    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取启动状态
     *
     * @return enabled - 启动状态
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * 设置启动状态
     *
     * @param enabled 启动状态
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * 获取身份证
     *
     * @return id_card - 身份证
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 设置身份证
     *
     * @param idCard 身份证
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * 获取邀请代码
     *
     * @return invitation_code - 邀请代码
     */
    public String getInvitationCode() {
        return invitationCode;
    }

    /**
     * 设置邀请代码
     *
     * @param invitationCode 邀请代码
     */
    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }

    /**
     * 获取邀请次数
     *
     * @return invitation_count - 邀请次数
     */
    public Integer getInvitationCount() {
        return invitationCount;
    }

    /**
     * 设置邀请次数
     *
     * @param invitationCount 邀请次数
     */
    public void setInvitationCount(Integer invitationCount) {
        this.invitationCount = invitationCount;
    }

    /**
     * 获取学校id
     *
     * @return school_id - 学校id
     */
    public String getSchoolId() {
        return schoolId;
    }

    /**
     * 设置学校id
     *
     * @param schoolId 学校id
     */
    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    /**
     * 获取头像
     *
     * @return photo - 头像
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * 设置头像
     *
     * @param photo 头像
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /**
     * @return open_id
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * @param openId
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }
}