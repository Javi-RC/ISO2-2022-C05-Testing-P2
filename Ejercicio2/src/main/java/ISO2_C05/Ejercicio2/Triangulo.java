package ISO2_C05.Ejercicio2;

public class Triangulo {

	private double a; // Base
	private double b; 
	private double c; // Hipotenusa
	private double alpha;
	private double beta;
	private double delta;
	
	public Triangulo(double a, double b, double c, double alpha, double beta, double delta) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.alpha = alpha;
		this.beta = beta;
		this.delta = delta;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
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


}
