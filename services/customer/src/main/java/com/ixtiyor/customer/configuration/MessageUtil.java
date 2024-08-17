package com.ixtiyor.customer.configuration;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class MessageUtil {

    public static String getMessage(String message, Object... dynamicValues) {
        return MessageSourceConfiguration.messageSource().getMessage(message, dynamicValues, LocaleContextHolder.getLocale());
    }

    public static String getMessage(String message, Locale locale, Object... dynamicValues) {
        return MessageSourceConfiguration.messageSource().getMessage(message, dynamicValues, locale);
    }
}
