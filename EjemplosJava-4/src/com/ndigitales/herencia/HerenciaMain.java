package com.ndigitales.herencia;

public class HerenciaMain {

	public static void main(String[] args) {

        HerenciaSuma suma=new HerenciaSuma();
        suma.cargarValor1();
        suma.cargarValor2();
        suma.calculo();
 
        System.out.print("El resultado de la suma es:");
        suma.mostrarResultado();
        
        HerenciaResta resta=new HerenciaResta();
        resta.cargarValor1();
        resta.cargarValor2();
        resta.calculo();
        
        System.out.print("El resultado de la resta es:");        
        resta.mostrarResultado();
	}

}
