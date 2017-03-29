<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
        <title>Cadastro</title>

        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="js/jquery-3.2.0.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>

        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>

        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Brand</a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse navbar-right" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li><a href="index.jsp">Login<span class="sr-only">(current)</span></a></li>
                        <li><a href="cadastro.jsp">Cadastro</a></li>        
                    </ul>  

                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>

        <div class="container-fluid">
<div class="row">
    <div class="col-sm-10 col-sm-offset-1 col-md-6 col-md-offset-3 col-lg-4 col-lg-offset-4">
        <div class="panel panel-default">
            <div class="panel-heading">
                LOGIN
            </div>
            <div class="panel-body">
                <form>
                    <input type="text" title="Digite o nome de usuário." placeholder="Usuário" required="required" class="form-control input-lg">
                    <br/>
                    <input type="password" title="Digite a senha." placeholder="Senha" required="required" class="form-control input-lg">
                    <br/>
                    <input type="submit" value="LOGAR" class="btn btn-default btn-lg center-block">
                </form>

                <br/>

                <a style="text-align: center;" href="cadastro.jsp" role="button"><h4>Cadastre-se</h4></a>

            </div>
        </div>
    </div>
</div>

</div><!-- fim do container fluid -->
</body>
</html>