package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import view.OtherView;
import view.WebUserView;
import dbUtils.DbConn;

public final class other_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <title>Application Freelancing</title>\r\n");
      out.write("        <link id=\"styleSheetID\" href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <script src=\"myscript.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script>readCookieSetStyle();</script> \r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "pre-content.jsp", out, false);
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("        document.getElementById(\"labs\").className = \"tab selected\";\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("    ");

            DbConn dbc = new DbConn();
            String msg = dbc.getErr(); // returns "" if connection is good, else error msg.
            if (msg.length() == 0) { // got open connection

                // returns a string that contains a HTML table with the db data in it
                msg = OtherView.listAllUsers("resultSetFormat", dbc);
            }
            // PREVENT DB connection leaks:
            dbc.close(); //    EVERY code path that opens a db connection, must also close it.
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <h1>Web Users</h1>\r\n");
      out.write("        ");
 out.print(msg); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "post-content.jsp", out, false);
      out.write('\r');
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
