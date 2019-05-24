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
@WebServlet("/ServletPersonne")
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
		
//		try {
//			String action = request.getParameter("action");
//			if(action!=null) {
//				if(action.equals("Consulter")) {
//					Long code = Long.parseLong(request.getParameter("code"));
//					request.setAttribute("code", code);
//					Compte cp = service.consulterCompte(code);
//					request.setAttribute("compte", cp);
//				}
//				else if (action.equals("Tous les comptes")) {
//					request.setAttribute("comptes", service.consulterComptes());
//				}
//				else if (action.equals("Verser")||action.equals("Retirer")) {
//					
//					double montant = Double.parseDouble(request.getParameter("montant"));
//					Long code = Long.parseLong(request.getParameter("code"));
//					
//					request.setAttribute("montant",  montant);
//					request.setAttribute("code",  code);
//					if(action.equals("Verser")) {
//						service.verser(code, montant);
//					}
//					else {
//						service.retirer(code, montant);
//					}
//					request.setAttribute("compte", service.consulterCompte(code));
//				}
//			}
//		} catch(Exception e) {
//			request.setAttribute("exception", e.getMessage());
//		}
		
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
