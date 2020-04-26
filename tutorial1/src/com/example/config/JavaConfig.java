package com.example.config;

import com.example.domain.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan(basePackages = { "com.example.*" })
@PropertySource("classpath:member.properties")
public class JavaConfig {

    @Bean
    public Catchphrase meme(){
        return new MemeCatchphrase();
    }

    @Bean
    public Member kaiwan(){
        return new CGM48Member("Kaiwan", meme());
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
