package com.poo.javainterface;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.print("inserire la lungherzza: ");
		double lung = sc.nextDouble();
		System.out.print("Inserire la larghezza: ");
		double larg = sc.nextDouble();
		System.out.print("Inserire l'altezza: ");
		double h = sc.nextDouble();
		
		
		System.out.println("CALCOLO DEL PERIMETRO E L'AREA DEL PARALLELOGRAMMA");
		Parallelogramma pg = new Parallelogramma(lung,larg,h);
		System.out.println("PERIMETRO: "+pg.calcolaPerimetro());
		System.out.println("AREA: "+pg.calcolaArea());
		
		System.out.println("CALCOLO DEL PERIMETRO E L'AREA DEL QUADRATO");
		Quadrato q = new Quadrato(lung);
		System.out.println("PERIMETRO: "+pg.calcolaPerimetro());
		System.out.println("AREA: "+pg.calcolaArea());
		
		
		
		sc.close();
	}

}
