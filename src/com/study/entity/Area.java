package com.study.entity;

import java.io.Serializable;

/**
 * @Auther: zhaotj
 * @Date: 2021/5/4 0004 - 05 - 04 - 22:48
 * @version: 1.0
 */
public class Area implements Serializable {
    private Integer areaid;
    private String areaname;
    private Integer parentid;
    private Integer arealevel;
    private Integer status;

    @Override
    public String toString() {
        return "Area{" +
                "areaid=" + areaid +
                ", areaname='" + areaname + '\'' +
                ", parentid=" + parentid +
                ", arealevel=" + arealevel +
                ", status=" + status +
                '}';
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getArealevel() {
        return arealevel;
    }

    public void setArealevel(Integer arealevel) {
        this.arealevel = arealevel;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Area() {
    }

    public Area(Integer areaid, String areaname, Integer parentid, Integer arealevel, Integer status) {
        this.areaid = areaid;
        this.areaname = areaname;
        this.parentid = parentid;
        this.arealevel = arealevel;
        this.status = status;
    }
}
