package com.wyait.manage.pojo;

import java.util.Date;
import javax.persistence.*;

public class Coupon {
//    @Id
    private String id;

    /**
     * 优惠券名称
     */
    private String name;

    /**
     * 类型
     */
    private String type;

    /**
     * 金额
     */
    private Long amount;

    /**
     * 满减金额
     */
//    @Column(name = "full_amount_reduction")
    private Long fullAmountReduction;

    /**
     * 开始时间
     */
//    @Column(name = "start_time")
    private Date startTime;

    /**
     * 结束时间
     */
//    @Column(name = "end_time")
    private Date endTime;

    /**
     * 使用状态
     */
    private String status;

    /**
     * 用户id
     */
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
     * 获取优惠券名称
     *
     * @return name - 优惠券名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置优惠券名称
     *
     * @param name 优惠券名称
     */
    public void setName(String name) {
        this.name = name;
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

    /**
     * 获取满减金额
     *
     * @return full_amount_reduction - 满减金额
     */
    public Long getFullAmountReduction() {
        return fullAmountReduction;
    }

    /**
     * 设置满减金额
     *
     * @param fullAmountReduction 满减金额
     */
    public void setFullAmountReduction(Long fullAmountReduction) {
        this.fullAmountReduction = fullAmountReduction;
    }

    /**
     * 获取开始时间
     *
     * @return start_time - 开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置开始时间
     *
     * @param startTime 开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取结束时间
     *
     * @return end_time - 结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置结束时间
     *
     * @param endTime 结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取使用状态
     *
     * @return status - 使用状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置使用状态
     *
     * @param status 使用状态
     */
    public void setStatus(String status) {
        this.status = status;
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
}