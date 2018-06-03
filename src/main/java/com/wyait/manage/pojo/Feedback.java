package com.wyait.manage.pojo;

import java.util.Date;
import javax.persistence.*;

public class Feedback {
//    @Id
    private String id;

//    @Column(name = "user_id")
    private String userId;

    private String feedback;

//    @Column(name = "create_time")
    private Date createTime;

    /**
     * 类别
     */
    private String type;

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
     * @return feedback
     */
    public String getFeedback() {
        return feedback;
    }

    /**
     * @param feedback
     */
    public void setFeedback(String feedback) {
        this.feedback = feedback;
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
     * 获取类别
     *
     * @return type - 类别
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类别
     *
     * @param type 类别
     */
    public void setType(String type) {
        this.type = type;
    }
}