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
			  <h1 class="text-titles"><i class="zmdi zmdi-male-alt zmdi-hc-fw"></i>Atencion en el Taller<small></small></h1>
			</div>
			<p class="lead">Permite el ingreso de un electrodomestico y la salida </p>
		</div>
		<div class="container-fluid">
			<div class="row">
				<div class="col-xs-12">
					<ul class="nav nav-tabs" style="margin-bottom: 15px;">
					  	<li class="active"><a href="#ingreso" data-toggle="tab">Ingreso Electrodomestico</a></li>
					  	<li><a href="#newcliente" data-toggle="tab">Nuevo Cliente</a></li>
					  	<li><a href="#newElectro" data-toggle="tab">Nuevo Electrodomestico</a></li>
					</ul>

					<div id="myTabContent" class="tab-content">
					
					
					
						<div class="tab-pane fade active in" id="ingreso">
							<div class="container-fluid">
								<div class="row">
									<div class="col-xs-12 col-md-10 col-md-offset-1">
									    
											  
											</div>
									    	<form method="post" action="<%=request.getContextPath() %>/ServletPostListarClientesDni">
											<div class="form-group label-floating">
											<label class="control-label">DNI Cliente</label>
											<input class="form-control" type="text" name="id_cliente" required>
											<input class="btn btn-info btn-raised btn-sm" type="submit" value="Buscar">
											</div>
											</form>
	
										   
					  							<div class="row">
													<div class="table-responsive">
								
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
											
											<th class="text-center">Accion</th>
											
											
											
										</tr>
									</thead>
									<tbody>
									
										 	
											
											<c:forEach items="${LstDniClientes}" var="e">
											<tr>
											
											<td><c:out value="${e.dni_persona}"></c:out></td>
											<td><c:out value="${e.id_electro}"></c:out></td>	
											<td><c:out value="${e.nombresCompleto}"></c:out></td>
											<td><c:out value="${e.tipo_electrodomestico}"></c:out></td>
											<td><c:out value="${e.marca}"></c:out></td>
											<td><c:out value="${e.modelo}"></c:out></td>
											<td><c:out value="${e.numero_serie}"></c:out></td>
											
											
											
						
											<!-- Editar-->
											<td> 
											<a href="servletDetalles/servletPostElectroDescripcionEditar.jsp?id_electro=${e.id_electro}"  class=" btn-raised btn-xs" >
											<button>
											<i class="zmdi zmdi"> Detalles </i>
											</button>
											</a>
											</td>
											
											
											
											
											</tr>
											
											</c:forEach>
								  		
								  			
								  		
											
									
									
											</tbody>
											</table>
									
										</div>
								
									</div>
								</div>
										    
									  
							</div>
						</div>
							
						
						<!-- Nuevo Cliente-->
						
						<div class="tab-pane fade" id="newcliente">
							<div class="container-fluid">
								<div class="row">
									<div class="col-xs-12 col-md-10 col-md-offset-1">
									    <form action="<%=request.getContextPath() %>/ServletPostClienteNuevoTecnico" method="post">
									   	 	<div class="form-group label-floating">
											  <label class="control-label">Dni</label>
											  <input class="form-control" type="number" name ="id" required>
											</div>
									    	<div class="form-group label-floating">
											  <label class="control-label">Nombre</label>
											  <input class="form-control" type="text" name ="nombre"required>
											</div>
											<div class="form-group label-floating">
											  <label class="control-label">Apellido Paterno</label>
											  <input class="form-control" type="text" name ="apell_pat"required>
											</div>
											<div class="form-group label-floating">
											  <label class="control-label">Apellido Materno</label>
											  <input class="form-control" type="text" name ="apell_mat"required>
											</div>
											<div class="form-group label-floating">
											  <label class="control-label">telefono</label>
											  <input class="form-control" type="text" name ="telefono"required>
											</div>
											
											<div class="form-group label-floating">
											  <label class="control-label">Direccion</label>
											  <input class="form-control" type="text" name ="direccion"required>
											</div>

											<div class="form-group">
										        <label class="control-label">Genero</label>
										        <select class="form-control" name="genero"required>
										          <option>Masculino</option>
										          <option>Femenino</option>
										        </select>
										    </div>
											
										    <!-- Icono Guardar Tecnico-->
										    <p class="text-center">
										    	<button name="Registrar"  class="btn btn-info btn-raised btn-sm"><i class="zmdi zmdi-floppy"></i> Registrar</button>
										    </p>
									    </form>
									</div>
								</div>
							</div>
						</div>
						
						<!-- Nuevo Electrodomestico-->
						
						<div class="tab-pane fade" id="newElectro">
							<div class="container-fluid">
								<div class="row">
									<div class="col-xs-12 col-md-10 col-md-offset-1">
									    <form action="<%=request.getContextPath() %>/ServletPostElectroNuevo" method="post">
									   	 	<div class="form-group label-floating">
											  <label class="control-label">Dni Cliente</label>
											  <input class="form-control" type="number" name ="dni" required>
											</div>
									    	<div class="form-group label-floating">
											  <label class="control-label">Tipo Electrodomestico</label>
											  <input class="form-control" type="text" name ="tipo_electrodomestico"required>
											</div>
											<div class="form-group label-floating">
											  <label class="control-label">Marca</label>
											  <input class="form-control" type="text" name ="marca"required>
											</div>
											<div class="form-group label-floating">
											  <label class="control-label">Modelo</label>
											  <input class="form-control" type="text" name ="modelo"required>
											</div>
											<div class="form-group label-floating">
											  <label class="control-label">Numero Serie</label>
											  <input class="form-control" type="text" name ="numero_Serie"required>
											</div>
											
											
										    <!-- Icono Guardar Tecnico-->
										    <p class="text-center">
										    	<button name="Registrar"  class="btn btn-info btn-raised btn-sm"><i class="zmdi zmdi-floppy"></i> Registrar</button>
										    </p>
									    </form>
									</div>
								</div>
							</div>
						</div>
						
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