package com.infotel.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infotel.wsSoap.Magasin;
import com.infotel.wsSoap.ProduitNonPerissable;
import com.infotel.wsSoap.ProduitSOAPService;
import com.infotel.wsSoap.ProduitSOAPServiceProxy;

/**
 * Servlet implementation class ServletProduitsNonPerissablesMagasins
 */
@WebServlet("/ServletProduitsNonPerissablesMagasins")
public class ServletProduitsNonPerissablesMagasins extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletProduitsNonPerissablesMagasins() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProduitSOAPService service = new ProduitSOAPServiceProxy();
		ProduitNonPerissable[] produits = service.getAllProduitsNP();
		request.setAttribute("produits", produits);
		Magasin[] magasins = service.getAllMagasins();
		request.setAttribute("magasins", magasins);
		
		
		
		String action = request.getParameter("action");
			
		if(action!=null) {
				
				if(action.equals("Ajouter")) {

					
					String nom = request.getParameter("nomProduit");
					int stock = Integer.parseInt(request.getParameter("stock"));
					double prix = Double.parseDouble(request.getParameter("prix"));
					String mode = request.getParameter("modeDemploi");
					Long idMagasin = Long.parseLong(request.getParameter("idMagasin"));

					service.ajouterProduitNonPerissableMagasin(nom, stock, prix, mode, idMagasin);
				}
		}
		
		request.setAttribute("magasins", service.getAllMagasins());
		request.setAttribute("produits", service.getAllProduitsNP());
		request.getRequestDispatcher("ajouterProduitNPMagasin.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
