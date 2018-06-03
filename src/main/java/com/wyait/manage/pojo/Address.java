package com.wyait.manage.pojo;

import java.util.Date;
import javax.persistence.*;

public class Address {
//    @Id
    private String id;

//    @Column(name = "user_id")
    private String userId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 电话
     */
    private String phone;

    /**
     * 地址
     */
    private String address;

    /**
     * 地址坐标
     */
    private String coordinate;

    /**
     * 备注
     */
    private String remark;

    /**
     * 详细地址
     */
    private String details;

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
     * 获取电话
     *
     * @return phone - 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取地址坐标
     *
     * @return coordinate - 地址坐标
     */
    public String getCoordinate() {
        return coordinate;
    }

    /**
     * 设置地址坐标
     *
     * @param coordinate 地址坐标
     */
    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取详细地址
     *
     * @return details - 详细地址
     */
    public String getDetails() {
        return details;
    }

    /**
     * 设置详细地址
     *
     * @param details 详细地址
     */
    public void setDetails(String details) {
        this.details = details;
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
}