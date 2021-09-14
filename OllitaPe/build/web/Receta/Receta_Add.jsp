<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Insumo</title>
    </head>
    <body>
        <h1>Insumo</h1>
        <form action="ControladorReceta" method="post">
            <label>Nombre</label>
            <input type="text" name="nombre"><br>
            <label>Categoría</label>
            <input type="text" name="idCategoria"><br>
            <label>Medida</label>
            <input type="text" name="idMedida"><br>
            <label>Precio</label>
            <input type="text" name="precio"><br>
            <input type="submit" value="Agregar Insumo" name="accion">
        </form>
    </body>
</html>