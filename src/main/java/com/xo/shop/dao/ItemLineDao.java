package com.xo.shop.dao;

import com.xo.shop.model.ItemLine;

public interface ItemLineDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ItemLine record);

    int insertSelective(ItemLine record);

    ItemLine selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ItemLine record);

    int updateByPrimaryKey(ItemLine record);
}