package com.servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class ThirdServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        System.out.println("This is doGet method of HttpServlet Class");

        //setting the content type
        res.setContentType("text/html");

        //setting content
        PrintWriter out= res.getWriter();
        out.println("Learnt about Http Servlet class and GET method");
        out.println(new Date().toString());
    }


}
