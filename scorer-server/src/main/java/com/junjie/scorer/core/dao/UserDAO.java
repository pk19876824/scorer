package com.junjie.scorer.core.dao;

import com.junjie.scorer.core.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author zhangjunjie@sensorsdata.cn
 * @since 2020/4/11 6:36 PM
 */
@Mapper
public interface UserDAO {

  @Select("SELECT * FROM user WHERE id = #{id} AND deleted = 0")
  User findById(@Param("id") long id);

  @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
  @Insert("INSERT INTO user "
      + " (account, password, name, email, telephone) "
      + " VALUES "
      + " (#{account}, #{password}, #{name}, #{email}, #{telephone})")
  int save(User user);
}
