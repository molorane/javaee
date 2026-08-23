package com.mosia.javaee.servlet;

import java.io.*;

import com.mosia.javaee.qualifier.ThirteenDigits;
import com.mosia.javaee.service.NumberGenerator;
import jakarta.inject.Inject;
import jakarta.servlet.http.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    private String message;

    @Inject
    @ThirteenDigits
    private NumberGenerator numberGenerator;

    public void init() {
        message = "Hello Servlet!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("message", message);
        request.setAttribute("number", numberGenerator.generateNumber());
        request.getRequestDispatcher("/hello.jsp").forward(request, response);
    }

    public void destroy() {
    }
}