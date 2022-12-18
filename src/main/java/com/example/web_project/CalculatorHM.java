package com.example.web_project;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import module.Numbers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Objects;


@WebServlet(name = "CalculatorHM", value = "/CalculatorHM")
public class CalculatorHM extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Integer a = Integer.parseInt(request.getParameter("a"));
        Integer b = Integer.parseInt(request.getParameter("b"));
        String sign = request.getParameter("sign");
        Integer result = 0;
        String f = null;
        if (Objects.equals(sign, "divide")) {
            result = a / b;
            f = " / ";
        } else if (Objects.equals(sign, "multiply")) {
            result = a * b;
            f = " * ";
        } else if (Objects.equals(sign, "plus")) {
            result = a + b;
            f = " + ";
        } else if (Objects.equals(sign, "minus")) {
            result = a - b;
            f = " - ";

        }
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + a + f + b + " = " + result + "</h1>");
        out.println("</body></html>");
    }

}

