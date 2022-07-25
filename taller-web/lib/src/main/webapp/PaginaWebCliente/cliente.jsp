<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
    
<head>

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
		<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
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
            			<a href="#home" class="icon-h fas fa-house-damage"></a>
					</li>
					
					
					<li data-tooltip="Reserva Visita Domicilio" data-position="bottom">
						<a href="listaElectro.jsp#lista?dni=${LstCliente}" class="icon-a fas fa-user-tie"></a>
					</li>
          		</ul>
				
				<!-- Sound wave -->
    			<a class="music-bg">
      				<div class="lines">
        				<span></span>
        				<span></span>
        				<span></span>
        				<span></span>
						<span></span>
						<span></span>
      				</div>
					<p> Sound </p>
    			</a>
			 </nav>
			
			 
		<div id="home">
  		<div id="about">
		<div id="contact">
			<!-- Home Section -->
          	<div class="pt-home" style="background-image: url('img/home-bg.jpg')">
             	<section>
					
					<!-- Banner -->
					<div class="banner">
  						<h1>Taller UTP</h1>
						<p class="cd-headline rotate-1">
							<span>Realizamos </span>
							<span class="cd-words-wrapper">
								<b class="is-visible">Mantenimientos</b>
								<b>Reparaciones</b>
								<b>Diagnosticos</b>
								<b>Cotizaciones</b>
							</span>
						</p>
					</div>
					
					<!-- Language -->
					<div class="lang">
                		<ul>
                   			<li><a href="#" class="active">eng</a></li>
                    		<li><a href="#">rus</a></li>
                		</ul>
            		</div>
		
					<!-- Social -->
					<div class="social">
            			<ul>
                			<li><a href="#"><i class="fab fa-facebook-f"></i></a></li>
                			<li><a href="#"><i class="fab fa-twitter"></i></a></li>
                			<li><a href="#"><i class="fab fa-instagram"></i></a></li>
							<li><a href="#"><i class="fab fa-youtube"></i></a></li>
            			</ul>
        			</div>
			  	</section>  
          	</div>
			
			
			 
			
			 
			<!-- Portfolio Section -->
          	
			 
			 
			<!-- Contact Section -->
         	<div class="page pt-contact" data-simplebar>
            	<section class="container">
					
					<!-- Section Title -->
              		<div class="header-page mt-70 mob-mt">
						<h2>Contact</h2>
    					<span></span>
					</div>
					
					<!-- Form Start -->
					<div class="row mt-100">
						<div class="col-lg-12 col-sm-12">
							<div class="contact-form ">
                        		<form method="post" class="box contact-valid" id="contact-form">
									<div class="row">
                            			<div class="col-lg-6 col-sm-12">
                                			<input type="text" name="name" id="name" class="form-control" placeholder="Name *">
                            			</div>
                            			<div class="col-lg-6 col-sm-12">
                                			<input type="email" name="email" id="email" class="form-control" placeholder="Email *">
                            			</div>
                            			<div class="col-lg-12 col-sm-12">
                                			<textarea class="form-control" name="note"  id="note" placeholder="Your Message"></textarea>
                            			</div>
                             			<div class="col-lg-12 col-sm-12 text-center">
                                			<button type="submit" class="btn-st">Send Message</button>
                                			<div id="loader">
                                    			<i class="fas fa-sync"></i>
                                			</div>
                            			</div>
										<div class="col-lg-12 col-sm-12">
                            				<div class="error-messages">
                                				<div id="success">
													<i class="far fa-check-circle"></i>Thank you, your message has been sent.
												</div>
                                				<div id="error">
													<i class="far fa-times-circle"></i>Error occurred while sending email. Please try again later.
												</div>
											</div>
                            			</div>
									</div>
                    			</form>
                    		</div>
						</div>
					</div>
					
					<!-- Contact Info -->
					<div class="box contact-info">
						<div class="row">
							<div class="col-lg-4 col-sm-12 info">
								<i class="fas fa-paper-plane"></i>
         						<p>example@example.com</p>
          						<span>Email</span>
							</div>
							<div class="col-lg-4 col-sm-12 info">
								<i class="fas fa-map-marker-alt"></i>
         						<p>123 Lorem Ipsum, USA</p>
          						<span>Addres</span>
							</div>	
							<div class="col-lg-4 col-sm-12 info">
								<i class="fas fa-phone"></i>
         						<p>(+1) 123 456 7890</p>
          						<span>Phone</span>
							</div>	
						</div>
					</div>
					
					<!--Google Map Start-->
					<div class="google-map box mt-100 mb-100">
						<div class="row">
							<div class="col-lg-12">
								<div id="map" data-latitude="40.712775" data-longitude="-74.005973" data-zoom="14"></div>
							</div>
						</div>
					</div>
            	</section>
          	</div> 
			
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