package com.example.server.entity.system;

import java.io.Serializable;
import java.util.Date;

/**
 * datadic
 * @author 
 */
public class Datadic implements Serializable {
    private String typedm;

    private String typemc;

    private String sfky;

    private String bzh;

    private String parenttypedm;

    private String createUser;

    private Date createDate;

    private String updateUser;

    private Date updateDate;

    private static final long serialVersionUID = 1L;

    public String getTypedm() {
        return typedm;
    }

    public void setTypedm(String typedm) {
        this.typedm = typedm;
    }

    public String getTypemc() {
        return typemc;
    }

    public void setTypemc(String typemc) {
        this.typemc = typemc;
    }

    public String getSfky() {
        return sfky;
    }

    public void setSfky(String sfky) {
        this.sfky = sfky;
    }

    public String getBzh() {
        return bzh;
    }

    public void setBzh(String bzh) {
        this.bzh = bzh;
    }

    public String getParenttypedm() {
        return parenttypedm;
    }

    public void setParenttypedm(String parenttypedm) {
        this.parenttypedm = parenttypedm;
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
        Datadic other = (Datadic) that;
        return (this.getTypedm() == null ? other.getTypedm() == null : this.getTypedm().equals(other.getTypedm()))
            && (this.getTypemc() == null ? other.getTypemc() == null : this.getTypemc().equals(other.getTypemc()))
            && (this.getSfky() == null ? other.getSfky() == null : this.getSfky().equals(other.getSfky()))
            && (this.getBzh() == null ? other.getBzh() == null : this.getBzh().equals(other.getBzh()))
            && (this.getParenttypedm() == null ? other.getParenttypedm() == null : this.getParenttypedm().equals(other.getParenttypedm()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTypedm() == null) ? 0 : getTypedm().hashCode());
        result = prime * result + ((getTypemc() == null) ? 0 : getTypemc().hashCode());
        result = prime * result + ((getSfky() == null) ? 0 : getSfky().hashCode());
        result = prime * result + ((getBzh() == null) ? 0 : getBzh().hashCode());
        result = prime * result + ((getParenttypedm() == null) ? 0 : getParenttypedm().hashCode());
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
        sb.append(", typedm=").append(typedm);
        sb.append(", typemc=").append(typemc);
        sb.append(", sfky=").append(sfky);
        sb.append(", bzh=").append(bzh);
        sb.append(", parenttypedm=").append(parenttypedm);
        sb.append(", createUser=").append(createUser);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}