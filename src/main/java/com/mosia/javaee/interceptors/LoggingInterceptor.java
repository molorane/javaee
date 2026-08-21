package com.mosia.javaee.interceptors;

import jakarta.inject.Inject;
import jakarta.interceptor.AroundConstruct;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import org.slf4j.Logger;

@Interceptor
public class LoggingInterceptor {

    @Inject
    private Logger logger;

    @AroundConstruct
    private void init(InvocationContext ic) throws Exception {
        String className = ic.getConstructor().getDeclaringClass().getName();
        logger.info("Entering constructor of {}", className);
        try {
            ic.proceed();
        } finally {
            logger.info("Exiting constructor of {}", className);
        }
    }

    @AroundInvoke
    public Object logMethod(InvocationContext ic) throws Exception {
        String className = ic.getMethod().getDeclaringClass().getName();
        String methodName = ic.getMethod().getName();
        logger.info("Entering {}.{}", className, methodName);
        try {
            return ic.proceed();
        } finally {
            logger.info("Exiting {}.{}", className, methodName);
        }
    }
}
