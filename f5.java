/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
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
@WebServlet(urlPatterns = {"/f5"})
public class f5 extends HttpServlet {

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
         String tClass=request.getParameter("Class");
         out.println("<form action=\"f52\" method=\"post\">\n" +
"            <style>\n" +
"                body{\n" +
"                    background: url(https://res.cloudinary.com/trailfinders-ltd/image/upload/vc_auto,w_1280,c_limit/flights-home.jpg);\n" +
"                    background-size: cover;\n" +
"                    \n" +
"                }\n" +
"                .a{\n" +
"                    width: 900px;\n" +
"                    margin: 200px;\n" +
"                     height: 900px;\n" +
"                   margin-left: 50%;\n" +
"                    margin-top: 35%;\n" +
"                    transform: translate(-50%,-50%);\n" +
"                    background-color: rgba(.8,0,0,.8);\n" +
"                    font-family: sans-serif;\n" +
"                    color: #ffffff;\n" +
"                    border-style: ridge;\n" +
"                    position: relative;\n" +
"                    \n" +
"                } \n" +
"                .b{\n" +
"                    margin-top: 5%;\n" +
"                    margin-left: 2%\n" +
"                }\n" +
"                 input{\n" +
"                    margin: 20px;\n" +
"                    background: none;\n" +
"                    color: white;\n" +
"                    border: none;\n" +
"                    outline: none;\n" +
"                   \n" +
"                }\n" +
"                .c{\n" +
"                  margin-left: 66%;\n" +
"                  margin-top: -8%;\n" +
"                }\n" +
"                .e{\n" +
"                    margin-top: 5%;\n" +
"                    margin-left: 2%;\n" +
"                }\n" +
"                .f{\n" +
"                    alignment-adjust: auto;\n" +
"                    margin-left: 70%;\n" +
"                    margin-top: -26.5%\n" +
"                }\n" +
"                .h{\n" +
"                    margin-left: 25%;\n" +
"                    margin-top: 10%;\n" +
"                }\n" +
"                .i{\n" +
"                    margin-left: 32%;\n" +
"          \n" +
"                }\n" +
"                .h input{\n" +
"                    width: 150px;\n" +
"                    text-align: center;\n" +
"                    border: none;\n" +
"                    border-bottom: 2px solid #ffffff;\n" +
"                    background: none;\n" +
"                    border-radius: 10px;\n" +
"                    height: 50px;\n" +
"                    outline: none;\n" +
"                    color: white;\n" +
"                    transition: 0.25s;\n" +
"                   \n" +
"                }\n" +
"                .h input[name=\"name\"]:hover{\n" +
"                     width: 300px;\n" +
"\n" +
"                    border-color: #ff3300;\n" +
"                }\n" +
"                .i input{\n" +
"                     width: 150px;\n" +
"                    text-align: center;\n" +
"                    border: none;\n" +
"                    border-bottom: 2px solid #ffffff;\n" +
"                    background: none;\n" +
"                    border-radius: 10px;\n" +
"                    height: 50px;\n" +
"                    outline: none;\n" +
"                    color: white;\n" +
"                    transition: 0.25s;\n" +
"                }\n" +
"                .i input:hover{\n" +
"                        width: 300px;\n" +
"\n" +
"                    border-color: #ff3300;\n" +
"                }\n" +
"                .j input[type=\"submit\"]{\n" +
"                    height: 50px;\n" +
"                    margin-left: 77%;\n" +
"                    margin-top: -15%;\n" +
"                    width: 150px;\n" +
"                    background: #000099;\n" +
"                    border: 2px solid;\n" +
"                    border-radius: 5px;\n" +
"                     color: wheat;\n" +
"                     border-style: inset;\n" +
"                     cursor: pointer;\n" +
"                     transition: 0.2s;\n" +
"                }\n" +
"                .j input[type=\"submit\"]:hover{\n" +
"                    background: #ff3300;\n" +
"                   \n" +
"                }\n" +
"                \n" +
"            </style>\n" +
"            <div class=\"a\">\n" +
"                <p><div class=\"b\"><label>source</label> <input type=\"text\" name=\"source\" value='"+source+"' /></div></p>\n" +
"            <p><div class=\"c\"><label>destination</label> <input type=\"text\" name=\"destination\" value='"+desti+"' /></div>\n" +
"\n" +
"            <div class=\"e\"> <p><label>Flight:</label> <input type=\"text\" name=\"flights\" value='"+trans+"' /></p>\n" +
"              <p><label>date:</label> <input type=\"text\" name=\"date\" value='"+date+"' /></p>\n" +
"              <p><label>price:</label> <input type=\"text\" name=\"price\" value='"+price+"' /></p></div>\n" +
"\n" +
"            <div class=\"f\"><p><label>Type:</label> <input type=\"text\" name=\"type\" value='"+type+"' /></p>\n" +
"\n" +
"\n" +
"              <p><label>Time:</label> <input type=\"text\" name=\"time\" value='"+time+"' /></p>\n" +
"\n" +
"\n" +
"             <p><label>Class:</label> <input type=\"text\" name=\"Class\" value='"+tClass+"' /></p></div>\n" +
"            <div class=\"h\"><p><label>name of passenger:</label><input type=\"text\" name=\"name\" value=\"\" /></p></div>\n" +
"               <div class=\"i\"> <p><label>mobile no.</label><input type=\"text\" name=\"mobile\" value=\"\" /></p></div>\n" +
"               <div class=\"j\"><p><input type=\"submit\" value=\"BOOK\" name=\"BOOK\" /></p></div>\n" +
"            </div>\n" +
"        </form>");
        
    }

}}