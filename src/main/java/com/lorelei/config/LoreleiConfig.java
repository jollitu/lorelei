package com.lorelei.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan({"com.lorelei.controller", "com.lorelei.repo", "com.lorelei.service"})
@PropertySources({
        @PropertySource("classpath:application.properties"),
        @PropertySource("classpath:env.properties")
    })
public class LoreleiConfig
{
}
