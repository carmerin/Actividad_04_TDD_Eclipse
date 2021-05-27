package carmerin.calculadora.tests;

import org.junit.Assert;
import org.junit.Test;

import carmerin.calculadora.Calculadora;

public class CalculadoraRestaTest  extends CalculadoraBaseTest{
	
	
	/**
	 * Test para restar dos números
	 */
	@Test
	public void testRestaDosNumeros(){
	    
	    //Arrange
		//Definimos los números a sumar
		int num1 = 2;
		int num2 = 1;
		//Definimos el resultado de la suma
		int resultado = 1;
		
		//Act
		//Llamamos al método a testear
		int resta = Calculadora.restar(num1, num2);
		
		//Assert
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(resta, resultado);
	}
	
	
	/**
	 * Test para restar dos números invertidos. 
	 */
	@Test
	public void testRestaDosNumerosInvertidos(){
		
	    //Arrange
	    //Definimos los números a sumar
		int num1 = 1;
		int num2 = 2;
		//Definimos el resultado de la suma
		int resultado = -1;
		
		//Act
		//Llamamos al método a testear
		int resta = Calculadora.restar(num1, num2);
		
		//Assert
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(resta, resultado);
	}

	/**
	 * Test para restar cero
	 */
	@Test
	public void testRestaCero(){
		
	    //Arrange
	    //Definimos los números a sumar
		int num1 = 2;
		int num2 = 0;
		//Definimos el resultado de la suma
		int resultado = 2;
		
		//Act
		//Llamamos al método a testear
		int resta = Calculadora.restar(num1, num2);
		
		//Assert
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(resta, resultado);
	}
}
