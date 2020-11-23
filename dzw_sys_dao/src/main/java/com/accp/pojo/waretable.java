package com.accp.pojo;

public class waretable {
    private Integer wareid;

    private String warename;

    private Integer waresort;

    private Integer wareamount;

    public Integer getWareid() {
        return wareid;
    }

    public void setWareid(Integer wareid) {
        this.wareid = wareid;
    }

    public String getWarename() {
        return warename;
    }

    public void setWarename(String warename) {
        this.warename = warename == null ? null : warename.trim();
    }

    public Integer getWaresort() {
        return waresort;
    }

    public void setWaresort(Integer waresort) {
        this.waresort = waresort;
    }

    public Integer getWareamount() {
        return wareamount;
    }

    public void setWareamount(Integer wareamount) {
        this.wareamount = wareamount;
    }
}