package com.wyait.manage.pojo;

import java.util.Date;
import javax.persistence.*;

//@Table(name = "delivery_info")
public class DeliveryInfo {
//    @Id
    private String id;

    /**
     * 订单id
     */
//    @Column(name = "orders_id")
    private String ordersId;

    /**
     * 用户id
     */
//    @Column(name = "user_id")
    private String userId;

    /**
     * 商户id
     */
//    @Column(name = "business_id")
    private String businessId;

    /**
     * 配送员id
     */
//    @Column(name = "delivery_id")
    private String deliveryId;

    /**
     * 状态
     */
    private String status;

    /**
     * 类型
     */
    private String type;

    /**
     * 创建时间
     */
//    @Column(name = "create_time")
    private Date createTime;

    /**
     * 完成时间
     */
//    @Column(name = "finish_time")
    private Date finishTime;

    /**
     * 金额
     */
    private Long amount;

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
     * 获取订单id
     *
     * @return orders_id - 订单id
     */
    public String getOrdersId() {
        return ordersId;
    }

    /**
     * 设置订单id
     *
     * @param ordersId 订单id
     */
    public void setOrdersId(String ordersId) {
        this.ordersId = ordersId;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取商户id
     *
     * @return business_id - 商户id
     */
    public String getBusinessId() {
        return businessId;
    }

    /**
     * 设置商户id
     *
     * @param businessId 商户id
     */
    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    /**
     * 获取配送员id
     *
     * @return delivery_id - 配送员id
     */
    public String getDeliveryId() {
        return deliveryId;
    }

    /**
     * 设置配送员id
     *
     * @param deliveryId 配送员id
     */
    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取类型
     *
     * @return type - 类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(String type) {
        this.type = type;
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
     * 获取完成时间
     *
     * @return finish_time - 完成时间
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * 设置完成时间
     *
     * @param finishTime 完成时间
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * 获取金额
     *
     * @return amount - 金额
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * 设置金额
     *
     * @param amount 金额
     */
    public void setAmount(Long amount) {
        this.amount = amount;
    }
}