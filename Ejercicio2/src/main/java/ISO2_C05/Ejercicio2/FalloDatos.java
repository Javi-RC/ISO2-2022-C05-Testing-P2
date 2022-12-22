package ISO2_C05.Ejercicio2;

public class FalloDatos extends Exception {
	
	/**
	 * Excepcion creada para utilizarse ante fallos de datos  
	 * numeros negativos o 0 y  angulos no congruentes
	 * @param cadena Contenido de la excepcion
	 */
	public FalloDatos(String cadena) {
		super(cadena);
	}
}
