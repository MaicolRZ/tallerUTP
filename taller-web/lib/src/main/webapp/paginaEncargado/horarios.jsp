<%@page import="pe.edu.universidad.dao.DaoHorarios"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="pe.edu.universidad.dao.DaoHorarios"%>
<%@ page import="pe.edu.universidad.entidades.*"%>
<%@ page import="pe.edu.universidad.servlet.*"%>
<%@ page import="pe.edu.universidad.servletPiezas.*"%>
<%@ page import="pe.edu.universidad.web.*"%>
	<%@ page import="java.util.List"%>
	    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<!DOCTYPE html>
<html>
<head>
<%@ include file="./header.jsp" %>
<link rel="stylesheet" type="text/css" href="/DataTables/datatables.css">
<link rel="stylesheet" href="css/main.css">

<meta charset="ISO-8859-1">
<title>Mantenimiento de piezas y repuestos</title>
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
			  <h1 class="text-titles"><i class="zmdi zmdi-male-alt zmdi-hc-fw"></i>Horarios Visita Domicilio<small>Tecnicos</small></h1>
			</div>
			<p class="lead">Permite el mantenimiento de los horarios de visita a domicilio de los tecnicos</p>
		</div>
		<div class="container-fluid">
			<div class="row">
				<div class="col-xs-12">
					<ul class="nav nav-tabs" style="margin-bottom: 15px;">
					  	<li class="active"><a href="#new" data-toggle="tab">Nuevo</a></li>
					  	<li><a href="#list2" data-toggle="tab">Lista</a></li>
					</ul>

					<div id="myTabContent" class="tab-content">
						<div class="tab-pane fade active in" id="new">
							<div class="container-fluid">
								<div class="row">
									<div class="col-xs-12 col-md-10 col-md-offset-1">
									    <form action="<%=request.getContextPath() %>/ServletInsertarHorarios" method="post">
									   	 	<div class="form-group">
										        <label class="control-label">Tecnico</label>
										        
										        <select class="form-control" name="dni_tecnico" required>
										        <c:forEach items="${lstUsuarios}" var="tec">
										          <option value="${tec.id}"><c:out value="${tec.nombre}"></c:out></option>
										          </c:forEach>
										        </select>
										    </div>
									    	<div class="form-group label-floating">
											  <label class="control-label">Fecha</label>
											  <input class="form-control" type="date" name ="fecha" required>
											</div>
											<div class="form-group">
										        <label class="control-label">Horario</label>
										        <select class="form-control" name="turno"required>
										          <option id="Mañana">Mañana</option>
										          <option id="Tarde">Tarde</option>
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
						<!-- Lista de Tecnicos-->
						
						
						
					  	
					  		<div class="tab-pane fade"  id="list2">
					  		<form method="post"  action="<%=request.getContextPath() %>/ServletPostListaHorarios">
						<p class="text-center">
										    	<button name="Registrar"  class="btn btn-info btn-raised btn-sm"><i class="zmdi zmdi-floppy"></i> Lista Horarios</button>
						</p>
						</form>
					  		<div class="row">
							<div class="table-responsive">
								
								<table id="tabla3" class="table table-striped text-center" style="width:100%">
									<thead>
									
										<tr>
									
											
											<th class="text-center">ID Horario</th>
											<th class="text-center">DNI Tecnico</th> 
											<th class="text-center">Nombres</th>
											<th class="text-center">Inicio</th>
											<th class="text-center">Fin</th>	
											<th class="text-center">Fecha</th>				
											<th class="text-center">Estado</th>
											

										</tr>
									</thead>
									
									<tbody>
									<c:forEach items="${HorariosTecnico}" var="ht">
											 
												
											
											<tr>
											<td><c:out value="${ht.id_horario}"></c:out></td>
											<td><c:out value="${ht.dni_tecnico}"></c:out></td>
											<td><c:out value="${ht.nombresCompletos}"></c:out></td>
											<td><c:out value="${ht.hora_inicio}"></c:out></td>
											<td><c:out value="${ht.hora_fin}"></c:out></td>
											<td><c:out value="${ht.fecha}"></c:out></td>
											<td><c:out value="${ht.estado}"></c:out></td>
								  		</c:forEach>
											
									</tbody>
									
								</table>

								</div>
								
							</div>
							</div>
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