package br.renato;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class executar_login
 */
@WebServlet("/executar_login")
public class executar_login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public executar_login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out;
		response.setContentType("text/html");
		out = response.getWriter();
		HttpSession sessao = request.getSession();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Cálculo áreas figuras geometricas </title>");
		out.println("</head>");
		out.println("<body>");
		
		if(request.getParameter("usuario").equals("renato") && request.getParameter("senha").equals("123")){
			sessao.setAttribute("usuario_logado", "true");
			sessao.setAttribute("nome_usuario", request.getParameter("usuario"));
			out.println("<h2> Bem-vindo "+request.getParameter("usuario")+"</h2>");
			out.println("<br><br>");
			out.println("<a href='index.html'>Calcular áreas</a>");
		}else {
			out.println("<p>Usuário ou senha inválidos</p>");
			out.println("<a href='login.jsp'>Tentar novamente</a>");
		}
		
		
		
		
		out.println("</body>");
		out.println("</html>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
