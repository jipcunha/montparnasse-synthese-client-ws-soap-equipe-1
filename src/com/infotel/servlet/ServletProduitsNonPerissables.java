package com.infotel.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infotel.wsSoap.Magasin;
import com.infotel.wsSoap.Produit;
import com.infotel.wsSoap.ProduitSOAPService;
import com.infotel.wsSoap.ProduitSOAPServiceProxy;

/**
 * Servlet implementation class ServletPersonne
 */
@WebServlet("/ServletProduitNonPerissable")
public class ServletProduitsNonPerissables extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletProduitsNonPerissables() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProduitSOAPService service = new ProduitSOAPServiceProxy();
		Produit[] produits = service.getAllProduits();
		request.setAttribute("produits", produits);
		
		try {
			String action = request.getParameter("action");
			if(action!=null) {
				
				if(action.equals("Ajouter")) {
					String nom = request.getParameter("nomProduit");
					int stock = Integer.parseInt(request.getParameter("stock"));
					double prix = Double.parseDouble(request.getParameter("prix"));
					String mode = request.getParameter("modeDemploi");
					
					service.ajouterProdNonPerissable(nom, stock, prix, mode);
				
				}
				else if (action.equals("Modifier")) {
					Long id = Long.parseLong(request.getParameter("idProduit"));
					String nom = request.getParameter("nomProduit");
					int stock = Integer.parseInt(request.getParameter("stock"));
					double prix = Double.parseDouble(request.getParameter("prix"));
					String mode = request.getParameter("modeDemploi");
					Long idMagasin = Long.parseLong(request.getParameter("idMagasin"));

					service.modifierProdNonPerissable(id, nom, stock, prix, mode, idMagasin);
				
				}
				else if (action.equals("ModifierProd")) {
		
				}
					
				else if (action.equals("SupprimerProd")) {
		
				}
			}
		} catch(Exception e) {
			request.setAttribute("exception", e.getMessage());
		}
		
		
		request.getRequestDispatcher("crudProdNonPerissable.jsp").forward(request, response);
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
