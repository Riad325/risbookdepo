package com.example.demo.vao;

import java.util.List;
import java.util.Vector;

public class Uporabnik {
	private String _ime;
	private String _priimek;
	private String _email;
	private String _uporabniskoIme;
	private String _geslo;
	private List<Knjiga> _knjiznaPolica;
	private List<Knjiga> _seznamZelja;
	public Vector<NakupKnjige> _unnamed_NakupKnjige_ = new Vector<NakupKnjige>();
	public Vector<Knjiga> _unnamed_Knjiga_ = new Vector<Knjiga>();

	public void izposodiKnjigo(Knjiga aKnjiga) {
		throw new UnsupportedOperationException();
	}

	public void vrniKnjigo(Knjiga aKnjiga) {
		throw new UnsupportedOperationException();
	}

	public void kupiKnjigo(Knjiga aKnjiga) {
		throw new UnsupportedOperationException();
	}

	public void dodajKnjigoNaSeznamZelja(Knjiga aKnjiga) {
		throw new UnsupportedOperationException();
	}

	public void setIme(String aIme) {
		this._ime = aIme;
	}

	public String getIme() {
		return this._ime;
	}

	public void setPriimek(String aPriimek) {
		this._priimek = aPriimek;
	}

	public String getPriimek() {
		return this._priimek;
	}

	public void setEmail(String aEmail) {
		this._email = aEmail;
	}

	public String getEmail() {
		return this._email;
	}

	public void setUporabniskoIme(String aUporabniskoIme) {
		this._uporabniskoIme = aUporabniskoIme;
	}

	public String getUporabniskoIme() {
		return this._uporabniskoIme;
	}

	public void setGeslo(String aGeslo) {
		this._geslo = aGeslo;
	}

	public String getGeslo() {
		return this._geslo;
	}

	public void setKnjiznaPolica(List<Knjiga> aKnjiznaPolica) {
		this._knjiznaPolica = aKnjiznaPolica;
	}

	public List<Knjiga> getKnjiznaPolica() {
		return this._knjiznaPolica;
	}

	public void setSeznamZelja(List<Knjiga> aSeznamZelja) {
		this._seznamZelja = aSeznamZelja;
	}

	public List<Knjiga> getSeznamZelja() {
		return this._seznamZelja;
	}
}