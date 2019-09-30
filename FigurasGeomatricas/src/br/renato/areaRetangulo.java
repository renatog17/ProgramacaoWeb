package br.renato;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class areaRetangulo
 */
@WebServlet("/areaRetangulo")
public class areaRetangulo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public areaRetangulo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String strURL;
		int altura;
		int largura;
		int area=1;
		if(request.getParameter("altura")!=null &&request.getParameter("largura")!=null) {
			altura = Integer.parseInt(request.getParameter("altura"));
			largura = Integer.parseInt(request.getParameter("largura"));
			area = altura*largura; 
		}
		
		strURL = "/resultado_area.jsp?TipoFigura=1&ValorArea="+area;
		RequestDispatcher Despachante = getServletContext().getRequestDispatcher(strURL);
		Despachante.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
