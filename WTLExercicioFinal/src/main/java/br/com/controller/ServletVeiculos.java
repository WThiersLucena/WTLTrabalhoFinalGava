package br.com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dao.VeiculosDAO;

/**
 * Servlet implementation class Veiculos
 */
@WebServlet("/Veiculos")
public class ServletVeiculos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	private VeiculosDAO veic;	
    public ServletVeiculos() {
        super();
        this.veic = new VeiculosDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		
		selectAllCliente(request,response);
	}
		
		private void selectAllCliente(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

		private void selectAllVeiculos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("listVeiculos", this.veic.mostrarVeiculo());
		request.getRequestDispatcher("veiculos.jsp").forward(request, response);
	}


}
