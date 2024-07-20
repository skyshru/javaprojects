package com.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class SecondServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("This is Servlet using Generic Servlet");

        //setting the content type

        res.setContentType("text/html");

        //setting the content
        PrintWriter out= res.getWriter();

        out.println("<p>This is the second servlet, the generic one</p>");
        out.println(new Date().toString());

        //now go and map it on xml file
    }
}
