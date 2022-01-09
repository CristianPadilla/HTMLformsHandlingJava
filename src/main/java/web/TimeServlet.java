package web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/TimeServlet")
public class TimeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("refresh", "1");
        Date date = new Date();
        SimpleDateFormat formater = new SimpleDateFormat("'Updated Time' HH:mm:ss");
        String formatedTime = formater.format(date);

        PrintWriter out = response.getWriter();
        out.print("Updated time: " + formatedTime);
        out.close();
    }
}
