package com.infotel.servlet;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

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
@WebServlet("/ServletCalcul")
public class ServletCalcul extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCalcul() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ProduitSOAPService service = new ProduitSOAPServiceProxy();
		Magasin[] magasins = service.getAllMagasins();
		request.setAttribute("magasins", magasins);
		
		request.getRequestDispatcher("methodeCalcul.jsp").forward(request, response);
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
