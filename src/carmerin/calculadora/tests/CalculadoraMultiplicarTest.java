package carmerin.calculadora.tests;

import org.junit.Assert;
import org.junit.Test;

import carmerin.calculadora.Calculadora;

public class CalculadoraMultiplicarTest  extends CalculadoraBaseTest{
	
	
	/**
	 * Test para multiplicar dos numeros enteros
	 */
	@Test
	public void testMultiplicaDosNumeros(){
		
		//Arrange
		//Definimos los numeros a multiplicar
		int num1 = 1;
		int num2 = 2;
		//Definimos el resultado de la multiplicación
		int resultado = 2;
		
		//Act
		//Llamamos al metodo a testear
		int producto = Calculadora.multiplicar(num1, num2);
		
		//Assert
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(producto, resultado);
	}
	
	
	/**
	 * Test para multiplicar dos numeros invertidos. 
	 */
	@Test
	public void testMultiplicaDosNumerosInvertidos(){
		
		//Arrange
		//Definimos los numeros a multiplicar
		int num1 = 1;
		int num2 = 2;
		//Definimos el resultado
		int resultado = 2;
		
		//Act
		//Llamamos al metodo a testear
		int producto = Calculadora.multiplicar(num2, num1);
		
		//Assert
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(producto, resultado);
	}

	/**
	 * Test para multiplicar cero
	 */
	@Test
	public void testMultiplicaCero(){
		
		//Arrange
		//Definimos los numeros a multiplicar
		int num1 = 2;
		int num2 = 0;
		//Definimos el resultado
		int resultado = 0;
		
		//Act
		//Llamamos al metodo a testear
		int producto = Calculadora.multiplicar(num2, num1);
		
		//Assert
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(producto, resultado);
	}
	
	/**
     * Test para multiplicar uno
     */
    @Test
    public void testMultiplicaUno(){
        
        //Arrange
        //Definimos los numeros a multiplicar
        int num1 = 2;
        int num2 = 1;
        
        //Act
        //Llamamos al metodo a testear
        int producto = Calculadora.multiplicar(num1, num2);
        
        //Assert
        //Comprobamos que el resultado es correcto.
        Assert.assertEquals(producto, num1);
    }
	
	/**
	 * Test para conmutativa
	 */
	@Test
	public void testMultiplicaConmutativa(){
		
		//Arrange
		//Definimos los numeros a multiplicar
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