package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"stylesheet\" href=\"./CSS/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("    <title>dCoder | The Best app to Crack</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">dCoder</a>\n");
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
      out.write("                        <a class=\"nav-link active\" href=\"about.html\">About</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\"\n");
      out.write("                            data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                            Courses\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"#\">Python</a></li>\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"#\">C++</a></li>\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"#\">Web Development</a></li>\n");
      out.write("                            <li>\n");
      out.write("                                <hr class=\"dropdown-divider\">\n");
      out.write("                            </li>\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"#\">And Many More..</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"./contact.html\">Contact Us</a>\n");
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
      out.write("        <div class=\"row featurette d-flex justify-content-center align-items-center\">\n");
      out.write("            <div class=\"col-md-7\">\n");
      out.write("                <h2 class=\"featurette-heading\">It all Started with dCoder's Idea. <span class=\"text-muted\">It’ll blow\n");
      out.write("                        your\n");
      out.write("                        mind.</span></h2>\n");
      out.write("                <p class=\"lead\">Some great placeholder content for the first featurette here. Imagine some exciting\n");
      out.write("                    prose here.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-5\">\n");
      out.write("                <img class=\"bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto\" src=\"imgs/abt1.png\"\n");
      out.write("                    alt=\"\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row featurette d-flex justify-content-center align-items-center\">\n");
      out.write("            <div class=\"col-md-7 order-md-2\">\n");
      out.write("                <h2 class=\"featurette-heading\">We Started dCoder recently<span class=\"text-muted\">It’ll blow your\n");
      out.write("                        mind.</span></h2>\n");
      out.write("                <p class=\"lead\">Some great placeholder content for the first featurette here. Imagine some exciting\n");
      out.write("                    prose here.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-5 order-md-1\">\n");
      out.write("                <img class=\"bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto\" src=\"imgs/abt2.png\"\n");
      out.write("                    alt=\"\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row featurette d-flex justify-content-center align-items-center\">\n");
      out.write("            <div class=\"col-md-7\">\n");
      out.write("                <h2 class=\"featurette-heading\">First featurette heading. <span class=\"text-muted\">It’ll blow your\n");
      out.write("                        mind.</span></h2>\n");
      out.write("                <p class=\"lead\">Some great placeholder content for the first featurette here. Imagine some exciting\n");
      out.write("                    prose here.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-5\">\n");
      out.write("                <img class=\"bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto\" src=\"imgs/abt3.png\"\n");
      out.write("                    alt=\"\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <footer class=\"container\">\n");
      out.write("        <p class=\"float-end\"><a href=\"#\">Back to top</a></p>\n");
      out.write("        <p>© 2020–2021 dCoder, Inc. · <a href=\"#\">Privacy</a> · <a href=\"#\">Terms</a></p>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Optional JavaScript; choose one of the two! -->\n");
      out.write("\n");
      out.write("    <!-- Option 1: Bootstrap Bundle with Popper -->\n");
      out.write("      -->\n");
      out.write("\n");
      out.write("      <script src=\"./JS/bootstrap.bundle.min.js\"></script>\n");
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
