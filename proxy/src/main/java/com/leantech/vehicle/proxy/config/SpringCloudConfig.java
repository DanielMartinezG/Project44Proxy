package com.leantech.vehicle.proxy.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {

  @Bean
  public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {

    return builder.routes()
        .route(route -> route.path("/selling/**")
            .uri("vehicle-selling:8082"))
        .route(route -> route.path("/buying/**")
            .uri("vehicle-buying:8081"))
        .build();

  }
}
