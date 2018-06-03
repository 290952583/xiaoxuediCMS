package com.wyait.manage.pojo;

import java.util.Date;

public class PayInfo {
    private Integer id;

    private Integer ordersId;

    private String payType;

    private String payStatus;

    private Date createTime;

    private Date finishTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return orders_id
     */
    public Integer getOrdersId() {
        return ordersId;
    }

    /**
     * @param ordersId
     */
    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
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
     * @return pay_status
     */
    public String getPayStatus() {
        return payStatus;
    }

    /**
     * @param payStatus
     */
    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
}