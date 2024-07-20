package com.servlets;
import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


public class FirstServlet implements Servlet{

    //Life Cycle Methods

    ServletConfig conf;

    public void init(ServletConfig conf)
    {
        //this method is to initialise the Servlet Object
        this.conf=conf;
        System.out.println("Creating objects..");
    }

    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException
    {

        //whenever the request will come to the server so to process that request this method will be run
        System.out.println("Logic Processing / Servicing");

        //setting the content type of the response
        resp.setContentType("text/html");

        //the content
        PrintWriter out= resp.getWriter();
        out.println("<p>Lalalala this is the first servlet created by implementing Interface</p>");
        out.println(new Date().toString());
    }

    public void destroy()
    {

        //to destroy the object
        System.out.println("Going to destroy the objects");
    }

    //non -lifecycle methods

    public ServletConfig getServletConfig(){
        return this.conf;
    }

    public String getServletInfo()
    {
        return "This servlet is created by Shruti Sharma";
    }

}
