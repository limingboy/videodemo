package com.example.server.entity.video;

import java.io.Serializable;
import java.util.Date;

/**
 * usertovideo
 * @author 
 */
public class Usertovideo extends UsertovideoKey implements Serializable {
    private Date recordtime;

    private String recentvideodm;

    private Date createDate;

    private Date updateDate;

    private static final long serialVersionUID = 1L;

    public Date getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(Date recordtime) {
        this.recordtime = recordtime;
    }

    public String getRecentvideodm() {
        return recentvideodm;
    }

    public void setRecentvideodm(String recentvideodm) {
        this.recentvideodm = recentvideodm;
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
        Usertovideo other = (Usertovideo) that;
        return (this.getVideodm() == null ? other.getVideodm() == null : this.getVideodm().equals(other.getVideodm()))
            && (this.getUsercode() == null ? other.getUsercode() == null : this.getUsercode().equals(other.getUsercode()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getRecordtime() == null ? other.getRecordtime() == null : this.getRecordtime().equals(other.getRecordtime()))
            && (this.getRecentvideodm() == null ? other.getRecentvideodm() == null : this.getRecentvideodm().equals(other.getRecentvideodm()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVideodm() == null) ? 0 : getVideodm().hashCode());
        result = prime * result + ((getUsercode() == null) ? 0 : getUsercode().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getRecordtime() == null) ? 0 : getRecordtime().hashCode());
        result = prime * result + ((getRecentvideodm() == null) ? 0 : getRecentvideodm().hashCode());
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
        sb.append(", recordtime=").append(recordtime);
        sb.append(", recentvideodm=").append(recentvideodm);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}