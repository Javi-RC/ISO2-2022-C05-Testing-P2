package ISO2_C05.Ejercicio2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrianguloTest {

	@Test
	public void testGetTipoTriangulo() {
		Triangulo triangulo= new Triangulo(2,2,2,2,2,2);
		triangulo=new Triangulo(40,20,20,60,60,60);
		String tipo="";
		try {
			//triangulo.getTipoTriangulo(triangulo, false);
			tipo=triangulo.getTipoTriangulo(triangulo, false);
		}
		catch(FalloDatos e) {
			fail(e.toString());
		}
		assertEquals("fallo","acutangulo",tipo);
		//fail("Not yet implemented");
		
	}


}
