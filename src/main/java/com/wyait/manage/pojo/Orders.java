package com.wyait.manage.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Orders {
    private String id;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 删除标记 0：未删除；其他：删除
     */
    private Long deleteTime;

    /**
     * 更新人
     */
    private String opBy;

    /**
     * 更新时间
     */
    private Date opTime;

    private String acceptUserId;

    private BigDecimal actualAmount;

    private String address;

    private BigDecimal couponAmount;

    private String couponId;

    private BigDecimal deliveryAmount;

    private Date finishTime;

    private Date forecastTime;

    private BigDecimal orderAmount;

    private String orderNo;

    private String payType;

    private Date receiveTime;

    private String remark;

    private String status;

    private String type;

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
     * @return delivery_amount
     */
    public BigDecimal getDeliveryAmount() {
        return deliveryAmount;
    }

    /**
     * @param deliveryAmount
     */
    public void setDeliveryAmount(BigDecimal deliveryAmount) {
        this.deliveryAmount = deliveryAmount;
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
     * @return forecast_time
     */
    public Date getForecastTime() {
        return forecastTime;
    }

    /**
     * @param forecastTime
     */
    public void setForecastTime(Date forecastTime) {
        this.forecastTime = forecastTime;
    }

    /**
     * @return order_amount
     */
    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    /**
     * @param orderAmount
     */
    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * @return order_no
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * @param orderNo
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * @return pay_type
     */
    public String getPayType() {
        return payType;
    }

    /**
     * @param payType
     */
    public void setPayType(String payType) {
        this.payType = payType;
    }

    /**
     * @return receive_time
     */
    public Date getReceiveTime() {
        return receiveTime;
    }

    /**
     * @param receiveTime
     */
    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
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