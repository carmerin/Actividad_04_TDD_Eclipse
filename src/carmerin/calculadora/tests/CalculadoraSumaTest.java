package carmerin.calculadora.tests;

import org.junit.Assert;
import org.junit.Test;

import carmerin.calculadora.Calculadora;

public class CalculadoraSumaTest  extends CalculadoraBaseTest{
	
	
	/**
	 * Test para sumar dos numeros enteros
	 */
	@Test
	public void testSumaDosNumeros(){
		
		//Arrange
		//Definimos los numeros a sumar
		float num1 = 1;
		float num2 = 2;
		//Definimos el resultado de la suma
		float resultado = 3;
		
		//Act
		//Llamamos al metodo a testear
		float suma = Calculadora.sumar(num1, num2);
		
		//Assert
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(suma, resultado, 0.00001);
	}
	
	
	/**
	 * Test para sumar dos numeros enteros invertidos. 
	 */
	@Test
	public void testSumaDosNumerosInvertidos(){
		
		//Arrange
		//Definimos los numeros a sumar
	    float num1 = 1;
	    float num2 = 2;
		//Definimos el resultado de la suma
	    float resultado = 3;
		
		//Act
		//Llamamos al metodo a testear
	    float suma = Calculadora.sumar(num2, num1);
		
		//Assert
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(suma, resultado, 0.00001);
	}

	/**
	 * Test para sumar cero
	 */
	@Test
	public void testSumaCero(){
		
		//Arrange
		//Definimos los numeros a sumar
	    float num1 = 2;
	    float num2 = 0;
		//Definimos el resultado de la suma
	    float resultado = 2;
		
		//Act
		//Llamamos al metodo a testear
	    float suma = Calculadora.sumar(num2, num1);
		
		//Assert
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(suma, resultado, 0.00001);
	}
	
	/**
	 * Test para conmutativa
	 */
	@Test
	public void testSumaConmutativa(){
		
		//Arrange
		//Definimos los numeros a sumar
	    float num1 = 2;
	    float num2 = 3;
		
		//Act
		//Llamamos al metodo a testear
	    float suma1 = Calculadora.sumar(num1, num2);
	    float suma2 = Calculadora.sumar(num2, num1);
		
		//Assert
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(suma1, suma2, 0.00001);
	}
	
}