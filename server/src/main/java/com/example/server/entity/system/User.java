package com.example.server.entity.system;

import java.io.Serializable;
import java.util.Date;

/**
 * user
 * @author 
 */
public class User implements Serializable {
    private String usercode;

    private String pwd;

    private String sfky;

    private String sflock;

    private String phone;

    private String email;

    private String submc;

    private String imgwjlj;

    private String imgwjmc;

    private String motto;

    private String type;

    private Date createDate;

    private Date updateDate;

    private static final long serialVersionUID = 1L;

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSfky() {
        return sfky;
    }

    public void setSfky(String sfky) {
        this.sfky = sfky;
    }

    public String getSflock() {
        return sflock;
    }

    public void setSflock(String sflock) {
        this.sflock = sflock;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubmc() {
        return submc;
    }

    public void setSubmc(String submc) {
        this.submc = submc;
    }

    public String getImgwjlj() {
        return imgwjlj;
    }

    public void setImgwjlj(String imgwjlj) {
        this.imgwjlj = imgwjlj;
    }

    public String getImgwjmc() {
        return imgwjmc;
    }

    public void setImgwjmc(String imgwjmc) {
        this.imgwjmc = imgwjmc;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getUsercode() == null ? other.getUsercode() == null : this.getUsercode().equals(other.getUsercode()))
            && (this.getPwd() == null ? other.getPwd() == null : this.getPwd().equals(other.getPwd()))
            && (this.getSfky() == null ? other.getSfky() == null : this.getSfky().equals(other.getSfky()))
            && (this.getSflock() == null ? other.getSflock() == null : this.getSflock().equals(other.getSflock()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getSubmc() == null ? other.getSubmc() == null : this.getSubmc().equals(other.getSubmc()))
            && (this.getImgwjlj() == null ? other.getImgwjlj() == null : this.getImgwjlj().equals(other.getImgwjlj()))
            && (this.getImgwjmc() == null ? other.getImgwjmc() == null : this.getImgwjmc().equals(other.getImgwjmc()))
            && (this.getMotto() == null ? other.getMotto() == null : this.getMotto().equals(other.getMotto()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUsercode() == null) ? 0 : getUsercode().hashCode());
        result = prime * result + ((getPwd() == null) ? 0 : getPwd().hashCode());
        result = prime * result + ((getSfky() == null) ? 0 : getSfky().hashCode());
        result = prime * result + ((getSflock() == null) ? 0 : getSflock().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getSubmc() == null) ? 0 : getSubmc().hashCode());
        result = prime * result + ((getImgwjlj() == null) ? 0 : getImgwjlj().hashCode());
        result = prime * result + ((getImgwjmc() == null) ? 0 : getImgwjmc().hashCode());
        result = prime * result + ((getMotto() == null) ? 0 : getMotto().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", usercode=").append(usercode);
        sb.append(", pwd=").append(pwd);
        sb.append(", sfky=").append(sfky);
        sb.append(", sflock=").append(sflock);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", submc=").append(submc);
        sb.append(", imgwjlj=").append(imgwjlj);
        sb.append(", imgwjmc=").append(imgwjmc);
        sb.append(", motto=").append(motto);
        sb.append(", type=").append(type);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}