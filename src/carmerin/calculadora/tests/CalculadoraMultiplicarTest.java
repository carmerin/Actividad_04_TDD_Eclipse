package carmerin.calculadora.tests;

import org.junit.Assert;
import org.junit.Test;

import carmerin.calculadora.Calculadora;

public class CalculadoraMultiplicarTest  extends CalculadoraBaseTest{
	
	
	/**
	 * Test para multiplicar dos numeros
	 */
	@Test
	public void testMultiplicaDosNumeros(){
		
		//Arrange
		//Definimos los numeros a multiplicar
		float num1 = 1;
		float num2 = 2;
		//Definimos el resultado de la multiplicación
		float resultado = 2;
		
		//Act
		//Llamamos al metodo a testear
		float producto = Calculadora.multiplicar(num1, num2);
		
		//Assert
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(producto, resultado, 0.00001);
	}
	
	
	/**
	 * Test para multiplicar dos numeros invertidos. 
	 */
	@Test
	public void testMultiplicaDosNumerosInvertidos(){
		
		//Arrange
		//Definimos los numeros a multiplicar
		float num1 = 1;
		float num2 = 2;
		//Definimos el resultado
		float resultado = 2;
		
		//Act
		//Llamamos al metodo a testear
		float producto = Calculadora.multiplicar(num2, num1);
		
		//Assert
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(producto, resultado, 0.00001);
	}

	/**
	 * Test para multiplicar cero
	 */
	@Test
	public void testMultiplicaCero(){
		
		//Arrange
		//Definimos los numeros a multiplicar
		float num1 = 2;
		float num2 = 0;
		//Definimos el resultado
		float resultado = 0;
		
		//Act
		//Llamamos al metodo a testear
		float producto = Calculadora.multiplicar(num2, num1);
		
		//Assert
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(producto, resultado, 0.00001);
	}
	
	/**
     * Test para multiplicar uno
     */
    @Test
    public void testMultiplicaUno(){
        
        //Arrange
        //Definimos los numeros a multiplicar
        float num1 = 2;
        float num2 = 1;
        
        //Act
        //Llamamos al metodo a testear
        float producto = Calculadora.multiplicar(num1, num2);
        
        //Assert
        //Comprobamos que el resultado es correcto.
        Assert.assertEquals(producto, num1, 0.00001);
    }
	
	/**
	 * Test para conmutativa
	 */
	@Test
	public void testMultiplicaConmutativa(){
		
		//Arrange
		//Definimos los numeros a multiplicar
	    float num1 = 2;
	    float num2 = 3;
		
		//Act
		//Llamamos al m�todo a testear
	    float producto1 = Calculadora.multiplicar(num1, num2);
	    float producto2 = Calculadora.multiplicar(num2, num1);
		
		//Assert
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(producto1, producto2, 0.00001);
	}
	
}