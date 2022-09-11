package com.example.server.entity.video;

import java.io.Serializable;

/**
 * usertovideo
 * @author 
 */
public class UsertovideoKey implements Serializable {
    private String videodm;

    private String usercode;

    private String type;

    private static final long serialVersionUID = 1L;

    public String getVideodm() {
        return videodm;
    }

    public void setVideodm(String videodm) {
        this.videodm = videodm;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        UsertovideoKey other = (UsertovideoKey) that;
        return (this.getVideodm() == null ? other.getVideodm() == null : this.getVideodm().equals(other.getVideodm()))
            && (this.getUsercode() == null ? other.getUsercode() == null : this.getUsercode().equals(other.getUsercode()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVideodm() == null) ? 0 : getVideodm().hashCode());
        result = prime * result + ((getUsercode() == null) ? 0 : getUsercode().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", videodm=").append(videodm);
        sb.append(", usercode=").append(usercode);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}