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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author abc
 */
@WebServlet(urlPatterns = {"/f8"})
public class f8 extends HttpServlet {

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
          String destination=request.getParameter("destination");
          PreparedStatement ps=con.prepareStatement("select flight from trans where source='"+source+"' and destination='"+destination+"'");
          ResultSet rs=ps.executeQuery();
          out.println("<form action='f9' method='post'>");
                  out.println("<style>\n" +
"body\n" +
"{\n" +
"background: url(https://images.unsplash.com/photo-1542296332-2e4473faf563?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80);\n" +
"background-repeat: no-repeat;\n" +
"background-size: cover;\n" +
"\n" +
"}\n" +
"           #trip\n" +
"            {\n" +
"            color: #F3EC50;\n" +
"            font-family: 'Ubuntu', sans-serif;\n" +
"\n" +
"            }\n" +
"            fieldset\n" +
"            {\n" +
"            font-size: 40px;\n" +
"            padding: 5px;\n" +
"            }\n" +
"                 h1\n" +
"            {\n" +
"            text-align: center;\n" +
"                font-family: 'Nunito', sans-serif;\n" +
"                font-size: 50px;\n" +
"\n" +
"\n" +
"\n" +
"            color: #9AD1FD;\n" +
"            }\n" +
"                    #to\n" +
"           {\n" +
"            margin-left: 88px;\n" +
"            color: white;      }\n" +
"            #from\n" +
"           {\n" +
"            margin-left: 45px; \n" +
"            color: white;     }\n" +
"            #flights\n" +
"            {\n" +
"            margin-left: -55px;\n" +
"            color: white;\n" +
"            }\n" +
"  \n" +
"\n" +
"            button\n" +
"{\n" +
"    align-items: center;\n" +
"               border: 0;\n" +
"               background: none;\n" +
"               margin: 20px auto;\n" +
"               text-align: center;\n" +
"               border: 2px solid #006666;\n" +
"               padding: 14px 40px;\n" +
"               \n" +
"               outline: none;\n" +
"               color: white;\n" +
"               border-radius: 24px;\n" +
"               transition: 0.20s;\n" +
"               cursor: pointer;\n" +
"               font-size: 17px;\n" +
"               font-family: 'Libre Baskerville', serif;\n" +
"\n" +
"           \n" +
"}\n" +
"              .register {\n" +
"             width: 450px;\n" +
"             padding: 10px;\n" +
"             position: absolute;\n" +
"             top: 50%;\n" +
"             left: 50%;\n" +
"             transform: translate(-50%,-50%);\n" +
"             background: rgba(0,0,0,0.7);\n" +
"                 \n" +
"             text-align: center;\n" +
"             border-radius: 50px;\n" +
"             border: 5px solid #006666;\n" +
"           }\n" +
"           .register:hover\n" +
"           {\n" +
"           	border-color: rgb(0, 254, 133);\n" +
"           }\n" +
"     button:hover{\n" +
"               background: #009900;\n" +
"               transform: translateY(3px);\n" +
"               border-color: rgb(207, 47, 0,0.6);\n" +
"               \n" +
"           }\n" +
"              a  {\n" +
"            cursor: pointer;\n" +
"            }\n" +
"            select\n" +
"            {\n" +
"            background:grey;\n" +
"            color: white;\n" +
"            }\n" +
"      </style>\n" +
"</head>\n" +
"<body>\n" +
"<h1>FoxStar <span id=\"trip\">Flights</span></h1>\n" +
"<fieldset class=\"register\"> \n" +
"<div id=\"from\"><label for=\"from\"><a>From:</a></label>\n" +
"                                               <select required name=source>\n" +
"                                                   <option value='"+source+"'>"+source+"</option>\""+
"                                                                 </select></div>\n" +
"                                                 <div id=\"to\"><label for=\"from\"><a>To:</a></label>\n" +
"                                                 <select required name=destination>\n" +
"                                                    <option value='"+destination+"'>"+destination+"</option>\n"+
"                                                     </select></div>");
          out.println(" <div id=\"flights\"><label for=\"flights\"><a>Flights:   </a></label><select required name=\"flight\">");
          while(rs.next()){
                  out.println("<option value='"+rs.getString(1)+"'>");
                          out.println(rs.getString(1));
                                  out.println("</option>");
          }
                  out.println("</select></div>");
                  out.println("<div><button><span id=\"btn\">Delete</span> <i class=\"fa fa-plane\" style=\"font-size:24px\"></i></button></div>\n" +
"</fieldset>");
                  out.println("</form>");
        } catch (SQLException ex) {
            Logger.getLogger(f8.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}