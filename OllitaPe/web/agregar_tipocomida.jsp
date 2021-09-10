<%-- 
    Document   : agregar tipo de comida
    Created on : 06/09/2021
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Tipo de Comida</title>
    </head>
    <body>
        <h1>Tipo de Comida</h1>
        <form action="ControladorComida" method="post">
            <label>Nombre</label>
            <input type="text" name="nombre"><br>
            <input type="submit" value="Agregar Comida" name="accion">
        </form>
    </body>
</html>
