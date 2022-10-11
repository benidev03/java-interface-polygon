package com.poo.javainterface;

public class Quadrato implements Poligono{
	
	
	private double lato;
	

	public Quadrato(double lato) {
		
		this.lato = lato;
		
	}

	@Override
	public double calcolaPerimetro() {
		
		return lato * 4;
	}

	@Override
	public double calcolaArea() {
		
		return lato * lato;
	}

}
