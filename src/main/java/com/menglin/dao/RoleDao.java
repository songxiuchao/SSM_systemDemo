package com.menglin.dao;

import com.menglin.entity.Role;

import java.util.List;
import java.util.Map;

public interface RoleDao {

    Role selectByName(String name);

    List<Role> getRolesList();

    List<Role> queryRolesByIdList(Map<String, Object> map);

    List<Role> queryRolesByPage(Map<String, Object> map);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    int insert(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    int insertSelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    Role selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Sun May 13 12:10:50 CST 2018
     */
    int updateByPrimaryKey(Role record);
}