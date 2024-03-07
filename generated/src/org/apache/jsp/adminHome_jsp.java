package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/adminNav.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            img{\n");
      out.write("                height:100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .carousel img {\n");
      out.write("                /*position: absolute;*/\n");
      out.write("                top: 0;\n");
      out.write("                left: 0;\n");
      out.write("                min-width: 100%;\n");
      out.write("                min-height: 100%;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"./CSS/bootstrap.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark fixed-top navbar-nav mr-auto\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">CodeWorm</a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\"\n");
      out.write("                        aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav ms-auto text-center mb-2 mb-lg-0\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link active\" aria-current=\"page\" href=\"adminHome.jsp\">Home</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link active\" aria-current=\"page\" href=\"adminview.jsp\">View User</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link active\" aria-current=\"page\" href=\"deleteuser.jsp\">Delete User</a>\n");
      out.write("                        </li>\n");
      out.write("                        ");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                    <!-- <form class=\"d-flex\">\n");
      out.write("                      <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                      <button class=\"btn btn-outline-light\" type=\"submit\">Search</button>\n");
      out.write("                    </form> \n");
      out.write("                    <div class=\"mx-2 p-md-1\">\n");
      out.write("                        <button class=\"btn btn-danger\"><a href=\"index.html\" style=\"color: white; text-decoration: none;\">Log Out</a></button>\n");
      out.write("                        \n");
      out.write("                    </div>-->\n");
      out.write("                </div>\n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script src=\"./JS/bootstrap.bundle.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <h1>WelCome Admin</h1>\n");
      out.write("        <script src=\"./JS/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("             <br>\n");
      out.write("        \n");
      out.write("        <div id=\"carouselExampleCaptions\" class=\"carousel slide carousel-fade\" data-bs-ride=\"carousel\">\n");
      out.write("            <div class=\"carousel-indicators\">\n");
      out.write("                <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"0\" class=\"active\"\n");
      out.write("                        aria-current=\"true\" aria-label=\"Slide 1\"></button>\n");
      out.write("                <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"1\"\n");
      out.write("                        aria-label=\"Slide 2\"></button>\n");
      out.write("                <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"2\"\n");
      out.write("                        aria-label=\"Slide 3\"></button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"carousel-inner\">\n");
      out.write("                <div class=\"carousel-item active\">\n");
      out.write("                    <img src=\"imgs/opt.jpg\" class=\"d-block w-100 h-100\" alt=\"...\">\n");
      out.write("                    <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                        <h2>Welcome to CodeWorm</h2>\n");
      out.write("                        <h5>\n");
      out.write("                            <p>Get your Coding Academics in a Fun and Cool Way !</p>\n");
      out.write("                        </h5>\n");
      out.write("                        <button class=\"btn btn-danger\">Tech News</button>\n");
      out.write("                        <button class=\"btn btn-primary\">Web Development</button>\n");
      out.write("                        <button class=\"btn btn-success\">Tech Fun</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"imgs/2.jpg\" class=\"d-block w-100\" alt=\"...\" height=\"450\">\n");
      out.write("                    <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                        <h2>Get LatestTech News Quickly</h2>\n");
      out.write("                        <h5>\n");
      out.write("                            <p>Get Daily Blogs related to Tech Daily</p>\n");
      out.write("                        </h5>\n");
      out.write("                        <button class=\"btn btn-danger\">Tech News</button>\n");
      out.write("                        <button class=\"btn btn-primary\">Web Development</button>\n");
      out.write("                        <button class=\"btn btn-success\">Tech Fun</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"imgs/option.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                    <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                        <h2>Good Coding Editors and Interface</h2>\n");
      out.write("                        <h5>\n");
      out.write("                            <p>Get Syntax's and Quick Cheat Sheets for Free</p>\n");
      out.write("                        </h5>\n");
      out.write("                        <button class=\"btn btn-danger\">Tech News</button>\n");
      out.write("                        <button class=\"btn btn-primary\">Web Development</button>\n");
      out.write("                        <button class=\"btn btn-success\">Tech Fun</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide=\"prev\">\n");
      out.write("                <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"visually-hidden\">Previous</span>\n");
      out.write("            </button>\n");
      out.write("            <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide=\"next\">\n");
      out.write("                <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"visually-hidden\">Next</span>\n");
      out.write("            </button>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <br>      \n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    <script src=\"./JS/bootstrap.bundle.min.js\"></script>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <footer style=\"background-color: #000\" class=\"footer text-center\">\n");
      out.write("            <div style=\"background-color: #000\" class=\"container\">\n");
      out.write("                <br>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    \n");
      out.write("                    <!--                    Footer Location-->\n");
      out.write("                    <div class=\"col-lg-4 mb-5 mb-lg-0\">\n");
      out.write("                        \n");
      out.write("                        <h4 style=\"color:white\" class=\"text-uppercase\">Location</h4>\n");
      out.write("                        <p style=\"color:white\" class=\"lead mb-0\">\n");
      out.write("                            Mumbai\n");
      out.write("                        </p>\n");
      out.write("                        <br>\n");
      out.write("                    </div>\n");
      out.write("                    <!--                    Footer Social Icons-->\n");
      out.write("                    <div class=\"col-lg-4 mb-5 mb-lg-0\">\n");
      out.write("                        <h4 style=\"color:white\" class=\"text-uppercase\">Find Us At</h4>\n");
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
      out.write("                        <h4 style=\"color:white\" class=\"text-uppercase\">Owned By</h4>\n");
      out.write("                        <p style=\"color:white\" class=\"lead mb-0\">\n");
      out.write("                            SYCS23 Faria Khan\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                        <p class=\"float-end\"><a href=\"#\">Back to top</a></p>\n");
      out.write("                        <p align=\"left\" style=\"color: whitesmoke\">© 2020–2021 CodeWorm, Inc. · <a href=\"#\">Privacy</a> · <a href=\"#\">Terms</a></p>\n");
      out.write("                        \n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write('\n');
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
