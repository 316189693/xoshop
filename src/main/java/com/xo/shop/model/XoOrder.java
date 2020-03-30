package com.xo.shop.model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * xo_order
 * @author 
 */
public class XoOrder implements Serializable {
    private Integer id;

    /**
     * 订单号
     */
    private String order_no;

    /**
     * 总价
     */
    private Double amount;

    /**
     * 实际售价
     */
    private Double actual_amount;

    private LocalDateTime order_create_date;

    private Integer order_create_by;

    private Integer discount_strategy;

    private Float discount;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getActual_amount() {
        return actual_amount;
    }

    public void setActual_amount(Double actual_amount) {
        this.actual_amount = actual_amount;
    }

    public LocalDateTime getOrder_create_date() {
        return order_create_date;
    }

    public void setOrder_create_date(LocalDateTime order_create_date) {
        this.order_create_date = order_create_date;
    }

    public Integer getOrder_create_by() {
        return order_create_by;
    }

    public void setOrder_create_by(Integer order_create_by) {
        this.order_create_by = order_create_by;
    }

    public Integer getDiscount_strategy() {
        return discount_strategy;
    }

    public void setDiscount_strategy(Integer discount_strategy) {
        this.discount_strategy = discount_strategy;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
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
        XoOrder other = (XoOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrder_no() == null ? other.getOrder_no() == null : this.getOrder_no().equals(other.getOrder_no()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getActual_amount() == null ? other.getActual_amount() == null : this.getActual_amount().equals(other.getActual_amount()))
            && (this.getOrder_create_date() == null ? other.getOrder_create_date() == null : this.getOrder_create_date().equals(other.getOrder_create_date()))
            && (this.getOrder_create_by() == null ? other.getOrder_create_by() == null : this.getOrder_create_by().equals(other.getOrder_create_by()))
            && (this.getDiscount_strategy() == null ? other.getDiscount_strategy() == null : this.getDiscount_strategy().equals(other.getDiscount_strategy()))
            && (this.getDiscount() == null ? other.getDiscount() == null : this.getDiscount().equals(other.getDiscount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrder_no() == null) ? 0 : getOrder_no().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getActual_amount() == null) ? 0 : getActual_amount().hashCode());
        result = prime * result + ((getOrder_create_date() == null) ? 0 : getOrder_create_date().hashCode());
        result = prime * result + ((getOrder_create_by() == null) ? 0 : getOrder_create_by().hashCode());
        result = prime * result + ((getDiscount_strategy() == null) ? 0 : getDiscount_strategy().hashCode());
        result = prime * result + ((getDiscount() == null) ? 0 : getDiscount().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", order_no=").append(order_no);
        sb.append(", amount=").append(amount);
        sb.append(", actual_amount=").append(actual_amount);
        sb.append(", order_create_date=").append(order_create_date);
        sb.append(", order_create_by=").append(order_create_by);
        sb.append(", discount_strategy=").append(discount_strategy);
        sb.append(", discount=").append(discount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}