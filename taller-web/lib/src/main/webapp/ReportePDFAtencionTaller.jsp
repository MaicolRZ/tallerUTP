<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>

	

<%@ include file="headerTecnico.jsp" %>
<meta charset="ISO-8859-1">

<title>Imprimir PDF de Atencion en el TAller</title>
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
			  <h1 class="text-titles"><i class="zmdi zmdi-male-alt zmdi-hc-fw"></i>Imprimir PDF<small>Atencion Taller</small></h1>
			</div>
			<p class="lead">Genera PDF para poder ser impreso y entregado al cliente</p>
		</div>
		<div class="container-fluid">
			<div class="row">
				<div class="col-xs-12">
					<ul class="nav nav-tabs" style="margin-bottom: 15px;">
					  	<li class="active"><a href="#new" data-toggle="tab">Imprimir PDF </a></li>
					  	
					</ul>

					<div id="myTabContent" class="tab-content">
						<div class="tab-pane fade active in" id="new">
							<div class="container-fluid">
								<div class="row">
									<div class="col-xs-12 col-md-10 col-md-offset-1">
									    
									</div>
								</div>
							</div>
						</div>
						<!-- Lista de Tecnicos-->
						
						
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
											<th class="text-center">Descripcion</th>
											<th class="text-center">Accion</th>
											
											
											
										</tr>
									</thead>
									<tbody>
									
										 	
											
											<c:forEach items="${LstAtencionTallerPDF}" var="e">
											<tr>
											
											<td><c:out value="${e.dni_persona}"></c:out></td>
											<td><c:out value="${e.id_electro}"></c:out></td>	
											<td><c:out value="${e.nombresCompleto}"></c:out></td>
											<td><c:out value="${e.tipo_electrodomestico}"></c:out></td>
											<td><c:out value="${e.marca}"></c:out></td>
											<td><c:out value="${e.modelo}"></c:out></td>
											<td><c:out value="${e.numero_serie}"></c:out></td>
											<td><c:out value="${e.descripcion}"></c:out></td>
											
											
						
											<!-- Generar PDf-->
											<td> 
											<form action="<%=request.getContextPath()%>/ReportesServlet" method="post">
											
								  			<input  name="dni_persona" type="hidden" value="${e.dni_persona}"></input>
								  			<input  name="id_electro" type="hidden" value="${e.id_electro}"></input>
								  			<input  name="nombresCompleto" type="hidden" value="${e.nombresCompleto}"></input>
								  			<input  name="tipo_electrodomestico" type="hidden" value="${e.tipo_electrodomestico}"></input>
								  			<input  name="marca" type="hidden" value="${e.marca}"></input>
								  			<input  name="modelo" type="hidden" value="${e.modelo}"></input>
								  			<input  name="numero_serie" type="hidden" value="${e.numero_serie}"></input>
								  			<input  name="descripcion" type="hidden" value="${e.descripcion}"></input>
								  			
								  			<button name="submit"  class="btn btn-danger btn-raised btn-xs"><i class="zmdi zmdi-"> Generar PDF </i></button>
								  			</form>
											</td>
											
											
											
											
											</tr>
											
											</c:forEach>
								  		
								  			
								  		
											
									
									
											</tbody>
											</table>
			
						
					</div>
				</div>
			</div>
		</div>
		</section>
</body>
</html>