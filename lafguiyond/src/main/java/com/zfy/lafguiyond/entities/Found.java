package com.zfy.lafguiyond.entities;

import java.util.Date;
import java.util.Objects;

public class Found {
            private Integer sid;
            private String title;
            private String type;
            private String keyWord1;
            private String keyWord2;
            private String keyWord3;
            private String address;
            private String address1;
            private String realAddress;
            private Date time;
            private String name;
            private String contact;
            private String detail;
            private String image;
            private Integer id;
            private Integer isDelete;


    public Found() {
    }


    public Found(Integer sid, String title, String type, String keyWord1, String keyWord2, String keyWord3, String address, String address1, String realAddress, Date time, String name, String contact, String detail, String image, Integer id, Integer isDelete) {
        this.sid = sid;
        this.title = title;
        this.type = type;
        this.keyWord1 = keyWord1;
        this.keyWord2 = keyWord2;
        this.keyWord3 = keyWord3;
        this.address = address;
        this.address1 = address1;
        this.realAddress = realAddress;
        this.time = time;
        this.name = name;
        this.contact = contact;
        this.detail = detail;
        this.image = image;
        this.id = id;
        this.isDelete = isDelete;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKeyWord1() {
        return keyWord1;
    }

    public void setKeyWord1(String keyWord1) {
        this.keyWord1 = keyWord1;
    }

    public String getKeyWord2() {
        return keyWord2;
    }

    public void setKeyWord2(String keyWord2) {
        this.keyWord2 = keyWord2;
    }

    public String getKeyWord3() {
        return keyWord3;
    }

    public void setKeyWord3(String keyWord3) {
        this.keyWord3 = keyWord3;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getRealAddress() {
        return realAddress;
    }

    public void setRealAddress(String realAddress) {
        this.realAddress = realAddress;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        if (!(o instanceof Found)) return false;
        Found found = (Found) o;
        return Objects.equals(getSid(), found.getSid()) &&
                Objects.equals(getTitle(), found.getTitle()) &&
                Objects.equals(getType(), found.getType()) &&
                Objects.equals(getKeyWord1(), found.getKeyWord1()) &&
                Objects.equals(getKeyWord2(), found.getKeyWord2()) &&
                Objects.equals(getKeyWord3(), found.getKeyWord3()) &&
                Objects.equals(getAddress(), found.getAddress()) &&
                Objects.equals(getAddress1(), found.getAddress1()) &&
                Objects.equals(getRealAddress(), found.getRealAddress()) &&
                Objects.equals(getTime(), found.getTime()) &&
                Objects.equals(getName(), found.getName()) &&
                Objects.equals(getContact(), found.getContact()) &&
                Objects.equals(getDetail(), found.getDetail()) &&
                Objects.equals(getImage(), found.getImage()) &&
                Objects.equals(getId(), found.getId()) &&
                Objects.equals(getIsDelete(), found.getIsDelete());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSid(), getTitle(), getType(), getKeyWord1(), getKeyWord2(), getKeyWord3(), getAddress(), getAddress1(), getRealAddress(), getTime(), getName(), getContact(), getDetail(), getImage(), getId(), getIsDelete());
    }

    @Override
    public String toString() {
        return "Found{" +
                "sid=" + sid +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", keyWord1='" + keyWord1 + '\'' +
                ", keyWord2='" + keyWord2 + '\'' +
                ", keyWord3='" + keyWord3 + '\'' +
                ", address='" + address + '\'' +
                ", address1='" + address1 + '\'' +
                ", realAddress='" + realAddress + '\'' +
                ", time=" + time +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", detail='" + detail + '\'' +
                ", image='" + image + '\'' +
                ", id=" + id +
                ", isDelete=" + isDelete +
                '}';
    }
}
