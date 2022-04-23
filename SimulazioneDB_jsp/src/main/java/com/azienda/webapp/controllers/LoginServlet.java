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
import com.azienda.webapp.utils.ControlloDati;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/jsp/Login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(ControlloDati.checkLoginUsername(username)&&ControlloDati.checkLoginPassword(password)) {
			request.getRequestDispatcher("WEB-INF/jsp/Benvenuto.jsp").forward(request, response);
		}else {
			request.setAttribute("errore", true);
			this.doGet(request,response);
		}
	}

}
