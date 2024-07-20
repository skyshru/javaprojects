package com.formProject;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;


public class RegisterServlet extends HttpServlet{

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<h1>Welcome to the Register Servlet</h1><br>");

        String name = req.getParameter("user_name");
        String pass = req.getParameter("password");
        String email = req.getParameter("user_email");
        String gender = req.getParameter("user_gender");
        String user_package = req.getParameter("user_package");
        String cond = req.getParameter("condition");

        out.println("<p>Condition value: " + cond + "</p>");

        if (cond != null) {
            if (cond.equals("checked")) {
                String tableString = "<table>" +
                        "<tr><th>Field</th><th>Value</th></tr>" +
                        "<tr><td>Name</td><td>" + name + "</td></tr>" +
                        "<tr><td>Password</td><td>******** (For security reasons, password is not displayed)</td></tr>" +
                        "<tr><td>Email Address</td><td>" + email + "</td></tr>" +
                        "<tr><td>Gender</td><td>" + gender + "</td></tr>" +
                        "<tr><td>Selected Package</td><td>" + user_package + "</td></tr>" +
                        "</table>";

                // assuming saved data success, forwarding it to a SuccesServlet class

                RequestDispatcher rd= req.getRequestDispatcher("success");
                rd.forward(req,res);

                out.println(tableString);
            } else {
                out.println("<p>You have not agreed to the terms and conditions</p>");
            }
        } else {
            out.println("<p>You have not selected the checkbox</p>");
            //we want to include the form again here

            //requesting the page, here in our case, index.jsp
            RequestDispatcher rd= req.getRequestDispatcher("index.jsp");

            //sending the output to this servlet
            rd.include(req,res);

        }
    }

}
