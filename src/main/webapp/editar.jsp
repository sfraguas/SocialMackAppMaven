<%-- 
    Document   : newjspindex
    Created on : 09/03/2017, 10:56:10
    Author     : 1147106
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar</title>
    </head>
    <body>
        <form action="FrontController" method="POST">
            <c:out value="${participante.senha}"></c:out>
                <p>
                    <label for="id">id:</label><br>
                    <input type="text" id="id" name="id" value="${participante.id_pessoa}" readonly/>
            </p>
            <p>
                <label for="name">Nome:</label><br>
                <input type="text" id="name" name="name" value="${participante.nome}"/>
            </p>

            <p>
                <label for="email">Email:</label><br>
                <input type="email" id="email" name="email" value="${participante.email}"/>
            </p>

            <c:choose>
                <c:when test="${participante.senha == null}">
                    <p>
                        <label for="senha">Senha:</label><br>
                        <input type="text" id="senha" name="senha"/>
                    </p>

                    <p>
                        <label for="celular">Celular:</label><br>
                        <input type="text" id="celular" name="celular"/>
                    </p>
                    <p>
                        <label for="formacao">Formacao:</label><br>
                        <input type="text" id="formacao" name="formacao"/>
                    </p>
                </c:when>
                <c:otherwise>
                    <p>
                        <label for="senha">Senha:</label><br>
                        <input type="text" id="senha" name="senha" value="${participante.senha}"/>
                    </p>

                    <p>
                        <label for="celular">Celular:</label><br>
                        <input type="text" id="celular" name="celular" value="${participante.celular}"/>
                    </p>
                    <p>
                        <label for="formacao">Formacao:</label><br>
                        <input type="text" id="formacao" name="formacao" value="${participante.formacao}"/>
                    </p>
                </c:otherwise>
            </c:choose>
            <input type="hidden" name="ctrl" value="AlterarParticipante"/>
            <p>
                <input type="submit" value="Alterar"/>
            </p>
        </form>
    </body>
</html>
