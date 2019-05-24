package com.infotel.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infotel.wsSoap.Magasin;
import com.infotel.wsSoap.ProduitSOAPService;
import com.infotel.wsSoap.ProduitSOAPServiceProxy;

/**
 * Servlet implementation class ServletMag
 */
@WebServlet("/ModifierMag")
public class ModifierMag extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ModifierMag() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProduitSOAPService service = new ProduitSOAPServiceProxy();
		Magasin[] magasins = service.getAllMagasins();
		request.setAttribute("magasins", magasins);

		Long id = Long.parseLong(request.getParameter("idMagasin"));
		Magasin m = service.getMagasin(id);

		request.setAttribute("idMagasin", m.getIdMagasin());
		request.setAttribute("nomMagasin", m.getNomMagasin());
		request.setAttribute("prixDuLocal", m.getPrixDuLocal());
		request.setAttribute("codeMagasin", m.getCodeMagasin());

		request.setAttribute("magasins", service.getAllMagasins());
		request.getRequestDispatcher("crudMagasin.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
