package com.servlets;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class Servlets implements Servlet {

    // Life Cycle Methods

    private ServletConfig conf;

    @Override
    public void init(ServletConfig conf) throws ServletException {
        // this method is to initialize the Servlet Object
        this.conf = conf;
        System.out.println("Creating objects..");
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        // whenever the request will come to the server so to process that request this method will be run
        System.out.println("Logic Processing / Servicing");

        //set the content type of the response
        resp.setContentType("text/html");

        //the content we want to show
        PrintWriter out= resp.getWriter();
        out.println("<h1> This is the Output that you can see</h1>");
        out.println("<h1> Timestamp for today is"+new Date().toString()+"</h1>");
    }

    @Override
    public void destroy() {
        // to destroy the object
        System.out.println("Going to destroy the objects");
    }

    // non-lifecycle methods

    @Override
    public ServletConfig getServletConfig() {
        return this.conf;
    }

    @Override
    public String getServletInfo() {
        return "This servlet is created by Shruti Sharma";
    }

}
