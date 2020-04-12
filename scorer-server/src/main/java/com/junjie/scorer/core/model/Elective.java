package com.junjie.scorer.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhangjunjie@sensorsdata.cn
 * @since 2020/4/12 8:13 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Elective {
  private long id;
  private long studentId;
  private long subjectId;
  private String status;
  private double score;
  private double ownCredit; // 获取到的学分
}
