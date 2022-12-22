package ISO2_C05.Ejercicio2;

import static org.junit.Assert.*;


import org.junit.Test;

public class TrianguloTest {

	
	
	@Test 
	public void testGetTipoTriangulo3() {
		String tipo;
		Triangulo triangulo;
		try {
			// caso 3 
			 triangulo = new Triangulo(1, 1, 1, 90, 1, 1);
			tipo = triangulo.getTipoTriangulo(triangulo, true);
			assertEquals("equilatero",tipo);
			}
			catch(FalloDatos e) {
				fail("si ha saltado la excepcion 3");
			}
		
		
	}
	@Test
	public void testGetTipoTriangulo() {
		
		String tipo ="";
		//caso 1
		Triangulo triangulo;
		try {
			 triangulo = new Triangulo(-1,-1,-1,-1,-1,-1);
			tipo = triangulo.getTipoTriangulo(triangulo, true);
			fail("No salto la excepcion");
		}
		catch( FalloDatos e ) {
			assertEquals("","");		
		}
	}
	

@Test
public void TestGetTipoTriangulo3() {
	String tipo="";
	Triangulo triangulo;
	//caso 2
	
	try {
	 triangulo = new Triangulo(3,1,1,90,1,1);
	tipo = triangulo.getTipoTriangulo(triangulo, false);
	fail("no salto la excepcion con angulos");
	}
	catch(FalloDatos e) {
		
		assertEquals("","");
	}
	
	
}

	

		
@Test
public void TestGetTipoTriangulo4() {
	String tipo="";
	Triangulo triangulo;
	//caso 4
	try {
		 triangulo = new Triangulo(1,3,2,90,1,1);
		tipo = triangulo.getTipoTriangulo(triangulo, true);
	}
	catch( FalloDatos e) {
		fail("si ha saltado la excepcion 4");
	}
	assertEquals("escaleno", tipo);
}
@Test
public void TestGetTipoTriangulo5() {
	String tipo="";
	Triangulo triangulo;
	//caso 5
	try {
		 triangulo = new Triangulo(2,1,1,90,1,1);
		tipo = triangulo.getTipoTriangulo(triangulo, true);
	}
	catch( FalloDatos e) {
		fail("si ha saltado la excepcion 5");
	}
	assertEquals("isosceles",tipo);
}
@Test
public void TestGetTipoTriangulo6() {
	//caso 6
	String tipo="";
	Triangulo triangulo;
	try {
		 triangulo = new Triangulo(2,1,1,90,60,30);
		tipo = triangulo.getTipoTriangulo(triangulo, false);
	}
	catch(FalloDatos e) {
		fail("ha saltado la excepcion 6");
	}
	assertEquals("rectangulo",tipo);
}
@Test
public void TestGetTipoTriangulo7(){
	//caso 7
	String tipo="";
	Triangulo triangulo;
	try {
		 triangulo = new Triangulo(2,1,1,110,10,60);
		tipo = triangulo.getTipoTriangulo(triangulo, false);
	}
	catch(FalloDatos e) {
		fail( "ha fallado la 7"+ e.getMessage());
	}
	assertEquals("obtusangulo",tipo);
	
}
@Test
public void TestGetTipoTriangulo8() {
	
	//caso 8
	Triangulo triangulo;
	String tipo="";
	try {
		 triangulo = new Triangulo(2,1,1,60,60,60);
		tipo = triangulo.getTipoTriangulo(triangulo, false);
	}
	catch(FalloDatos e) {
		fail("ha saltado la excepcion 8");
		}
	assertEquals("acutangulo",tipo);
}}
