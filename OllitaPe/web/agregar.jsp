<%-- 
    Document   : agregar categoría
    Created on : 06/09/2021
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Catálogo</title>
    </head>
    <body>
        <h1>Categoría</h1>
        <form action="Controlador" method="post">
            <label>Nombre</label>
            <input type="text" name="nombre"><br>
            <input type="submit" value="Agregar Categoria" name="accion">
        </form>
    </body>
</html>
