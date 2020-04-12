package com.junjie.scorer.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhangjunjie@sensorsdata.cn
 * @since 2020/4/12 6:47 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Subject {
  private long id;
  private String name;
  private String type; // 课程类型
  private double credit; // 学分
}
