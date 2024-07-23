package com.klapertart.elide.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

/**
 * @author tritronik
 * @since 7/22/2024
 */

@Configuration
public class SpringDocConfig {

    @Bean
    public GroupedOpenApi elideApi() {
        return GroupedOpenApi.builder()
                .group("elide")
                .pathsToMatch("/api/**")
                .build();
    }

}