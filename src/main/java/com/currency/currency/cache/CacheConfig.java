package com.currency.currency.cache;

import com.currency.currency.entity.ConversionHistory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class CacheConfig {

    @Bean
    public Map<String, List<ConversionHistory>> conversionHistoryCache() {
        return new HashMap<>();
    }
}