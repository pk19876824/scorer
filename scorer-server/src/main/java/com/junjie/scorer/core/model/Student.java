package com.junjie.scorer.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhangjunjie@sensorsdata.cn
 * @since 2020/4/12 6:37 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
  private long id;
  private long userId;
}
