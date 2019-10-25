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
@WebServlet(urlPatterns = {"/f52"})
public class f52 extends HttpServlet {

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
         String desti=request.getParameter("destination");
         String trans=request.getParameter("flights");
           String type=request.getParameter("type");
         String date=request.getParameter("date");
         String time=request.getParameter("time");
         String price=request.getParameter("price");
         String Class=request.getParameter("Class");
         String name=request.getParameter("name");
         String mobile=request.getParameter("mobile");
          Statement stmt=con.createStatement();
         stmt.executeUpdate("insert into flight(source,desti,flight,type,date,time,price,tclass,name,mobile) values('"+source+"','"+desti+"','"+trans+"','"+type+"','"+date+"','"+time+"','"+price+"','"+Class+"','"+name+"','"+mobile+"')");
         RequestDispatcher rd=request.getRequestDispatcher("F3.jsp");
           rd.include(request,response);
          out.println("<script>");
          out.println("alert('Ticket Booked!!')");
          out.println("</script>");
        } catch (SQLException ex) {
            Logger.getLogger(f5.class.getName()).log(Level.SEVERE, null, ex);
        } 
        }
    }

   