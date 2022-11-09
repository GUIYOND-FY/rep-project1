package com.zfy.lafguiyond.entities;

import java.util.Date;
import java.util.Objects;

public class SysUser {
    private Integer sysId;
    private String sysName;
    private String sysPassword;
    private String sysPhone;
    private String sysPicture;
    private Date createTime;
    private Integer isDelete;

    public SysUser() {
    }

    public SysUser(Integer sysId, String sysName, String sysPassword, String sysPhone, String sysPicture, Date createTime, Integer isDelete) {
        this.sysId = sysId;
        this.sysName = sysName;
        this.sysPassword = sysPassword;
        this.sysPhone = sysPhone;
        this.sysPicture = sysPicture;
        this.createTime = createTime;
        this.isDelete = isDelete;
    }

    public Integer getSysId() {
        return sysId;
    }

    public void setSysId(Integer sysId) {
        this.sysId = sysId;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    public String getSysPassword() {
        return sysPassword;
    }

    public void setSysPassword(String sysPassword) {
        this.sysPassword = sysPassword;
    }

    public String getSysPhone() {
        return sysPhone;
    }

    public void setSysPhone(String sysPhone) {
        this.sysPhone = sysPhone;
    }

    public String getSysPicture() {
        return sysPicture;
    }

    public void setSysPicture(String sysPicture) {
        this.sysPicture = sysPicture;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SysUser)) return false;
        SysUser sysUser = (SysUser) o;
        return Objects.equals(getSysId(), sysUser.getSysId()) &&
                Objects.equals(getSysName(), sysUser.getSysName()) &&
                Objects.equals(getSysPassword(), sysUser.getSysPassword()) &&
                Objects.equals(getSysPhone(), sysUser.getSysPhone()) &&
                Objects.equals(getSysPicture(), sysUser.getSysPicture()) &&
                Objects.equals(getCreateTime(), sysUser.getCreateTime()) &&
                Objects.equals(getIsDelete(), sysUser.getIsDelete());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSysId(), getSysName(), getSysPassword(), getSysPhone(), getSysPicture(), getCreateTime(), getIsDelete());
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "sysId=" + sysId +
                ", sysName='" + sysName + '\'' +
                ", sysPassword='" + sysPassword + '\'' +
                ", sysPhone='" + sysPhone + '\'' +
                ", sysPicture='" + sysPicture + '\'' +
                ", createTime=" + createTime +
                ", isDelete=" + isDelete +
                '}';
    }
}
