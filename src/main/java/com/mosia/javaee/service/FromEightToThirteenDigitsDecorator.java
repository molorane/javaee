package com.mosia.javaee.service;

import com.mosia.javaee.qualifier.EightDigits;
import jakarta.decorator.Decorator;
import jakarta.decorator.Delegate;
import jakarta.inject.Inject;

@Decorator
public class FromEightToThirteenDigitsDecorator implements NumberGenerator {

    @Inject
    @Delegate
    @EightDigits
    private NumberGenerator numberGenerator;

    public String generateNumber() {
        String issn = numberGenerator.generateNumber();
        String isbn = "13-84356" + issn.substring(1);
        return isbn;
    }
}