package com.ndigitales.herencia;

public class StockDeposito extends StockDatos {

	public void deposito() {
		
		cargaDatos();
		System.out.println("Dep�sito: ");
		String depo = ing.nextLine();
	}
}
