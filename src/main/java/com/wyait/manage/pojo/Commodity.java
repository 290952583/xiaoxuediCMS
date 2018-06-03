package com.wyait.manage.pojo;

import java.util.Date;
import javax.persistence.*;

public class Commodity {
//    @Id
    private String id;

    private String type;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 销量
     */
//    @Column(name = "sales_sum")
    private String salesSum;

    /**
     * 售价
     */
    private Long price;

    /**
     * 原价
     */
//    @Column(name = "original_price")
    private Long originalPrice;

    /**
     * 成本价
     */
//    @Column(name = "cost_price")
    private Long costPrice;

    /**
     * 商品图片
     */
    private String imgs;

    /**
     * 店铺id
     */
//    @Column(name = "business_id")
    private String businessId;

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
     * 获取商品名称
     *
     * @return name - 商品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商品名称
     *
     * @param name 商品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取销量
     *
     * @return sales_sum - 销量
     */
    public String getSalesSum() {
        return salesSum;
    }

    /**
     * 设置销量
     *
     * @param salesSum 销量
     */
    public void setSalesSum(String salesSum) {
        this.salesSum = salesSum;
    }

    /**
     * 获取售价
     *
     * @return price - 售价
     */
    public Long getPrice() {
        return price;
    }

    /**
     * 设置售价
     *
     * @param price 售价
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * 获取原价
     *
     * @return original_price - 原价
     */
    public Long getOriginalPrice() {
        return originalPrice;
    }

    /**
     * 设置原价
     *
     * @param originalPrice 原价
     */
    public void setOriginalPrice(Long originalPrice) {
        this.originalPrice = originalPrice;
    }

    /**
     * 获取成本价
     *
     * @return cost_price - 成本价
     */
    public Long getCostPrice() {
        return costPrice;
    }

    /**
     * 设置成本价
     *
     * @param costPrice 成本价
     */
    public void setCostPrice(Long costPrice) {
        this.costPrice = costPrice;
    }

    /**
     * 获取商品图片
     *
     * @return imgs - 商品图片
     */
    public String getImgs() {
        return imgs;
    }

    /**
     * 设置商品图片
     *
     * @param imgs 商品图片
     */
    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    /**
     * 获取店铺id
     *
     * @return business_id - 店铺id
     */
    public String getBusinessId() {
        return businessId;
    }

    /**
     * 设置店铺id
     *
     * @param businessId 店铺id
     */
    public void setBusinessId(String businessId) {
        this.businessId = businessId;
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