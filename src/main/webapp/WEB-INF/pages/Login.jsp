<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <link rel="stylesheet" type="text/css" href="/login.css">
      <title>Login</title>
   </head>
   <body>
      
      <h2>${seleccionPersonajeDto.mensajeError}</h2>
      
      <h2>Introduzca usuario y contraseña</h2>
      <form:form method = "POST" action = "/mundo/user/login" modelAttribute="login">
         <table>
            <tr>
               <td><form:label path = "usuario">Usuario</form:label></td>
               <td><form:input path = "usuario" /></td>
            </tr>
            <tr>
               <td><form:label path = "password">Contraseña</form:label></td>
               <td><form:input path = "password" /></td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form:form>
   </body>
</html>