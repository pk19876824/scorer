package com.junjie.scorer.core.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhangjunjie@sensorsdata.cn
 * @since 2020/4/13 12:18 AM
 */
@Mapper
public interface ElectiveDAO {

  @Insert("INSERT INTO elective ()")
  int save();
}
