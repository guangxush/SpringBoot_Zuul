package com.shgx.zuul;

import com.shgx.zuul.filter.AccessPasswordFilter;
import com.shgx.zuul.filter.AccessUserNameFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {
    @Bean
    public AccessUserNameFilter accessUserNameFilter() {
        return new AccessUserNameFilter();
    }

    @Bean
    public AccessPasswordFilter accessPasswordFilter(){
        return new AccessPasswordFilter();
    }

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }

}

