package br.com.mack.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FrontController", urlPatterns = {"/FrontController"})
public class FrontController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                
        PrintWriter out = response.getWriter(  ); 
        response.setContentType("text/html"); 
        out.println("<H1>Hello from a Servlet</h2>"); 
        out.println("<P>Courtesy of FrontController ");
        
        //String ctrl = request.getParameter("ctrl");
        
        //Controller controller = ControllerFactory.getInstanceByName(ctrl);
        
        //String page = "erro.jsp";
        //if(controller!=null){
        //    controller.init(request, response);
            //controller.execute();
          //  page = controller.getReturnPage();
        //}
        
        //response.sendRedirect(page);
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}