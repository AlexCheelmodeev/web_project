package com.example.web_project;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

    @WebServlet(name = "SetCookiesServlet", value = "/set-cookies")
    public class setCookiesServlet extends HttpServlet {
        private String message;

        public void init() {
            message = "Hello World!";
        }

        public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            Cookie cookie1 = new Cookie ("user_id", "123456");
            Cookie cookie2 = new Cookie ("some_cookie", "cookie");

            cookie1.setMaxAge(24 * 60 * 60);
            cookie2.setMaxAge(24 * 60 * 60);

            response.addCookie(cookie1);
            response.addCookie(cookie2);
        }

        public void destroy() {
        }
    }

