package ru.smal.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.smal")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
