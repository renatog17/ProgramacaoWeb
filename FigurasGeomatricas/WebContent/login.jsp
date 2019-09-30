<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="javax.servlet.http.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	HttpSession sessao = request.getSession();
	if(sessao.getAttribute("usuario_logado")==null){
		sessao.setAttribute("usuario_logado", "false");
	}
	
	if(sessao.isNew() || sessao.getAttribute("usuario_logado").equals("false")){
		out.println("<form action='executar_login' method='post' >");
		out.println("Usuário <input name='usuario' type='text' ><br>");
		out.println("Senha <input name='senha' type='password'><br>");
		out.println("<input type='submit' value='Entrar'>");
		out.println("</form>");
	}else{
		out.println("<h2>Olá "+sessao.getAttribute("nome_usuario")+"!</h2>");
	}
	%>
</body>
</html>