package com.example.demo.vao;
import java.util.ArrayList;

public class Knjiga {
	private String naslov;
	private String avtor;
	private String zalozba;
	private int letoIzdaje;
	private int ISBN;
	private boolean status;
	private Zvrst zvrst;
	public Zvrst unnamed_Zvrst_;
	public Administrator unnamed_Administrator_;
	public ArrayList<Uporabnik> unnamed_Uporabnik_ = new ArrayList<Uporabnik>();
	public ArrayList<NakupKnjige> unnamed_NakupKnjige_ = new ArrayList<NakupKnjige>();

	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}

	public String getNaslov() {
		return this.naslov;
	}

	public void setAvtor(String avtor) {
		this.avtor = avtor;
	}

	public String getAvtor() {
		return this.avtor;
	}

	public void setZalozba(String zalozba) {
		this.zalozba = zalozba;
	}

	public String getZalozba() {
		return this.zalozba;
	}

	public void setLetoIzdaje(int letoIzdaje) {
		this.letoIzdaje = letoIzdaje;
	}

	public int getLetoIzdaje() {
		return this.letoIzdaje;
	}

	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}

	public int getISBN() {
		return this.ISBN;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean isStatus() {
		return this.status;
	}

	public void setZvrst(Zvrst zvrst) {
		this.zvrst = zvrst;
	}

	public Zvrst getZvrst() {
		return this.zvrst;
	}
}