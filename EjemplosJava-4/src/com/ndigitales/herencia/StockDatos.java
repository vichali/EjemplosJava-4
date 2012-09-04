package com.ndigitales.herencia;

import java.util.Scanner;

public class StockDatos {
	
	protected int codigo;
	protected int numeroParte;

	Scanner ing = new Scanner(System.in); 
	
	public void cargaDatos() {
		System.out.print("Ingrese Código del producto: ");
		codigo = ing.nextInt();
		System.out.print("Ingrese número de parte: ");
		numeroParte = ing.nextInt();
		ing.nextLine();
	}
	
}
