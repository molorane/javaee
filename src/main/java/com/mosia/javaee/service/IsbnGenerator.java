package com.mosia.javaee.service;

import com.mosia.javaee.interceptors.LoggingInterceptor;
import com.mosia.javaee.qualifier.ThirteenDigits;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.interceptor.Interceptors;

import java.util.Random;

@ThirteenDigits
@ApplicationScoped
public class IsbnGenerator implements NumberGenerator {

    @Interceptors(LoggingInterceptor.class)
    public String generateNumber() {
        return "13-84356-" + Math.abs(new Random().nextInt());
    }
}
