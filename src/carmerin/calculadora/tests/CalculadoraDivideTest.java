package carmerin.calculadora.tests;

import org.junit.Assert;
import org.junit.Test;

import carmerin.calculadora.Calculadora;

public class CalculadoraDivideTest  extends CalculadoraBaseTest{
	
	
	/**
	 * Test para sumar dos numeros
	 */
	@Test
	public void testDivideDosNumeros(){
		
		//Arrange
		//Definimos los n�meros a sumar
		int num1 = 6;
		int num2 = 2;
		//Definimos el resultado de la suma
		double resultado = 3.0d;
		
		//Act
		//Llamamos al m�todo a testear
		double cociente = Calculadora.dividir(num1, num2);
		
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
    		//Definimos los n�meros a sumar
    		int num1 = 4;
    		int num2 = 0;
    		
    		//Act
    		//Llamamos al metodo a testear
    		Calculadora.dividir(num1, num2);
    		
    		//Assert
    		//Comprobamos que el resultado es correcto.
    		Assert.fail("Expected an IllegalArgumentException to be thrown");
	    }
	    catch(IllegalArgumentException e) {
	        
	        Assert.assertEquals(e.getMessage(), "Division by zero is not supported");
	    }
	    catch(Throwable t) {
	        
	        Assert.fail("Expected an IllegalArgumentException to be thrown");
	    }
	}
}