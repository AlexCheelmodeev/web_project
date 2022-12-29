package com.example.web_project;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "libraryServlet", value = "/library")
public class GetNameOfBooks {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter pw = response.getWriter();

        try {
            ResultSet resultSet = Util.getResultFromBd();
            while (resultSet.next()){
                pw.println(resultSet.getString("name")
                        + resultSet.getString("author"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
