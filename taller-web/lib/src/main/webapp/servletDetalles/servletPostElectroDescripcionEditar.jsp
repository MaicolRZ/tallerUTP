<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>

	

<%@ include file="headerTecnico.jsp" %>
<meta charset="ISO-8859-1">

<title>Insertar Descripcion Ingreso al Taller</title>
</head>
<body>
<%String id_electro=request.getParameter("id_electro");

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
			  <h1 class="text-titles"><i class="zmdi zmdi-male-alt zmdi-hc-fw"></i>Descripcion Electrodomestico<small>Estado</small></h1>
			</div>
			<p class="lead">Estado del electrodomestico</p>
		</div>
		<div class="container-fluid">
			<div class="row">
				<div class="col-xs-12">
					<ul class="nav nav-tabs" style="margin-bottom: 15px;">
					  	<li class="active"><a href="#new" data-toggle="tab">Estado</a></li>
					  	
					</ul>

					<div id="myTabContent" class="tab-content">
						<div class="tab-pane fade active in" id="new">
							<div class="container-fluid">
								<div class="row">
									<div class="col-xs-12 col-md-10 col-md-offset-1">
									    <form action="<%=request.getContextPath() %>/ServletPostElectroDescripcionEditar" method="post">
									   		<div class="form-group label-floating">
											  <label class="control-label">Id Electrodomestico</label>
											  <input class="form-control" type="text" name ="id_elec" value="<%=id_electro%>"required readonly>
											</div>
									   	 	<div class="form-group label-floating">
											  <label class="control-label">Descripcion Pieza falla</label>
											  <input class="form-control" type="text" name ="descripcion" required>
											</div>
											<div class="form-group">
											<label class="control-label">Tecnico</label>
												<select class="form-control" name="id_tecnico">
												<c:forEach items="${applicationScope.lstUsuarios}" var="usu">
												<option value="${usu.id}">${usu.nombre} ${usu.apell_pat} ${usu.apell_mat}</option>

												</c:forEach>
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
						
						
						
			
						
					</div>
				</div>
			</div>
		</div>
		</section>
</body>
</html>