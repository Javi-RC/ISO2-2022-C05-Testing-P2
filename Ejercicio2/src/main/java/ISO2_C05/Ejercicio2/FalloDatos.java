package ISO2_C05.Ejercicio2;

/**
 * Excepcion creada para utilizarse ante fallos de datos  
 * numeros negativos o 0 y  angulos no congruentes
 */
public class FalloDatos extends Exception {
	public FalloDatos(String cadena) {
		super(cadena);
	}
}
