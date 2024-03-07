package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class delUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Delete User</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style>\n");
      out.write("            .myclass {\n");
      out.write("                height: 416px;\n");
      out.write("                width: 400px;\n");
      out.write("            }\n");
      out.write("            li {\n");
      out.write("                color: red;\n");
      out.write("            }\n");
      out.write("            .slider {\n");
      out.write("                height: 800px;\n");
      out.write("                width: 1685px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <!-- Favicon-->\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/favicon.ico\" />\n");
      out.write("        <!-- Font Awesome icons (free version)-->\n");
      out.write("        <script src=\"https://use.fontawesome.com/releases/v5.15.4/js/all.js\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("        <!-- Google fonts-->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\"\n");
      out.write("              rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic\"\n");
      out.write("            rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!-- Core theme CSS (includes Bootstrap)-->\n");
      out.write("        <link href=\"css/index-styles.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"site-mobile-menu\">\n");
      out.write("            <div class=\"site-mobile-menu-header\">\n");
      out.write("                <div class=\"site-mobile-menu-close mt-3\">\n");
      out.write("                    <span class=\"icon-close2 js-menu-toggle\"></span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"site-mobile-menu-body\"></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <header class=\"site-navbar\" role=\"banner\">\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row align-items-center\">\n");
      out.write("\n");
      out.write("                    <div class=\"col-11 col-xl-2\">\n");
      out.write("                        <h1 class=\"mb-0 site-logo\"><a href=\"index.html\" class=\"text-white mb-0\">Brand</a></h1>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12 col-md-10 d-none d-xl-block\">\n");
      out.write("                        <nav\n");
      out.write("                            class=\"navbar navbar-expand-lg text-uppercase fixed-top\"\n");
      out.write("                            id=\"mainNav\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <a class=\"navbar-brand\" style=\"color: #F0997D\" href=\"#page-top\"><h1>Aesthetic Thoughts</h1></a>\n");
      out.write("                                <button\n");
      out.write("                                    class=\"navbar-toggler text-uppercase font-weight-bold bg-primary text-white rounded\"\n");
      out.write("                                    type=\"button\" data-bs-toggle=\"collapse\"\n");
      out.write("                                    data-bs-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\"\n");
      out.write("                                    aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                                    Menu <i class=\"fas fa-bars\"></i>\n");
      out.write("                                </button>\n");
      out.write("                                <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("                                    <ul class=\"navbar-nav ms-auto\">\n");
      out.write("                                        <li class=\"nav-item mx-0 mx-lg-1\"><a\n");
      out.write("                                                class=\"nav-link py-3 px-0 px-lg-3 rounded\" style=\"color: #F0997D\" href=\"userView.jsp\">View User</a></li>\n");
      out.write("                                        <li class=\"nav-item mx-0 mx-lg-1\"><a\n");
      out.write("                                                class=\"nav-link py-3 px-0 px-lg-3 rounded\" style=\"color: #F0997D\" href=\"DeleteUser.html\">Delete User</a></li>\n");
      out.write("                                        <!--                                        <li class=\"nav-item mx-0 mx-lg-1\"><a\n");
      out.write("                                                                                        class=\"nav-link py-3 px-0 px-lg-3 rounded\" style=\"color: #FAD6A5\" href=\"login.jsp\">Admin Login</a></li>-->\n");
      out.write("                                        <li class=\"nav-item mx-0 mx-lg-1\"><a\n");
      out.write("                                                class=\"nav-link py-3 px-0 px-lg-3 rounded\" style=\"color: #F0997D\" href=\"index.jsp\">Log Out</a></li>\n");
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </nav> </br></br></br></br>\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <form action=\"DeleteBack.jsp\" method=\"get\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <label>Enter the ID you want to delete:  </label>   \n");
      out.write("                                <input class=\"boxes\" type=\"text\" placeholder=\"Enter your ID\" name=\"id\">\n");
      out.write("                                <!--<input class=\"boxes\" type=\"text\" placeholder=\"Enter Your ID\" name=\"id\">-->  \n");
      out.write("                                </br></br>\n");
      out.write("                                <input style=\"background-color: #1abc9c; color: white\" class=\"boxes\" type=\"submit\" name=\"btsubmit\">  \n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"d-inline-block d-xl-none ml-md-0 mr-auto py-3\" style=\"position: relative; top: 3px;\"><a href=\"#\" class=\"site-menu-toggle js-menu-toggle text-white\"><span class=\"icon-menu h3\"></span></a></div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!--</div>-->\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <div class=\"hero\" style=\"background-image: url('images/delbg.png'); background-size: auto;\"></div>\n");
      out.write("        <!-- Footer-->\n");
      out.write("        <footer style=\"background-color: #F0997D\" class=\"footer text-center\">\n");
      out.write("            <div style=\"background-color: #F0997D\" class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <!--                    Footer Location-->\n");
      out.write("                    <div class=\"col-lg-4 mb-5 mb-lg-0\">\n");
      out.write("                        <h4 style=\"color:white\" class=\"text-uppercase mb-4\">Location</h4>\n");
      out.write("                        <p style=\"color:white\" class=\"lead mb-0\">\n");
      out.write("                            Bhavan's College, <br /> Andheri West, Mumbai.\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                    <!--                    Footer Social Icons-->\n");
      out.write("                    <div class=\"col-lg-4 mb-5 mb-lg-0\">\n");
      out.write("                        <h4 style=\"color:white\" class=\"text-uppercase mb-4\">Around the Web</h4>\n");
      out.write("                        <a class=\"btn btn-outline-light btn-social mx-1\" href=\"#!\"><i\n");
      out.write("                                class=\"fab fa-fw fa-facebook-f\"></i></a> <a\n");
      out.write("                            class=\"btn btn-outline-light btn-social mx-1\" href=\"#!\"><i\n");
      out.write("                                class=\"fab fa-fw fa-twitter\"></i></a> <a\n");
      out.write("                            class=\"btn btn-outline-light btn-social mx-1\" href=\"#!\"><i\n");
      out.write("                                class=\"fab fa-fw fa-linkedin-in\"></i></a> <a\n");
      out.write("                            class=\"btn btn-outline-light btn-social mx-1\" href=\"#!\"><i\n");
      out.write("                                class=\"fab fa-fw fa-dribbble\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                    <!--                    Footer About Text-->\n");
      out.write("                    <div class=\"col-lg-4\">\n");
      out.write("                        <h4 style=\"color:white\" class=\"text-uppercase mb-4\">Owned By</h4>\n");
      out.write("                        <p style=\"color:white\" class=\"lead mb-0\">\n");
      out.write("                            SYCS09 Benecia Crasta\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script src=\"js/popper.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.sticky.js\"></script>\n");
      out.write("        <script src=\"js/main1.js\"></script>\n");
      out.write("    </body>\n");
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
