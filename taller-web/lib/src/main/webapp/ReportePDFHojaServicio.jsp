<%@page import="pe.edu.universidad.dto.DtoPdfHojaServicio"%>
<%@page import="pe.edu.universidad.dao.DaoGenerico"%>
<%@page import="pe.edu.universidad.dao.DaoRegistarPiezasUsadas"%>
<%@page import="pe.edu.universidad.dao.DaoHojaServicio"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
    <%@ page import="java.util.List"%>   
<!DOCTYPE html>
<html>
<head>

	

<%@ include file="headerTecnico.jsp" %>
<meta charset="ISO-8859-1">

<title>Imprimir PDF de Hoja de Servicio</title>
</head>
<body>
<%
	String id_hoja_servicio=request.getParameter("id");
	
%>
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
			  <h1 class="text-titles"><i class="zmdi zmdi-male-alt zmdi-hc-fw"></i>Imprimir PDF<small>Hoja Servicio</small></h1>
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
						
						
						
											
											<table class="table table-striped text-center" style="width:100%" border="1">
											<c:forEach items="${PdfHojaServicio}" var="hs">
											<tr>
											
											<td>
											
											<p class="lead">Datos Cliente</p>
											
											
											<div class="form-group label-floating">
											  <label class="control-label">Nombres Completos</label>
											  <input class="form-control" type="text" name ="a" value="${hs.nombresCompletos}" readonly>
											</div>
											<div class="form-group label-floating">
											  <label class="control-label">Direccion</label>
											  <input class="form-control" type="text" name ="a" value="${hs.direccion}" readonly>
											</div>
											<div class="form-group label-floating">
											  <label class="control-label">Telefono</label>
											  <input class="form-control" type="text" name ="a" value="${hs.telefono}" readonly>
											</div>
											<div class="form-group label-floating">
											  <label class="control-label">DNI</label>
											  <input class="form-control" type="text" name ="a" value="${hs.dni_persona}" readonly>
											</div>
											</td>
											<td>
											<p class="lead">Datos Electrodomestico</p>
											
											<div class="form-group label-floating">
											  <label class="control-label">Electrodomestico</label>
											  <input class="form-control" type="text" name ="a" value="${hs.electrodomestico}" readonly>
											</div>
											<div class="form-group label-floating">
											  <label class="control-label">Marca</label>
											  <input class="form-control" type="text" name ="a" value="${hs.marca}" readonly>
											</div>
											<div class="form-group label-floating">
											  <label class="control-label">Modelo</label>
											  <input class="form-control" type="text" name ="a" value="${hs.modelo}" readonly>
											</div>
											  
											  <div class="form-group label-floating">
											  <label class="control-label">N° Serie</label>
											  <input class="form-control" type="text" name ="a" value="${hs.numero_serie}" readonly>
											</div>
											<div class="form-group label-floating">
											  <label class="control-label">Descripcion Fallo </label>
											  <input class="form-control" type="text" name ="a" value="${hs.descripcion_falla}" readonly>
											</div> 
											
											</td>
											
											</tr>
											
											<tr>
											<td>
											<p class="lead">Servicios Realizados</p>
											
											<div class="form-group label-floating">
											  <label class="control-label">Dni Tecnico</label>
											  <input class="form-control" type="text" name ="a" value="${hs.id_tecnico}" readonly>
											</div>
											<div class="form-group label-floating">
											  <label class="control-label">Descripcion Servicios realizado</label>
											  <input class="form-control" type="text" name ="a" value="${hs.descripcion_arreglo}" readonly>
											</div>
											<div class="form-group label-floating">
											  <label class="control-label">Fecha</label>
											  <input class="form-control" type="text" name ="a" value="${hs.fecha}" readonly>
											</div>
											  
											  <div class="form-group label-floating">
											  <label class="control-label">Hora</label>
											  <input class="form-control" type="text" name ="a" value="${hs.hora}" readonly>
											</div>
											
											</td>
											<td>
											
											
											</tr>
											</c:forEach>
											</table>
											<table class="table table-striped text-center" style="width:100%" border="1">
											<tr>
											<c:forEach items="${LstPiezasUsadas}" var="lp">
											<td>
											<p class="lead">Piezas usadas</p>
											
											
											<div class="form-group label-floating">
											  <label class="control-label">Nombre Pieza</label>
											  <input class="form-control" type="text" name ="a" value="${lp.nombre}" readonly>
											</div>
											<div class="form-group label-floating">
											  <label class="control-label">Precio</label>
											  <input class="form-control" type="text" name ="a" value="${lp.precio}" readonly>
											</div>
											</td>
											</c:forEach>
											</tr>
											</table>
							<div class="form-group label-floating">
											  <label class="control-label">Suma Total Piezas</label>
											  <input class="form-control" type="text" name ="a" value="${sumaTotal}" readonly>
											</div>
											<c:forEach items="${PdfHojaServicio}" var="hs">
											<form action="<%=request.getContextPath() %>/SrvPrecioTotal" method="post">
										<div class=" label-floating">
											  <label class="control-label">Cantidad Total</label>
											   <input class="form-control" type="hidden" name ="id_taller" value="${hs.id_taller}" readonly>
											  <input class="form-control" type="number" name ="precioTotal" value="${sumaTotal+hs.precio}" readonly>
											</div>
											<p class="text-center">
										    	<button name="Registrar"  class="btn btn-info btn-raised btn-sm"><i class="zmdi zmdi-floppy"></i> Registrar</button>
										    </p>
											
											</form>
											</c:forEach>
					</div>
				</div>
			</div>
		</div>
		</section>
</body>
</html>