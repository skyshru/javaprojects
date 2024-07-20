package com.formProject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class S2_Servlet extends HttpServlet {

    public void processRequest(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

        res.setContentType("text/html");
        PrintWriter out= res.getWriter();

        int n1= Integer.parseInt(req.getParameter("N1"));
        int n2= Integer.parseInt(req.getParameter("N2"));

        int multiply= n1 * n2;

            //get attribute from S1 servlet using req object
       int sum= (int)req.getAttribute("s");

       out.println("The sum is: "+sum);
       out.println("tHE Product is :"+multiply);
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        processRequest(req, res);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

        processRequest(req,res);
    }

}
