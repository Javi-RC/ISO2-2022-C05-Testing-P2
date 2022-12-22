package ISO2_C05.Ejercicio2;



public class Triangulo {

	private double ladoA;
	private double b; 
	private double ladoC;
	private double alpha;
	private double beta;
	private double delta;
	

	public Triangulo(double ladoA, double ladoB, double ladoC, double alpha, double beta, double delta) {
		this.ladoA = ladoA;
		this.b = ladoB;
		this.ladoC = ladoC;
		this.alpha = alpha;
		this.beta = beta;
		this.delta = delta;
	}

	public double getA() {
		return ladoA;
	}


	public double getB() {
		return b;
	}


	public double getC() {
		return ladoC;
	}


	public double getAlpha() {
		return alpha;
	}


	public double getBeta() {
		return beta;
	}


	public double getDelta() {
		return delta;
	}

	private String getTipoLadosTriangulo(Triangulo triangulo) {
		
		String tipo="";
		if (triangulo.getA()==triangulo.getB() && triangulo.getB() == triangulo.getC())
			tipo="equilatero";
		else if(triangulo.getB()==triangulo.getC()){
			tipo="isosceles";
			}
		else {
			tipo="escaleno";	
			
		}

		return tipo;
	}
	
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
	
	public String getTipoTriangulo(Triangulo triangulo,boolean decision) throws FalloDatos {
		String tipo="";
		
		if (triangulo.getA()<=0 || triangulo.getB() <=0 ||
			triangulo.getC() <=0 || triangulo.getAlpha()<=0 ||
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
