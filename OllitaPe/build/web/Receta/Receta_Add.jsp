<%@page import="modeloDAO.comidaDAO"%>
<%@page import="modelo.Comida"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Receta</title>
    </head>
    <body>
        <h1>Receta</h1>
        <%
            ArrayList<Comida> lis;
            comidaDAO dao= new comidaDAO();
            lis =dao.listarTodo();
        %>
        <form action="ControladorReceta" method="post">
            <label>Nombre</label>
            <input type="text" name="nombre"><br>
            <label>Categoría</label>
            <input type="text" name="idCategoria"><br>
            <label>Medida</label>
            <input type="text" name="idMedida"><br>
            <label>Precio</label>
            <input type="text" name="precio"><br>
            <label>Tipo de Comida</label>
            <select name="idTipoComida">
                <%for(int i=0; i<lis.size(); i++){%>
                <option value=<%=lis.get(i).getNombre()%></option>
                <%}%>
            </select>
            <br>
            <input type="submit" value="Agregar Receta" name="accion">
        </form>
    </body>
</html>