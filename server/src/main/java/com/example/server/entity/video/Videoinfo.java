package com.example.server.entity.video;

import java.io.Serializable;
import java.util.Date;

/**
 * videoinfo
 * @author 
 */
public class Videoinfo implements Serializable {
    private String videodm;

    private String videomc;

    private String submc;

    private String sfky;

    private String typeM;

    private String sfsf;

    private Double sfbz;

    private String sfgk;

    private String imgwjlj;

    private String imgwjmc;

    private String previewwjlj;

    private String previewwjmc;

    private String wjlj;

    private String wjmc;

    private String fvideodm;

    private String briefinfo;

    private String createUser;

    private Date createDate;

    private String updateUser;

    private Date updateDate;

    private static final long serialVersionUID = 1L;

    public String getVideodm() {
        return videodm;
    }

    public void setVideodm(String videodm) {
        this.videodm = videodm;
    }

    public String getVideomc() {
        return videomc;
    }

    public void setVideomc(String videomc) {
        this.videomc = videomc;
    }

    public String getSubmc() {
        return submc;
    }

    public void setSubmc(String submc) {
        this.submc = submc;
    }

    public String getSfky() {
        return sfky;
    }

    public void setSfky(String sfky) {
        this.sfky = sfky;
    }

    public String getTypeM() {
        return typeM;
    }

    public void setTypeM(String typeM) {
        this.typeM = typeM;
    }

    public String getSfsf() {
        return sfsf;
    }

    public void setSfsf(String sfsf) {
        this.sfsf = sfsf;
    }

    public Double getSfbz() {
        return sfbz;
    }

    public void setSfbz(Double sfbz) {
        this.sfbz = sfbz;
    }

    public String getSfgk() {
        return sfgk;
    }

    public void setSfgk(String sfgk) {
        this.sfgk = sfgk;
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

    public String getPreviewwjlj() {
        return previewwjlj;
    }

    public void setPreviewwjlj(String previewwjlj) {
        this.previewwjlj = previewwjlj;
    }

    public String getPreviewwjmc() {
        return previewwjmc;
    }

    public void setPreviewwjmc(String previewwjmc) {
        this.previewwjmc = previewwjmc;
    }

    public String getWjlj() {
        return wjlj;
    }

    public void setWjlj(String wjlj) {
        this.wjlj = wjlj;
    }

    public String getWjmc() {
        return wjmc;
    }

    public void setWjmc(String wjmc) {
        this.wjmc = wjmc;
    }

    public String getFvideodm() {
        return fvideodm;
    }

    public void setFvideodm(String fvideodm) {
        this.fvideodm = fvideodm;
    }

    public String getBriefinfo() {
        return briefinfo;
    }

    public void setBriefinfo(String briefinfo) {
        this.briefinfo = briefinfo;
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
        Videoinfo other = (Videoinfo) that;
        return (this.getVideodm() == null ? other.getVideodm() == null : this.getVideodm().equals(other.getVideodm()))
            && (this.getVideomc() == null ? other.getVideomc() == null : this.getVideomc().equals(other.getVideomc()))
            && (this.getSubmc() == null ? other.getSubmc() == null : this.getSubmc().equals(other.getSubmc()))
            && (this.getSfky() == null ? other.getSfky() == null : this.getSfky().equals(other.getSfky()))
            && (this.getTypeM() == null ? other.getTypeM() == null : this.getTypeM().equals(other.getTypeM()))
            && (this.getSfsf() == null ? other.getSfsf() == null : this.getSfsf().equals(other.getSfsf()))
            && (this.getSfbz() == null ? other.getSfbz() == null : this.getSfbz().equals(other.getSfbz()))
            && (this.getSfgk() == null ? other.getSfgk() == null : this.getSfgk().equals(other.getSfgk()))
            && (this.getImgwjlj() == null ? other.getImgwjlj() == null : this.getImgwjlj().equals(other.getImgwjlj()))
            && (this.getImgwjmc() == null ? other.getImgwjmc() == null : this.getImgwjmc().equals(other.getImgwjmc()))
            && (this.getPreviewwjlj() == null ? other.getPreviewwjlj() == null : this.getPreviewwjlj().equals(other.getPreviewwjlj()))
            && (this.getPreviewwjmc() == null ? other.getPreviewwjmc() == null : this.getPreviewwjmc().equals(other.getPreviewwjmc()))
            && (this.getWjlj() == null ? other.getWjlj() == null : this.getWjlj().equals(other.getWjlj()))
            && (this.getWjmc() == null ? other.getWjmc() == null : this.getWjmc().equals(other.getWjmc()))
            && (this.getFvideodm() == null ? other.getFvideodm() == null : this.getFvideodm().equals(other.getFvideodm()))
            && (this.getBriefinfo() == null ? other.getBriefinfo() == null : this.getBriefinfo().equals(other.getBriefinfo()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVideodm() == null) ? 0 : getVideodm().hashCode());
        result = prime * result + ((getVideomc() == null) ? 0 : getVideomc().hashCode());
        result = prime * result + ((getSubmc() == null) ? 0 : getSubmc().hashCode());
        result = prime * result + ((getSfky() == null) ? 0 : getSfky().hashCode());
        result = prime * result + ((getTypeM() == null) ? 0 : getTypeM().hashCode());
        result = prime * result + ((getSfsf() == null) ? 0 : getSfsf().hashCode());
        result = prime * result + ((getSfbz() == null) ? 0 : getSfbz().hashCode());
        result = prime * result + ((getSfgk() == null) ? 0 : getSfgk().hashCode());
        result = prime * result + ((getImgwjlj() == null) ? 0 : getImgwjlj().hashCode());
        result = prime * result + ((getImgwjmc() == null) ? 0 : getImgwjmc().hashCode());
        result = prime * result + ((getPreviewwjlj() == null) ? 0 : getPreviewwjlj().hashCode());
        result = prime * result + ((getPreviewwjmc() == null) ? 0 : getPreviewwjmc().hashCode());
        result = prime * result + ((getWjlj() == null) ? 0 : getWjlj().hashCode());
        result = prime * result + ((getWjmc() == null) ? 0 : getWjmc().hashCode());
        result = prime * result + ((getFvideodm() == null) ? 0 : getFvideodm().hashCode());
        result = prime * result + ((getBriefinfo() == null) ? 0 : getBriefinfo().hashCode());
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
        sb.append(", videodm=").append(videodm);
        sb.append(", videomc=").append(videomc);
        sb.append(", submc=").append(submc);
        sb.append(", sfky=").append(sfky);
        sb.append(", typeM=").append(typeM);
        sb.append(", sfsf=").append(sfsf);
        sb.append(", sfbz=").append(sfbz);
        sb.append(", sfgk=").append(sfgk);
        sb.append(", imgwjlj=").append(imgwjlj);
        sb.append(", imgwjmc=").append(imgwjmc);
        sb.append(", previewwjlj=").append(previewwjlj);
        sb.append(", previewwjmc=").append(previewwjmc);
        sb.append(", wjlj=").append(wjlj);
        sb.append(", wjmc=").append(wjmc);
        sb.append(", fvideodm=").append(fvideodm);
        sb.append(", briefinfo=").append(briefinfo);
        sb.append(", createUser=").append(createUser);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}