package com.xo.shop.dao;

import com.xo.shop.model.XoOrderLine;

public interface XoOrderLineDao {
    int deleteByPrimaryKey(Integer id);

    int insert(XoOrderLine record);

    int insertSelective(XoOrderLine record);

    XoOrderLine selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(XoOrderLine record);

    int updateByPrimaryKey(XoOrderLine record);
}