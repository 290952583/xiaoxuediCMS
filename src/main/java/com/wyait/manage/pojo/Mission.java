package com.wyait.manage.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Mission {
//    @Id
    private String id;

    /**
     * 创建人
     */
//    @Column(name = "create_by")
    private String createBy;

    /**
     * 创建时间
     */
//    @Column(name = "create_time")
    private Date createTime;

    /**
     * 删除标记 0：未删除；其他：删除
     */
//    @Column(name = "delete_time")
    private Long deleteTime;

    /**
     * 更新人
     */
//    @Column(name = "op_by")
    private String opBy;

    /**
     * 更新时间
     */
//    @Column(name = "op_time")
    private Date opTime;

//    @Column(name = "actual_amount")
    private BigDecimal actualAmount;

    private String address;

//    @Column(name = "coupon_amount")
    private BigDecimal couponAmount;

//    @Column(name = "coupon_id")
    private String couponId;

    private String delivery;

//    @Column(name = "distribution_time")
    private String distributionTime;

//    @Column(name = "finish_time")
    private Date finishTime;

//    @Column(name = "get_code")
    private String getCode;

//    @Column(name = "mission_no")
    private String missionNo;

    private BigDecimal price;

    private String remark;

    private String school;

    private String status;

    private String type;

//    @Column(name = "accept_user_id")
    private String acceptUserId;

//    @Column(name = "user_id")
    private String userId;

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
     * 获取创建人
     *
     * @return create_by - 创建人
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人
     *
     * @param createBy 创建人
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
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
     * 获取删除标记 0：未删除；其他：删除
     *
     * @return delete_time - 删除标记 0：未删除；其他：删除
     */
    public Long getDeleteTime() {
        return deleteTime;
    }

    /**
     * 设置删除标记 0：未删除；其他：删除
     *
     * @param deleteTime 删除标记 0：未删除；其他：删除
     */
    public void setDeleteTime(Long deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * 获取更新人
     *
     * @return op_by - 更新人
     */
    public String getOpBy() {
        return opBy;
    }

    /**
     * 设置更新人
     *
     * @param opBy 更新人
     */
    public void setOpBy(String opBy) {
        this.opBy = opBy;
    }

    /**
     * 获取更新时间
     *
     * @return op_time - 更新时间
     */
    public Date getOpTime() {
        return opTime;
    }

    /**
     * 设置更新时间
     *
     * @param opTime 更新时间
     */
    public void setOpTime(Date opTime) {
        this.opTime = opTime;
    }

    /**
     * @return actual_amount
     */
    public BigDecimal getActualAmount() {
        return actualAmount;
    }

    /**
     * @param actualAmount
     */
    public void setActualAmount(BigDecimal actualAmount) {
        this.actualAmount = actualAmount;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return coupon_amount
     */
    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    /**
     * @param couponAmount
     */
    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    /**
     * @return coupon_id
     */
    public String getCouponId() {
        return couponId;
    }

    /**
     * @param couponId
     */
    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    /**
     * @return delivery
     */
    public String getDelivery() {
        return delivery;
    }

    /**
     * @param delivery
     */
    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    /**
     * @return distribution_time
     */
    public String getDistributionTime() {
        return distributionTime;
    }

    /**
     * @param distributionTime
     */
    public void setDistributionTime(String distributionTime) {
        this.distributionTime = distributionTime;
    }

    /**
     * @return finish_time
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * @param finishTime
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * @return get_code
     */
    public String getGetCode() {
        return getCode;
    }

    /**
     * @param getCode
     */
    public void setGetCode(String getCode) {
        this.getCode = getCode;
    }

    /**
     * @return mission_no
     */
    public String getMissionNo() {
        return missionNo;
    }

    /**
     * @param missionNo
     */
    public void setMissionNo(String missionNo) {
        this.missionNo = missionNo;
    }

    /**
     * @return price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return school
     */
    public String getSchool() {
        return school;
    }

    /**
     * @param school
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return accept_user_id
     */
    public String getAcceptUserId() {
        return acceptUserId;
    }

    /**
     * @param acceptUserId
     */
    public void setAcceptUserId(String acceptUserId) {
        this.acceptUserId = acceptUserId;
    }

    /**
     * @return user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
}