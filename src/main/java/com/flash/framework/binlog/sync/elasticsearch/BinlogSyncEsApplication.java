package com.flash.framework.binlog.sync.elasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhurg
 * @date 2020/12/4 - 下午5:40
 */
@SpringBootApplication
public class BinlogSyncEsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BinlogSyncEsApplication.class, args);
    }
}