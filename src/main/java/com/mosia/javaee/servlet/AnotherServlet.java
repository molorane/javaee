package com.mosia.javaee.servlet;

import com.mosia.javaee.qualifier.EightDigits;
import com.mosia.javaee.qualifier.ThirteenDigits;
import com.mosia.javaee.service.NumberGenerator;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "anotherServlet", value = "/another-servlet")
public class AnotherServlet extends HttpServlet {

    private String message;

    @Inject
    @EightDigits
    private NumberGenerator numberGenerator;

    public void init() {
        message = "Another Servlet!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("message", message);
        request.setAttribute("number", numberGenerator.generateNumber());
        request.setAttribute("activeMenu", "another");
        request.getRequestDispatcher("/another.jsp").forward(request, response);
    }

    public void destroy() {
    }
}