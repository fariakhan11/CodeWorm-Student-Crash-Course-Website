package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class certificate1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Certificate Generator using javascript</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Archivo+Narrow&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"favicon.png\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <header>\n");
      out.write("        <div class=\"heading_text\">\n");
      out.write("            <h1>Create Certificates for Free in Minutes</h1>\n");
      out.write("            <h2>Make unique certificates in minutes. No design skills needed.</h2>\n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("    </header>\n");
      out.write("    <main>\n");
      out.write("        <div>\n");
      out.write("            <input type=\"text\" name=\"Name\" class=\"question\" id=\"name\" required autocomplete=\"off\" />\n");
      out.write("            <label for=\"name\"><span>What's your name?</span></label>\n");
      out.write("            <input type=\"submit\" id=\"submitBtn\" value=\"Get Certificate\"/>\n");
      out.write("        </div>\n");
      out.write("    </main>\n");
      out.write("    <script src=\"https://unpkg.com/pdf-lib/dist/pdf-lib.min.js\"></script>\n");
      out.write("    <script src=\"https://unpkg.com/@pdf-lib/fontkit@0.0.4\"></script>\n");
      out.write("    <script src=\"filesaver.js\"></script>\n");
      out.write("    <script src=\"index.js\"></script>\n");
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
