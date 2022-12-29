package com.example.web_project;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "GetIdOfBooks", value = "/getidofbooks")
public class GetIdOfBooks {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter pw = response.getWriter();

        try {
            ResultSet resultSet = Util.getResultFromBd();
            while (resultSet.next()){
                pw.println(resultSet.getString("id")
                        + resultSet.getString("quantity"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }



}
