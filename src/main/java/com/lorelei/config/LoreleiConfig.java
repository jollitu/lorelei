package com.lorelei.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.lorelei.controller", "com.lorelei.dao", "com.lorelei.service"})
@PropertySource(value = "application.properties")
public class LoreleiConfig
{
}
