package com.lorelei;

import com.lorelei.config.LoreleiWebAppInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class LoreleiApplication extends SpringBootServletInitializer
{
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder)
    {
        return builder.sources(LoreleiWebAppInitializer.class);
    }

    public static void main(String[] args)
    {
        SpringApplication.run(LoreleiWebAppInitializer.class, args);
    }
}
