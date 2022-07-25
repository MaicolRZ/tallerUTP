<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="es">
<head>
	<title>LogIn</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
	<link rel="stylesheet" href="./css/main.css">

</head>
<%
	String rspt="";
	if (request.getParameter("rspt")!=null){
		String r=request.getParameter("rspt");
	if(r.equals("0")){
		rspt="Error: Credenciales Incorrectas";
	}
	}
	
%>
<body class="cover" style="background-image: url(./assets/img/fondo.jpg);">
	
	<h2>BIENVENIDOS A TALLER UTP</h2>

	<form action="<%=request.getContextPath() %>/ServletSesion" method="post" autocomplete="off" class="full-box logInForm">
		<p class="text-center text-muted"><i class="zmdi zmdi-account-circle zmdi-hc-5x"></i></p>
		<p class="text-center text-muted text-uppercase">Inicia sesión con tu cuenta</p>
		<div class="form-group label-floating">
		
		  <label class="control-label" for="UserEmail">E-mail</label>
		  <input style="color:white; " class="form-control" name="correo" type="text" required>
		  <p class="help-block">Escribe tú E-mail</p>
		</div>
		<div class="form-group label-floating">
		  <label class="control-label" for="UserPass">Contraseña</label>
		  <input style="color:white; " class="form-control" name="clave" type="password"required>
		  <p class="help-block">Escribe tú contraseña</p>
		</div>
		<div class="form-group text-center">
			<input type="submit" value="Iniciar sesión" class="btn btn-raised btn-danger">
		</div>
		<div class="form-group label-floating">
		  <p style="color: red;"><%=rspt %></p>
		 
		 
		</div>
		
</form>
		
		<div class="form-group text-center">
		<p class="text-center text-muted text-uppercase">No tienes cuenta? Registrate</p>
		<input  value="Registrarme" class="btn btn-raised btn-danger">
		</div>
	
	<!--====== Scripts -->
	<script src="./js/jquery-3.1.1.min.js"></script>
	<script src="./js/bootstrap.min.js"></script>
	<script src="./js/material.min.js"></script>
	<script src="./js/ripples.min.js"></script>
	<script src="./js/sweetalert2.min.js"></script>
	<script src="./js/jquery.mCustomScrollbar.concat.min.js"></script>
	<script src="./js/main.js"></script>
	<script>
		$.material.init();
	</script>
</body>

</html>