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
 * Servlet implementation class ServletPersonne
 */
@WebServlet("/ServletMagasins")
public class ServletMagasins extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletMagasins() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProduitSOAPService service = new ProduitSOAPServiceProxy();
		Magasin[] magasins = service.getAllMagasins();
		request.setAttribute("magasins", magasins);
		
		try {
			String action = request.getParameter("action");
			if(action!=null) {
				
				if(action.equals("Ajouter")) {
					String nom = request.getParameter("nomMagasin");
					int code = Integer.parseInt(request.getParameter("codeMagasin"));
					double prix = Double.parseDouble(request.getParameter("prixDuLocal"));
					
					service.ajouterMagasin(nom, code, prix);
				
				}
				else if (action.equals("Modifier")) {
					Long id = Long.parseLong(request.getParameter("idMagasin"));
					String nom = request.getParameter("nomMagasin");
					int code = Integer.parseInt(request.getParameter("codeMagasin"));
					double prix = Double.parseDouble(request.getParameter("prixDuLocal"));
					
					service.modifierMagasin(id, nom, code, prix);
				
				}
				
			}
		} catch(Exception e) {
			request.setAttribute("exception", e.getMessage());
		}
		
		
		request.setAttribute("magasins", service.getAllMagasins());
		request.getRequestDispatcher("crudMagasin.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
