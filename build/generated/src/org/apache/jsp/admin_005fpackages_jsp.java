package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import app.classes.User;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import app.classes.dbConnector;

public final class admin_005fpackages_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
    User user = new User();
    if (session.getAttribute("user_id") != null) {
        int user_id = (Integer) session.getAttribute("user_id");
        user.setId(user_id);
    }else{
     response.sendRedirect("index.jsp");
    }
    

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>TravelEase - Admin</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        <style>\n");
      out.write("            nav {\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: space-between;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                background-color: #f8f8f8; /* Change to your desired background color */\n");
      out.write("                font-weight: 900;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .nav-logo img {\n");
      out.write("                height: 50px; /* Adjust based on your logo size */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .nav-links {\n");
      out.write("                flex-grow: 1;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .nav-links ul {\n");
      out.write("                list-style: none;\n");
      out.write("                padding: 0;\n");
      out.write("                margin: 0;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .nav-links li {\n");
      out.write("                margin: 0 15px;\n");
      out.write("                font-size: 18px; /* Adjust the font size as needed */\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .nav-links li a{\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("            .nav-links li a:hover{\n");
      out.write("                color: blue;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .nav-btn {\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .nav-btn button {\n");
      out.write("                background-color: black; /* Change to your desired button color */\n");
      out.write("                color: white;\n");
      out.write("                border: none;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                font-size: 16px; /* Adjust the font size as needed */\n");
      out.write("                border-radius: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .nav-btn button a {\n");
      out.write("                color: white;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .nav-btn button:hover {\n");
      out.write("                background-color: darkgray; /* Adjust hover color as needed */\n");
      out.write("            }\n");
      out.write("            h2{\n");
      out.write("                font-size: 2rem;\n");
      out.write("                font-weight: 800;\n");
      out.write("            }\n");
      out.write("            #main-title{\n");
      out.write("                color: darkorange;\n");
      out.write("            }\n");
      out.write("            h1 {\n");
      out.write("                font-family: 'Poppins', sans-serif;\n");
      out.write("                font-size: 45px;\n");
      out.write("                font-weight: bolder;\n");
      out.write("            }\n");
      out.write("            .card-title {\n");
      out.write("                font-size: 1.5rem;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            .card-text {\n");
      out.write("                font-size: 1rem;\n");
      out.write("            }\n");
      out.write("            .text-muted {\n");
      out.write("                font-size: 0.9rem;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!----------------------------------------------nav bar-------------------------------------------->\n");
      out.write("        <nav>\n");
      out.write("            <div class=\"nav-logo\">\n");
      out.write("                <img src=\"logo.png\" alt=\"logo comes here..\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"nav-links\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"admin.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"admin_packages.jsp\">Packages</a></li>\n");
      out.write("                    <li><a href=\"logout.jsp\">Log Out</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"nav-btn btn btn-black\">\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("       \n");
      out.write("        <div class=\"container mt-5\">\n");
      out.write("            <h3 class=\"row justify-content-center\">Booked Packages <span class=\"solution\">Details</span></h3>\n");
      out.write("            <!-- Centering the table with Bootstrap classes -->\n");
      out.write("            <div class=\"row justify-content-center\">\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                    <table class=\"table table-bordered table-striped\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Booking Id</th>\n");
      out.write("                                <th>Name</th>\n");
      out.write("                                <th>Address</th>\n");
      out.write("                                <th>Email</th>\n");
      out.write("                                <th>Phone No</th>\n");
      out.write("                                <th>Contact No.</th>\n");
      out.write("                                <th>Location ID</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");

                                Connection con = dbConnector.getConnection();
                                String query = "SELECT * FROM booking";
                                PreparedStatement pstmt = con.prepareStatement(query);
                                ResultSet rs = pstmt.executeQuery();

                                while (rs.next()) {
                                    String bookingId = rs.getString("bookingId");
                                    String name = rs.getString("name");
                                    String address = rs.getString("address");
                                    String email = rs.getString("email");
                                    String phoneNo = rs.getString("phoneNo");
                                    String bookingDate = rs.getString("bookingDate");
                                    String id = rs.getString("loc_id");

                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print( bookingId);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( name);
      out.write("</td>\n");
      out.write("                                 <td>");
      out.print( address);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( email);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( phoneNo);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( bookingDate);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( id);
      out.write("</td>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                                }
                                rs.close();
                                pstmt.close();
                                con.close();
                            
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
