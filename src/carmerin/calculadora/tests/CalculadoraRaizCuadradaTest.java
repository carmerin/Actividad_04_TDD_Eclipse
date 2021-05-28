package carmerin.calculadora.tests;

import org.junit.Assert;
import org.junit.Test;

import carmerin.calculadora.Calculadora;

public class CalculadoraRaizCuadradaTest  extends CalculadoraBaseTest{
	
	
	/**
	 * Test para la raíz cuadrada de un número en punto flotante
	 */
	@Test
	public void testRaizCuadrada(){
		
		//Arrange
		//Definimos el número
		float num1 = 45.4255f;
		
		//Definimos el resultado
		float resultado = 6.7398442118494103958361139320588f;
		
		//Act
		//Llamamos al m�todo a testear
		float raiz = Calculadora.raiz_cuadrada(num1);
		
		//Assert
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(raiz, resultado, 0.00001d);
	}
	
	
	/**
	 * Test para número negativo. 
	 */
	@Test
	public void testRaizCuadradaNumeroNegativo(){
		
	    try {
		
	        //Arrange
    		//Definimos el numero
    		float num1 = -3.2341f;
    		
    		//Act
    		//Llamamos al metodo a testear
    		Calculadora.raiz_cuadrada(num1);
    		
    		//Assert
    		//Comprobamos que el resultado es correcto.
    		Assert.fail("Se esperaba que se lanzara una IllegalArgument Exception.");
	    }
	    catch(IllegalArgumentException e) {
	        
	        Assert.assertEquals(e.getMessage(), "La raíz cuadrada de un número negativo no está soportada.");
	    }
	    catch(Throwable t) {
	        
	        Assert.fail("Se esperaba que se lanzara una IllegalArgument Exception.");
	    }
	}
	
	/**
     * Test para la raíz cuadrada de un número en punto flotante
     */
    @Test
    public void testRaizCuadradaCuadradoPerfecto(){
        
        //Arrange
        //Definimos el número
        float num1 = 16.0f;
        
        //Definimos el resultado
        float resultado = 4.0f;
        
        //Act
        //Llamamos al m�todo a testear
        float raiz = Calculadora.raiz_cuadrada(num1);
        
        //Assert
        //Comprobamos que el resultado es correcto.
        Assert.assertEquals(raiz, resultado, 0.00001d);
    }
}