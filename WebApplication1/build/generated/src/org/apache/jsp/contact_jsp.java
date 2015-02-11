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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>Application Freelancing</title>\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <script src=\"myscript.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "pre-content.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("        document.getElementById(\"labs\").className = \"tab selected\";\n");
      out.write("    </script>\n");
      out.write("    <p></p>\n");
      out.write("\t<form name=\"myForm\" method=\"post\" action=\"http://www.temple.edu/cgi-bin/mail?tuf08373@temple.edu\">\n");
      out.write("\t<table>\n");
      out.write("      <tr>What is Your Name?   <input type=\"text\" name=\"userName\" />  <br/> <br/> </tr>\n");
      out.write("      <tr>Are you a developer?      <input type=\"radio\" name=\"userType\" value=\"Y\"  />   Yes  </tr>\n");
      out.write("                                         <input type=\"radio\" name=\"userSex\"  value=\"N\"  />    No  <br/> <br/> \n");
      out.write("      <tr> Have you made requests or fulfilled them on this site before <input type=\"checkbox\" name=\"isUser\"  />  <br/> <br/> </tr>\n");
      out.write("      <tr> Why are you contacting us? </tr>\n");
      out.write("     <tr>   <select name=\"contactType\" >\n");
      out.write("           <option value=\"BR\" >Bug Report</option>\n");
      out.write("           <option value=\"RU\">Report User</option>\n");
      out.write("           <option value=\"QS\">Question About Site</option>\n");
      out.write("           <option value=\"OT\" selected=\"selected\">Other</option>\n");
      out.write("           <option value=\"FB\">Feedback</option>\n");
      out.write("        </select>     <br/> <br/> </tr>\n");
      out.write("    <tr>   Message: <br/> </tr>\n");
      out.write("       <textarea name=\"inputcomments\" cols=\"45\" rows=\"5\">Type your message here</textarea> <br/> <br/>\n");
      out.write("       <input type=\"submit\" value=\"Click Here\" />\n");
      out.write("\t   </table>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "post-content.jsp", out, false);
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
