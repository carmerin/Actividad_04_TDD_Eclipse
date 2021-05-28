package carmerin.calculadora.tests;

import org.junit.Assert;
import org.junit.Test;

import carmerin.calculadora.Calculadora;

public class CalculadoraDivideTest  extends CalculadoraBaseTest{
	
	
	/**
	 * Test para dividir dos numeros
	 */
	@Test
	public void testDivideDosNumeros(){
		
		//Arrange
		//Definimos los numeros a dividir
	    float num1 = 6;
	    float num2 = 2;
		//Definimos el resultado
		float resultado = 3.0f;
		
		//Act
		//Llamamos al m�todo a testear
		float cociente = Calculadora.dividir(num1, num2);
		
		//Assert
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(cociente, resultado, 0.001d);
	}
	
	
	/**
	 * Test para evitar division por cero. 
	 */
	@Test
	public void testDividePorCero(){
		
	    try {
		
	        //Arrange
    		//Definimos los numeros a dividir
	        float num1 = 4;
	        float num2 = 0;
    		
    		//Act
    		//Llamamos al metodo a testear
    		Calculadora.dividir(num1, num2);
    		
    		//Assert
    		//Comprobamos que el resultado es correcto.
    		Assert.fail("Expected an IllegalArgumentException to be thrown");
	    }
	    catch(IllegalArgumentException e) {
	        
	        Assert.assertEquals(e.getMessage(), "La división por cero no está soportada.");
	    }
	    catch(Throwable t) {
	        
	        Assert.fail("Expected an IllegalArgumentException to be thrown");
	    }
	}
}