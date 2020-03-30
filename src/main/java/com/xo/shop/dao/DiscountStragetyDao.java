package com.xo.shop.dao;

import com.xo.shop.model.DiscountStragety;

public interface DiscountStragetyDao {
    int deleteByPrimaryKey(Integer id);

    int insert(DiscountStragety record);

    int insertSelective(DiscountStragety record);

    DiscountStragety selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DiscountStragety record);

    int updateByPrimaryKey(DiscountStragety record);
}