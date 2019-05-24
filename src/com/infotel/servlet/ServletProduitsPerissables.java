package com.infotel.servlet;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infotel.wsSoap.Produit;
import com.infotel.wsSoap.ProduitSOAPService;
import com.infotel.wsSoap.ProduitSOAPServiceProxy;

/**
 * Servlet implementation class ServletPersonne
 */
@WebServlet("/ServletProduitPerissable")
public class ServletProduitsPerissables extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletProduitsPerissables() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ProduitSOAPService service = new ProduitSOAPServiceProxy();
		Produit[] produits = service.getAllProduits();
		request.setAttribute("produits", produits);
		
//		try {
//			String action = request.getParameter("action");
//			if(action!=null) {
//				
//				if(action.equals("Ajouter")) {
//					String nom = request.getParameter("nomProduit");
//					int stock = Integer.parseInt(request.getParameter("stock"));
//					double prix = Double.parseDouble(request.getParameter("prix"));
//					Calendar date = new Calendar();
//					
//					service.ajouterProdPerissable(nom, stock, prix, date);;
//				
//				}
//				else if (action.equals("Modifier")) {
//					Long id = Long.parseLong(request.getParameter("idProduit"));
//					String nom = request.getParameter("nomProduit");
//					int stock = Integer.parseInt(request.getParameter("stock"));
//					double prix = Double.parseDouble(request.getParameter("prix"));
//					Date date = new Date();
//					
//					service.modifierProdPerissable(id, nom, stock, prix, date);
//				
//				}
//				else if (action.equals("ModifierProd")) {
//		
//				}
//					
//				else if (action.equals("SupprimerProd")) {
//		
//				}
//			}
//		} catch(Exception e) {
//			request.setAttribute("exception", e.getMessage());
//		}
		
		
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
