<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Controlador.LoginServlet"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> HOME PAGINA</title>
    </head>
    <body>
        <h1> PAGINA PRINCIPAL</h1>
        <br>
        <label>Publica un mensaje</label>
        <input type="text" name="texto">
        <br>
        <input type="submit" value="Publicar">
        <input type="submit" value="Borrar">
        <input type="submit" value="Actualizar">
        <input type="submit" value="Eliminar">
        <br>
        <br>
        <input type="submit" value="Ver mensaje publicado">
        <label>Mensaje publicado</label>
        <input type="text" name="publicado">

    </body>
</html>
