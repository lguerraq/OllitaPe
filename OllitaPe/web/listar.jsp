<%@page import="modelo.Categoria"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modeloDAO.categoriaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mantenimiento de Categoría</title>
    </head>
    <body>
        <h1 align="center">Mantenimiento de Categoría</h1>
        <%
            ArrayList<Categoria> lis;
            categoriaDAO dao= new categoriaDAO();
            lis =dao.listarTodo();
        %>
        <table border=1" width="600" align="center">
            <tr bgcolor = "skyblue">
                <th colspan="3">Mantenimiento de Categorías</th>
            </tr>
            <tr bgcolor = "skyblue">
                <td>Código</td>
                <td>Nombre</td>
                <td align="center">Acción</td>                
            </tr>
            <%for(int i=0; i<lis.size(); i++){%>
            <tr>
                <td><%=lis.get(i).getIdCategoria()%></td>
                <td><%=lis.get(i).getNombre()%></td>
                <th> 
                    <a href="Controlador?accion=editarCategoria&codigo=<%=lis.get(i).getIdCategoria()%>">Editar
                    <img src="Recursos/editar.png" width="30" height="30">  </a>

                    <a href="Controlador?accion=borrarCategoria&codigo=<%=lis.get(i).getIdCategoria()%>">Borrar
                    <img src="Recursos/borrar.png" width="30" height="30">  </a> 
                    
                </th> 
            </tr>
                    <%}%>        
        </table>
        
          <table border=1" width="600" align="center">
            <tr bgcolor = "skyblue">

                 <th align="center"><a href="Controlador?accion=agregarCategoria">Nuevo
                     <img src="Recursos/nuevo.png" width="50" height="50" > </a>  
                 </th>
                 
                 <th align="center"><a href="Controlador?accion=salidaCategoria">Salida
                     <img src="Recursos/salida.png" width="50" height="50" > </a>  
                 </th>
                 

             </tr>
          </table>
        
    </body>
</html>
