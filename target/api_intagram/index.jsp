<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Iniciar sesión</title>
</head>
<body>
    <div>
        <h1>Iniciar sesión</h1>
         <form action="/api_intagram/servlets/LoginServlet" method="get">
            <label for="username">Nombre de usuario:</label>
            <input type="text" name="username">
            <br>
            <label for="password">Password:</label>
            <input type="password" name="password">
            <br>
            <input type="submit" value="Iniciar">
        </form>
    </div>
</body>
</html>
