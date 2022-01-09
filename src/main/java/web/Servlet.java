package web;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset-UTF8-8");
        PrintWriter out = response.getWriter();

        //get all form's parameters
        String user = request.getParameter("user");
        String password = request.getParameter("password");
        String[] tecnologies = request.getParameterValues("tecnologies");
        String gender = request.getParameter("genders");
        String occupation = request.getParameter("occupation");
        String[] music = request.getParameterValues("music");
        String comment = request.getParameter("comment");

        //a not optimal way to return html<html>
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Result</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>parameters worked by server</h1>");
        out.println("<table border='1'>");

        out.println("<tr>");
        out.println("<td>");
        out.println("usuariosssssssss");
        out.println("</td>");
        out.println("<td>");
        out.println(user);
        out.println("</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>");
        out.println("password");
        out.println("</td>");
        out.println("<td>");
        out.println(password);
        out.println("</td>");
        out.println("</tr>");
        //and so on with all parameters (use for loop to print arrays)
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");

        // Request Headers printing
//        out.println("HTTP method: " + request.getMethod());
//        out.println("URI: " + request.getRequestURI());

        //HTTP Status codes
//        response.setStatus(HttpServletResponse.SC_ACCEPTED);
//        response.sendError(HttpServletResponse.SC_BAD_GATEWAY,"Error message");
//        response.sendRedirect("url");

        out.close();


    }
}