package com.ixtiyor.customer.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import java.nio.charset.StandardCharsets;

public class MessageSourceConfiguration {

    private static final String DEFAULT_BUNDLE_PATH = "classpath:messages/messages";
    private static final String DEFAULTS_PATH = "classpath:messages/defaults";

    @Bean
    public static ReloadableResourceBundleMessageSource messageSource() {
        var messageSource = new ReloadableResourceBundleMessageSource();

        messageSource.setBasenames(DEFAULT_BUNDLE_PATH, DEFAULTS_PATH);
        messageSource.setDefaultEncoding(StandardCharsets.UTF_8.name());

        return messageSource;
    }
}
