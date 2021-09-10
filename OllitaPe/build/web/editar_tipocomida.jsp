<%@page import="modeloDAO.comidaDAO"%>
<%@page import="modelo.Comida"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Comida</h1>
        <form action="ControladorComida" method="post">  
            <% 
                String c =   request.getAttribute("codigo").toString();
                comidaDAO dao = new comidaDAO();
                Comida d=new Comida();
                d=dao.listarUno(Integer.parseInt(c));
            %>
            <input type="text" name="codigo" value="<%=d.getIdTipoComida()%>"><br>
            <label>Nombre</label>
            <input type="text" name="nombre" value="<%=d.getNombre()%>"><br>
            <input type="submit" value="ActualizarComida" name="accion">
        </form>
    </body>
</html>
