package com.formProject;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class S1_Servlet extends HttpServlet {
    public void processRequest(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

        res.setContentType("text/html");
        PrintWriter out= res.getWriter();

        String n1= req.getParameter("N1");
        String n2= req.getParameter("N2");

        int nn1= Integer.parseInt(n1);
        int nn2= Integer.parseInt(n2);

        //sum
        int sum= nn1 + nn2;
        //setting attribute
        req.setAttribute("s",sum);

        //now we will forward the request by request dispatcher
        RequestDispatcher rd= req.getRequestDispatcher("s2");//s2 is the url Pattern of S2 Servlet
        rd.forward(req,res);
         
    }


    ///These two functions which we have overriden, it means the following
    // if we get request in the form of doGet or doPost, the processrequest method will handle it
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        processRequest(req, res);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        processRequest(req, res);
    }

}
