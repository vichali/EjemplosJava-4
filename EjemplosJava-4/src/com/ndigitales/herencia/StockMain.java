package com.ndigitales.herencia;
import java.util.Scanner;

public class StockMain {

	public static void main(String[] args) {
		
		StockDatos sdata = new StockDatos();
		StockDeposito sdepo = new StockDeposito();
		StockExistencia sexis = new StockExistencia();
		
		System.out.println("Stock");
		System.out.println("------------------------");
		
		System.out.println("1- Carga Datos");
		System.out.println("2- Carga Datos y deposito");
		System.out.println("3- Carga Datos y existencia");
		
		Scanner ingreso = new Scanner(System.in);
		int opc = ingreso.nextInt();
		
		switch (opc) {
		case 1:
			sdata.cargaDatos();
			break;
		case 2:
			sdepo.deposito();
			break;
		case 3:
			sexis.existencia();
			break;
		}

	}

}
