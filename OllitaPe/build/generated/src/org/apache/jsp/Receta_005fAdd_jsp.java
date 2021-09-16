package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import modelo.Preferencia;
import modelo.Servicio;
import modelo.Comida;
import modeloDAO.ServicioDAO;
import modeloDAO.comidaDAO;
import modeloDAO.PreferenciaDAO;
import java.util.ArrayList;

public final class Receta_005fAdd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Agregar Receta</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Receta</h1>\n");
      out.write("        ");

            ArrayList<Comida> ListComida;
            comidaDAO comidaDAO= new comidaDAO();
            ListComida =comidaDAO.listarTodo();
        
      out.write("\n");
      out.write("        ");

            ArrayList<Servicio> ListServicio;
            ServicioDAO ServicioDAO= new ServicioDAO();
            ListServicio =ServicioDAO.listarTodo();
        
      out.write("\n");
      out.write("        ");

            ArrayList<Preferencia> ListPreferencia;
            PreferenciaDAO PreferenciaaDAO= new PreferenciaDAO();
            ListPreferencia =PreferenciaaDAO.listarTodo();
        
      out.write("\n");
      out.write("        <form action=\"ControladorReceta\" method=\"post\">\n");
      out.write("            <label>Nombre</label>\n");
      out.write("            <input type=\"text\" name=\"nombre\"><br>\n");
      out.write("            <label>Servicio</label>\n");
      out.write("            <select name=\"idServicio\">\n");
      out.write("                ");
for(int i=0; i<ListServicio.size(); i++){
      out.write("\n");
      out.write("                <option value=\"");
      out.print(ListServicio.get(i) );
      out.write('"');
      out.write('>');
      out.print(ListServicio.get(i).getNombre() );
      out.write("</option>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </select>\n");
      out.write("            <br>\n");
      out.write("            <label>Preferencia</label>\n");
      out.write("            <select name=\"idPreferencia\">\n");
      out.write("                ");
for(int i=0; i<ListPreferencia.size(); i++){
      out.write("\n");
      out.write("                <option value=\"");
      out.print(ListPreferencia.get(i) );
      out.write('"');
      out.write('>');
      out.print(ListPreferencia.get(i).getNombre() );
      out.write("</option>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </select>\n");
      out.write("            <br>\n");
      out.write("            <label>Tipo de Comida</label>\n");
      out.write("            <select name=\"idTipoComida\">\n");
      out.write("                ");
for(int i=0; i<ListComida.size(); i++){
      out.write("\n");
      out.write("                <option value=\"");
      out.print(ListComida.get(i) );
      out.write('"');
      out.write('>');
      out.print(ListComida.get(i).getNombre() );
      out.write("</option>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </select>\n");
      out.write("            <br>\n");
      out.write("            <label>Link</label>\n");
      out.write("            <input type=\"text\" name=\"Link\"><br>\n");
      out.write("            <label>Total</label>\n");
      out.write("            <input type=\"text\" name=\"Total\"><br>\n");
      out.write("            <input type=\"submit\" value=\"Agregar Receta\" name=\"accion\">\n");
      out.write("        </form>      \n");
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
