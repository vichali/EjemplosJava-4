package com.ndigitales.herencia;

public class StockDeposito extends StockDatos {

	public void deposito() {
		
		cargaDatos();
		System.out.println("Depósito: ");
		String depo = ing.nextLine();
	}
}
