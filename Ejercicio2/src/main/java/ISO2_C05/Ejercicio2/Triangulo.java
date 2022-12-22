package ISO2_C05.Ejercicio2;

public class Triangulo {

	private double ladoA; // Base
	private double ladoB; 
	private double ladoC; // Hipotenusa
	private double alpha;
	private double beta;
	private double delta;
	
	public Triangulo(double ladoA, double ladoB, double ladoC, double alpha, double beta, double delta) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
		this.alpha = alpha;
		this.beta = beta;
		this.delta = delta;
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setA(double a) {
		this.ladoA = a;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setB(double b) {
		this.ladoB = b;
	}

	public double getLadoC() {
		return ladoC;
	}

	public void setC(double c) {
		this.ladoC = c;
	}

	public double getAlpha() {
		return alpha;
	}

	public void setAlpha(double alpha) {
		this.alpha = alpha;
	}

	public double getBeta() {
		return beta;
	}

	public void setBeta(double beta) {
		this.beta = beta;
	}

	public double getDelta() {
		return delta;
	}

	public void setDelta(double delta) {
		this.delta = delta;
	}
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
