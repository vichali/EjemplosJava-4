package com.ndigitales.herencia;
import java.util.Scanner;

public class HerenciaCalculos {

	    protected Scanner teclado;
	    protected int valor1;
	    protected int valor2;
	    protected int resultado;

	    public HerenciaCalculos() {
	    	teclado=new Scanner(System.in);
	    }
	    
	    public void cargarValor1() {
	        System.out.print("Ingrese el primer valor:");
	        valor1=teclado.nextInt();        
	    }
	    
	    public void cargarValor2() {
	        System.out.print("Ingrese el segundo valor:");
	        valor2=teclado.nextInt();
	    }
	    
	    public void mostrarResultado() {
	        System.out.println(resultado);
	    }
}

