<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="headerTecnico.jsp" />
<title>Hoja trabajo</title>

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
			  <h1 class="text-titles"><i class="zmdi zmdi-male-alt zmdi-hc-fw"></i>Atencion en el Taller Estado Cotizacion<small></small></h1>
			</div>
			<p class="lead">Permite aceptar o rechazar la cotizacion enviada al cliente</p>
		</div>
		<div class="container-fluid">
			<div class="row">
				<div class="col-xs-12">
					<ul class="nav nav-tabs" style="margin-bottom: 15px;">
					  	<li class="active"><a href="#ingreso" data-toggle="tab">Lista cotizaciones</a></li>
					  	
					</ul>

					<div id="myTabContent" class="tab-content">
					
					
					
						<div class="tab-pane fade active in" id="ingreso">
							<div class="container-fluid">
								<div class="row">
									<div class="col-xs-12 col-md-10 col-md-offset-1">
									    
											  
											</div>
									    	<form method="post" action="<%=request.getContextPath() %>/SrvCotizaciones">
											<div class="form-group label-floating">
											<label class="control-label">DNI Cliente</label>
											<input class="form-control" type="text" name="id_cliente">
											<input class="btn btn-info btn-raised btn-sm" type="submit" value="Buscar">
											</div>
											</form>
	
										   
					  							<div class="row">
													<div class="table-responsive">
								<form action="<%=request.getContextPath() %>/SrvEstadoCotizacion" method="post">
								<table id="tabla2" class="table table-striped text-center" style="width:100%">
								
									<thead>
									
										<tr>
											
											<th class="text-center">Dni Persona</th>
											<th class="text-center">Id Electrodomestico</th>
											<th class="text-center">Nombres Completos</th>
											<th class="text-center">Tipo Electrodomestico</th>
											<th class="text-center">Marca</th>						
											<th class="text-center">Modelo</th>
											<th class="text-center">N° Serie</th>
											
											<th class="text-center">Estado</th>
											<th class="text-center">ID_Taller</th>
											<th class="text-center">Accion</th>
											
										</tr>
									</thead>
									
									<tbody>
									
											
											<c:forEach items="${LstCotizacion}" var="c">
											<tr>
											
											<td><c:out value="${c.dni_persona}"></c:out></td>
											<td><c:out value="${c.id_electro}"></c:out></td>	
											<td><c:out value="${c.nombresCompleto}"></c:out></td>
											<td><c:out value="${c.tipo_electrodomestico}"></c:out></td>
											<td><c:out value="${c.marca}"></c:out></td>
											<td><c:out value="${c.modelo}"></c:out></td>
											<td><c:out value="${c.numero_serie}"></c:out></td>
											<td><c:out value="${c.estado}"></c:out></td>
											<td><c:out value="${c.id_taller}"></c:out></td>
											
											
						
											<!-- aCCION-->
											
											<td>
											<a href="servletDetalles/EstadoCotizacion2.jsp?id_taller=${c.id_taller}&nombres=${c.nombresCompleto}">SELECCIONAR</a>
											</td>
											
											
											</tr>
											
											</c:forEach>
								  		
								  			
								
								  		
											
									
											</tbody>
												
											</table>
									</form>
										</div>
								
									</div>
								</div>
										    
									  
							</div>
						</div>
							
						
						<!-- Nuevo Cliente-->
						
						
						
						<!-- Nuevo Electrodomestico-->
						
						
						
						<!-- ....-->
					  	</div>
					  	</div>
					  	</div>
					  	
					</div>
				
			
		
	</section>

<!--====== Scripts -->
	<script src="https://code.jquery.com/jquery-3.5.1.js" ></script>
	<script src="https://cdn.datatables.net/1.11.3/js/jquery.dataTables.min.js" ></script>
	<script src="https://cdn.datatables.net/1.11.3/js/dataTables.bootstrap5.min.js" ></script>
	<script src="./js/main2.js)"></script>
	<script>
	$(document).ready(function(){
		
	    $('#tabla2').DataTable();
	});
	</script>

</body>
</html>