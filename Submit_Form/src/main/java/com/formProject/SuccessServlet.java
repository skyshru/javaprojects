package com.formProject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SuccessServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        res.setContentType("text/html");

        PrintWriter out= res.getWriter();
        out.println("<h2>This is a Success Servlet</h2>");
        out.println("<h1>Successfully Registered</h1>");
    }
}
