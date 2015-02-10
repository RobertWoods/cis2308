package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>Application Freelancing</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: \"Lucida Sans Unicode\", \"Lucida Grande\", sans-serif;\n");
      out.write("                background-image: url(images/Blue-Squares.jpg);  /* Pic size:200-300K, but for sure <500K. Put in folder \"images\" */\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: cover;  /* bg pic will stretch when window is resized */\n");
      out.write("                background-color: blue; /* select color that matches your bg pic */\n");
      out.write("                opacity: 0.85;\n");
      out.write("                text-shadow: 1px 1px #FFFFFF\n");
      out.write("            }\n");
      out.write("            #container {\n");
      out.write("                border:2px solid green;\n");
      out.write("                width:85%;  \n");
      out.write("                margin:auto;  /* this means center the container div (itself, not its contents) */\n");
      out.write("                font-size: 14px;\n");
      out.write("                min-width: 750px;  /* if user tries to size smaller than this, scroll bar will kick in. */\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("            #title {\n");
      out.write("                border:2px solid brown;\n");
      out.write("                background-color: #CCFF99;\n");
      out.write("            }\n");
      out.write("            #nav {\n");
      out.write("                border:2px solid yellow;\n");
      out.write("                background-color: #CCFF99;\n");
      out.write("            }\n");
      out.write("            .tab {\n");
      out.write("                border:2px solid blue;\n");
      out.write("                width:12%;\n");
      out.write("                float:left;\n");
      out.write("                font-size:14px;\n");
      out.write("                min-width:100px; /* tab will only get this narrow when user sizes down window */\n");
      out.write("            }\n");
      out.write("            .tab a {\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            .tab:hover {\n");
      out.write("                background-color: #88BB44\n");
      out.write("            }\n");
      out.write("            .newLine {\n");
      out.write("                clear:both;\n");
      out.write("            }\n");
      out.write("            #content {\n");
      out.write("                border:2px solid purple;\n");
      out.write("                min-height: 270px;\n");
      out.write("            }\n");
      out.write("            .selected {\n");
      out.write("                background-color:#CCFF99;\n");
      out.write("            }\n");
      out.write("            #footer {\n");
      out.write("                border:2px solid gold;\n");
      out.write("                background-color: #CCFF99;\n");
      out.write("            }\n");
      out.write("            img {\n");
      out.write("                float: left;\n");
      out.write("                margin-right: 5px;\n");
      out.write("            }\n");
      out.write("            p {\n");
      out.write("                margin: 3px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br/>\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <div id=\"title\">Application Freelancing</div>  <!-- finishes off the title div -->\n");
      out.write("            <div id=\"nav\">\n");
      out.write("                <div id=\"home\"    class=\"tab\">          <a href=\"index.jsp\">  Home</a></div>\n");
      out.write("                <div id=\"assoc\"   class=\"tab\">          <a href=\"assoc.jsp\">Requests</a></div>\n");
      out.write("                <div id=\"other\"   class=\"tab\">          <a href=\"other.jsp\">Apps</a></div>\n");
      out.write("                <div id=\"users\"   class=\"tab\">          <a href=\"users.jsp\">  Customers</a></div>\n");
      out.write("                <div id=\"search\"  class=\"tab\">          <a href=\"search.jsp\"> Search</a></div>\n");
      out.write("                <div id=\"contact\" class=\"tab\">          <a href=\"contact.jsp\">Contact</a></div>\n");
      out.write("                <div id=\"labs\"    class=\"tab\">          <a href=\"labs.jsp\">   Labs</a></div>\n");
      out.write("                <div class=\"newLine\"></div>\n");
      out.write("            </div>  <!-- finishes off the nav div -->\n");
      out.write("            <div id=\"content\" class=\"selected\">\n");
      out.write("                <p><img src=\"images/apps_image.jpg\"></img>Here you can request applications to be made by developers and incentivize them by offering money to anyone that makes the application.\n");
      out.write("                    <br><a href=\"data_model.docx\">Data model</a>\n");
      out.write("                    <br><a href=\"proposal.doc\">Project proposal</a></p>\n");
      out.write("            </div> <!-- finishes off the content div -->\n");
      out.write("            <div id=\"footer\">Web Site Design by Robert Woods</div>\n");
      out.write("        </div> <!-- finishes off the container div -->\n");
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
