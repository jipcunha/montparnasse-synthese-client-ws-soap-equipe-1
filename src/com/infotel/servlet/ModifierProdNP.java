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
import com.infotel.wsSoap.ProduitSOAPService;
import com.infotel.wsSoap.ProduitSOAPServiceProxy;

/**
 * Servlet implementation class ServletMag
 */
@WebServlet("/ModifierProdNP")
public class ModifierProdNP extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ModifierProdNP() {
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
		ProduitNonPerissable[] produits = service.getAllProduitsNP();
		request.setAttribute("produits", produits);
		Magasin[] magasins = service.getAllMagasins();
		request.setAttribute("magasins", magasins);
		
	
		Long idProduit = Long.parseLong(request.getParameter("idProduit"));
		ProduitNonPerissable pnp = service.getProduitNP(idProduit);
			
		if (request.getParameter("idProduit") != null) {
		request.setAttribute("idProduit", pnp.getIdProduit());
		request.setAttribute("nomProduit", pnp.getNomProduit());
		request.setAttribute("stock", pnp.getStock());
		request.setAttribute("prix", pnp.getPrix());
		request.setAttribute("modeDemploi", pnp.getModeDemploi());
		request.setAttribute("idMagasin", pnp.getMagasin());

		}
		
		request.setAttribute("produits", service.getAllProduitsNP());
		request.setAttribute("magasins", service.getAllMagasins());
		request.getRequestDispatcher("crudProdNonPerissable.jsp").forward(request, response);
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
