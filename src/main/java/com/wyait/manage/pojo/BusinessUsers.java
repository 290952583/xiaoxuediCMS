package com.wyait.manage.pojo;

import javax.persistence.*;

//@Table(name = "business_users")
public class BusinessUsers {
//    @Id
    private String id;

    /**
     * 店铺名称
     */
    private String name;

    /**
     * 学校id
     */
//    @Column(name = "school_id")
    private String schoolId;

    /**
     * 店铺地址
     */
    private String address;

    /**
     * 头像设置
     */
//    @Column(name = "head_img")
    private String headImg;

    /**
     * 营业时间
     */
//    @Column(name = "business_hours")
    private String businessHours;

    /**
     * 公告
     */
    private String placard;

    /**
     * 客服电话
     */
//    @Column(name = "service_phone")
    private String servicePhone;

    /**
     * 营业状态
     */
//    @Column(name = "business_status")
    private String businessStatus;

    /**
     * 总订单量
     */
//    @Column(name = "orders_sum")
    private Integer ordersSum;

    /**
     * 总营业额
     */
//    @Column(name = "business_sum")
    private Long businessSum;

    /**
     * 提现账号
     */
//    @Column(name = "withdraw_account")
    private String withdrawAccount;

    /**
     * 提现账号类型
     */
//    @Column(name = "withdraw_type")
    private String withdrawType;

    /**
     * 起送价
     */
//    @Column(name = "starting_price")
    private Long startingPrice;

    /**
     * 配送费
     */
//    @Column(name = "distribution_price")
    private Long distributionPrice;

    /**
     * 营业执照
     */
//    @Column(name = "business_license")
    private String businessLicense;

    /**
     * 认证状态
     */
//    @Column(name = "auth_status")
    private String authStatus;

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
     * 获取店铺名称
     *
     * @return name - 店铺名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置店铺名称
     *
     * @param name 店铺名称
     */
    public void setName(String name) {
        this.name = name;
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
     * 获取店铺地址
     *
     * @return address - 店铺地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置店铺地址
     *
     * @param address 店铺地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取头像设置
     *
     * @return head_img - 头像设置
     */
    public String getHeadImg() {
        return headImg;
    }

    /**
     * 设置头像设置
     *
     * @param headImg 头像设置
     */
    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    /**
     * 获取营业时间
     *
     * @return business_hours - 营业时间
     */
    public String getBusinessHours() {
        return businessHours;
    }

    /**
     * 设置营业时间
     *
     * @param businessHours 营业时间
     */
    public void setBusinessHours(String businessHours) {
        this.businessHours = businessHours;
    }

    /**
     * 获取公告
     *
     * @return placard - 公告
     */
    public String getPlacard() {
        return placard;
    }

    /**
     * 设置公告
     *
     * @param placard 公告
     */
    public void setPlacard(String placard) {
        this.placard = placard;
    }

    /**
     * 获取客服电话
     *
     * @return service_phone - 客服电话
     */
    public String getServicePhone() {
        return servicePhone;
    }

    /**
     * 设置客服电话
     *
     * @param servicePhone 客服电话
     */
    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone;
    }

    /**
     * 获取营业状态
     *
     * @return business_status - 营业状态
     */
    public String getBusinessStatus() {
        return businessStatus;
    }

    /**
     * 设置营业状态
     *
     * @param businessStatus 营业状态
     */
    public void setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
    }

    /**
     * 获取总订单量
     *
     * @return orders_sum - 总订单量
     */
    public Integer getOrdersSum() {
        return ordersSum;
    }

    /**
     * 设置总订单量
     *
     * @param ordersSum 总订单量
     */
    public void setOrdersSum(Integer ordersSum) {
        this.ordersSum = ordersSum;
    }

    /**
     * 获取总营业额
     *
     * @return business_sum - 总营业额
     */
    public Long getBusinessSum() {
        return businessSum;
    }

    /**
     * 设置总营业额
     *
     * @param businessSum 总营业额
     */
    public void setBusinessSum(Long businessSum) {
        this.businessSum = businessSum;
    }

    /**
     * 获取提现账号
     *
     * @return withdraw_account - 提现账号
     */
    public String getWithdrawAccount() {
        return withdrawAccount;
    }

    /**
     * 设置提现账号
     *
     * @param withdrawAccount 提现账号
     */
    public void setWithdrawAccount(String withdrawAccount) {
        this.withdrawAccount = withdrawAccount;
    }

    /**
     * 获取提现账号类型
     *
     * @return withdraw_type - 提现账号类型
     */
    public String getWithdrawType() {
        return withdrawType;
    }

    /**
     * 设置提现账号类型
     *
     * @param withdrawType 提现账号类型
     */
    public void setWithdrawType(String withdrawType) {
        this.withdrawType = withdrawType;
    }

    /**
     * 获取起送价
     *
     * @return starting_price - 起送价
     */
    public Long getStartingPrice() {
        return startingPrice;
    }

    /**
     * 设置起送价
     *
     * @param startingPrice 起送价
     */
    public void setStartingPrice(Long startingPrice) {
        this.startingPrice = startingPrice;
    }

    /**
     * 获取配送费
     *
     * @return distribution_price - 配送费
     */
    public Long getDistributionPrice() {
        return distributionPrice;
    }

    /**
     * 设置配送费
     *
     * @param distributionPrice 配送费
     */
    public void setDistributionPrice(Long distributionPrice) {
        this.distributionPrice = distributionPrice;
    }

    /**
     * 获取营业执照
     *
     * @return business_license - 营业执照
     */
    public String getBusinessLicense() {
        return businessLicense;
    }

    /**
     * 设置营业执照
     *
     * @param businessLicense 营业执照
     */
    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    /**
     * 获取认证状态
     *
     * @return auth_status - 认证状态
     */
    public String getAuthStatus() {
        return authStatus;
    }

    /**
     * 设置认证状态
     *
     * @param authStatus 认证状态
     */
    public void setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
    }
}