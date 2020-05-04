<%-- 
    Document   : login
    Created on : 4 May 2020, 11:41:18
    Author     : michael
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>  
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html>
<html>
    <head>  
    <h3>login form</h3>
    </head>

    <form:form method="POST" action="/assignment2b/login" modelAttribute="users">

        <table>
           <tr>
                <td>id</td>
                <td><form:input path="userName"/></td>
                <td style="color:red"></td>
            </tr>
            <tr>
                <td>name</td>
                <td><form:input path="password"/></td>
                <td style="color:red"></td>
            </tr>
                    <td><input type="submit" value="login"/></td>
                </tr>
              <tr>
                <spring:message code="submit.button" var="labelSubmit"></spring:message>
                <td><input type="submit" value="${labelSubmit}"/></td>
            </tr>
        </table>
    </form:form>
    </body>
</html>
