package com.azienda.webapp.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.azienda.webapp.model.Utente;

public class Database {
	private static Database instance;
	private List<Utente> utenti;

	private Database() {
		utenti = new ArrayList<>();
		utenti.add(new Utente(
				"donato",
				"di zenzo",
				"donato@gmail.com",
				"donato123!",
				"sdfsf345345",
				LocalDate.now()));
		utenti.add(new Utente(
				"simone",
				"crisalli",
				"cris@gmail.com",
				"alli123!",
				"dfgddg3453",
				LocalDate.now()));
	}
	
	public static Database getInstance() {
		if(instance == null) {
			instance = new Database();
		}
		return instance;
	}
	
	public void saveUtente(Utente utente) {
		//INSERT INTO...
		utenti.add(utente);
	}
	
	public List<Utente> findAllUtenti() {
		//SELECT * FROM UTENTE;
		return utenti;
	}
}
