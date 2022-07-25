<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="<%=request.getContextPath() %>/ServletPostElectroNuevo" method="post">
	<table>
	<tr>
	<td>Dni:</td><td> <input type="text" name="dni"> </td>
	</tr>
	<tr>
	<td>Electrodomestico: </td><td> <input type="text" name="tipo_electrodomestico"> </td>
	</tr>
	<tr>
	<td>Marca: </td><td> <input type="text" name="marca"> </td>
	</tr>
	<tr>
	<td>Modelo: </td><td> <input type="text" name="modelo"> </td>
	</tr>
	<tr>
	<td>Numero Serie: </td><td> <input type="text" name="numero_Serie"> </td>
	</tr>
	<tr>
	<td>Descripcion: </td><td> <input type="text" name="descripcion"> </td>
	</tr>
	</table>
</form>	
</body>
</html>