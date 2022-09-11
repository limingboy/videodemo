package com.example.system.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * datadic_data
 * @author 
 */
public class DatadicData extends DatadicDataKey implements Serializable {
    private String secondmc;

    private String sfky;

    private String createUser;

    private Date createDate;

    private String updateUser;

    private Date updateDate;

    private static final long serialVersionUID = 1L;

    public String getSecondmc() {
        return secondmc;
    }

    public void setSecondmc(String secondmc) {
        this.secondmc = secondmc;
    }

    public String getSfky() {
        return sfky;
    }

    public void setSfky(String sfky) {
        this.sfky = sfky;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
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
        DatadicData other = (DatadicData) that;
        return (this.getSecondtypedm() == null ? other.getSecondtypedm() == null : this.getSecondtypedm().equals(other.getSecondtypedm()))
            && (this.getTypedm() == null ? other.getTypedm() == null : this.getTypedm().equals(other.getTypedm()))
            && (this.getSecondmc() == null ? other.getSecondmc() == null : this.getSecondmc().equals(other.getSecondmc()))
            && (this.getSfky() == null ? other.getSfky() == null : this.getSfky().equals(other.getSfky()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSecondtypedm() == null) ? 0 : getSecondtypedm().hashCode());
        result = prime * result + ((getTypedm() == null) ? 0 : getTypedm().hashCode());
        result = prime * result + ((getSecondmc() == null) ? 0 : getSecondmc().hashCode());
        result = prime * result + ((getSfky() == null) ? 0 : getSfky().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", secondmc=").append(secondmc);
        sb.append(", sfky=").append(sfky);
        sb.append(", createUser=").append(createUser);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}