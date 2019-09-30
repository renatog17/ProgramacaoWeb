<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Parametros para c�lculo da �rea</title>
</head>
<body>
	<%
		String strTituloFormulario, strFormulario;
		
		int figuraGeometrica = (Integer) request.getAttribute("Tipo");
		strTituloFormulario = "ERRO";
		strFormulario = "<form name='formCalculoAreasFiguras'>";
		
		if(figuraGeometrica==1){
			strTituloFormulario = "C�lculo da �rea de um ret�ngulo";
			strFormulario = "<form name='formCalculoAreasFiguras' method='get' action='areaRetangulo'>";
		}else{
			if(figuraGeometrica==2){
				strTituloFormulario = "C�lculo da �rea de um tri�ngulo ret�ngulo";
				strFormulario = "<form name='formCalculoAreasFiguras' method='get' action='areaTrianguloRetangulo'>";
			}else{
				if(figuraGeometrica==3){
					strTituloFormulario = "C�lculo da �rea de um c�rculo";
					strFormulario = "<form name='formCalculoAreasFiguras' method='get' action='areaCircunferencia'>";
				}
			}
		}
		out.println(strFormulario);
		out.println(strTituloFormulario);
		
		if(figuraGeometrica==1 || figuraGeometrica==2){
			out.println("<p>Altura:");
			out.println("<input name='altura'/>");
			out.println("</p>");
			
			out.println("<p>Largura:");
			out.println("<input name='largura'/>");
			out.println("</p>");
		}else{
			if(figuraGeometrica==3){
				out.println("<p>Raio:");
				out.println("<input name='raio'/>");
				out.println("</p>");
			}else{
				out.println("<p>Deve ser informado o tipo da figura!</p");
			}
		}
		
	%>
	
	<p>
		<input type="submit" name="btnCalcular" value="Calcular" />
	</p>
	
</body>
</html>