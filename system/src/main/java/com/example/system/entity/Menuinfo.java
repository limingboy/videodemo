package com.example.system.entity;

import java.io.Serializable;

/**
 * menuinfo
 * @author 
 */
public class Menuinfo implements Serializable {
    private String menucode;

    private String parentcode;

    private String menuname;

    private String state;

    private String linkurl;

    private String iconurl;

    private static final long serialVersionUID = 1L;

    public String getMenucode() {
        return menucode;
    }

    public void setMenucode(String menucode) {
        this.menucode = menucode;
    }

    public String getParentcode() {
        return parentcode;
    }

    public void setParentcode(String parentcode) {
        this.parentcode = parentcode;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLinkurl() {
        return linkurl;
    }

    public void setLinkurl(String linkurl) {
        this.linkurl = linkurl;
    }

    public String getIconurl() {
        return iconurl;
    }

    public void setIconurl(String iconurl) {
        this.iconurl = iconurl;
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
        Menuinfo other = (Menuinfo) that;
        return (this.getMenucode() == null ? other.getMenucode() == null : this.getMenucode().equals(other.getMenucode()))
            && (this.getParentcode() == null ? other.getParentcode() == null : this.getParentcode().equals(other.getParentcode()))
            && (this.getMenuname() == null ? other.getMenuname() == null : this.getMenuname().equals(other.getMenuname()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getLinkurl() == null ? other.getLinkurl() == null : this.getLinkurl().equals(other.getLinkurl()))
            && (this.getIconurl() == null ? other.getIconurl() == null : this.getIconurl().equals(other.getIconurl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMenucode() == null) ? 0 : getMenucode().hashCode());
        result = prime * result + ((getParentcode() == null) ? 0 : getParentcode().hashCode());
        result = prime * result + ((getMenuname() == null) ? 0 : getMenuname().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getLinkurl() == null) ? 0 : getLinkurl().hashCode());
        result = prime * result + ((getIconurl() == null) ? 0 : getIconurl().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", menucode=").append(menucode);
        sb.append(", parentcode=").append(parentcode);
        sb.append(", menuname=").append(menuname);
        sb.append(", state=").append(state);
        sb.append(", linkurl=").append(linkurl);
        sb.append(", iconurl=").append(iconurl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}