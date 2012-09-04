package com.ndigitales.herencia;

public class StockExistencia extends StockDeposito {
	
	public void existencia() {
		
		deposito();
		
		System.out.println("Ingresar Existencia: ");
		int stockTotal = ing.nextInt();
		
	}

}
