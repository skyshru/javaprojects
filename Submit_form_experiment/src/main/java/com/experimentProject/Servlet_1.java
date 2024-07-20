package com.experimentProject;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet_1 extends HttpServlet {

    public void processRequest(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out= res.getWriter();

        String n1= req.getParameter("name1");
        out.println("Welcome to the Servlet1 "+n1);

            //we are setting name of the string as atribute to send to the other servlet
        req.setAttribute("name",n1);
        //now we will forward the request
        out.println("<h3> <a href='s2'>Go to servlet s2</a></h3>");//s2 is the url pattern

        RequestDispatcher rd= req.getRequestDispatcher("s2");
        rd.forward(req,res);

        //I wanted to see if this can be used instead of cookies



    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    processRequest(req, res);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        processRequest(req, res);
    }

}
