package com.azienda.webapp.controllers;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.azienda.webapp.dao.Database;
import com.azienda.webapp.utils.ControlloDati;
import com.azienda.webapp.model.Utente;


@WebServlet("/Registrazione")
public class RegistrazioneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/jsp/Registrazione.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String nome = request.getParameter("nome");
		//String cognome = request.getParameter("nome");
		
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		LocalDate dataN=LocalDate.now();
		if(!request.getParameter("dataNascita").isBlank()) {
		dataN = LocalDate.parse(request.getParameter("dataNascita"));
		}
		String cF = request.getParameter("codiceFiscale");
		String registrazione;
		Boolean controllo;
		
		controllo=ControlloDati.checkValidName(nome)&&ControlloDati.checkValidName(cognome)&&ControlloDati.checkUsername(username)
				&&ControlloDati.checkPassword(password)&&ControlloDati.checkAge(dataN)&&ControlloDati.checkCodiceFiscale(cF);
		
		if(controllo) {
			Utente utente = new Utente(nome,cognome,username,password,cF,dataN);
			Database.getInstance().saveUtente(utente);
			registrazione = "Ti sei correttamente registrato";
			request.setAttribute("controllo", controllo);
			request.setAttribute("registrazione", registrazione);
			
			request.getRequestDispatcher("WEB-INF/jsp/Registrazione.jsp").forward(request, response);
			//response.sendRedirect("VisualizzaListaUtenti");
		}else {
			registrazione = "Errore nella registrazione";
			request.setAttribute("controllo", controllo);
			request.setAttribute("registrazione", registrazione);
			request.getRequestDispatcher("WEB-INF/jsp/Registrazione.jsp").forward(request, response);	
		}
		
		
		
		
	}

}
