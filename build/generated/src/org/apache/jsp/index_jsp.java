package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import app.classes.User;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Bootstrap demo</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("              integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");

    if (request.getParameter("s") != null) {
        if (request.getParameter("s").equals("1")) {

      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    alert(\"Suucessfully Logged In\");\n");
      out.write("</script>\n");

} else if(request.getParameter("s").equals("2")){

      out.write("\n");
      out.write("<script>\n");
      out.write("    alert(\"Succefully Registered!\");\n");
      out.write("</script>\n");

    }
}

      out.write("\n");
      out.write("        <div class=\"nav_contain\">\n");
      out.write("            <nav class=\"navbar navbar-expand-lg\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <img src=\"");
      out.print( request.getContextPath());
      out.write("/images/Vector.png\" alt=\"\" class=\"logo\">\n");
      out.write("                    <div class=\"offcanvas offcanvas-end\" tabindex=\"-1\" id=\"offcanvasNavbar\"\n");
      out.write("                         aria-labelledby=\"offcanvasNavbarLabel\">\n");
      out.write("                        <div class=\"offcanvas-header\">\n");
      out.write("                            <h5 class=\"offcanvas-title\" id=\"offcanvasNavbarLabel\">travelEase</h5>\n");
      out.write("                            <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"offcanvas\" aria-label=\"Close\"></button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"offcanvas-body\">\n");
      out.write("                            <ul class=\"navbar-nav justify-content-center flex-grow-1 pe-3\">\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link\" aria-current=\"page\" href=\"./index.jsp\">Home</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"./package.jsp\">Packages</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"./user_profile.jsp\">Profile</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");

                        User user = new User();
                        if (session.getAttribute("user_id") != null) {
                    
      out.write("\n");
      out.write("                    <a href=\"./logout.jsp\" class=\"login-button\">Log Out</a>\n");
      out.write("                    ");

                    } else {
                    
      out.write("\n");
      out.write("                    <a href=\"./Login.jsp\" class=\"login-button\">Login</a>\n");
      out.write("                    ");

                        }

                    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"offcanvas\"\n");
      out.write("                            data-bs-target=\"#offcanvasNavbar\" aria-controls=\"offcanvasNavbar\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"body_containnn_1\">\n");
      out.write("            <div class=\"left_contain\">\n");
      out.write("                <h1>\n");
      out.write("                    Your One-Stop <span class=\"solution\">Solution</span> for Perfect <span class=\"solution\">Tour\n");
      out.write("                        Packages</span>.\n");
      out.write("                </h1>\n");
      out.write("                <p>\n");
      out.write("                    We simplify your travel planning by offering comprehensive tour packages that include hotel bookings and\n");
      out.write("                    trip details.\n");
      out.write("                </p>\n");
      out.write("                <a href=\"./package.jsp\" class=\"book-button\">Book</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"right_contain\">\n");
      out.write("                <img src=\"");
      out.print( request.getContextPath());
      out.write("/images/Group 17.png\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"package_contain_1\">\n");
      out.write("            <h1><span class=\"solution\">Choose</span> your Affordable <span class=\"solution\">Package</span>.</h1>\n");
      out.write("            <p>Find your perfect package, balancing comfort and budget.</p>\n");
      out.write("            <div class=\"image_container_flex\">\n");
      out.write("                <img src=\"");
      out.print( request.getContextPath());
      out.write("/images/Rectangle 9.png\" alt=\"Rectangle 9\">\n");
      out.write("                <img src=\"");
      out.print( request.getContextPath());
      out.write("/images/Rectangle 10.png\" alt=\"\">\n");
      out.write("                <img src=\"");
      out.print( request.getContextPath());
      out.write("/images/Rectangle 11.png\" alt=\"\">\n");
      out.write("                <img src=\"");
      out.print( request.getContextPath());
      out.write("/images/Rectangle 12.png\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"how_it_works\">\n");
      out.write("            <h1>How It <span class=\"solution\"> Works</span>?</h1>\n");
      out.write("\n");
      out.write("            <div class=\"row_1\">\n");
      out.write("                <div class=\"rec-\">\n");
      out.write("                    <div class=\"rec-logo\">\n");
      out.write("                        <img src=\"");
      out.print( request.getContextPath());
      out.write("/images/Group 18.png\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"rec-para\">\n");
      out.write("                        <p class=\"slim_para\"> 1. Select Your Destination</p>\n");
      out.write("                        <p>Choose from a variety of destinations. For instance, if you want to visit Galle in Sri Lanka, we\n");
      out.write("                            have\n");
      out.write("                            the perfect package for you.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"rec-\">\n");
      out.write("                    <div class=\"rec-logo\">\n");
      out.write("                        <img src=\"");
      out.print( request.getContextPath());
      out.write("/images/Group 19.png\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"rec-para\">\n");
      out.write("                        <p class=\"slim_para\">2. Choose Your Package:</p>\n");
      out.write("                        <p>Our packages are designed to accommodate up to 6 people, providing flexibility for families and\n");
      out.write("                            groups.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"row_1\">\n");
      out.write("                <div class=\"rec-\">\n");
      out.write("                    <div class=\"rec-logo\">\n");
      out.write("                        <img src=\"");
      out.print( request.getContextPath());
      out.write("/images/Group 20.png\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"rec-para\">\n");
      out.write("                        <p class=\"slim_para\">3. Complete Details:</p>\n");
      out.write("                        <p>Each package includes detailed information about the duration of your stay, daily itineraries,\n");
      out.write("                            and hotel accommodations.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"rec-\">\n");
      out.write("                    <div class=\"rec-logo\">\n");
      out.write("                        <img src=\"");
      out.print( request.getContextPath());
      out.write("/images/Group 21.png\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"rec-para\">\n");
      out.write("                        <p class=\"slim_para\"> 4. Hassle-Free Booking:</p>\n");
      out.write("                        <p>Once you book a package, there's no need to worry about hotel reservations. We handle all the\n");
      out.write("                            bookings for you, ensuring a smooth and worry-free experience.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"why_choose\">\n");
      out.write("            <h1>Why Choose <span class=\"solution\">travelEase</span>?</h1>\n");
      out.write("            <div class=\"same_line\">\n");
      out.write("                <div class=\"rec_2\">\n");
      out.write("                    <img src=\"");
      out.print( request.getContextPath());
      out.write("/images/Group 22.png\" alt=\"\">\n");
      out.write("                    <p>Curated Experiences</p>\n");
      out.write("                    <p class=\"small_para\"> Our team handpicks the best hotels and activities to ensure you have a memorable\n");
      out.write("                        trip.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"rec_2\">\n");
      out.write("                    <img src=\"");
      out.print( request.getContextPath());
      out.write("/images/Group 22.png\" alt=\"\">\n");
      out.write("                    <p>Curated Experiences</p>\n");
      out.write("                    <p class=\"small_para\"> Our team handpicks the best hotels and activities to ensure you have a memorable\n");
      out.write("                        trip.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"rec_2\">\n");
      out.write("                    <img src=\"");
      out.print( request.getContextPath());
      out.write("/images/Group 22.png\" alt=\"\">\n");
      out.write("                    <p>Curated Experiences</p>\n");
      out.write("                    <p class=\"small_para\"> Our team handpicks the best hotels and activities to ensure you have a memorable\n");
      out.write("                        trip.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"book_trip\">\n");
      out.write("            <h1>Book Your <span class=\"solution\">Dream Trip Today</span>!</h1>\n");
      out.write("            <p>Experience the ease of travel planning with TravelEase. Browse our packages, select your destination, and let us take care of the rest. Your perfect journey starts here.</p>\n");
      out.write("            <a href=\"./package.jsp\" class=\"book-button\">Book Now</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"footer_content_\">\n");
      out.write("            <div class=\"vertical-line\"></div>\n");
      out.write("            <div class=\"vertical-line\"></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"footer_content_1\">\n");
      out.write("            <p>RAD Group Assignment</p>\n");
      out.write("            <p>Group - M</p>\n");
      out.write("            <p>BIMSARA L.G.</p>\n");
      out.write("            <p>NETHMINA V.A.K.M.</p>\n");
      out.write("            <p>SURANJAYA K.D.V.</p>\n");
      out.write("            <p>NILAKSHAN R.</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("                integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
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
