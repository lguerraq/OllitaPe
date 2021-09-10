<%@page import="modeloDAO.categoriaDAO"%>
<%@page import="modelo.Categoria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Categoría</h1>
        <form action="Controlador" method="post">  
            <% 
                String c =   request.getAttribute("codigo").toString();
                categoriaDAO dao = new categoriaDAO();
                Categoria d=new Categoria();
                System.out.println("Valor...: "+c);
                d=dao.listarUno(Integer.parseInt(c));
            %>
            <input type="text" name="codigo" value="<%=d.getIdCategoria()%>"><br>
            <label>Nombre</label>
            <input type="text" name="nombre" value="<%=d.getNombre()%>"><br>
            <input type="submit" value="Actualizar Categoria" name="accion">
        </form>
    </body>
</html>
