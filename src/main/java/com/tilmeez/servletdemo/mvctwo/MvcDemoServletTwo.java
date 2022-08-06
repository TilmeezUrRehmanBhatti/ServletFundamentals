package com.tilmeez.servletdemo.mvctwo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "MvcDemoServletTwo", value = "/MvcDemoServletTwo")
public class MvcDemoServletTwo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // step 1: get the student data from helper class (model=
        List<Student> students = StudentDataUtil.getStudent();

        // step 2: add student to request object
        request.setAttribute("student_list", students);

        // step 3: get request dispatcher
        RequestDispatcher dispatcher = request.getRequestDispatcher("view_students_two.jsp");

        // step 4: now forward to JSP
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
