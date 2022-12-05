package com.example.demo.vao;

import java.util.ArrayList;
import java.util.List;

public class Uporabnik {
	private String ime;
	private String priimek;
	private String email;
	private String uporabniskoIme;
	private String geslo;
	private List<Knjiga> knjiznaPolica;
	private List<Knjiga> seznamZelja;
	public ArrayList<NakupKnjige> unnamed_NakupKnjige_ = new ArrayList<NakupKnjige>();
	public ArrayList<Knjiga> unnamed_Knjiga_ = new ArrayList<Knjiga>();

	public void izposodiKnjigo(Knjiga knjiga) {
		throw new UnsupportedOperationException();
	}

	public void vrniKnjigo(Knjiga knjiga) {
		throw new UnsupportedOperationException();
	}

	public void kupiKnjigo(Knjiga knjiga) {
		throw new UnsupportedOperationException();
	}

	public void dodajKnjigoNaSeznamZelja(Knjiga knjiga) {
		throw new UnsupportedOperationException();
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getIme() {
		return this.ime;
	}

	public void setPriimek(String priimek) {
		this.priimek = priimek;
	}

	public String getPriimek() {
		return this.priimek;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return this.email;
	}

	public void setUporabniskoIme(String uporabniskoIme) {
		this.uporabniskoIme = uporabniskoIme;
	}

	public String getUporabniskoIme() {
		return this.uporabniskoIme;
	}

	public void setGeslo(String geslo) {
		this.geslo = geslo;
	}

	public String getGeslo() {
		return this.geslo;
	}

	public void setKnjiznaPolica(List<Knjiga> knjiznaPolica) {
		this.knjiznaPolica = knjiznaPolica;
	}

	public List<Knjiga> getKnjiznaPolica() {
		return this.knjiznaPolica;
	}

	public void setSeznamZelja(List<Knjiga> seznamZelja) {
		this.seznamZelja = seznamZelja;
	}

	public List<Knjiga> getSeznamZelja() {
		return this.seznamZelja;
	}
}