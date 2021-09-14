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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>La Ollita pe</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\" />\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css\"\n");
      out.write("    />\n");
      out.write("    <script\n");
      out.write("      src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js\"\n");
      out.write("      charset=\"utf-8\"\n");
      out.write("    ></script>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <input type=\"checkbox\" id=\"check\" />\n");
      out.write("    <!--header area start-->\n");
      out.write("    <header>\n");
      out.write("      <label for=\"check\">\n");
      out.write("        <i class=\"fas fa-bars\" id=\"sidebar_btn\"></i>\n");
      out.write("      </label>\n");
      out.write("      <div class=\"left_area\">\n");
      out.write("        <img src=\"la_ollita_pe_logo.png\" class=\"profile_image\" alt=\"\" />\n");
      out.write("        <!--h3>Coding <span>Snow</span></h3>-->\n");
      out.write("      </div>\n");
      out.write("      <div class=\"right_area\">\n");
      out.write("        <a href=\"#\" class=\"logout_btn\">Cerrar Sesión</a>\n");
      out.write("      </div>\n");
      out.write("    </header>\n");
      out.write("    <!--header area end-->\n");
      out.write("    <!--mobile navigation bar start-->\n");
      out.write("    <div class=\"mobile_nav\">\n");
      out.write("      <div class=\"nav_bar\">\n");
      out.write("        <img src=\"1.jpg\" class=\"mobile_profile_image\" alt=\"\" />\n");
      out.write("        <i class=\"fa fa-bars nav_btn\"></i>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"mobile_nav_items\">\n");
      out.write("        <a href=\"#\"><i class=\"fas fa-desktop\"></i><span>Inicio</span></a>\n");
      out.write("        <a href=\"#\"><i class=\"fas fa-cogs\"></i><span>Menú</span></a>\n");
      out.write("        <a href=\"listar.jsp\"><i class=\"fas fa-table\"></i><span>Crud de Categorías</span></a>\n");
      out.write("        <a href=\"listar_tipocomida.jsp\"><i class=\"fas fa-th\"></i><span>Crud de comida</span></a>\n");
      out.write("        <a href=\"listar_insumo.jsp\"><i class=\"fas fa-info-circle\"></i><span>Crud de Insumos</span></a>\n");
      out.write("        <a href=\"#\"\n");
      out.write("          ><i class=\"fas fa-sliders-h\"></i><span>Configuración</span></a\n");
      out.write("        >\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!--mobile navigation bar end-->\n");
      out.write("    <!--sidebar start-->\n");
      out.write("    <div class=\"sidebar\">\n");
      out.write("      <div class=\"profile_info\">\n");
      out.write("        <img src=\"1.jpg\" class=\"profile_image\" alt=\"\" />\n");
      out.write("        <h4>GM Team</h4>\n");
      out.write("      </div>\n");
      out.write("      <a href=\"#\"><i class=\"fas fa-desktop\"></i><span>Inicio</span></a>\n");
      out.write("      <a href=\"#\"><i class=\"fas fa-cogs\"></i><span>Menú</span></a>\n");
      out.write("      <a href=\"listar.jsp\"><i class=\"fas fa-table\"></i><span>Crud de Categorías</span></a>\n");
      out.write("      <a href=\"listar_tipocomida.jsp\"><i class=\"fas fa-th\"></i><span>Crud de Comida</span></a>\n");
      out.write("      <a href=\"listar_insumo.jsp\"><i class=\"fas fa-info-circle\"></i><span>Crud de Insumos</span></a>\n");
      out.write("      <a href=\"#\"><i class=\"fas fa-sliders-h\"></i><span>Configuración</span></a>\n");
      out.write("    </div>\n");
      out.write("    <!--sidebar end-->\n");
      out.write("\n");
      out.write("    <div class=\"content\">\n");
      out.write("      <div class=\"card\">\n");
      out.write("        <p>\n");
      out.write("          Lorem Ipsum is simply dummy text of the printing and typesetting\n");
      out.write("          industry. Lorem Ipsum has been the industry's standard dummy text ever\n");
      out.write("          since the 1500s, when an unknown printer took a galley of type and\n");
      out.write("          scrambled it to make a type specimen book. It has survived not only\n");
      out.write("          five centuries, but also the leap into electronic typesetting,\n");
      out.write("          remaining essentially unchanged.\n");
      out.write("        </p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"card\">\n");
      out.write("        <p>\n");
      out.write("          Lorem Ipsum is simply dummy text of the printing and typesetting\n");
      out.write("          industry. Lorem Ipsum has been the industry's standard dummy text ever\n");
      out.write("          since the 1500s, when an unknown printer took a galley of type and\n");
      out.write("          scrambled it to make a type specimen book. It has survived not only\n");
      out.write("          five centuries, but also the leap into electronic typesetting,\n");
      out.write("          remaining essentially unchanged.\n");
      out.write("        </p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"card\">\n");
      out.write("        <p>\n");
      out.write("          Lorem Ipsum is simply dummy text of the printing and typesetting\n");
      out.write("          industry. Lorem Ipsum has been the industry's standard dummy text ever\n");
      out.write("          since the 1500s, when an unknown printer took a galley of type and\n");
      out.write("          scrambled it to make a type specimen book. It has survived not only\n");
      out.write("          five centuries, but also the leap into electronic typesetting,\n");
      out.write("          remaining essentially unchanged.\n");
      out.write("        </p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("      $(document).ready(function () {\n");
      out.write("        $(\".nav_btn\").click(function () {\n");
      out.write("          $(\".mobile_nav_items\").toggleClass(\"active\");\n");
      out.write("        });\n");
      out.write("      });\n");
      out.write("    </script>\n");
      out.write("  </body>\n");
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
