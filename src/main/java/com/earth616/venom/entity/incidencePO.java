package com.earth616.venom.entity;

import java.io.Serializable;
import java.util.Date;

public class incidencePO implements Serializable {
    private String storeId;

    private String wanIpAddr;

    private Integer wanPort;

    private Date startTime;

    private Date clearTime;

    private static final long serialVersionUID = 1L;

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId == null ? null : storeId.trim();
    }

    public String getWanIpAddr() {
        return wanIpAddr;
    }

    public void setWanIpAddr(String wanIpAddr) {
        this.wanIpAddr = wanIpAddr == null ? null : wanIpAddr.trim();
    }

    public Integer getWanPort() {
        return wanPort;
    }

    public void setWanPort(Integer wanPort) {
        this.wanPort = wanPort;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getClearTime() {
        return clearTime;
    }

    public void setClearTime(Date clearTime) {
        this.clearTime = clearTime;
    }
}