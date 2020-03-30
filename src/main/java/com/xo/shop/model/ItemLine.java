package com.xo.shop.model;

import java.io.Serializable;

/**
 * item_line
 * @author 
 */
public class ItemLine implements Serializable {
    private Integer id;

    private Integer fk_item_id;

    /**
     * 件数
     */
    private Integer piece;

    /**
     * 型号
     */
    private String type;

    /**
     * 条形码
     */
    private String bar_code;

    private Integer remains;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFk_item_id() {
        return fk_item_id;
    }

    public void setFk_item_id(Integer fk_item_id) {
        this.fk_item_id = fk_item_id;
    }

    public Integer getPiece() {
        return piece;
    }

    public void setPiece(Integer piece) {
        this.piece = piece;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBar_code() {
        return bar_code;
    }

    public void setBar_code(String bar_code) {
        this.bar_code = bar_code;
    }

    public Integer getRemains() {
        return remains;
    }

    public void setRemains(Integer remains) {
        this.remains = remains;
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
        ItemLine other = (ItemLine) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFk_item_id() == null ? other.getFk_item_id() == null : this.getFk_item_id().equals(other.getFk_item_id()))
            && (this.getPiece() == null ? other.getPiece() == null : this.getPiece().equals(other.getPiece()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getBar_code() == null ? other.getBar_code() == null : this.getBar_code().equals(other.getBar_code()))
            && (this.getRemains() == null ? other.getRemains() == null : this.getRemains().equals(other.getRemains()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFk_item_id() == null) ? 0 : getFk_item_id().hashCode());
        result = prime * result + ((getPiece() == null) ? 0 : getPiece().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getBar_code() == null) ? 0 : getBar_code().hashCode());
        result = prime * result + ((getRemains() == null) ? 0 : getRemains().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", fk_item_id=").append(fk_item_id);
        sb.append(", piece=").append(piece);
        sb.append(", type=").append(type);
        sb.append(", bar_code=").append(bar_code);
        sb.append(", remains=").append(remains);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}