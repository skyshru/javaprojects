package com.learning;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet2 extends HttpServlet{
    public void processRequest (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        res.setContentType("text/html");
        PrintWriter out= res.getWriter();
        out.println("<h1>Weclome to the Servlet 2</h1>");



        //getting all the cookies
        Cookie[] cookies= req.getCookies();
        //setting bool value to false assuming new user
        boolean val= false;

        String name_user="";

        if(cookies==null)
        {
            out.println("<h2> You are not Registered, Kindly Register yourself first</h2>");
            //so Now we will return as nothing else shall be excecuted
            return;
        }



            for(Cookie c: cookies)
            {
                //setting temporary name
                String temp_name= c.getName();///in this context, getName will get the name (key) of the cookie (in our case the name of cookie is "user_name")
                if(temp_name.equals("user_name"))
                    {
                    //set the boolean value to true
                        val= true;

                        //and assing the value to the String variable we created
                        name_user=c.getValue();
                    }

            }




            out.println("<h1>" + name_user + "</h1>");



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
