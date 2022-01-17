package com.leantech.vehicle.proxy.filter;

import java.net.URI;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.cloud.gateway.support.ServerWebExchangeUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class LogFilter implements GlobalFilter {
  Log log = LogFactory.getLog(LogFilter.class);

  /**
   * Filter that log the header of each request that the user made through the proxy
   * @param exchange
   * @param chain
   * @return
   */
  @Override
  public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
    log.info("HTTP Method: " + exchange.getRequest().getMethodValue());
    log.info("Incoming request " + exchange.getRequest().getPath() + " is routed to:" + exchange.getAttribute(ServerWebExchangeUtils.GATEWAY_REQUEST_URL_ATTR));
    log.info("Headers: " + exchange.getRequest().getHeaders());
    return chain.filter(exchange);
  }
}
