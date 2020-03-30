package com.xo.shop.dao;

import com.xo.shop.model.RoleMenuLink;

public interface RoleMenuLinkDao {
    int deleteByPrimaryKey(Integer id);

    int insert(RoleMenuLink record);

    int insertSelective(RoleMenuLink record);

    RoleMenuLink selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoleMenuLink record);

    int updateByPrimaryKey(RoleMenuLink record);
}