package com.ndigitales.herencia;

/* Miembros protected: Los miembros public son accesibles en cualquier parte en donde el programa 
 * tenga una referencia a un objeto de esa clase, o subclases. Los miembros private de una clase son accesibles
 * s�lo dentro de la misma clase. De este modo, los miembros private de una superclase no son heredados por sus
 * subclases. El modificador protected, ofrece un nivel intermedio de acceso entre public y private.
 * Los miembros protected de una superclase pueden ser utilizados por los miembros de esa superclase, por los 
 * miembros de sus subclases y por los miembros de otras clases en el mismo paquete. As� los miembros protected
 * tienen tambi�n tienen acceso a nivel de paquete.
 * En el c�digo, para definir una herencia, la clase tendr� la palabra reservada extends y el nombre de la clase que hereda
 * 
 * Resumiendo, las variables y m�todos pueden estar en uno de los siguientes cuatro niveles de acceso, recuerde
 * que las clases pueden estar a nivel public o default.
 * 
 * 	MODIFICADOR		MISMA CLASE		MISMO PAQUETE		SUBCLASE		UNIVERSO
 * --------------------------------------------------------------------------------
 * 	private				si
 * 	default				si				si
 * 	protected			si				si					si
 * 	public				si				si					si				si
 * 
 */

public class Empleado {

	protected String nombre;
	protected int sector;
	protected double sueldo;

	
	public void legajo() {
		
	}
}


