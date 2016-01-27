package com.dziennik.domain;

public class Przedmiot {

	private int id=0;
	private String nazwa ="";
	private int godz;
	
	public Przedmiot(){
		super();
	}
	
	public Przedmiot(String nazwa, int godz){
		this.nazwa=nazwa;
		this.godz=godz;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public int getGodz() {
		return godz;
	}

	public void setGodz(int godz) {
		this.godz = godz;
	}
	
}
