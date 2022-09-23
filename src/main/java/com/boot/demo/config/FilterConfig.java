package com.boot.demo.config;

import com.alibaba.csp.sentinel.adapter.servlet.CommonFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean sentinelFilterRegistration() {
        FilterRegistrationBean<Filter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new CommonFilter());
        registration.addUrlPatterns("/*");
        //接入 filter 之后，所有访问的 Web URL 就会被自动统计为 Sentinel 的资源，可以针对单个 URL 维度进行流控。
        // 若希望区分不同 HTTP Method，可以将 HTTP_METHOD_SPECIFY 这个 init parameter 设为 true，
        // 给每个 URL 资源加上前缀，比如 GET:/foo。  false只是显示 /foo
//        registration.addInitParameter(CommonFilter.HTTP_METHOD_SPECIFY, "true");
        registration.setName("sentinelFilter");
        registration.setOrder(1);

        return registration;
    }
}