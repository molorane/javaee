package com.mosia.javaee.interceptors;

import jakarta.annotation.Priority;
import jakarta.inject.Inject;
import jakarta.interceptor.AroundConstruct;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import org.slf4j.Logger;

@Interceptor
@Loggable
@Priority(Interceptor.Priority.APPLICATION)
public class LoggingInterceptorWithBinding {

    @Inject
    private Logger logger;

    @AroundConstruct
    private void init(InvocationContext ic) throws Exception {
        String className = ic.getConstructor().getDeclaringClass().getName();
        logger.info("Loggable: Entering constructor of {}", className);
        try {
            ic.proceed();
        } finally {
            logger.info("Loggable: Exiting constructor of {}", className);
        }
    }

    @AroundInvoke
    public Object logMethod(InvocationContext ic) throws Exception {
        String className = ic.getMethod().getDeclaringClass().getName();
        String methodName = ic.getMethod().getName();
        logger.info("Loggable: Entering {}.{}", className, methodName);
        try {
            return ic.proceed();
        } finally {
            logger.info("Loggable: Exiting {}.{}", className, methodName);
        }
    }
}
