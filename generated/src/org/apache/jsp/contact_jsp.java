package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    \n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/favicon.ico\" />\n");
      out.write("        <!-- Font Awesome icons (free version)-->\n");
      out.write("        <script src=\"https://use.fontawesome.com/releases/v5.15.4/js/all.js\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("        <!-- Google fonts-->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\"\n");
      out.write("              rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic\"\n");
      out.write("            rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"./CSS/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("    <title>CodeWorm | The Best app to Crack</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">CodeWorm</a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\n");
      out.write("                data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\n");
      out.write("                aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" aria-current=\"page\" href=\"index.html\">Home</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"about.jsp\">About</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\"\n");
      out.write("                            data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                            Courses\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"videos.jsp\">C++</a></li>\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"videospython.jsp\">Python</a></li>\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"videosds.jsp\">Data Structures</a></li>\n");
      out.write("                            <li>\n");
      out.write("                                <hr class=\"dropdown-divider\">\n");
      out.write("                            </li>\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"#\">And Many More...</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link active\" href=\"contact.jsp\">Contact Us</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <form class=\"d-flex\">\n");
      out.write("                    <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                    <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"container my-4\">\n");
      out.write("        <h2>Contact Us</h2>\n");
      out.write("        <form action=\"contactback.jsp\">\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("                <label for=\"exampleFormControlInput1\" class=\"form-label\">Email address</label>\n");
      out.write("                <input type=\"email\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"name@example.com\" name=\"myemail\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"formgroup\">\n");
      out.write("                <label for=\"form-select-lg example\" class=\"form-label\">Choose Your Query</label>\n");
      out.write("                <select class=\"form-select form-select-sm\" aria-label=\".form-select-lg example\" name=\"service\">\n");
      out.write("                    <option selected>About Our Service</option>\n");
      out.write("                    <option value=\"1\">Technology News</option>\n");
      out.write("                    <option value=\"2\">Web Hosting</option>\n");
      out.write("                    <option value=\"3\">Any topic of your Course</option>\n");
      out.write("                </select>\n");
      out.write("                <br>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("                <label for=\"exampleFormControlTextarea1\" class=\"form-label\">Elaborate your Concern</label>\n");
      out.write("                <textarea class=\"form-control\" id=\"exampleFormControlTextarea1\" rows=\"3\" name=\"query\"></textarea>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <button class=\"btn btn-primary\">Submit</button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <footer style=\"background-color: #000\" class=\"footer text-center\">\n");
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
      out.write("\n");
      out.write("    <!-- Optional JavaScript; choose one of the two! -->\n");
      out.write("\n");
      out.write("    <!-- Option 1: Bootstrap Bundle with Popper -->\n");
      out.write("    <script src=\"./JS/bootstrap.bundle.min.js\"></script>\n");
      out.write("</body>\n");
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
