<%@page import="modeloDAO.insumoDAO"%>
<%@page import="modelo.Insumo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Insumo</h1>
        <form action="ControladorInsumo" method="post">  
            <% 
                String c =   request.getAttribute("codigo").toString();
                insumoDAO dao = new insumoDAO();
                Insumo d=new Insumo();
                d=dao.listarUno(Integer.parseInt(c));
            %>
            <input type="text" name="codigo" value="<%=d.getIdInsumo()%>"><br>
            <label>Nombre</label>
            <input type="text" name="nombre" value="<%=d.getNombre()%>"><br>
            <label>Categoría</label>
            <input type="text" name="idCategoria" value="<%=d.getIdCategoria()%>"><br>
            <label>Medida</label>
            <input type="text" name="idMedida" value="<%=d.getIdMedida()%>"><br>
            <label>Precio</label>
            <input type="text" name="precio" value="<%=d.getPrecio()%>"><br>
                      
            
            <input type="submit" value="Actualizar Insumo" name="accion">
        </form>
    </body>
</html>
