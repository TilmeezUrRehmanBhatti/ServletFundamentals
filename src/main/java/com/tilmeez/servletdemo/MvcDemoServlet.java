package com.tilmeez.servletdemo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "MvcDemoServlet", value = "/MvcDemoServlet")
public class MvcDemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Step 0: Add data
        String[] students = {"Susan", "Anil", "Habib", "Navpreet"};
        request.setAttribute("student_list", students);

        // Step 1: get request dispatcher
        RequestDispatcher dispatcher =
                request.getRequestDispatcher("/view_students.jsp");

        // Step 2: forward the request to JSP
        dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
