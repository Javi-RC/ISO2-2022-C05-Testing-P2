package ISO2_C05.Ejercicio2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Triangulo t = new Triangulo(2,1,1,110,10,60);
    	String tipo="";
		try {
			tipo = t.getTipoTriangulo(t, false);
		} catch (FalloDatos e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println(tipo);
        System.out.println( "Hello World!" );
    }
}
