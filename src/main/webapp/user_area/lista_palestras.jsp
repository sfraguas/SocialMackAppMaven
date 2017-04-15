<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="/template/header_post_login.jsp"/>
${participante}
<div class="row">

    <c:out value="${user}"></c:out>

    <c:forEach items="${palestras}" var="p">
    

        <div class="col-sm-12 col-md-4 col-lg-3">
            <div class="panel panel-default">
                <div class="panel-heading">
                    Palestra ${p.codigo}
                </div>
                <div class="panel-body">             
                    ${p.tema}
                </div>
                <div class="panel-footer">
                    <a href="<c:url value="/FrontController?ctrl=RegistrarPalestra&idPalestra=${p.id_palestra}"/>" class="btn btn-default btn-lg center-block">
                        Inscrever-se
                    </a>
                </div>
            </div>
        </div>

    </c:forEach>

</div>

<c:import url="../template/footer_post_login.jsp"/>
