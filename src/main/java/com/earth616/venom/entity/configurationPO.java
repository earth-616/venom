package com.earth616.venom.entity;

import java.io.Serializable;

public class configurationPO implements Serializable {
    private String wanIp;

    private String storeid;

    private Integer wanPort;

    private static final long serialVersionUID = 1L;

    public String getWanIp() {
        return wanIp;
    }

    public void setWanIp(String wanIp) {
        this.wanIp = wanIp == null ? null : wanIp.trim();
    }

    public String getStoreid() {
        return storeid;
    }

    public void setStoreid(String storeid) {
        this.storeid = storeid == null ? null : storeid.trim();
    }

    public Integer getWanPort() {
        return wanPort;
    }

    public void setWanPort(Integer wanPort) {
        this.wanPort = wanPort;
    }
}