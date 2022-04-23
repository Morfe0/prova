package com.azienda.webapp.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.azienda.webapp.dao.Database;
import com.azienda.webapp.model.Utente;


@WebServlet("/VisualizzaListaUtenti")
public class VisualizzaListaUtenti extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Utente> utentiDB = Database.getInstance().findAllUtenti();
		
		for(Utente utente: utentiDB) {
			System.out.println("ID: "+utente.getId());
			System.out.println("USERNAME: "+utente.getUsername());
			System.out.println();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
