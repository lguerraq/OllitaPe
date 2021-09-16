package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Insumo;
import java.util.ArrayList;
import modeloDAO.insumoDAO;

public final class listar_005finsumo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Mantenimiento de Insumo</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 align=\"center\">Mantenimiento de Insumo</h1>\n");
      out.write("        ");

            ArrayList<Insumo> lis;
            insumoDAO dao= new insumoDAO();
            lis =dao.listarTodo();
        
      out.write("\n");
      out.write("        <table border=1\" width=\"600\" align=\"center\">\n");
      out.write("            <tr bgcolor = \"skyblue\">\n");
      out.write("                <th colspan=\"6\">Mantenimiento de Insumo</th>\n");
      out.write("            </tr>\n");
      out.write("            <tr bgcolor = \"skyblue\">\n");
      out.write("                <td>Código</td>\n");
      out.write("                <td>Nombre</td>\n");
      out.write("                <td>Categoria</td>\n");
      out.write("                <td>Medida</td>\n");
      out.write("                <td>Precio</td>\n");
      out.write("                <td align=\"center\">Acción</td>                \n");
      out.write("            </tr>\n");
      out.write("            ");
for(int i=0; i<lis.size(); i++){
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(lis.get(i).getIdInsumo());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(lis.get(i).getNombre());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(lis.get(i).getIdCategoria());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(lis.get(i).getIdMedida());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(lis.get(i).getPrecio());
      out.write("</td>\n");
      out.write("                <th> \n");
      out.write("                    <a href=\"ControladorInsumo?accion=editarInsumo&codigo=");
      out.print(lis.get(i).getIdInsumo());
      out.write("\">Editar\n");
      out.write("                    <img src=\"Recursos/editar.png\" width=\"30\" height=\"30\">  </a>\n");
      out.write("\n");
      out.write("                    <a href=\"ControladorInsumo?accion=borrarInsumo&codigo=");
      out.print(lis.get(i).getIdInsumo());
      out.write("\">Borrar\n");
      out.write("                    <img src=\"Recursos/borrar.png\" width=\"30\" height=\"30\">  </a> \n");
      out.write("                    \n");
      out.write("                </th> \n");
      out.write("            </tr>\n");
      out.write("                    ");
}
      out.write("        \n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("          <table border=1\" width=\"600\" align=\"center\">\n");
      out.write("            <tr bgcolor = \"skyblue\">\n");
      out.write("\n");
      out.write("                 <th align=\"center\"><a href=\"ControladorInsumo?accion=agregarInsumo\">Nuevo\n");
      out.write("                     <img src=\"Recursos/nuevo.png\" width=\"50\" height=\"50\" > </a>  \n");
      out.write("                 </th>\n");
      out.write("                 \n");
      out.write("                 <th align=\"center\"><a href=\"ControladorInsumo?accion=salida\">Salida\n");
      out.write("                     <img src=\"Recursos/salida.png\" width=\"50\" height=\"50\" > </a>  \n");
      out.write("                 </th>\n");
      out.write("                 \n");
      out.write("\n");
      out.write("             </tr>\n");
      out.write("          </table>\n");
      out.write("        \n");
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
