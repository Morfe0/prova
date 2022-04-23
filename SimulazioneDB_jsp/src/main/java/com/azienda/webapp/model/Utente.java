package com.azienda.webapp.model;

import java.time.LocalDate;

public class Utente {
	private int id;
	private String nome;
	private String cognome;
	private String username;
	private String password;
	private String cf;
	private LocalDate dataNascita;
	
	//per simulare il db mysql(auto_increment)
	private static int idAuto = 0;
	
	public Utente(String nome, String cognome, String username, String password, String cf, LocalDate dataNascita) {
		this(++idAuto, nome, cognome, username, password, cf, dataNascita);
	}

	public Utente(int id, String nome, String cognome, String username, String password, String cf,
			LocalDate dataNascita) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
		this.password = password;
		this.cf = cf;
		this.dataNascita = dataNascita;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}
}
