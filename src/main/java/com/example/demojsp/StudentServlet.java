package com.example.demojsp;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "QLSV", value = "/c0222i1")
public class StudentServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Students> list = new ArrayList<>();
            list.add(new Students(1, "minh", 23));
            list.add(new Students(2, "hải", 30));
            list.add(new Students(3, "long", 20));
            list.add(new Students(4, "Hùng", 29));
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("studentList.jsp");
        req.setAttribute("ds", list);
        requestDispatcher.forward(req,resp);
    }

    public void destroy() {
    }
}