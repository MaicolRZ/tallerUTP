<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="./header.jsp" />
<title>Reportes Tecnico</title>

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
			  <h1 class="text-titles"><i class="zmdi zmdi-male-alt zmdi-hc-fw"></i>Reportes Tecnico<small></small></h1>
			</div>
			<p class="lead">Crea una lista con los reportes seleccionados</p>
		</div>
		<div class="container-fluid">
			<div class="row">
				<div class="col-xs-12">
					<ul class="nav nav-tabs" style="margin-bottom: 15px;">
					  	<li class="active"><a href="#lista" data-toggle="tab">Reportes</a></li>
					  
					</ul>

					<div id="myTabContent" class="tab-content">
					
						<div class="tab-pane fade active in" id="lista">
							<div class="container-fluid">
								<div class="row">
									<div class="col-xs-12 col-md-10 col-md-offset-1">
									    
											  
											</div>
									    	<form method="post" action="<%=request.getContextPath() %>/SrvReportesTecnico">
											<div class="form-group label-floating">
											<label class="control-label">DNI Tecnico</label>
											<input  type="text" name="id_tecnico" required>
											<input  type="date" name="fecha">
											<input  type="date" name="fechaFinal">
											<input class="btn btn-info btn-raised btn-sm" type="submit" value="Buscar">
											</div>
											</form>
									
											
											<form action="<%=request.getContextPath() %>/ServletPDF" method="post">
											<div class="form-group label-floating">
											<label class="control-label">Generar PDF</label>
											<input class="btn btn-info btn-raised btn-sm" type="submit" value="Imprimir Lista">
											</div>
											</form>
										    
										   
					  							<div class="row">
													<div class="table-responsive">
								
								<table id="tabla3" class="table table-striped text-center" style="width:100%">
									<thead>
										<tr>
											
											<th class="text-center">ID Taller</th>
											<th class="text-center">DNI Tecnico</th>
											<th class="text-center">Fecha</th>
											<th class="text-center">DNI CLiente</th>
											<th class="text-center">Nombres Completos</th>
											<th class="text-center">ID Electro</th>
											
											
											<th class="text-center">Marca</th>
											<th class="text-center">Modelo</th>						
											
											<th class="text-center">Descripcion</th>
											<th class="text-center">Servicio</th>
											
											
											
										</tr>
									</thead>
									<tbody>
											
										 	
											
											<c:forEach items="${LstReporteTecnico}" var="e">
											<tr>
											<td><c:out value="${e.id_taller}"></c:out></td>
											<td><c:out value="${e.id_tecnico}"></c:out></td>
											<td><c:out value="${e.fecha}"></c:out></td>						
											<td><c:out value="${e.dni_cliente}"></c:out></td>
											<td><c:out value="${e.nombresCompletos}"></c:out></td>
											<td><c:out value="${e.id_electro}"></c:out></td>
											<td><c:out value="${e.modelo}"></c:out></td>
											<td><c:out value="${e.marca}"></c:out></td>
											<td><c:out value="${e.descripcion}"></c:out></td>
											<td><c:out value="${e.tipo_Servicio}"></c:out></td>
											<!-- Editar-->
											
											
											
											
											
											</tr>
											
											</c:forEach>
								  		
								  			
								  		
											
									
									
											</tbody>
								</table>
									
								</div>
								
							</div>
							</div>
										    
									  
									</div>
								</div>
								
								
								<!-- Lista de Tecnicos-->
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
		
	    $('#tabla3').DataTable();
	});
	</script>

</body>
</html>