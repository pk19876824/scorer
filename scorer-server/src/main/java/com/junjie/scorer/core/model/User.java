package com.junjie.scorer.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhangjunjie@sensorsdata.cn
 * @since 2020/4/11 6:33 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
  private long id;
  private String account;
  private String password;
  private String name;
  private String email;
  private String telephone;
}
