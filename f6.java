/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
@WebServlet(urlPatterns = {"/f6"})
public class f6 extends HttpServlet {

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
         String source=request.getParameter("source");
          String flight=request.getParameter("flight");
           String destination=request.getParameter("destination");
            int distance=Integer.parseInt(request.getParameter("distance"));
             String time=request.getParameter("time");
          
             int price=(int) (distance*71.5);
              int priceb=(int) (distance*71.5*2);
               int pricef=(int) (distance*71.5*3);
             Statement stmt=con.createStatement();
             stmt.executeUpdate("insert into trans values('"+source+"','"+flight+"','"+destination+"','"+distance+"','"+price+"','"+priceb+"','"+pricef+"','"+time+"')");
             RequestDispatcher rd=request.getRequestDispatcher("F6.jsp");
             rd.include(request,response);
             out.println("<script>");
                   out.println("alert('details suuccessfully inserted')");
                         out.println("</script>");
        } catch (SQLException ex) {
            Logger.getLogger(f6.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}