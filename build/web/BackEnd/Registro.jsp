<%-- 
    Document   : Registro
    Created on : 15/09/2021, 12:24:56 AM
    Author     : Luis Alfredo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>formulario de registro</h1>
        
        <form action="" method="post">
            <label>Usuario</label>
            <input type="text" name="usuario"/> <br>
             <label>Nombres</label>
            <input type="text" name="nombre"/><br>
             <label>Apellidos</label>
            <input type="text" name="apellido"/><br>
             <label>Contraseña</label>
            <input type="password" name="pass"/><br>
            <input type="submit" value="Registrarme"/><br>
            
            
            </form>
    </body>
</html>
