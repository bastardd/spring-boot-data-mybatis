package com.tzl.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;

@org.springframework.context.annotation.Configuration
public class MyBatisConfig {

    public ConfigurationCustomizer configurationCustomizer() {
        return new ConfigurationCustomizer() {
            @Override
            public void customize(Configuration configuration) {
                //开启驼峰命名规则，如数据库字段depart_name会自动和Bean里department的departName相对应
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }
}
