package com.junjie.scorer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangjunjie@sensorsdata.cn
 * @since 2020/4/12 2:20 AM
 */

@SpringBootApplication
@MapperScan("com.junjie.scorer.core.dao")
public class ScorerApplication {

  public static void main(String[] args) {
    SpringApplication.run(ScorerApplication.class, args);
  }
}
