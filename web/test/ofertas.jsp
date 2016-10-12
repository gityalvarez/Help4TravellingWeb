<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
        <script type="text/javascript" src="http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
        <script src="js/jquery-3.1.0.min.js"></script>
        <script src="js/includes.js"></script>
        <link href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href="css\test.css" rel="stylesheet" type="text/css">
        <script>
            $(document).ready(function () {   
                setTimeout(function(){
                    <%if ((String) session.getAttribute("nickname") != null) {%>
                        $('#idIniciar').hide();
                        $('#idRegistrar').hide();
                    <%} else {%> 
                        $('#idPerfil').hide();
                        $('#idReservas').hide();
                        $('#idSalir').hide();
                    <%}%>;
                }, 100);
            });
        </script>
    </head>
    <body>
        <div class="navbar navbar-default navbar-fixed-top" id="header">
        </div>
        <div class="section">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <h1 class="text-center">Servicios y Promociones</h1>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-4">
                        <a><img src="http://pingendo.github.io/pingendo-bootstrap/assets/placeholder.png" class="img-responsive"></a>
                        <h2>Servicio1</h2>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisici elit,&nbsp;</p>
                    </div>
                    <div class="col-md-4">
                        <a><img src="http://pingendo.github.io/pingendo-bootstrap/assets/placeholder.png" class="img-responsive"></a>
                        <h2>Servicio 2</h2>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisici elit,&nbsp;</p>
                    </div>
                    <div class="col-md-4">
                        <a><img src="http://pingendo.github.io/pingendo-bootstrap/assets/placeholder.png" class="img-responsive"></a>
                        <h2>Servicio 3</h2>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisici elit,&nbsp;</p>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-4">
                        <a><img src="http://pingendo.github.io/pingendo-bootstrap/assets/placeholder.png" class="img-responsive"></a>
                        <h2>Promoción 1</h2>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisici elit,&nbsp;</p>
                    </div>
                    <div class="col-md-4">
                        <a><img src="http://pingendo.github.io/pingendo-bootstrap/assets/placeholder.png" class="img-responsive"></a>
                        <h2>Promoción 2</h2>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisici elit,&nbsp;</p>
                    </div>
                    <div class="col-md-4">
                        <a><img src="http://pingendo.github.io/pingendo-bootstrap/assets/placeholder.png" class="img-responsive"></a>
                        <h2>Promoción 3</h2>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisici elit,&nbsp;</p>
                    </div>
                </div>
            </div>
        </div>
        <footer class="section section-primary" id="footer">
        </footer>
    </body>
</html>