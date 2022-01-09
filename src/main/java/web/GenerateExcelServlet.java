package web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/GenerateExcelServlet")
public class GenerateExcelServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //specify the document type we will send to the client (MIME type)
        response.setContentType("application/vnd.ms-excel");
        //download excel file
        response.setHeader("Content-Disposition", "attachment;filename=excelExample.xls");
        // dont save cache
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-store");
        response.setDateHeader("Expires", -1);

        // send information to the client
        PrintWriter out = response.getWriter();//excel handling
        out.println("\tValues");//e
        out.println("\t1");
        out.println("\t2");
        out.println("Total\t=SUMA(b2:B3)");
        out.close();


    }
}
