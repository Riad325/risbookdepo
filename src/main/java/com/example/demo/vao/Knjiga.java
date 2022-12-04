package com.example.demo.vao;

import java.util.Vector;

public class Knjiga {
	private String _naslov;
	private String _avtor;
	private String _zalozba;
	private int _letoIzdaje;
	private int _iSBN;
	private boolean _status;
	private Zvrst _zvrst;
	public Zvrst _unnamed_Zvrst_;
	public Administrator _unnamed_Administrator_;
	public Vector<Uporabnik> _unnamed_Uporabnik_ = new Vector<Uporabnik>();
	public Vector<NakupKnjige> _unnamed_NakupKnjige_ = new Vector<NakupKnjige>();

	public void setNaslov(String aNaslov) {
		this._naslov = aNaslov;
	}

	public String getNaslov() {
		return this._naslov;
	}

	public void setAvtor(String aAvtor) {
		this._avtor = aAvtor;
	}

	public String getAvtor() {
		return this._avtor;
	}

	public void setZalozba(String aZalozba) {
		this._zalozba = aZalozba;
	}

	public String getZalozba() {
		return this._zalozba;
	}

	public void setLetoIzdaje(int aLetoIzdaje) {
		this._letoIzdaje = aLetoIzdaje;
	}

	public int getLetoIzdaje() {
		return this._letoIzdaje;
	}

	public void setISBN(int aISBN) {
		this._iSBN = aISBN;
	}

	public int getISBN() {
		return this._iSBN;
	}

	public void setStatus(boolean aStatus) {
		this._status = aStatus;
	}

	public boolean isStatus() {
		return this._status;
	}

	public void setZvrst(Zvrst aZvrst) {
		this._zvrst = aZvrst;
	}

	public Zvrst getZvrst() {
		return this._zvrst;
	}
}