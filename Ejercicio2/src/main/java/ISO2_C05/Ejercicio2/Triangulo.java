package ISO2_C05.Ejercicio2;
/**
 * 
 * @author Javier Rodriguez Castellano
 * @author Enrique Javier Villar Cea
 *
 *
 */
public class Triangulo {

	private double ladoA;
	private double ladoB; 
	private double ladoC;
	private double alpha;
	private double beta;
	private double delta;
/**
 * Crear un triangulo
 * @param ladoA lado 1 de un triangulo
 * @param ladoB lado 2 de un triangulo
 * @param ladoC lado 3 de un triangulo, en un triangulo rectangulo sería la hipotenusa
 * @param alpha angulo entre ladoA y ladoB
 * @param beta beta angulo entre ladoA y ladoC
 * @param delta delta angulo entre ladoB y ladoC
 */
	public Triangulo(double ladoA, double ladoB, double ladoC, double alpha, double beta, double delta) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
		this.alpha = alpha;
		this.beta = beta;
		this.delta = delta;
	}
	/**
	 * 
	 * @return tamaño del lado 1 de un triangulo
	 */
	public double getLadoA() {
		return ladoA;
	}
/**
* 
* @return tamaño del lado 2 de un triangulo
*/
	public double getLadoB() {
		return ladoB;
	}

/**
* 
* @return tamaño del lado 3 de un triangulo
*  
*/
	public double getLadoC() {
		return ladoC;
	}
/**
* 
* @return angulo entre ladoA y ladoB
*/
	public double getAlpha() {
		return alpha;
	}
/**
* 
* @return angulo entre ladoA y ladoC
*/
	public double getBeta() {
		return beta;
	}

/**
* 
* @return angulo entre ladoB y ladoC
*/
	public double getDelta() {
		return delta;
	}
/**
* 
* Función que devuelve el tipo de triangulo dependiendo de sus lados
* @param triangulo El triangulo del que se quiere conecer su tipo
* @return El tipo de triangulo: equilatero, isosceles o escaleno
*/
	private String getTipoLadosTriangulo(Triangulo triangulo) {
		
		String tipo="";
		if (triangulo.getLadoA()==triangulo.getLadoB() && triangulo.getLadoB() == triangulo.getLadoC())
			tipo="equilatero";
		else if(triangulo.getLadoB()==triangulo.getLadoC()){
			tipo="isosceles";
			}
		else {
			tipo="escaleno";	
			
		}

		return tipo;
	}
/**
* Función que devuelve el tipo de triangulo dependiendo de sus angulos
* @param triangulo El triangulo del que se quiere conecer su tipo
* @return El tipo de triangulo: rectangulo, obtusangulo, acutangulo
* @throws FalloDatos, cuando la suma de los angulos del triangulo no son iguales a 180
*/
	private String getTipoAnguloTriangulo(Triangulo triangulo)throws FalloDatos{
		
		String tipo = "";
		double suma = triangulo.getAlpha()+ triangulo.getBeta()+triangulo.getDelta();
		if(suma!=180.0) {
			throw new FalloDatos("La suma de los angulos debe de ser 180");
		}
		if (triangulo.getAlpha()==90) {
			tipo = "rectangulo";
		}
		else if(triangulo.getAlpha()>90) {
			tipo="obtusangulo";
		}
		else{
			
			tipo="acutangulo";
		}
		return tipo;
	}
/**
* Funcion para obtener el tipo de triangulo
* @param triangulo El triangulo del que se quiere conocer su tipo
* @param decision obtener el tipo de triangulo. True: segun los lados, False: segun sus angulos
* @return tipo El tipo de triangulo
* @throws FalloDatos Lanzada cuando algun parametro del triangulo es menor o igual a 0 o si la suma de sus angulos en menor a 180
*/	
	public String getTipoTriangulo(Triangulo triangulo,boolean decision) throws FalloDatos {
		String tipo="";
		
		if (triangulo.getLadoA()<=0 || triangulo.getLadoB() <=0 ||
			triangulo.getLadoC() <=0 || triangulo.getAlpha()<=0 ||
			triangulo.getBeta()<=0 || triangulo.getDelta()<=0) {
			throw new FalloDatos("Los lados y angulos deben ser mayor que 0");
		}
			
			
		if (decision) {
			tipo=getTipoLadosTriangulo(triangulo);
		}
		else {
			
			tipo=getTipoAnguloTriangulo(triangulo);
		}

		return tipo;
	}


}
