package com.junjie.scorer.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhangjunjie@sensorsdata.cn
 * @since 2020/4/12 9:29 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Teacher {
  private long id;
  private long userId;
}
