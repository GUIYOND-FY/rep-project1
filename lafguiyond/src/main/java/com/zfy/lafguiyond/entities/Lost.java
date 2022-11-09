package com.zfy.lafguiyond.entities;

import lombok.*;

import java.util.Date;
import java.util.Objects;



public class Lost {
    private Integer lsid;
  private String ltitle;
  private String ltype;
  private String lkeyWord1;
  private String lkeyWord2;
  private String lkeyWord3;
  private String laddress;
  private String laddress1;
  private String lrealAddress;
  private Date ltime;
  private String lname;
  private String lcontact;
  private String ldetail;
  private String limage;
  private Integer id;
  private Integer lisDelete;

  public Lost() {
  }

  public Lost(Integer lsid, String ltitle, String ltype, String lkeyWord1, String lkeyWord2, String lkeyWord3, String laddress, String laddress1, String lrealAddress, Date ltime, String lname, String lcontact, String ldetail, String limage, Integer id, Integer lisDelete) {
    this.lsid = lsid;
    this.ltitle = ltitle;
    this.ltype = ltype;
    this.lkeyWord1 = lkeyWord1;
    this.lkeyWord2 = lkeyWord2;
    this.lkeyWord3 = lkeyWord3;
    this.laddress = laddress;
    this.laddress1 = laddress1;
    this.lrealAddress = lrealAddress;
    this.ltime = ltime;
    this.lname = lname;
    this.lcontact = lcontact;
    this.ldetail = ldetail;
    this.limage = limage;
    this.id = id;
    this.lisDelete = lisDelete;
  }

  public Integer getLsid() {
    return lsid;
  }

  public void setLsid(Integer lsid) {
    this.lsid = lsid;
  }

  public String getLtitle() {
    return ltitle;
  }

  public void setLtitle(String ltitle) {
    this.ltitle = ltitle;
  }

  public String getLtype() {
    return ltype;
  }

  public void setLtype(String ltype) {
    this.ltype = ltype;
  }

  public String getLkeyWord1() {
    return lkeyWord1;
  }

  public void setLkeyWord1(String lkeyWord1) {
    this.lkeyWord1 = lkeyWord1;
  }

  public String getLkeyWord2() {
    return lkeyWord2;
  }

  public void setLkeyWord2(String lkeyWord2) {
    this.lkeyWord2 = lkeyWord2;
  }

  public String getLkeyWord3() {
    return lkeyWord3;
  }

  public void setLkeyWord3(String lkeyWord3) {
    this.lkeyWord3 = lkeyWord3;
  }

  public String getLaddress() {
    return laddress;
  }

  public void setLaddress(String laddress) {
    this.laddress = laddress;
  }

  public String getLaddress1() {
    return laddress1;
  }

  public void setLaddress1(String laddress1) {
    this.laddress1 = laddress1;
  }

  public String getLrealAddress() {
    return lrealAddress;
  }

  public void setLrealAddress(String lrealAddress) {
    this.lrealAddress = lrealAddress;
  }

  public Date getLtime() {
    return ltime;
  }

  public void setLtime(Date ltime) {
    this.ltime = ltime;
  }

  public String getLname() {
    return lname;
  }

  public void setLname(String lname) {
    this.lname = lname;
  }

  public String getLcontact() {
    return lcontact;
  }

  public void setLcontact(String lcontact) {
    this.lcontact = lcontact;
  }

  public String getLdetail() {
    return ldetail;
  }

  public void setLdetail(String ldetail) {
    this.ldetail = ldetail;
  }

  public String getLimage() {
    return limage;
  }

  public void setLimage(String limage) {
    this.limage = limage;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getLisDelete() {
    return lisDelete;
  }

  public void setLisDelete(Integer lisDelete) {
    this.lisDelete = lisDelete;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Lost)) return false;
    Lost lost = (Lost) o;
    return Objects.equals(getLsid(), lost.getLsid()) &&
            Objects.equals(getLtitle(), lost.getLtitle()) &&
            Objects.equals(getLtype(), lost.getLtype()) &&
            Objects.equals(getLkeyWord1(), lost.getLkeyWord1()) &&
            Objects.equals(getLkeyWord2(), lost.getLkeyWord2()) &&
            Objects.equals(getLkeyWord3(), lost.getLkeyWord3()) &&
            Objects.equals(getLaddress(), lost.getLaddress()) &&
            Objects.equals(getLaddress1(), lost.getLaddress1()) &&
            Objects.equals(getLrealAddress(), lost.getLrealAddress()) &&
            Objects.equals(getLtime(), lost.getLtime()) &&
            Objects.equals(getLname(), lost.getLname()) &&
            Objects.equals(getLcontact(), lost.getLcontact()) &&
            Objects.equals(getLdetail(), lost.getLdetail()) &&
            Objects.equals(getLimage(), lost.getLimage()) &&
            Objects.equals(getId(), lost.getId()) &&
            Objects.equals(getLisDelete(), lost.getLisDelete());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getLsid(), getLtitle(), getLtype(), getLkeyWord1(), getLkeyWord2(), getLkeyWord3(), getLaddress(), getLaddress1(), getLrealAddress(), getLtime(), getLname(), getLcontact(), getLdetail(), getLimage(), getId(), getLisDelete());
  }

  @Override
  public String toString() {
    return "Lost{" +
            "lsid=" + lsid +
            ", ltitle='" + ltitle + '\'' +
            ", ltype='" + ltype + '\'' +
            ", lkeyWord1='" + lkeyWord1 + '\'' +
            ", lkeyWord2='" + lkeyWord2 + '\'' +
            ", lkeyWord3='" + lkeyWord3 + '\'' +
            ", laddress='" + laddress + '\'' +
            ", laddress1='" + laddress1 + '\'' +
            ", lrealAddress='" + lrealAddress + '\'' +
            ", ltime=" + ltime +
            ", lname='" + lname + '\'' +
            ", lcontact='" + lcontact + '\'' +
            ", ldetail='" + ldetail + '\'' +
            ", limage='" + limage + '\'' +
            ", id=" + id +
            ", lisDelete=" + lisDelete +
            '}';
  }
}
