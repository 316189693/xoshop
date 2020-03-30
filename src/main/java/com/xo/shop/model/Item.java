package com.xo.shop.model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * item
 * @author 
 */
public class Item implements Serializable {
    private Integer id;

    private String name;

    /**
     * 进货价
     */
    private Double purchasing_cost;

    private Double price;

    /**
     * 几组， 一组有几个型号， 每个型号几件
     */
    private Integer sets;

    private String color;

    /**
     * 产品编号
     */
    private String item_no;

    /**
     * 产品类别
     */
    private String item_type;

    /**
     * 品牌名称
     */
    private String brand;

    private Double vip_price;

    private LocalDateTime purchase_date;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPurchasing_cost() {
        return purchasing_cost;
    }

    public void setPurchasing_cost(Double purchasing_cost) {
        this.purchasing_cost = purchasing_cost;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getSets() {
        return sets;
    }

    public void setSets(Integer sets) {
        this.sets = sets;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getItem_no() {
        return item_no;
    }

    public void setItem_no(String item_no) {
        this.item_no = item_no;
    }

    public String getItem_type() {
        return item_type;
    }

    public void setItem_type(String item_type) {
        this.item_type = item_type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getVip_price() {
        return vip_price;
    }

    public void setVip_price(Double vip_price) {
        this.vip_price = vip_price;
    }

    public LocalDateTime getPurchase_date() {
        return purchase_date;
    }

    public void setPurchase_date(LocalDateTime purchase_date) {
        this.purchase_date = purchase_date;
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
        Item other = (Item) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPurchasing_cost() == null ? other.getPurchasing_cost() == null : this.getPurchasing_cost().equals(other.getPurchasing_cost()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getSets() == null ? other.getSets() == null : this.getSets().equals(other.getSets()))
            && (this.getColor() == null ? other.getColor() == null : this.getColor().equals(other.getColor()))
            && (this.getItem_no() == null ? other.getItem_no() == null : this.getItem_no().equals(other.getItem_no()))
            && (this.getItem_type() == null ? other.getItem_type() == null : this.getItem_type().equals(other.getItem_type()))
            && (this.getBrand() == null ? other.getBrand() == null : this.getBrand().equals(other.getBrand()))
            && (this.getVip_price() == null ? other.getVip_price() == null : this.getVip_price().equals(other.getVip_price()))
            && (this.getPurchase_date() == null ? other.getPurchase_date() == null : this.getPurchase_date().equals(other.getPurchase_date()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPurchasing_cost() == null) ? 0 : getPurchasing_cost().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getSets() == null) ? 0 : getSets().hashCode());
        result = prime * result + ((getColor() == null) ? 0 : getColor().hashCode());
        result = prime * result + ((getItem_no() == null) ? 0 : getItem_no().hashCode());
        result = prime * result + ((getItem_type() == null) ? 0 : getItem_type().hashCode());
        result = prime * result + ((getBrand() == null) ? 0 : getBrand().hashCode());
        result = prime * result + ((getVip_price() == null) ? 0 : getVip_price().hashCode());
        result = prime * result + ((getPurchase_date() == null) ? 0 : getPurchase_date().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", purchasing_cost=").append(purchasing_cost);
        sb.append(", price=").append(price);
        sb.append(", sets=").append(sets);
        sb.append(", color=").append(color);
        sb.append(", item_no=").append(item_no);
        sb.append(", item_type=").append(item_type);
        sb.append(", brand=").append(brand);
        sb.append(", vip_price=").append(vip_price);
        sb.append(", purchase_date=").append(purchase_date);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}