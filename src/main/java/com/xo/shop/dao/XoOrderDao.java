package com.xo.shop.dao;

import com.xo.shop.model.XoOrder;

public interface XoOrderDao {
    int deleteByPrimaryKey(Integer id);

    int insert(XoOrder record);

    int insertSelective(XoOrder record);

    XoOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(XoOrder record);

    int updateByPrimaryKey(XoOrder record);
}