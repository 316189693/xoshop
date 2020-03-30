package com.xo.shop.dao;

import com.xo.shop.model.UserRoleLink;

public interface UserRoleLinkDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRoleLink record);

    int insertSelective(UserRoleLink record);

    UserRoleLink selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRoleLink record);

    int updateByPrimaryKey(UserRoleLink record);
}