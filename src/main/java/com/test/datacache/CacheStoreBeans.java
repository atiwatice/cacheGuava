package com.test.datacache;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.test.entity.Employee;

@Configuration
public class CacheStoreBeans {
	@Bean
    public CacheStore<Employee> employeeCache() {
        return new CacheStore<Employee>(120, TimeUnit.SECONDS);
    }

    @Bean
    public CacheStore<String> productNameCache() {
        return new CacheStore<String>(1, TimeUnit.HOURS);
    }
}
