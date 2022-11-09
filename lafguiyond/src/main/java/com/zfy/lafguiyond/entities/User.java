package com.zfy.lafguiyond.entities;


import java.util.Date;
import java.util.Objects;

public class User {
      private Integer id;
      private String username;
      private String password;
      private String phone;
      private String qq;
      private String mail;
      private String picture;
      private Date createTime;
      private Integer isDelete;

    public User() {
    }

    public User(Integer id, String username, String password, String phone, String qq, String mail, String picture, Date createTime, Integer isDelete) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.qq = qq;
        this.mail = mail;
        this.picture = picture;
        this.createTime = createTime;
        this.isDelete = isDelete;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
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
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getId(), user.getId()) &&
                Objects.equals(getUsername(), user.getUsername()) &&
                Objects.equals(getPassword(), user.getPassword()) &&
                Objects.equals(getPhone(), user.getPhone()) &&
                Objects.equals(getQq(), user.getQq()) &&
                Objects.equals(getMail(), user.getMail()) &&
                Objects.equals(getPicture(), user.getPicture()) &&
                Objects.equals(getCreateTime(), user.getCreateTime()) &&
                Objects.equals(getIsDelete(), user.getIsDelete());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUsername(), getPassword(), getPhone(), getQq(), getMail(), getPicture(), getCreateTime(), getIsDelete());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", qq='" + qq + '\'' +
                ", mail='" + mail + '\'' +
                ", picture='" + picture + '\'' +
                ", createTime=" + createTime +
                ", isDelete=" + isDelete +
                '}';
    }
}
