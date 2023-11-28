package org.example; // Додайте пакетне визначення

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"org.example.aspect", "org.example.beans"})
@EnableAspectJAutoProxy
public class AppConfig {

    // Включення аспекту в конфігурацію
    @Bean
    public org.example.aspect.MyAspect myAspect() {
        return new org.example.aspect.MyAspect();
    }
}
