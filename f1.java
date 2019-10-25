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
@WebServlet(urlPatterns = {"/f1"})
public class f1 extends HttpServlet {

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
           String uname=request.getParameter("uname");
            String psw=request.getParameter("psw");
            
           PreparedStatement ps=con.prepareStatement("select*from log where user='"+uname+"'and pass='"+psw+"'");
           
           ResultSet rs=ps.executeQuery();
           if(rs.next()){
           String type="'"+rs.getString(3)+"'";
           if(type.equals("'admin'")){
                   out.println("<script>");
                      out.println("alert('Hi!! "+uname+"')");
                                 out.println("</script");
           RequestDispatcher rd=request.getRequestDispatcher("adminopt.jsp");
           rd.include(request,response);
           

           }
           else if(type.equals("'user'")){
                   out.println("<script>");
                  
                      out.println("alert('Hi!! "+uname+"')");
                    
                                 out.println("</script");
           RequestDispatcher rd=request.getRequestDispatcher("F3.jsp");
           rd.include(request,response);
       

           }
           }else{
             out.println("<script>");
                      out.println("alert('invalid username or password')");
                                 out.println("</script");
           RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
           rd.include(request,response);}

        } catch (SQLException ex) {
            Logger.getLogger(f1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}