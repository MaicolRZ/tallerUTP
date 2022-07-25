<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hoja Trabajo</title>
<jsp:include page="headerTecnico.jsp" />
<%@ page import="pe.edu.universidad.dao.*"%>
<%@ page import="pe.edu.universidad.entidades.*"%>
<%@ page import="pe.edu.universidad.servlet.*"%>
	<%@ page import="java.util.List"%>
	<%@ page import="ServletsControladores.*"%>
</head>
<body>
<% 
int dni=Integer.parseInt(request.getParameter("dni"));
String elec=request.getParameter("id_elec");
String id_taller=request.getParameter("id_taller");
DaoCliente dao= new DaoCliente();
Cliente p=(Cliente)dao.lista(dni); 
DaoElectro dao2 = new DaoElectro();
Electro e=(Electro)dao2.lista(elec);
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
			  <h1 class="text-titles"><i class="zmdi zmdi-male-alt zmdi-hc-fw"></i>Hoja de Servicio<small></small></h1>
			</div>
			<p class="lead">Rellenar datos y respuestos del Servicio</p>
		</div>
		<div class="container-fluid">
			<div class="row">
				<div class="col-xs-12">
					<ul class="nav nav-tabs" style="margin-bottom: 15px;">
					  	<li class="active"><a href="#new" data-toggle="tab">Hoja de Servicio</a></li>
					  
					</ul>

					<div id="myTabContent" class="tab-content">
						<div class="tab-pane fade active in" id="new">
							<div class="container-fluid">
								<div class="row">
									<div class="col-xs-12 col-md-10 col-md-offset-1">
									    
											  
											</div>
									    	
											<table class="table table-striped text-center" style="width:100%" border="1">
											<tr>
											<td>
											<p class="lead">Datos Cliente</p>
											
											
											<div class="form-group label-floating">
											  <label class="control-label">Nombres Completos</label>
											  <input class="form-control" type="text" name ="a" value="<%=p.getNombre()%> <%=p.getApell_pat()%> <%=p.getApell_mat()%>" readonly>
											</div>
											<div class="form-group label-floating">
											  <label class="control-label">Direccion</label>
											  <input class="form-control" type="text" name ="a" value="<%=p.getDireccion()%>" readonly>
											</div>
											<div class="form-group label-floating">
											  <label class="control-label">Telefono</label>
											  <input class="form-control" type="text" name ="a" value="<%=p.getTelefono()%>" readonly>
											</div>
											</td>
											<td>
											<p class="lead">Datos Electrodomestico</p>
											
											<div class="form-group label-floating">
											  <label class="control-label">Electrodomestico</label>
											  <input class="form-control" type="text" name ="a" value="<%=elec%>" readonly>
											</div>
											<div class="form-group label-floating">
											  <label class="control-label">Marca</label>
											  <input class="form-control" type="text" name ="a" value="<%=e.getMarca()%>" readonly>
											</div>
											<div class="form-group label-floating">
											  <label class="control-label">Modelo</label>
											  <input class="form-control" type="text" name ="a" value="<%=e.getModelo()%>" readonly>
											</div>
											  
											  <div class="form-group label-floating">
											  <label class="control-label">N° Serie</label>
											  <input class="form-control" type="text" name ="a" value="<%=e.getNumero_Serie()%>" readonly>
											</div>
											<div class="form-group label-floating">
											  <label class="control-label">Descripcion Fallo </label>
											  <input class="form-control" type="text" name ="a" value="<%=e.getDescripcion()%>" readonly>
											</div> 
											</td>
											</tr>
											</table>
												
											
										
											
									</div>
								</div>
							</div>
						</div>
						
						
						
					  	<form method="post" action="<%=request.getContextPath() %>/SrvHojaServicio">
											
											<label class="control-label"></label>
											<input class="form-control" type="hidden" name="id_taller" value ="<%=id_taller%>" readonly>
											
											

							
								<p>Seleccionar Servicios Brindados</p>
								<div class="form-group">
										        <label class="control-label">Actividades</label>
										        <select class="form-control" name="id_actividades"required>
										          <option value="ACT_01">Diagnostico</option>
										          <option value="ACT_02">Mantenimiento Preventivo</option>
										          <option value="ACT_03">Reparacion</option>
										        </select>
										    </div>
								
							
							<div class="form-group label-floating">
											  <label class="control-label">Descripcion Servicios Brindados</label>
											  <input class="form-control" type="text" name="descripcion" required >
											</div>
											
											
											
											<input class="btn btn-info btn-raised btn-sm" type="submit" value="Registrar">
											
											
							</form>
											
					  		
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