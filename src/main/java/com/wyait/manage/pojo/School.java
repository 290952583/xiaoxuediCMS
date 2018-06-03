package com.wyait.manage.pojo;

import javax.persistence.*;

public class School {
    private String id;

    /**
     * 学校名称
     */
    private String school;

    /**
     * 学校坐标
     */
    private String coordinate;

    /**
     * 地址
     */
    private String address;

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
     * 获取学校名称
     *
     * @return school - 学校名称
     */
    public String getSchool() {
        return school;
    }

    /**
     * 设置学校名称
     *
     * @param school 学校名称
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * 获取学校坐标
     *
     * @return coordinate - 学校坐标
     */
    public String getCoordinate() {
        return coordinate;
    }

    /**
     * 设置学校坐标
     *
     * @param coordinate 学校坐标
     */
    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
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
}