package com.poo.javainterface;

public class Parallelogramma implements Poligono{
	
	
	private double lung, larg, h;

	public Parallelogramma(double lung, double larg, double h) {
		
		this.lung = lung;
		this.larg = larg;
		this.h = h;
	}

	@Override
	public double calcolaPerimetro() {
		
		return (lung * larg) * 2;
	}

	@Override
	public double calcolaArea() {
		
		return lung * h;
	}

}
