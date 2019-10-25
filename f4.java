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
@WebServlet(urlPatterns = {"/f4"})
public class f4 extends HttpServlet {

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
          String date=request.getParameter("date");
          String month=request.getParameter("month");
          String year=request.getParameter("year");
          
          int price;
           String type=request.getParameter("type");
           String sour=request.getParameter("source");
                    String Class=request.getParameter("Class");
                    

           
           String destination=request.getParameter("destination");
               
                         PreparedStatement s=con.prepareStatement("select day(sysdate()),month(sysdate())");
                           ResultSet q=s.executeQuery();
                PreparedStatement p=con.prepareStatement("select '"+date+"'-day(sysdate()),'"+month+"'-month(sysdate())");
               ResultSet r=p.executeQuery();
                  
                   if(Class.equals("economy")){
                 
                    PreparedStatement ps=con.prepareStatement("select flight,time,price from trans where source='"+sour+"' and destination='"+destination+"'");
                ResultSet rs=ps.executeQuery();
                if(q.next()){
                 if(r.next()){
                            out.println("<style>\n" +
"            body{\n" +
"                background:  url(https://img2.goodfon.com/original/2048x1152/8/75/jal-samolet-vzletnaya-polosa.jpg);\n" +
"                background-size: cover;\n" +
"            }\n" +
"            .a{\n" +
"                height: 15%;\n" +
"                width: 100%;\n" +
"                background-color: rgba(0.8,0.8,0,0.8);\n" +
"               text-align: left;\n" +
"               margin-top: 5%;\n" +
"               border-radius: 20px;\n" +
"               font-size: 25px;\n" +
"               border: none;\n" +
"            }\n" +
"            .a label{\n" +
"                color: #0000ff;\n" +
"                position: absolute;\n" +
"                margin-top: 20px;\n" +
"                margin-left: 129px;\n" +
"                \n" +
"            }\n" +
"            .a input{\n" +
"                margin-left: 120px;\n" +
"                margin-top: 49px;\n" +
"                background: none;\n" +
"                height: 30px;\n" +
"                color: white;\n" +
"                \n" +
"            }\n" +
"            .b label{\n" +
"                text-align: center;\n" +
"               \n" +
"                \n" +
"            }\n" +
"          \n" +
"            \n" +
"            .c{\n" +
"                background-color: #cccccc;\n" +
"                border: #666666 outset;\n" +
"                border-radius: 20px;\n" +
"                width: 80%;\n" +
"                height: 20%;\n" +
"                margin-left: 10%;\n" +
"                margin-top: 10px;\n" +
"                \n" +
"                \n" +
"            }\n" +
"            .c input[type=\"text\"]{\n" +
"                border: none;\n" +
"                \n" +
"               margin-top: 50px;\n" +
"               margin-left: 1px;\n" +
"            height: 20%;\n" +
"               background: none;\n" +
"               font-size: 25px;\n" +
"               font: sans-serif;\n" +
"               text-align: center;\n" +
"               \n" +
"            }\n" +
"            .c input[type=\"submit\"]{\n" +
"                background: #0033ff;\n" +
"                width: 12%;\n" +
"                height: 30%;\n" +
"                border-radius: 20px;\n" +
"                margin-left: 5px;\n" +
"                cursor: pointer;\n" +
"                transition: 0.25s;\n" +
"               text-decoration: #ffffff;\n" +
"                font-family: fantasy;\n" +
"                font-size: 20px;\n" +
"                   \n" +
"            }\n" +
"            .c input[type=\"submit\"]:hover{\n" +
"                background-color: #ff0000;\n" +
"            }\n" +
"            \n" +
"            .d{\n" +
"                margin-left:50%;\n" +
"                margin-top: 20px;\n" +
"                font-family: sans-serif;\n" +
"                color: white;\n" +
"                font-size: 50px;\n" +
"                font-style: oblique;\n" +
"                color: #0000cc;\n" +
"            }\n" +
"            .e{\n" +
"                  margin-left:26%;\n" +
"                margin-top: -4.5%;\n" +
"                font-family: sans-serif;\n" +
"                color: white;\n" +
"                font-size: 50px;\n" +
"                font-style: oblique;\n" +
"                color:  #ff0000;\n" +
"            }\n" +
"            .f{\n" +
"                 margin-left:70%;\n" +
"                margin-top: -4%;\n" +
"                font-family: sans-serif;\n" +
"                color: white;\n" +
"                font-size: 50px;\n" +
"                font-style: oblique;\n" +
"                color:  #ff0000;\n" +
"                \n" +
"            }\n" +
"            .g{\n" +
"                \n" +
"                height: 500%;\n" +
"                width: 90%;\n" +
"                background: rgba(.8,.8,.8,.8);\n" +
"                margin-left: 5%;\n" +
"                margin-top: -1.35%;\n" +
"                border: none;\n" +
"            }\n" +
"             h1\n" +
"            {\n" +
"            text-align: center;\n" +
"                font-family: 'Nunito', sans-serif;\n" +
"                font-size: 50px;\n" +
"\n" +
"\n" +
"\n" +
"                color: #0000cc;\n" +
"            }\n" +
"            #trip\n" +
"            {\n" +
"                color: #ff0000;\n" +
"            font-family: 'Ubuntu', sans-serif;\n" +
"\n" +
"            }\n" +
"            \n" +
"            \n" +
"           \n" +
"            \n" +
"        </style>\n" +
"        <form action=\"f5\" method=\"post\">\n" +
"           <h1>FoxStar <span id=\"trip\">Flights</span></h1>\n" +
"            <div class=\"a\"> <label>source: </label> <input type=\"text\" name=\"source\" value='"+sour+"' />\n" +
"              <label>Class</label> <input type=\"text\" name=\"Class\" value='"+Class+"'/>\n" +
"                \n" +
"                        <label>Destination:</label> <input type=\"text\" name=\"destination\" value='"+destination+"' />\n" +
"            <label>Trip type:</label> <input type=\"text\" name=\"type\" value='"+type+"' />\n" +
"            <label>Depart:</label> <input type=\"text\" name=\"date\" value="+date+"/"+month+"/"+year+" /></div>\n" +
"            <div class=\"g\">\n" +
"            <div class=\"d\"><label>TIME</label></div><div class=\"e\"><label>FLIGHT</label></div><div class=\"f\"><label>PRICE</label></div>");
                while(rs.next()){
                    if(type.equals("one way")){
                    if(month.equals(q.getString(2))){
                        if(date.equals(q.getString(1))){

                           price=rs.getInt(3);
        
                   
                          }
                   else{
                           price=rs.getInt(3)/r.getInt(1);

                   }
                    }                   
                    
                   
                    else{
                        if(date.equals(q.getString(1))){
                        price=rs.getInt(3)/(28*r.getInt(2));
                        }
                        else{
                        price=rs.getInt(3)/(28*r.getInt(1)*r.getInt(2));
                        }
                    
                    }
                    }
                    else{
                    if(month.equals(q.getString(2))){
                        if(date.equals(q.getString(1))){

                           price=2*rs.getInt(3);
        
                   
                          }
                   else{
                           price=2*rs.getInt(3)/r.getInt(1);

                   }
                    }                   
                    
                   
                    else{
                        if(date.equals(q.getInt(1))){
                        price=2*rs.getInt(3)/(28*r.getInt(2));
                        }
                        else{
                        price=2*rs.getInt(3)/(28*r.getInt(1)*r.getInt(2));
                        }
                    
                    }
                    }
                    
                    
                    
                   out.println("<form action='f5' method='post'>");
                 out.println("<input type='hidden' name='type' value='"+type+"'/>");
                 out.println("<input type='hidden' name='source' value='"+sour+"'/>");
                   out.println("<input type='hidden' name='destination' value='"+destination+"'/>");
                out.println("<input type='hidden' name='date' value='"+year+"/"+month+"/"+date+"'/>");
             out.println("<input type='hidden' name='Class' value='"+Class+"'/>");
                out.println(" <style>\n" +
"            body{\n" +
"                background:  url(https://img2.goodfon.com/original/2048x1152/8/75/jal-samolet-vzletnaya-polosa.jpg);\n" +
"                background-size: cover;\n" +
"            }\n" +
"            .a{\n" +
"                height: 15%;\n" +
"                width: 100%;\n" +
"                background-color: rgba(0.8,0.8,0,0.8);\n" +
"               text-align: left;\n" +
"               margin-top: 5%;\n" +
"               border-radius: 20px;\n" +
"               font-size: 25px;\n" +
"               border: none;\n" +
"            }\n" +
"            .a label{\n" +
"                color: #0000ff;\n" +
"                position: absolute;\n" +
"                margin-top: 20px;\n" +
"                margin-left: 129px;\n" +
"                \n" +
"            }\n" +
"            .a input{\n" +
"                margin-left: 120px;\n" +
"                margin-top: 49px;\n" +
"                background: none;\n" +
"                height: 30px;\n" +
"                color: white;\n" +
"                \n" +
"            }\n" +
"            .b label{\n" +
"                text-align: center;\n" +
"               \n" +
"                \n" +
"            }\n" +
"          \n" +
"            \n" +
"            .c{\n" +
"                background-color: #cccccc;\n" +
"                border: #666666 outset;\n" +
"                border-radius: 20px;\n" +
"                width: 80%;\n" +
"                height: 20%;\n" +
"                margin-left: 10%;\n" +
"                margin-top: 10px;\n" +
"                \n" +
"                \n" +
"            }\n" +
"            .c input[type=\"text\"]{\n" +
"                border: none;\n" +
"                \n" +
"               margin-top: 50px;\n" +
"               margin-left: 1px;\n" +
"            height: 20%;\n" +
"               background: none;\n" +
"               font-size: 25px;\n" +
"               font: sans-serif;\n" +
"               text-align: center;\n" +
"               \n" +
"            }\n" +
"            .c input[type=\"submit\"]{\n" +
"                background: #0033ff;\n" +
"                width: 12%;\n" +
"                height: 30%;\n" +
"                border-radius: 20px;\n" +
"                margin-left: 5px;\n" +
"                cursor: pointer;\n" +
"                transition: 0.25s;\n" +
"               text-decoration: #ffffff;\n" +
"                font-family: fantasy;\n" +
"                font-size: 20px;\n" +
"                   \n" +
"            }\n" +
"            .c input[type=\"submit\"]:hover{\n" +
"                background-color: #ff0000;\n" +
"            }\n" +
"            \n" +
"            .d{\n" +
"                margin-left:50%;\n" +
"                margin-top: 20px;\n" +
"                font-family: sans-serif;\n" +
"                color: white;\n" +
"                font-size: 50px;\n" +
"                font-style: oblique;\n" +
"                color: #0000cc;\n" +
"            }\n" +
"            .e{\n" +
"                  margin-left:26%;\n" +
"                margin-top: -4.5%;\n" +
"                font-family: sans-serif;\n" +
"                color: white;\n" +
"                font-size: 50px;\n" +
"                font-style: oblique;\n" +
"                color:  #ff0000;\n" +
"            }\n" +
"            .f{\n" +
"                 margin-left:70%;\n" +
"                margin-top: -4%;\n" +
"                font-family: sans-serif;\n" +
"                color: white;\n" +
"                font-size: 50px;\n" +
"                font-style: oblique;\n" +
"                color:  #ff0000;\n" +
"                \n" +
"            }\n" +
"            .g{\n" +
"                \n" +
"                height: 100%;\n" +
"                width: 90%;\n" +
"                background: rgba(.8,.8,.8,.8);\n" +
"                margin-left: 5%;\n" +
"                margin-top: -1.35%;\n" +
"                border: none;\n" +
"            }\n" +
"             h1\n" +
"            {\n" +
"            text-align: center;\n" +
"                font-family: 'Nunito', sans-serif;\n" +
"                font-size: 50px;\n" +
"\n" +
"\n" +
"\n" +
"                color: #0000cc;\n" +
"            }\n" +
"            #trip\n" +
"            {\n" +
"                color: #ff0000;\n" +
"            font-family: 'Ubuntu', sans-serif;\n" +
"\n" +
"            }\n" +
"            \n" +
"            \n" +
"           \n" +
"            \n" +
"        </style>  <div class=\"c\"> <p> <input type=\"submit\" value=\"Book Now\" name=\"Book Now\" /><input type=\"text\" name=\"flights\" value='"+rs.getString(1)+"' /><input type=\"text\" name=\"time\" value='"+rs.getString(2)+"' /><input type=\"text\" name=\"price\" value='"+price+"' /></p></div>");
                                       
                                     out.println("</form>");  

                }

                                   out.println("</div>");
                }                                     out.println("</form>");  

                }
                   }                

                   else if(Class.equals("buisness")){
                    PreparedStatement ps=con.prepareStatement("select flight,time,priceb from trans where source='"+sour+"' and destination='"+destination+"'");
                ResultSet rs=ps.executeQuery();
             if(q.next()){
                 if(r.next()){
                            out.println("<style>\n" +
"            body{\n" +
"                background:  url(https://img2.goodfon.com/original/2048x1152/8/75/jal-samolet-vzletnaya-polosa.jpg);\n" +
"                background-size: cover;\n" +
"            }\n" +
"            .a{\n" +
"                height: 15%;\n" +
"                width: 100%;\n" +
"                background-color: rgba(0.8,0.8,0,0.8);\n" +
"               text-align: left;\n" +
"               margin-top: 5%;\n" +
"               border-radius: 20px;\n" +
"               font-size: 25px;\n" +
"               border: none;\n" +
"            }\n" +
"            .a label{\n" +
"                color: #0000ff;\n" +
"                position: absolute;\n" +
"                margin-top: 20px;\n" +
"                margin-left: 129px;\n" +
"                \n" +
"            }\n" +
"            .a input{\n" +
"                margin-left: 120px;\n" +
"                margin-top: 49px;\n" +
"                background: none;\n" +
"                height: 30px;\n" +
"                color: white;\n" +
"                \n" +
"            }\n" +
"            .b label{\n" +
"                text-align: center;\n" +
"               \n" +
"                \n" +
"            }\n" +
"          \n" +
"            \n" +
"            .c{\n" +
"                background-color: #cccccc;\n" +
"                border: #666666 outset;\n" +
"                border-radius: 20px;\n" +
"                width: 80%;\n" +
"                height: 20%;\n" +
"                margin-left: 10%;\n" +
"                margin-top: 10px;\n" +
"                \n" +
"                \n" +
"            }\n" +
"            .c input[type=\"text\"]{\n" +
"                border: none;\n" +
"                \n" +
"               margin-top: 50px;\n" +
"               margin-left: 1px;\n" +
"            height: 20%;\n" +
"               background: none;\n" +
"               font-size: 25px;\n" +
"               font: sans-serif;\n" +
"               text-align: center;\n" +
"               \n" +
"            }\n" +
"            .c input[type=\"submit\"]{\n" +
"                background: #0033ff;\n" +
"                width: 12%;\n" +
"                height: 30%;\n" +
"                border-radius: 20px;\n" +
"                margin-left: 5px;\n" +
"                cursor: pointer;\n" +
"                transition: 0.25s;\n" +
"               text-decoration: #ffffff;\n" +
"                font-family: fantasy;\n" +
"                font-size: 20px;\n" +
"                   \n" +
"            }\n" +
"            .c input[type=\"submit\"]:hover{\n" +
"                background-color: #ff0000;\n" +
"            }\n" +
"            \n" +
"            .d{\n" +
"                margin-left:50%;\n" +
"                margin-top: 20px;\n" +
"                font-family: sans-serif;\n" +
"                color: white;\n" +
"                font-size: 50px;\n" +
"                font-style: oblique;\n" +
"                color: #0000cc;\n" +
"            }\n" +
"            .e{\n" +
"                  margin-left:26%;\n" +
"                margin-top: -4.5%;\n" +
"                font-family: sans-serif;\n" +
"                color: white;\n" +
"                font-size: 50px;\n" +
"                font-style: oblique;\n" +
"                color:  #ff0000;\n" +
"            }\n" +
"            .f{\n" +
"                 margin-left:70%;\n" +
"                margin-top: -4%;\n" +
"                font-family: sans-serif;\n" +
"                color: white;\n" +
"                font-size: 50px;\n" +
"                font-style: oblique;\n" +
"                color:  #ff0000;\n" +
"                \n" +
"            }\n" +
"            .g{\n" +
"                \n" +
"                height: 500%;\n" +
"                width: 90%;\n" +
"                background: rgba(.8,.8,.8,.8);\n" +
"                margin-left: 5%;\n" +
"                margin-top: -1.35%;\n" +
"                border: none;\n" +
"            }\n" +
"             h1\n" +
"            {\n" +
"            text-align: center;\n" +
"                font-family: 'Nunito', sans-serif;\n" +
"                font-size: 50px;\n" +
"\n" +
"\n" +
"\n" +
"                color: #0000cc;\n" +
"            }\n" +
"            #trip\n" +
"            {\n" +
"                color: #ff0000;\n" +
"            font-family: 'Ubuntu', sans-serif;\n" +
"\n" +
"            }\n" +
"            \n" +
"            \n" +
"           \n" +
"            \n" +
"        </style>\n" +
"        <form action=\"f5\" method=\"post\">\n" +
"           <h1>FoxStar <span id=\"trip\">Flights</span></h1>\n" +
"            <div class=\"a\"> <label>source: </label> <input type=\"text\" name=\"source\" value='"+sour+"' />\n" +
"              <label>Class</label> <input type=\"text\" name=\"class\" value='"+Class+"'/>\n" +
"                \n" +
"                        <label>Destination:</label> <input type=\"text\" name=\"destination\" value='"+destination+"' />\n" +
"            <label>Trip type:</label> <input type=\"text\" name=\"type\" value='"+type+"' />\n" +
"            <label>Depart:</label> <input type=\"text\" name=\"date\" value="+date+"/"+month+"/"+year+" /></div>\n" +
"            <div class=\"g\">\n" +
"            <div class=\"d\"><label>TIME</label></div><div class=\"e\"><label>FLIGHT</label></div><div class=\"f\"><label>PRICE</label></div>");
                while(rs.next()){
                    if(type.equals("round way")){
                    if(month.equals(q.getString(2))){
                        if(date.equals(q.getString(1))){

                           price=2*rs.getInt(3);
        
                   
                          }
                   else{
                           price=2*(rs.getInt(3)/r.getInt(1));

                   }
                    }                   
                    
                   
                    else{
                        if(date.equals(q.getString(1))){
                        price=2*(rs.getInt(3)/(28*r.getInt(2)));
                        }
                        else{
                        price=2*(rs.getInt(3)/(28*r.getInt(1)*r.getInt(2)));
                        }
                    
                    }
                    }
                    else{
                    if(month.equals(q.getString(2))){
                        if(date.equals(q.getString(1))){

                           price=2*rs.getInt(3);
        
                   
                          }
                   else{
                           price=2*rs.getInt(3)/r.getInt(1);

                   }
                    }                   
                    
                   
                    else{
                        if(date.equals(q.getInt(1))){
                        price=2*rs.getInt(3)/(28*r.getInt(2));
                        }
                        else{
                        price=2*rs.getInt(3)/(28*r.getInt(1)*r.getInt(2));
                        }
                    
                    }
                    }
                    
                    
                    
                   out.println("<form action='f5' method='post'>");
                 out.println("<input type='hidden' name='type' value='"+type+"'/>");
                 out.println("<input type='hidden' name='source' value='"+sour+"'/>");
                   out.println("<input type='hidden' name='destination' value='"+destination+"'/>");
                out.println("<input type='hidden' name='date' value='"+year+"/"+month+"/"+date+"'/>");
             out.println("<input type='hidden' name='Class' value='"+Class+"'/>");
                out.println(" <style>\n" +
"            body{\n" +
"                background:  url(https://img2.goodfon.com/original/2048x1152/8/75/jal-samolet-vzletnaya-polosa.jpg);\n" +
"                background-size: cover;\n" +
"            }\n" +
"            .a{\n" +
"                height: 15%;\n" +
"                width: 100%;\n" +
"                background-color: rgba(0.8,0.8,0,0.8);\n" +
"               text-align: left;\n" +
"               margin-top: 5%;\n" +
"               border-radius: 20px;\n" +
"               font-size: 25px;\n" +
"               border: none;\n" +
"            }\n" +
"            .a label{\n" +
"                color: #0000ff;\n" +
"                position: absolute;\n" +
"                margin-top: 20px;\n" +
"                margin-left: 129px;\n" +
"                \n" +
"            }\n" +
"            .a input{\n" +
"                margin-left: 120px;\n" +
"                margin-top: 49px;\n" +
"                background: none;\n" +
"                height: 30px;\n" +
"                color: white;\n" +
"                \n" +
"            }\n" +
"            .b label{\n" +
"                text-align: center;\n" +
"               \n" +
"                \n" +
"            }\n" +
"          \n" +
"            \n" +
"            .c{\n" +
"                background-color: #cccccc;\n" +
"                border: #666666 outset;\n" +
"                border-radius: 20px;\n" +
"                width: 80%;\n" +
"                height: 20%;\n" +
"                margin-left: 10%;\n" +
"                margin-top: 10px;\n" +
"                \n" +
"                \n" +
"            }\n" +
"            .c input[type=\"text\"]{\n" +
"                border: none;\n" +
"                \n" +
"               margin-top: 50px;\n" +
"               margin-left: 1px;\n" +
"            height: 20%;\n" +
"               background: none;\n" +
"               font-size: 25px;\n" +
"               font: sans-serif;\n" +
"               text-align: center;\n" +
"               \n" +
"            }\n" +
"            .c input[type=\"submit\"]{\n" +
"                background: #0033ff;\n" +
"                width: 12%;\n" +
"                height: 30%;\n" +
"                border-radius: 20px;\n" +
"                margin-left: 5px;\n" +
"                cursor: pointer;\n" +
"                transition: 0.25s;\n" +
"               text-decoration: #ffffff;\n" +
"                font-family: fantasy;\n" +
"                font-size: 20px;\n" +
"                   \n" +
"            }\n" +
"            .c input[type=\"submit\"]:hover{\n" +
"                background-color: #ff0000;\n" +
"            }\n" +
"            \n" +
"            .d{\n" +
"                margin-left:50%;\n" +
"                margin-top: 20px;\n" +
"                font-family: sans-serif;\n" +
"                color: white;\n" +
"                font-size: 50px;\n" +
"                font-style: oblique;\n" +
"                color: #0000cc;\n" +
"            }\n" +
"            .e{\n" +
"                  margin-left:26%;\n" +
"                margin-top: -4.5%;\n" +
"                font-family: sans-serif;\n" +
"                color: white;\n" +
"                font-size: 50px;\n" +
"                font-style: oblique;\n" +
"                color:  #ff0000;\n" +
"            }\n" +
"            .f{\n" +
"                 margin-left:70%;\n" +
"                margin-top: -4%;\n" +
"                font-family: sans-serif;\n" +
"                color: white;\n" +
"                font-size: 50px;\n" +
"                font-style: oblique;\n" +
"                color:  #ff0000;\n" +
"                \n" +
"            }\n" +
"            .g{\n" +
"                \n" +
"                height: 100%;\n" +
"                width: 90%;\n" +
"                background: rgba(.8,.8,.8,.8);\n" +
"                margin-left: 5%;\n" +
"                margin-top: -1.35%;\n" +
"                border: none;\n" +
"            }\n" +
"             h1\n" +
"            {\n" +
"            text-align: center;\n" +
"                font-family: 'Nunito', sans-serif;\n" +
"                font-size: 50px;\n" +
"\n" +
"\n" +
"\n" +
"                color: #0000cc;\n" +
"            }\n" +
"            #trip\n" +
"            {\n" +
"                color: #ff0000;\n" +
"            font-family: 'Ubuntu', sans-serif;\n" +
"\n" +
"            }\n" +
"            \n" +
"            \n" +
"           \n" +
"            \n" +
"        </style>  <div class=\"c\"> <p> <input type=\"submit\" value=\"Book Now\" name=\"Book Now\" /><input type=\"text\" name=\"flights\" value='"+rs.getString(1)+"' /><input type=\"text\" name=\"time\" value='"+rs.getString(2)+"' /><input type=\"text\" name=\"price\" value='"+price+"' /></p></div>");
                     out.println("</form>");  
                                       

                }
                                   out.println("</div>");

                }}
                   }                

                      else{
                    PreparedStatement ps=con.prepareStatement("select flight,time,pricef from trans where source='"+sour+"' and destination='"+destination+"'");
                ResultSet rs=ps.executeQuery();
                if(q.next()){
                 if(r.next()){
                            out.println("<style>\n" +
"            body{\n" +
"                background:  url(https://img2.goodfon.com/original/2048x1152/8/75/jal-samolet-vzletnaya-polosa.jpg);\n" +
"                background-size: cover;\n" +
"            }\n" +
"            .a{\n" +
"                height: 15%;\n" +
"                width: 100%;\n" +
"                background-color: rgba(0.8,0.8,0,0.8);\n" +
"               text-align: left;\n" +
"               margin-top: 5%;\n" +
"               border-radius: 20px;\n" +
"               font-size: 25px;\n" +
"               border: none;\n" +
"            }\n" +
"            .a label{\n" +
"                color: #0000ff;\n" +
"                position: absolute;\n" +
"                margin-top: 20px;\n" +
"                margin-left: 129px;\n" +
"                \n" +
"            }\n" +
"            .a input{\n" +
"                margin-left: 120px;\n" +
"                margin-top: 49px;\n" +
"                background: none;\n" +
"                height: 30px;\n" +
"                color: white;\n" +
"                \n" +
"            }\n" +
"            .b label{\n" +
"                text-align: center;\n" +
"               \n" +
"                \n" +
"            }\n" +
"          \n" +
"            \n" +
"            .c{\n" +
"                background-color: #cccccc;\n" +
"                border: #666666 outset;\n" +
"                border-radius: 20px;\n" +
"                width: 80%;\n" +
"                height: 20%;\n" +
"                margin-left: 10%;\n" +
"                margin-top: 10px;\n" +
"                \n" +
"                \n" +
"            }\n" +
"            .c input[type=\"text\"]{\n" +
"                border: none;\n" +
"                \n" +
"               margin-top: 50px;\n" +
"               margin-left: 1px;\n" +
"            height: 20%;\n" +
"               background: none;\n" +
"               font-size: 25px;\n" +
"               font: sans-serif;\n" +
"               text-align: center;\n" +
"               \n" +
"            }\n" +
"            .c input[type=\"submit\"]{\n" +
"                background: #0033ff;\n" +
"                width: 12%;\n" +
"                height: 30%;\n" +
"                border-radius: 20px;\n" +
"                margin-left: 5px;\n" +
"                cursor: pointer;\n" +
"                transition: 0.25s;\n" +
"               text-decoration: #ffffff;\n" +
"                font-family: fantasy;\n" +
"                font-size: 20px;\n" +
"                   \n" +
"            }\n" +
"            .c input[type=\"submit\"]:hover{\n" +
"                background-color: #ff0000;\n" +
"            }\n" +
"            \n" +
"            .d{\n" +
"                margin-left:50%;\n" +
"                margin-top: 20px;\n" +
"                font-family: sans-serif;\n" +
"                color: white;\n" +
"                font-size: 50px;\n" +
"                font-style: oblique;\n" +
"                color: #0000cc;\n" +
"            }\n" +
"            .e{\n" +
"                  margin-left:26%;\n" +
"                margin-top: -4.5%;\n" +
"                font-family: sans-serif;\n" +
"                color: white;\n" +
"                font-size: 50px;\n" +
"                font-style: oblique;\n" +
"                color:  #ff0000;\n" +
"            }\n" +
"            .f{\n" +
"                 margin-left:70%;\n" +
"                margin-top: -4%;\n" +
"                font-family: sans-serif;\n" +
"                color: white;\n" +
"                font-size: 50px;\n" +
"                font-style: oblique;\n" +
"                color:  #ff0000;\n" +
"                \n" +
"            }\n" +
"            .g{\n" +
"                \n" +
"                height: 500%;\n" +
"                width: 90%;\n" +
"                background: rgba(.8,.8,.8,.8);\n" +
"                margin-left: 5%;\n" +
"                margin-top: -1.35%;\n" +
"                border: none;\n" +
"            }\n" +
"             h1\n" +
"            {\n" +
"            text-align: center;\n" +
"                font-family: 'Nunito', sans-serif;\n" +
"                font-size: 50px;\n" +
"\n" +
"\n" +
"\n" +
"                color: #0000cc;\n" +
"            }\n" +
"            #trip\n" +
"            {\n" +
"                color: #ff0000;\n" +
"            font-family: 'Ubuntu', sans-serif;\n" +
"\n" +
"            }\n" +
"            \n" +
"            \n" +
"           \n" +
"            \n" +
"        </style>\n" +
"        <form action=\"f5\" method=\"post\">\n" +
"           <h1>FoxStar <span id=\"trip\">Flights</span></h1>\n" +
"            <div class=\"a\"> <label>source: </label> <input type=\"text\" name=\"source\" value='"+sour+"' />\n" +
"              <label>Class</label> <input type=\"text\" name=\"Class\" value='"+Class+"'/>\n" +
"                \n" +
"                        <label>Destination:</label> <input type=\"text\" name=\"destination\" value='"+destination+"' />\n" +
"            <label>Trip type:</label> <input type=\"text\" name=\"type\" value='"+type+"' />\n" +
"            <label>Depart:</label> <input type=\"text\" name=\"date\" value="+date+"/"+month+"/"+year+" /></div>\n" +
"            <div class=\"g\">\n" +
"            <div class=\"d\"><label>TIME</label></div><div class=\"e\"><label>FLIGHT</label></div><div class=\"f\"><label>PRICE</label></div>");
                while(rs.next()){
                    if(type.equals("one way")){
                    if(month.equals(q.getString(2))){
                        if(date.equals(q.getString(1))){

                           price=rs.getInt(3);
        
                   
                          }
                   else{
                           price=rs.getInt(3)/r.getInt(1);

                   }
                    }                   
                    
                   
                    else{
                        if(date.equals(q.getString(1))){
                        price=rs.getInt(3)/(28*r.getInt(2));
                        }
                        else{
                        price=rs.getInt(3)/(28*r.getInt(1)*r.getInt(2));
                        }
                    
                    }
                    }
                    else{
                    if(month.equals(q.getString(2))){
                        if(date.equals(q.getString(1))){

                           price=2*rs.getInt(3);
        
                   
                          }
                   else{
                           price=2*rs.getInt(3)/r.getInt(1);

                   }
                    }                   
                    
                   
                    else{
                        if(date.equals(q.getInt(1))){
                        price=2*rs.getInt(3)/(28*r.getInt(2));
                        }
                        else{
                        price=2*rs.getInt(3)/(28*r.getInt(1)*r.getInt(2));
                        }
                    
                    }
                    }
                    
                    
                    
                   out.println("<form action='f5' method='post'>");
                 out.println("<input type='hidden' name='type' value='"+type+"'/>");
                 out.println("<input type='hidden' name='source' value='"+sour+"'/>");
                   out.println("<input type='hidden' name='destination' value='"+destination+"'/>");
                out.println("<input type='hidden' name='date' value='"+year+"/"+month+"/"+date+"'/>");
             out.println("<input type='hidden' name='Class' value='"+Class+"'/>");
                out.println(" <style>\n" +
"            body{\n" +
"                background:  url(https://img2.goodfon.com/original/2048x1152/8/75/jal-samolet-vzletnaya-polosa.jpg);\n" +
"                background-size: cover;\n" +
"            }\n" +
"            .a{\n" +
"                height: 15%;\n" +
"                width: 100%;\n" +
"                background-color: rgba(0.8,0.8,0,0.8);\n" +
"               text-align: left;\n" +
"               margin-top: 5%;\n" +
"               border-radius: 20px;\n" +
"               font-size: 25px;\n" +
"               border: none;\n" +
"            }\n" +
"            .a label{\n" +
"                color: #0000ff;\n" +
"                position: absolute;\n" +
"                margin-top: 20px;\n" +
"                margin-left: 129px;\n" +
"                \n" +
"            }\n" +
"            .a input{\n" +
"                margin-left: 120px;\n" +
"                margin-top: 49px;\n" +
"                background: none;\n" +
"                height: 30px;\n" +
"                color: white;\n" +
"                \n" +
"            }\n" +
"            .b label{\n" +
"                text-align: center;\n" +
"               \n" +
"                \n" +
"            }\n" +
"          \n" +
"            \n" +
"            .c{\n" +
"                background-color: #cccccc;\n" +
"                border: #666666 outset;\n" +
"                border-radius: 20px;\n" +
"                width: 80%;\n" +
"                height: 20%;\n" +
"                margin-left: 10%;\n" +
"                margin-top: 10px;\n" +
"                \n" +
"                \n" +
"            }\n" +
"            .c input[type=\"text\"]{\n" +
"                border: none;\n" +
"                \n" +
"               margin-top: 50px;\n" +
"               margin-left: 1px;\n" +
"            height: 20%;\n" +
"               background: none;\n" +
"               font-size: 25px;\n" +
"               font: sans-serif;\n" +
"               text-align: center;\n" +
"               \n" +
"            }\n" +
"            .c input[type=\"submit\"]{\n" +
"                background: #0033ff;\n" +
"                width: 12%;\n" +
"                height: 30%;\n" +
"                border-radius: 20px;\n" +
"                margin-left: 5px;\n" +
"                cursor: pointer;\n" +
"                transition: 0.25s;\n" +
"               text-decoration: #ffffff;\n" +
"                font-family: fantasy;\n" +
"                font-size: 20px;\n" +
"                   \n" +
"            }\n" +
"            .c input[type=\"submit\"]:hover{\n" +
"                background-color: #ff0000;\n" +
"            }\n" +
"            \n" +
"            .d{\n" +
"                margin-left:50%;\n" +
"                margin-top: 20px;\n" +
"                font-family: sans-serif;\n" +
"                color: white;\n" +
"                font-size: 50px;\n" +
"                font-style: oblique;\n" +
"                color: #0000cc;\n" +
"            }\n" +
"            .e{\n" +
"                  margin-left:26%;\n" +
"                margin-top: -4.5%;\n" +
"                font-family: sans-serif;\n" +
"                color: white;\n" +
"                font-size: 50px;\n" +
"                font-style: oblique;\n" +
"                color:  #ff0000;\n" +
"            }\n" +
"            .f{\n" +
"                 margin-left:70%;\n" +
"                margin-top: -4%;\n" +
"                font-family: sans-serif;\n" +
"                color: white;\n" +
"                font-size: 50px;\n" +
"                font-style: oblique;\n" +
"                color:  #ff0000;\n" +
"                \n" +
"            }\n" +
"            .g{\n" +
"                \n" +
"                height: 100%;\n" +
"                width: 90%;\n" +
"                background: rgba(.8,.8,.8,.8);\n" +
"                margin-left: 5%;\n" +
"                margin-top: -1.35%;\n" +
"                border: none;\n" +
"            }\n" +
"             h1\n" +
"            {\n" +
"            text-align: center;\n" +
"                font-family: 'Nunito', sans-serif;\n" +
"                font-size: 50px;\n" +
"\n" +
"\n" +
"\n" +
"                color: #0000cc;\n" +
"            }\n" +
"            #trip\n" +
"            {\n" +
"                color: #ff0000;\n" +
"            font-family: 'Ubuntu', sans-serif;\n" +
"\n" +
"            }\n" +
"            \n" +
"            \n" +
"           \n" +
"            \n" +
"        </style>  <div class=\"c\"> <p> <input type=\"submit\" value=\"Book Now\" name=\"Book Now\" /><input type=\"text\" name=\"flights\" value='"+rs.getString(1)+"' /><input type=\"text\" name=\"time\" value='"+rs.getString(2)+"' /><input type=\"text\" name=\"price\" value='"+price+"' /></p></div>");
                                     out.println("</form>");  
                                       

                }
                                   out.println("</div>");
                                     out.println("</form>");  

                }}
                   }                

                                 

                      
                          
                        
                        
                  
        } catch (SQLException ex) {
            Logger.getLogger(f4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }}

   