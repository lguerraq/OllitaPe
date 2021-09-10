
package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Insumo;
import modeloDAO.insumoDAO;

@WebServlet(name = "ControladorInsumo", urlPatterns = {"/ControladorInsumo"})
public class ControladorInsumo extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pagina="";
        String paginaListarInsumo = "listar_insumo.jsp";
        String paginaEditarInsumo = "editar_insumo.jsp";
        String paginaAgregarInsumo = "agregar_insumo.jsp";
        
        insumoDAO dao = new insumoDAO();
        Insumo d;
        
        String action = request.getParameter("accion");
        System.out.println(action);
        
        
        /*Se agrego estos dos if para que las acciones de index de abrir las paginas listar y agregar
        pasen por el controlador de manera que estando en listar pueda ir a editar tambien pasando por 
        el controlador. OJO del como llamo a las paginas listas y agregar desde index*/
        
        if(action.equalsIgnoreCase("listarInsumo")){
            pagina=paginaListarInsumo;
        }
        if(action.equalsIgnoreCase("agregarInsumo")){
            pagina=paginaAgregarInsumo;
        }
        /**/
        
        
            
        if(action.equalsIgnoreCase("Agregar Insumo")){        
            String nom = request.getParameter("nombre");            
            Integer idCat =  Integer.parseInt(request.getParameter("idCategoria"));            
            Integer idMed =  Integer.parseInt(request.getParameter("idMedida"));                        
            double  idPrecio  =  Double.parseDouble(request.getParameter("precio"));                                    
    
            d=new Insumo(0, nom, idCat, idMed, idPrecio);  
            dao.agregar(d);
            pagina=paginaListarInsumo;
        } 
        

        if(action.equalsIgnoreCase("borrarInsumo")){
            String cod = request.getParameter("codigo");         
            dao.eliminar(Integer.parseInt(cod)); 
            pagina=paginaListarInsumo;
        }  

        
       // System.out.println("111");                                    
        if(action.equalsIgnoreCase("editarInsumo")){
         //   System.out.println("222");  
            String cod = request.getParameter("codigo");
            request.setAttribute("codigo", cod);  
            pagina=paginaEditarInsumo;
           // System.out.println("333");  
         }
        //System.out.println("444");  
        

        if(action.equalsIgnoreCase("Actualizar Insumo")){
            //Integer cod = Integer.parseInt(request.getParameter("codigo"));
            String cod = request.getParameter("codigo");
            String nom = request.getParameter("nombre"); 
            Integer idCat =  Integer.parseInt(request.getParameter("idCategoria"));            
            Integer idMed =  Integer.parseInt(request.getParameter("idMedida"));                        
            double  idPrecio  =  Double.parseDouble(request.getParameter("precio"));                                    
            
            Integer codi;
            System.out.println(cod);  
            System.out.println(nom);  
            codi = Integer.parseInt(cod);
            System.out.println(codi);  
            
            d=new Insumo(codi, nom, idCat, idMed, idPrecio);              
            dao.editar(d);
            pagina=paginaListarInsumo;
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
