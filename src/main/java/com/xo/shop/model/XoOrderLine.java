package com.xo.shop.model;

import java.io.Serializable;

/**
 * xo_order_line
 * @author 
 */
public class XoOrderLine implements Serializable {
    private Integer id;

    private Integer fk_xo_order;

    private Integer fk_item_line;

    private Integer piece;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFk_xo_order() {
        return fk_xo_order;
    }

    public void setFk_xo_order(Integer fk_xo_order) {
        this.fk_xo_order = fk_xo_order;
    }

    public Integer getFk_item_line() {
        return fk_item_line;
    }

    public void setFk_item_line(Integer fk_item_line) {
        this.fk_item_line = fk_item_line;
    }

    public Integer getPiece() {
        return piece;
    }

    public void setPiece(Integer piece) {
        this.piece = piece;
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
        XoOrderLine other = (XoOrderLine) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFk_xo_order() == null ? other.getFk_xo_order() == null : this.getFk_xo_order().equals(other.getFk_xo_order()))
            && (this.getFk_item_line() == null ? other.getFk_item_line() == null : this.getFk_item_line().equals(other.getFk_item_line()))
            && (this.getPiece() == null ? other.getPiece() == null : this.getPiece().equals(other.getPiece()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFk_xo_order() == null) ? 0 : getFk_xo_order().hashCode());
        result = prime * result + ((getFk_item_line() == null) ? 0 : getFk_item_line().hashCode());
        result = prime * result + ((getPiece() == null) ? 0 : getPiece().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", fk_xo_order=").append(fk_xo_order);
        sb.append(", fk_item_line=").append(fk_item_line);
        sb.append(", piece=").append(piece);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}