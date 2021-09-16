package controlador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Receta;
import modeloDAO.RecetaDAO;
@WebServlet(name = "ControladorReceta", urlPatterns = {"/ControladorReceta"})
public class ControladorReceta extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pagina=".";
        String paginaListarReceta = "Receta/Receta_List.jsp";
        String paginaEditarReceta = "Receta/Receta_Delete.jsp";
        String paginaAgregarReceta = "Receta_Add.jsp";
        
        RecetaDAO dao = new RecetaDAO();
        Receta d;
        
        String action = request.getParameter("accion");
        System.out.println(action);
        
        if(action.equalsIgnoreCase("ListarReceta")){
            pagina=paginaListarReceta;
        }
        if(action.equalsIgnoreCase("AgregarReceta")){
            pagina=paginaAgregarReceta;
        }    
            
        if(action.equalsIgnoreCase("Agregar Receta")){        
            String nombre = request.getParameter("nombre");            
            Integer idServicio =  Integer.parseInt(request.getParameter("idServicio"));            
            Integer idPreferencia =  Integer.parseInt(request.getParameter("idPreferencia"));                        
            Integer idTipoComida =  Integer.parseInt(request.getParameter("idTipoComida"));
            String Link = request.getParameter("Link");
            Double Total = Double.parseDouble(request.getParameter("Total"));
    
            d = new Receta(0, nombre, idServicio, idPreferencia, idTipoComida, Link, Total);  
            dao.agregar(d);
            pagina=paginaListarReceta;
        } 
        
        if(action.equalsIgnoreCase("BorrarReceta")){
            String cod = request.getParameter("codigo");         
            dao.eliminar(Integer.parseInt(cod)); 
            pagina=paginaListarReceta;
        }  
                                
        if(action.equalsIgnoreCase("EditarReceta")){ 
            String cod = request.getParameter("codigo");
            request.setAttribute("codigo", cod);  
            pagina=paginaEditarReceta;
         } 
        
        if(action.equalsIgnoreCase("Actualizar Receta")){
            String nombre = request.getParameter("nombre");            
            Integer idServicio =  Integer.parseInt(request.getParameter("idServicio"));            
            Integer idPreferencia =  Integer.parseInt(request.getParameter("idPreferencia"));                        
            Integer idTipoComida =  Integer.parseInt(request.getParameter("idTipoComida"));
            String Link = request.getParameter("Link");
            Double Total = Double.parseDouble(request.getParameter("Total"));                                 
            /*
            Integer codi;
            System.out.println(cod);  
            System.out.println(nom);  
            codi = Integer.parseInt(cod);
            System.out.println(codi);  
            */
            d = new Receta(0, nombre, idServicio, idPreferencia, idTipoComida, Link, Total);
            dao.editar(d);
            pagina=paginaListarReceta;
        }
        RequestDispatcher rd= request.getRequestDispatcher(pagina);
        rd.forward(request, response);   
    
        }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}