<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String mensagem = "Erro";
	int tipoFigura = Integer.parseInt(request.getParameter("TipoFigura"));
	int area = Integer.parseInt(request.getParameter("ValorArea"));
	
	if(tipoFigura==1){
		mensagem = "Valor da �rea ret�ngulo �: "+area;
	}else{
		if(tipoFigura==2){
			mensagem = "Valor da �rea trin�gulo ret�ngulo �: "+area;
		}else{
			if(tipoFigura==3){
				mensagem = "Valor da �rea circunfer�ncia �: "+area;
			}
		}
	}


%>
<h2>
<%= mensagem %>
</h2>
</body>
</html>