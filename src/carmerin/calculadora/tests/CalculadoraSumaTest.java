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
		int num1 = 1;
		int num2 = 2;
		//Definimos el resultado de la suma
		int resultado = 3;
		
		//Act
		//Llamamos al metodo a testear
		int suma = Calculadora.sumar(num1, num2);
		
		//Assert
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(suma, resultado);
	}
	
	
	/**
	 * Test para sumar dos numeros enteros invertidos. 
	 */
	@Test
	public void testSumaDosNumerosInvertidos(){
		
		//Arrange
		//Definimos los numeros a sumar
		int num1 = 1;
		int num2 = 2;
		//Definimos el resultado de la suma
		int resultado = 3;
		
		//Act
		//Llamamos al metodo a testear
		int suma = Calculadora.sumar(num2, num1);
		
		//Assert
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(suma, resultado);
	}

	/**
	 * Test para sumar cero
	 */
	@Test
	public void testSumaCero(){
		
		//Arrange
		//Definimos los numeros a sumar
		int num1 = 2;
		int num2 = 0;
		//Definimos el resultado de la suma
		int resultado = 2;
		
		//Act
		//Llamamos al metodo a testear
		int suma = Calculadora.sumar(num2, num1);
		
		//Assert
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(suma, resultado);
	}
	
	/**
	 * Test para conmutativa
	 */
	@Test
	public void testSumaConmutativa(){
		
		//Arrange
		//Definimos los numeros a sumar
		int num1 = 2;
		int num2 = 3;
		
		//Act
		//Llamamos al metodo a testear
		int suma1 = Calculadora.sumar(num1, num2);
		int suma2 = Calculadora.sumar(num2, num1);
		
		//Assert
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(suma1, suma2);
	}
	
}