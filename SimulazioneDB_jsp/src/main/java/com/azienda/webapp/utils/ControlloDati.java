package com.azienda.webapp.utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import com.azienda.webapp.dao.Database;
import com.azienda.webapp.model.Utente;

public class ControlloDati {
	
	public static Boolean checkValidName(String s){
		return s.matches("^[a-zA-Z\\s]+$")&&s!=null;
	}
	public static Boolean checkUsername(String s) {
		return s.matches("^[a-zA-Z\\s]+$")&&s!=null;
		
	}
	public static Boolean checkPassword(String s) {
		return s.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!]).{6,20})")&&s!=null;
	}
	public static Boolean checkAge(LocalDate d) {
		if(d!=null) {
		LocalDate today=LocalDate.now();
		return Period.between(d,today).getYears()>=18;
		}
		return false;
	}
	public static Boolean checkCodiceFiscale(String s) {
		return s.matches("^[A-Z]{6}[0-9]{2}[A-Z][0-9]{2}[A-Z][0-9]{3}[A-Z]$")&&s!=null;
		
	}
	
	public static Boolean checkLoginUsername(String username) {
		List<Utente> utentiDB = Database.getInstance().findAllUtenti();
		Boolean usernameOK;
		for(Utente utente: utentiDB) {
			if(username.equals(utente.getUsername())) {
				usernameOK=true;
				return usernameOK;
			}
		}
		return false;
		
	}
	public static Boolean checkLoginPassword(String pw) {
		List<Utente> utentiDB = Database.getInstance().findAllUtenti();
		Boolean pwOK;
		for(Utente utente: utentiDB) {
			if(pw.equals(utente.getPassword())) {
				pwOK=true;
				return pwOK;
			}
		}
		return false;
		
	}
	
}
