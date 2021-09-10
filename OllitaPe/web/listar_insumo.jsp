<%@page import="modelo.Insumo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modeloDAO.insumoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mantenimiento de Insumo</title>
    </head>
    <body>
        <h1 align="center">Mantenimiento de Insumo</h1>
        <%
            ArrayList<Insumo> lis;
            insumoDAO dao= new insumoDAO();
            lis =dao.listarTodo();
        %>
        <table border=1" width="600" align="center">
            <tr bgcolor = "skyblue">
                <th colspan="6">Mantenimiento de Insumo</th>
            </tr>
            <tr bgcolor = "skyblue">
                <td>Código</td>
                <td>Nombre</td>
                <td>Categoria</td>
                <td>Medida</td>
                <td>Precio</td>
                <td align="center">Acción</td>                
            </tr>
            <%for(int i=0; i<lis.size(); i++){%>
            <tr>
                <td><%=lis.get(i).getIdInsumo()%></td>
                <td><%=lis.get(i).getNombre()%></td>
                <td><%=lis.get(i).getIdCategoria()%></td>
                <td><%=lis.get(i).getIdMedida()%></td>
                <td><%=lis.get(i).getPrecio()%></td>
                <th> 
                    <a href="ControladorInsumo?accion=editarInsumo&codigo=<%=lis.get(i).getIdInsumo()%>">Editar
                    <img src="Recursos/editar.png" width="30" height="30">  </a>

                    <a href="ControladorInsumo?accion=borrarInsumo&codigo=<%=lis.get(i).getIdInsumo()%>">Borrar
                    <img src="Recursos/borrar.png" width="30" height="30">  </a> 
                    
                </th> 
            </tr>
                    <%}%>        
        </table>
        
          <table border=1" width="600" align="center">
            <tr bgcolor = "skyblue">

                 <th align="center"><a href="ControladorInsumo?accion=agregarInsumo">Nuevo
                     <img src="Recursos/nuevo.png" width="50" height="50" > </a>  
                 </th>
                 
                 <th align="center"><a href="ControladorInsumo?accion=salida">Salida
                     <img src="Recursos/salida.png" width="50" height="50" > </a>  
                 </th>
                 

             </tr>
          </table>
        
    </body>
</html>
