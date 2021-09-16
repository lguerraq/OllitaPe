<%@page import="java.sql.ResultSet"%>
<%@page import="modelo.Preferencia"%>
<%@page import="modelo.Servicio"%>
<%@page import="modelo.Comida"%>
<%@page import="modeloDAO.ServicioDAO"%>
<%@page import="modeloDAO.comidaDAO"%>
<%@page import="modeloDAO.PreferenciaDAO"%>
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
            ArrayList<Comida> ListComida;
            comidaDAO comidaDAO= new comidaDAO();
            ListComida =comidaDAO.listarTodo();
        %>
        <%
            ArrayList<Servicio> ListServicio;
            ServicioDAO ServicioDAO= new ServicioDAO();
            ListServicio =ServicioDAO.listarTodo();
        %>
        <%
            ArrayList<Preferencia> ListPreferencia;
            PreferenciaDAO PreferenciaaDAO= new PreferenciaDAO();
            ListPreferencia =PreferenciaaDAO.listarTodo();
        %>
        <form action="ControladorReceta" method="post">
            <label>Nombre</label>
            <input type="text" name="nombre"><br>
            <label>Servicio</label>
            <select name="idServicio">
                <%for(int i=0; i<ListServicio.size(); i++){%>
                <option value="<%=ListServicio.get(i) %>"><%=ListServicio.get(i).getNombre() %></option>
                <%}%>
            </select>
            <br>
            <label>Preferencia</label>
            <select name="idPreferencia">
                <%for(int i=0; i<ListPreferencia.size(); i++){%>
                <option value="<%=ListPreferencia.get(i) %>"><%=ListPreferencia.get(i).getNombre() %></option>
                <%}%>
            </select>
            <br>
            <label>Tipo de Comida</label>
            <select name="idTipoComida">
                <%for(int i=0; i<ListComida.size(); i++){%>
                <option value="<%=ListComida.get(i) %>"><%=ListComida.get(i).getNombre() %></option>
                <%}%>
            </select>
            <br>
            <label>Link</label>
            <input type="text" name="Link"><br>
            <label>Total</label>
            <input type="text" name="Total"><br>
            <input type="submit" value="Agregar Receta" name="accion">
        </form>      
    </body>
</html>