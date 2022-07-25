<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<head>
	<%@ page import="pe.edu.universidad.dao.*"%>
	<%@ page import="pe.edu.universidad.entidades.*"%>
		<%@ page import="java.util.List"%>
		<!-- Meta -->
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
		
		<!-- Title -->
		<title>Taller - UTP</title>

		<!-- CSS Plugins -->
        <link rel="stylesheet" href="css/plugins/bootstrap.min.css">
        <link rel="stylesheet" href="css/plugins/font-awesome.css">
		<link rel="stylesheet" href="css/plugins/magnific-popup.css">
		<link rel="stylesheet" href="css/plugins/simplebar.css">
		<link rel="stylesheet" href="css/plugins/owl.carousel.min.css">
		<link rel="stylesheet" href="css/plugins/owl.theme.default.min.css">
		<link rel="stylesheet" href="css/plugins/jquery.animatedheadline.css">
		
		<!-- CSS Base -->
        <link rel="stylesheet" class="back-color" href="css/style-light.css">
		<link rel="stylesheet" href="css/style-demo.css">
		
		<!-- Settings Style -->
		<link rel="stylesheet" class="posit-nav" href="css/settings/left-nav.css" />
		<link rel="stylesheet" class="theme-color" href="css/settings/green-color.css" />
		
    </head>
    <body>
   	
	
		<!--Theme Options Start-->
        <div class="style-options">
            <div class="toggle-btn">
                <span><i class="fas fa-cog"></i></span>
            </div>
            <div class="style-menu">
                <div class="style-nav">
                    <h4 class="mt-15 mb-10">Menu Posiciones</h4>
                    <ul>
						<li><a href="css/settings/top-nav.css"><i class="fas fa-caret-up"></i> Arriba</a></li>
                        <li><a href="css/settings/left-nav.css"><i class="fas fa-caret-left"></i> Izquierda</a></li>
                        <li><a href="css/settings/right-nav.css"><i class="fas fa-caret-right"></i> Derecha</a></li>
                        <li><a href="css/settings/bottom-nav.css"><i class="fas fa-caret-down"></i> Abajo</a></li>
                    </ul>
                </div>
				<div class="style-back">
                    <h4 class="mt-85 mb-10">Modo Pagina</h4>
                    <ul>
                        <li><a href="css/style-dark.css"><i class="fas fa-moon"></i> Oscuro</a></li>
                        <li><a href="css/style-light.css"><i class="far fa-lightbulb"></i> Claro</a></li>
                    </ul>
                </div>
				<div class="style-color">
                    <h4 class="mt-55 mb-10">Tema Color</h4>
                    <ul>
                        <li><a href="css/settings/green-color.css" style="background-color: #25ca7f;"></a></li>
						<li><a href="css/settings/blue-color.css" style="background-color: #00a3e1;"></a></li>
                        <li><a href="css/settings/red-color.css" style="background-color: #d94c48;"></a></li>
                        <li><a href="css/settings/purple-color.css" style="background-color: #bb68c8;"></a></li>
						<li><a href="css/settings/sea-color.css" style="background-color: #0dcdbd;"></a></li>
                        <li><a href="css/settings/yellow-color.css" style="background-color: #eae328;"></a></li>
                    </ul>
                </div>
            </div>
        </div>
		
		<!-- Preloader -->
		<div id="preloader">
  			<div class="loading-area">
    			<div class="circle"></div>
  			</div>
  			<div class="left-side"></div>
  			<div class="right-side"></div>
		</div>
		
		<!-- Main Site -->
		
			
			<div class="header-mobile">
                <a class="header-toggle"><i class="fas fa-bars"></i></a>
                <h2>Baha</h2>
            </div>
			
			<!-- Left Block -->
			<nav class="header-main" data-simplebar>
		
				<!-- Logo -->
				<div class="logo">
					<img src="img/logo.png" alt="">
					
					<p style="color: #25ca7f;">${lstNombresCompletos}</p>
					<br>
					<p style="color: #25ca7f;">${LstCliente}</p>
					
					<ul>
					<li data-tooltip="exit" data-position="top">
            			<a href="../index.jsp" style="color: #25ca7f;" class="fas fa-ban"></a>
            			
					</li>
					</ul>
					
					
				</div>
				
          		<ul>
					<li data-tooltip="home" data-position="top">
            			<a href="cliente.jsp#home" class="icon-h fas fa-house-damage"></a>
					</li>
					
					
					<li data-tooltip="Reserva Visita Domicilio" data-position="bottom">
						<a href="#lista" class="icon-a fas fa-user-tie"></a>
					</li>
          		</ul>
				
				
			 </nav>
			
			<!-- Home Section -->
			<div id="home">
          	<div class="pt-home" style="background-image: url('img/home-bg.jpg')">
             	
			
             	<section>
					
				
	
			  	</section>  
          	</div>
				
			 
			<div id="lista">
			 
			<!-- Contact Section -->
         	<div class="page pt-lista" data-simplebar>
            	<section class="container">
					
					<!-- Section Title -->
              		<div class="header-page mt-30 mob-mt">
						<h2>Datos Usuario</h2>
    					<span></span>
					</div>
					
					<!-- Form Start -->
					<div class="row mt-100">
						<div class="col-lg-12 col-sm-12">
							<div class="contact-form ">
							
                        		<form method="post" class="box contact-valid" id="contact-form">
                        		
                        	
                        		
                        		
                        		
                        		
									<div class="row">
										<div class="col-lg-6 col-sm-12">
                            				
                                			<input type="text"  id="nombres" class="form-control" value="${lstNombresCompletos}" readonly>
                            			</div>
                            			<div class="col-lg-6 col-sm-12">
                            				
                                			<input type="text"  id="direccion" class="form-control"  value="${lstDireccion}"readonly>
                            			</div>
                            			<div class="col-lg-6 col-sm-12">
                                			<input type="text"  id="telefono" class="form-control"  value="${lstTelefono}"readonly>
                            			</div>
                            			<div class="col-lg-6 col-sm-12">
                                			<input type="text"  id="dni" class="form-control"  value="${LstCliente}"readonly>
                            			</div>
                            			<br/>
										<div class="col-lg-6 col-sm-12">
                            				
                                			<input type="email" id="correo" class="form-control" placeholder="Email *"  value="" required>
                            			</div>
										</div>
										
										
										
										</form>
										
									</div>
									
									
								</div>
						</div>
						
						
						
						
											<div class="box contact-info">
											
											<form method="post"  action="<%=request.getContextPath() %>/SrvListaElectros">
						<div class="col-lg-6 col-sm-12">
                                			<input type="hidden"  name="dni" class="form-control" value="${LstCliente}"  required readonly>
                            			</div>
						<div class="col-lg-12 col-sm-12 ">
																	<button name="Registrar"  class="btn btn-info btn-raised btn-sm"><i class="zmdi zmdi-floppy"></i> Listar Electrodomesticos</button>
						</div>
						
						</form>
											
												<div class="row">
							<table id="electro" class="table table-striped text-center"
								style="width: 100%">
								<thead>
									<tr>
										<th>Id Electro</th>
										<th>Electrodomestico</th>
										<th>Marca</th>
										<th>Modelo</th>
										<th>Numero Serie</th>
										<th>Accion</th>
									</tr>
								</thead>
								<tbody>

									<tr>
										<c:forEach items="${Electrodomesticos}" var="lst">
											<tr>
												<td><c:out value="${lst.id}"></c:out></td>

												<td><c:out value="${lst.tipo_electrodomestico}"></c:out></td>
												<td><c:out value="${lst.marca}"></c:out></td>
												<td><c:out value="${lst.modelo}"></c:out></td>
												<td><c:out value="${lst.numero_Serie}"></c:out></td>
												<td>
													<form>
														<a href="visitaDomicilio.jsp?id_electro=${lst.id}"
															class=" btn-raised btn-xs">Seleccionar</a>
													</form>
												</td>

											</tr>

										</c:forEach>
								</tbody>
							</table>
						</div>
											</div>
						
						<div class="row mt-100">
												<div class="col-lg-12 col-sm-12">
													<div class="contact-form ">
						
							<form method="post" class="box contact-valid" id="contact-form" action="<%=request.getContextPath() %>/ServletPostElectroNuevoCliente">
										
											<h4>Registrar Nuevo Electrodomestico</h4>
											
											<br/>
										
										<div class="row">
										
										<div class="col-lg-6 col-sm-12">
                                			<input type="text"  name="tipo_electrodomestico" class="form-control" placeholder="Tipo Electrodomestico *"  required>
                            			</div>
                            			<div class="col-lg-6 col-sm-12">
                                			<input type="text"  name="marca" class="form-control" placeholder="Marca *"  required>
                            			</div>
                            			<div class="col-lg-6 col-sm-12">
                                			<input type="text"  name="modelo" class="form-control" placeholder="Modelo *"  required>
                            			</div>
                            			<div class="col-lg-6 col-sm-12">
                                			<input type="text"  name="numero_Serie" class="form-control" placeholder="Numero Serie *"  required>
                            			</div>
                            			<div class="col-lg-12 col-sm-12">
                                			<input type="text"  name="descripcion" class="form-control" placeholder="Descripcion *"  required>
                            			</div>
                            			<div class="col-lg-6 col-sm-12">
                                			<input type="hidden"  name="dni" class="form-control" value="${LstCliente}"  required readonly>
                            			</div>
                            			
                            			
                            			<div class="col-lg-12 col-sm-12 text-center">
																	<button name="Registrar"  class="btn btn-info btn-raised btn-sm"><i class="zmdi zmdi-floppy"></i> Registrar</button>
										</div>
										</div>
							</form>
						</div>
						</div>
						</div>
						
						
						</section>
					</div>
					
					<!-- Contact Info -->
					
					
            	
				
          	</div>
          	
			 </div>
			 
			 
		
	
		
		<!-- All Script -->
		<script src="js/jquery.min.js"></script>
		<script src="js/isotope.pkgd.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/simplebar.js"></script>
		<script src="js/owl.carousel.min.js"></script>
		<script src="js/jquery.magnific-popup.min.js"></script>
		<script src="js/jquery.animatedheadline.min.js"></script>
		<script src="js/jquery.easypiechart.js"></script>
		<script src="js/jquery.validation.js"></script>
		<script src="js/tilt.js"></script>
        <script src="js/main.js"></script>
		<script src="js/main-demo.js"></script>
        <script src="https://maps.google.com/maps/api/js?sensor=false"></script>
		
    </body>

</html>