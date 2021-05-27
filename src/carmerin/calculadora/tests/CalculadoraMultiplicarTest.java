package carmerin.calculadora.tests;

import org.junit.Assert;
import org.junit.Test;

import carmerin.calculadora.Calculadora;

public class CalculadoraMultiplicarTest  extends CalculadoraBaseTest{
	
	
	/**
	 * Test para sumar dos numeros
	 */
	@Test
	public void testMultiplicaDosNumeros(){
		
		//Arrange
		//Definimos los n�meros a sumar
		int num1 = 1;
		int num2 = 2;
		//Definimos el resultado de la suma
		int resultado = 2;
		
		//Act
		//Llamamos al m�todo a testear
		int producto = Calculadora.multiplicar(num1, num2);
		
		//Assert
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(producto, resultado);
	}
	
	
	/**
	 * Test para sumar dos numeros invertidos. 
	 */
	@Test
	public void testMultiplicaDosNumerosInvertidos(){
		
		//Arrange
		//Definimos los n�meros a sumar
		int num1 = 1;
		int num2 = 2;
		//Definimos el resultado de la suma
		int resultado = 2;
		
		//Act
		//Llamamos al m�todo a testear
		int producto = Calculadora.multiplicar(num2, num1);
		
		//Assert
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(producto, resultado);
	}

	/**
	 * Test para sumar cero
	 */
	@Test
	public void testMultiplicaCero(){
		
		//Arrange
		//Definimos los n�meros a sumar
		int num1 = 2;
		int num2 = 0;
		//Definimos el resultado de la suma
		int resultado = 0;
		
		//Act
		//Llamamos al metodo a testear
		int producto = Calculadora.multiplicar(num2, num1);
		
		//Assert
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(producto, resultado);
	}
	
	/**
	 * Test para conmutativa
	 */
	@Test
	public void testMultiplicaConmutativa(){
		
		//Arrange
		//Definimos los n�meros a sumar
		int num1 = 2;
		int num2 = 3;
		
		//Act
		//Llamamos al m�todo a testear
		int producto1 = Calculadora.multiplicar(num1, num2);
		int producto2 = Calculadora.multiplicar(num2, num1);
		
		//Assert
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(producto1, producto2);
	}
	
}