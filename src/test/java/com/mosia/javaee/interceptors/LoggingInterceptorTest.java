package com.mosia.javaee.interceptors;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoggingInterceptorTest {

    @Test
    public void testLoggingInterceptorInstantiationAndExecution() throws Exception {
        LoggingInterceptor interceptor = new LoggingInterceptor();
        assertNotNull(interceptor);

        Field loggerField = LoggingInterceptor.class.getDeclaredField("logger");
        loggerField.setAccessible(true);
        Logger logger = LoggerFactory.getLogger(LoggingInterceptorTest.class);
        loggerField.set(interceptor, logger);

        logger.info("Test log message written to verify file logging capability");

        Path logFilePath = Path.of("logs/app.log");
        assertTrue(Files.exists(logFilePath), "Log file logs/app.log should exist");
        List<String> lines = Files.readAllLines(logFilePath);
        assertTrue(lines.stream().anyMatch(l -> l.contains("Test log message written to verify file logging capability")),
                "Log file should contain the test log message");
    }
}
