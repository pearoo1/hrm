package com.zl.hrm.dao;

import com.zl.hrm.pojo.User;
import com.zl.hrm.pojo.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_table
     *
     * @mbg.generated Fri Aug 30 14:07:56 CST 2019
     */
    long countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_table
     *
     * @mbg.generated Fri Aug 30 14:07:56 CST 2019
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_table
     *
     * @mbg.generated Fri Aug 30 14:07:56 CST 2019
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_table
     *
     * @mbg.generated Fri Aug 30 14:07:56 CST 2019
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_table
     *
     * @mbg.generated Fri Aug 30 14:07:56 CST 2019
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_table
     *
     * @mbg.generated Fri Aug 30 14:07:56 CST 2019
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_table
     *
     * @mbg.generated Fri Aug 30 14:07:56 CST 2019
     */
    User selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_table
     *
     * @mbg.generated Fri Aug 30 14:07:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_table
     *
     * @mbg.generated Fri Aug 30 14:07:56 CST 2019
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_table
     *
     * @mbg.generated Fri Aug 30 14:07:56 CST 2019
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_table
     *
     * @mbg.generated Fri Aug 30 14:07:56 CST 2019
     */
    int updateByPrimaryKey(User record);
}