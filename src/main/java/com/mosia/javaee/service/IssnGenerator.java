package com.mosia.javaee.service;

import com.mosia.javaee.interceptors.Loggable;
import com.mosia.javaee.qualifier.EightDigits;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.Random;

@EightDigits
@ApplicationScoped
public class IssnGenerator implements NumberGenerator {

    @Loggable
    public String generateNumber() {
        return "8-" + Math.abs(new Random().nextInt());
    }
}