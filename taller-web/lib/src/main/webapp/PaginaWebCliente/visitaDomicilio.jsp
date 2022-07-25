<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<head>
		
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
        <link rel="stylesheet" class="back-color" href="css/style-dark.css">
		<link rel="stylesheet" href="css/style-demo.css">
		
		<!-- Settings Style -->
		<link rel="stylesheet" class="posit-nav" href="css/settings/left-nav.css" />
		<link rel="stylesheet" class="theme-color" href="css/settings/green-color.css" />
		
    </head>
    <body>
    <%String id_electro=request.getParameter("id_electro");

	%>
		
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
						<a href="listaElectro.jsp#lista" class="icon-a fas fa-user-tie"></a>
					</li>
          		</ul>
				
				
			 </nav>
			
			<!-- Home Section -->
			<div id="home">
          	
             	
			
			<div class="pt-home" style="background-image: url('img/home-bg.jpg')">
             	<section>
					

					
			  	</section>  
          	</div>
				
			 
			
			 
			<!-- About Section                   -->
			<div id="horario">
			<div class="page pt-horario" data-simplebar>
				
				<section class="container">

					<!-- Section Title -->
					<div class="header-page mt-70 mob-mt">
						<h2>Horarios Tecnicos</h2>
						<span></span>
					</div>

					<!-- Personal Info Start -->
					<div class="row mt-100">

						<!-- Information Tecnico -->
						
						<c:forEach items="${lstHorarios}" var="hr">
						<div class="col-lg-12 col-sm-12">
							<div class="info box">
								<div class="row">
									<div class="col-lg-3 col-sm-4">
										<div class="photo">
											<img alt="" src="img/user-photo.jpg">
										</div>
									</div>
									<div class="col-lg-9 col-sm-8">
										<h4><c:out value="${hr.nombresCompletos}"></c:out></h4>
										<div class="loc">
											<i class="fas fa-map-marked-alt"></i> Arequipa, Taller UTP
										</div>
										<p>Dni Tecnico </p>
										<p><c:out value="${hr.dni_tecnico}"></c:out></p>
										<p>Genero</p>
										<p>
											<c:out value="${hr.genero}"></c:out>
										</p>
										<div class="row">
										<p> Hora Inicio (</p>
										<p><c:out value="${hr.hora_inicio}"></c:out> ) </p>
										<p> Hora Fin (</p>
										<p><c:out value="${hr.hora_fin}"></c:out> ) </p>
										</div>
									</div>

									<!-- Icon Info -->
									<div class="col-lg-3 col-sm-4">
										<div class="info-icon">
											
											<div class="desc-icon">
												<h6><c:out value="${hr.experiencia}"></c:out> años</h6>
												<p>Experiencia</p>
												
											</div>
										</div>
									</div>

								
									<div class="col-lg-3 col-sm-4">
										<div class="info-icon">
											
											<div class="desc-icon">
												<h6><c:out value="${hr.fecha}"></c:out></h6>
												<p>Fecha</p>
											</div>
										</div>
									</div>

									<!-- Icon Info -->
									<div class="col-lg-3 col-sm-4">
										<div class="info-icon">
											
											<div class="desc-icon">
												<h6>Horario</h6>
												<p><c:out value="${hr.estado}"></c:out></p>
											</div>
										</div>
									</div>
									<div class="col-lg-3 col-sm-12 pt-10">
										<form action="<%=request.getContextPath()%>/ServletPostVisitaAsignada" method="post">
								  			<input  name="id_elec" type="hidden" value="<%=id_electro%>"></input>
								  			<input  name="id_tecnico" type="hidden" value="${hr.dni_tecnico}"></input>
								  			<input  name="id_horario" type="hidden" value="${hr.id_horario}"></input> 
								  			<input  name="fecha" type="hidden" value="${hr.fecha}"></input>
								  			
								  			<button name="submit"  class="btn btn-danger btn-raised btn-xs"><i class="zmdi ">Seleccionar</i></button>
								  			</form>
									</div>
								</div>
							</div>
						</div>
						
						</c:forEach>
						<!-- Information Tecnico -->
						
					</div>
					
				</section>
				
          	</div>
          	
			 
			
			
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