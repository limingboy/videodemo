package com.example.system.entity;

import java.io.Serializable;

/**
 * datadic_data
 * @author 
 */
public class DatadicDataKey implements Serializable {
    private String secondtypedm;

    private String typedm;

    private static final long serialVersionUID = 1L;

    public String getSecondtypedm() {
        return secondtypedm;
    }

    public void setSecondtypedm(String secondtypedm) {
        this.secondtypedm = secondtypedm;
    }

    public String getTypedm() {
        return typedm;
    }

    public void setTypedm(String typedm) {
        this.typedm = typedm;
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
        DatadicDataKey other = (DatadicDataKey) that;
        return (this.getSecondtypedm() == null ? other.getSecondtypedm() == null : this.getSecondtypedm().equals(other.getSecondtypedm()))
            && (this.getTypedm() == null ? other.getTypedm() == null : this.getTypedm().equals(other.getTypedm()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSecondtypedm() == null) ? 0 : getSecondtypedm().hashCode());
        result = prime * result + ((getTypedm() == null) ? 0 : getTypedm().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", secondtypedm=").append(secondtypedm);
        sb.append(", typedm=").append(typedm);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}