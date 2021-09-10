package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Categoria;
import modeloDAO.categoriaDAO;

@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pagina="";
        String paginaListarCategoria = "listar.jsp";
        String paginaEditarCategoria = "editar.jsp";
        String paginaAgregarCategoria = "agregar.jsp";
        
        categoriaDAO dao = new categoriaDAO();
        Categoria d;
        
        String action = request.getParameter("accion");
        System.out.println(action);
        
        
        /*Se agrego estos dos if para que las acciones de index de abrir las paginas listar y agregar
        pasen por el controlador de manera que estando en listar pueda ir a editar tambien pasando por 
        el controlador. OJO del como llamo a las paginas listas y agregar desde index*/
        
        if(action.equalsIgnoreCase("listarCategoria")){
            pagina=paginaListarCategoria;
        }
        if(action.equalsIgnoreCase("agregarCategoria")){
            pagina=paginaAgregarCategoria;
        }
        /**/
        
        

        if(action.equalsIgnoreCase("Agregar Categoria")){        
            //String cod = request.getParameter("codigo");
            String nom = request.getParameter("nombre");            
            d=new Categoria(0, nom);  
            dao.agregar(d);
            pagina=paginaListarCategoria;
        } 
        

        if(action.equalsIgnoreCase("borrarCategoria")){
            String cod = request.getParameter("codigo");         
            dao.eliminar(Integer.parseInt(cod)); 
            pagina=paginaListarCategoria;
        }  

        
       // System.out.println("111");                                    
        if(action.equalsIgnoreCase("editarCategoria")){
         //   System.out.println("222");  
            String cod = request.getParameter("codigo");
            request.setAttribute("codigo", cod);  
            pagina=paginaEditarCategoria;
           // System.out.println("333");  
         }
        //System.out.println("444");  
        

        if(action.equalsIgnoreCase("Actualizar Categoria")){
            //Integer cod = Integer.parseInt(request.getParameter("codigo"));
            String cod = request.getParameter("codigo");
            String nom = request.getParameter("nombre"); 
            Integer codi;
            System.out.println(cod);  
            System.out.println(nom);  
            codi = Integer.parseInt(cod);
            System.out.println(codi);  
            
            d = new Categoria(codi, nom);
            dao.editar(d);
            pagina=paginaListarCategoria;
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
