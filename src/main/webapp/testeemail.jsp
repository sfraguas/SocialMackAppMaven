<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="template/header_pre_login.jsp"/>
<div class="row">
    <div class="col-sm-10 col-sm-offset-1 col-md-6 col-md-offset-3 col-lg-4 col-lg-offset-4">
        <div class="panel panel-default">
            <div class="panel-heading">
                TESTE EMAIL
            </div>
            <div class="panel-body">
                <form action="FrontController" method="POST">
                    <input type="email"  name="email" title="Digite o email." placeholder="email" required="required" class="form-control input-lg">
                    <br/>
                    <input type="hidden" value="Email" name="ctrl">
                    <input type="submit" value="email" class="btn btn-default btn-lg center-block">
                </form>
                <br/>
                
            </div>
        </div>
    </div>
</div>

<c:import url="template/footer_pre_login.jsp"/>