package com.infotel.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infotel.wsSoap.Magasin;
import com.infotel.wsSoap.Produit;
import com.infotel.wsSoap.ProduitPerissable;
import com.infotel.wsSoap.ProduitSOAPService;
import com.infotel.wsSoap.ProduitSOAPServiceProxy;

/**
 * Servlet implementation class SupprimerProd
 */
@WebServlet("/SupprimerProd")
public class SupprimerProdP extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SupprimerProdP() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProduitSOAPService service = new ProduitSOAPServiceProxy();
		ProduitPerissable[] produits = service.getAllProduitsP();
		request.setAttribute("produits", produits);

		
		Long idProduit = Long.parseLong(request.getParameter("idProduit"));
		
		service.supprimerProduit(idProduit);
		
		request.setAttribute("produits", service.getAllProduitsP());
		request.getRequestDispatcher("crudProdPerissable.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
