package com.example.web_project;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "GetCookiesServlet", value = "/get-cookies")
public class GetCookiesServlet extends HttpServlet {




    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Cookie> cookies = Arrays.asList(request.getCookies());
        PrintWriter pw = response.getWriter();

        pw.println("<html>");
        for (Cookie cookie: cookies) {
            pw.println();
            pw.println("<h1>" + cookie.getName() + " : " + cookie.getValue() + "</h1>");
        }
        pw.println("</html>");
    }

    public void destroy() {
    }
}
