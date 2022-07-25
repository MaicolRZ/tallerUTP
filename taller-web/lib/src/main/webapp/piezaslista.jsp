<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<%@ include file="headerTecnico.jsp" %>

<%@ page import="ServletsControladores.*"%>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		
		<!-- Content page-->
	<section class="full-box dashboard-contentPage">
		<!-- NavBar -->
		<nav class="full-box dashboard-Navbar">
			<ul class="full-box list-unstyled text-right">
				<li class="pull-left">
					<a href="#!" class="btn-menu-dashboard"><i class="zmdi zmdi-more-vert"></i></a>
				</li>
				<li>
					<a href="#!" class="btn-Notifications-area">
						<i class="zmdi zmdi-notifications-none"></i>
						<span class="badge">7</span>
					</a>
				</li>
				<li>
					<a href="#!" class="btn-search">
						<i class="zmdi zmdi-search"></i>
					</a>
				</li>
				<li>
					<a href="#!" class="btn-modal-help">
						<i class="zmdi zmdi-help-outline"></i>
					</a>
				</li>
			</ul>
		</nav>
<div class="container-fluid">
			<div class="page-header">
			  <h1 class="text-titles"><i class="zmdi zmdi-male-alt zmdi-hc-fw"></i>Seleccionar Piezas Usadas ${Id_Hoja_Servicio}<small></small></h1>
			</div>
			<p class="lead">Permite el ingreso de un electrodomestico y la salida </p>
		</div>
		<div class="container-fluid">
			<div class="row">
				<div class="col-xs-12">
					<ul class="nav nav-tabs" style="margin-bottom: 15px;">
					  	<li class="active"><a href="#ingreso" data-toggle="tab">Ingreso Electrodomestico</a></li>
					  	
					</ul>

					<div id="myTabContent" class="tab-content">
					
					
					
						<div class="tab-pane fade active in" id="ingreso">
							<div class="container-fluid">
								<div class="row">
									<div class="col-xs-12 col-md-10 col-md-offset-1">
									    
											  
											</div>
									    	<form method="post" action="<%=request.getContextPath()%>/ServletPostListarPiezasNombre">
											<div class="form-group label-floating">
											
											
											</div>
											</form>
								<div>
										   
					  							<div class="row">
													<div class="table-responsive">
								
								<p class="lead">|    Lista Piezas</p>
											
											<table id="tabla3" class="table table-striped text-center" style="width:60%">
									<thead>
										<tr>
											
											<th class="text-center">ID</th>
											<th class="text-center">Nombre</th>
											
											<th class="text-center">Precio</th>
																
											<th class="text-center">Seleccionar</th>

										</tr>
									</thead>
									<tbody>
									
											<c:forEach items="${lstPiezas}" var="d">
														<tr>

															<td><c:out value="${d.id}"></c:out></td>
															<td><c:out value="${d.piezas}"></c:out></td>
															
															<td><c:out value="${d.precio}"></c:out></td>
															
															<td><a href="<%=request.getContextPath() %>/lista?idpieza=${d.id}&piezas=${d.piezas}&precio=${d.precio}"> Agregar </a></td>

														</tr>

													</c:forEach>	
						
											
								  	
								  			
								  			
								  		
									</tbody>
								</table>
								<%int suma=0;
								
								%>
								<p class="lead">| 	 Seleccionados </p>
								
									<table class="table table-striped text-center" style="width:50%">
										<tr>
											<th></th>
											<th class="text-center">ID</th>
											<th class="text-center">Nombre</th>
											
											<th class="text-center">Precio</th>
																
											<th class="text-center">Quitar</th>
										</tr>
									<c:forEach items="${lstSlcPiezas}" var="e">
									
									<tr>
									<td></td>
		 							<td><c:out value="${e.id}"></c:out></td>
		 							
									<td><c:out value="${e.piezas}"></c:out></td>
															
									<td><c:out value="${e.precio}"></c:out></td>
									
									<td> <a href="<%=request.getContextPath() %>/ServletGetQuitarPieza?idpiezas=${e.id}"> Quitar</a>
									</td>
									
									
									
									</tr>
									
									<td></td>>
									</c:forEach>
									
									</table>
									
									 
								</div>
								
								
								
									
										</div>
								
									</div>
								</div>
										    
									  
							</div>
							<form method="post" action="<%=request.getContextPath() %>/ServletRegistrarPiezas">
							<input type="hidden" name="id_hoja_servicio" value="${Id_Hoja_Servicio}">
							<input type="submit" value="Registrar">
							</form>
						</div>
							

						

					  	</div>
					  	</div>
					  	</div>
					  	
					</div>
				
			
		
	</section>
		</body>
		<!--====== Scripts -->
	<script src="https://code.jquery.com/jquery-3.5.1.js" ></script>
	<script src="https://cdn.datatables.net/1.11.3/js/jquery.dataTables.min.js" ></script>
	<script src="https://cdn.datatables.net/1.11.3/js/dataTables.bootstrap5.min.js" ></script>
	<script src="./js/main2.js)"></script>
	<script>
	$(document).ready(function(){
		
	    $('#tabla3').DataTable();
	});
	
	Let precio=document.getElementById("precio").value;
	</script>
	
</html>