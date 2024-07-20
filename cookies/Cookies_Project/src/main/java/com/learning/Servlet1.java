package com.learning;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet1 extends HttpServlet{
    public void processRequest (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

        res.setContentType("text/html");
        PrintWriter out= res.getWriter();
        out.println("<h1>Weclome to the Servlet 1,</h1>");

        String name1=req.getParameter("name");
        out.println("<h1>"+name1+"</h1>");

        out.println("<a href='s2' >Go to Servlet 2</a>");

        //creating a cookie
        Cookie c= new Cookie("user_name",name1);
        //   stored in the form of   key     :  value
        // we will send the response in addition with this created cookie to the client's browser
        //this cookie will be saved in the client's machine
        res.addCookie(c);
    }

        @Override
    public void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        processRequest(req, res);
    }

        @Override
    public void doPost (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        processRequest(req, res);
    }
}
