package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ClientServlet
 */
import beans.ClientBean;
@WebServlet("/ClientServlet")
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nom = request.getParameter("Nom");
		String prenom = request.getParameter("Prenom");
		String adresseL = request.getParameter("AdresseL");
		int numT = Integer.parseInt(request.getParameter("NumT"));
		String email = request.getParameter("Email");
		
		ClientBean client = new ClientBean();
		
		client.setNom(nom);
		client.setPrenom(prenom);
		client.setAdresseL(adresseL);
		client.setNumT(numT);
		client.setEmail(email);
		
		HttpSession session = request.getSession();

		session.setAttribute("client",client);
		RequestDispatcher dispInf = request.getRequestDispatcher("client.jsp");
		dispInf.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
