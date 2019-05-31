package com.infotel.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infotel.wsSoap.Magasin;
import com.infotel.wsSoap.Produit;
import com.infotel.wsSoap.ProduitNonPerissable;
import com.infotel.wsSoap.ProduitPerissable;
import com.infotel.wsSoap.ProduitSOAPService;
import com.infotel.wsSoap.ProduitSOAPServiceProxy;

/**
 * Servlet implementation class ServletMag
 */
@WebServlet("/ModifierProdP")
public class ModifierProdP extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ModifierProdP() {
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
		ProduitPerissable[] produits = service.getAllProduitsP();
		request.setAttribute("produits", produits);
		Magasin[] magasins = service.getAllMagasins();
		request.setAttribute("magasins", magasins);
	
		Long idProduit = Long.parseLong(request.getParameter("idProduit"));
		ProduitPerissable p = service.getProduitP(idProduit);

		request.setAttribute("idProduit", p.getIdProduit());
		request.setAttribute("nomProduit", p.getNomProduit());
		request.setAttribute("stock", p.getStock());
		request.setAttribute("prix", p.getPrix());

		request.setAttribute("produits", service.getAllProduitsP());
		request.setAttribute("magasins", service.getAllMagasins());
		request.getRequestDispatcher("crudProdPerissable.jsp").forward(request, response);
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
