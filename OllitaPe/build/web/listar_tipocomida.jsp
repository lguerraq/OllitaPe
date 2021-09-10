<%@page import="modelo.Comida"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modeloDAO.comidaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mantenimiento de Tipo de Comida</title>
    </head>
    <body>
        <h1 align="center">Mantenimiento de Tipo de Comida</h1>
        <%
            ArrayList<Comida> lis;
            comidaDAO dao= new comidaDAO();
            lis =dao.listarTodo();
        %>
        <table border=1" width="600" align="center">
            <tr bgcolor = "skyblue">
                <th colspan="3">Mantenimiento de Tipo de Comida</th>
            </tr>
            <tr bgcolor = "skyblue">
                <td>Código</td>
                <td>Nombre</td>
                <td align="center">Acción</td>                
            </tr>
            <%for(int i=0; i<lis.size(); i++){%>
            <tr>
                <td><%=lis.get(i).getIdTipoComida()%></td>
                <td><%=lis.get(i).getNombre()%></td>
                <th> 
                    <a href="ControladorComida?accion=editarComida&codigo=<%=lis.get(i).getIdTipoComida()%>">Editar
                    <img src="Recursos/editar.png" width="30" height="30">  </a>

                    <a href="ControladorComida?accion=borrarComida&codigo=<%=lis.get(i).getIdTipoComida()%>">Borrar
                    <img src="Recursos/borrar.png" width="30" height="30">  </a> 
                    
                </th> 
            </tr>
                    <%}%>        
        </table>
        
          <table border=1" width="600" align="center">
            <tr bgcolor = "skyblue">

                 <th align="center"><a href="ControladorComida?accion=agregarComida">Nuevo
                     <img src="Recursos/nuevo.png" width="50" height="50" > </a>  
                 </th>
                 
                 <th align="center"><a href="Controlador?accion=salida">Salida
                     <img src="Recursos/salida.png" width="50" height="50" > </a>  
                 </th>
                 

             </tr>
          </table>
        
    </body>
</html>
