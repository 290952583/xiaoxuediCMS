package com.wyait.manage.pojo;

import javax.persistence.*;

//@Table(name = "order_commodity")
public class OrderCommodity {
//    @Id
    private String id;

    /**
     * 订单id
     */
//    @Column(name = "order_id")
    private String orderId;

    /**
     * 商品id
     */
//    @Column(name = "commodity_id")
    private String commodityId;

    /**
     * 商品名称
     */
//    @Column(name = "commodity_name")
    private String commodityName;

    /**
     * 商品数量
     */
//    @Column(name = "commodity_sum")
    private Integer commoditySum;

    /**
     * 商品总价
     */
//    @Column(name = "commodity_amount_sum")
    private Long commodityAmountSum;

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
     * @return order_id - 订单id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单id
     *
     * @param orderId 订单id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取商品id
     *
     * @return commodity_id - 商品id
     */
    public String getCommodityId() {
        return commodityId;
    }

    /**
     * 设置商品id
     *
     * @param commodityId 商品id
     */
    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    /**
     * 获取商品名称
     *
     * @return commodity_name - 商品名称
     */
    public String getCommodityName() {
        return commodityName;
    }

    /**
     * 设置商品名称
     *
     * @param commodityName 商品名称
     */
    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    /**
     * 获取商品数量
     *
     * @return commodity_sum - 商品数量
     */
    public Integer getCommoditySum() {
        return commoditySum;
    }

    /**
     * 设置商品数量
     *
     * @param commoditySum 商品数量
     */
    public void setCommoditySum(Integer commoditySum) {
        this.commoditySum = commoditySum;
    }

    /**
     * 获取商品总价
     *
     * @return commodity_amount_sum - 商品总价
     */
    public Long getCommodityAmountSum() {
        return commodityAmountSum;
    }

    /**
     * 设置商品总价
     *
     * @param commodityAmountSum 商品总价
     */
    public void setCommodityAmountSum(Long commodityAmountSum) {
        this.commodityAmountSum = commodityAmountSum;
    }
}