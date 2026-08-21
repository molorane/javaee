package com.mosia.javaee.servlet;

import com.mosia.javaee.qualifier.EightDigits;
import com.mosia.javaee.qualifier.ThirteenDigits;
import com.mosia.javaee.service.NumberGenerator;
import jakarta.inject.Inject;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "anotherServlet", value = "/another-servlet")
public class AnotherServlet extends HttpServlet {

    private String message;

    @Inject
    @EightDigits
    private NumberGenerator numberGenerator;

    public void init() {
        message = "Another Servlet!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h2>" + numberGenerator.generateNumber() + "</h2>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}