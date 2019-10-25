/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author abc
 */
@WebServlet(urlPatterns = {"/f7"})
public class f7 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
          server ap=new server();
          Connection con=ap.getCon();
       String user=request.getParameter("username");
              String pass=request.getParameter("password");
                     String confirm=request.getParameter("confirm"); 
                     if(pass.equals(confirm)){

              Statement stmt=con.createStatement();
              stmt.executeUpdate("insert into log values('"+user+"','"+pass+"','admin')");
              RequestDispatcher rd=request.getRequestDispatcher("adminopt.jsp");
                               rd.include(request,response);
                                out.println("<script>");
                          out.println("alert('successfully registered')");

                                       out.println("</script>");

                     }
                     else{
                      out.println("<script>");
                          out.println("alert('password mismatched!!')");

                                       out.println("</script>");
                                        RequestDispatcher rd=request.getRequestDispatcher("adminadd.jsp");
                               rd.include(request,response);
                                       
                     }
              
              
       
    }   catch (SQLException ex) {
            Logger.getLogger(f7.class.getName()).log(Level.SEVERE, null, ex);
        }

}
}