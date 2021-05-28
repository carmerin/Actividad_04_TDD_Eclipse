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
		//Definimos los números a restar
		float num1 = 2;
		float num2 = 1;
		//Definimos el resultado de la resta
		float resultado = 1;
		
		//Act
		//Llamamos al método a testear
		float resta = Calculadora.restar(num1, num2);
		
		//Assert
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(resta, resultado, 0.00001);
	}
	
	
	/**
	 * Test para restar dos números invertidos. 
	 */
	@Test
	public void testRestaDosNumerosInvertidos(){
		
	    //Arrange
	    //Definimos los números a restar
		float num1 = 1;
		float num2 = 2;
		//Definimos el resultado de la resta
		float resultado = -1;
		
		//Act
		//Llamamos al método a testear
		float resta = Calculadora.restar(num1, num2);
		
		//Assert
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(resta, resultado, 0.00001);
	}

	/**
	 * Test para restar cero
	 */
	@Test
	public void testRestaCero(){
		
	    //Arrange
	    //Definimos los números a restar
		float num1 = 2;
		float num2 = 0;
		//Definimos el resultado de la resta
		float resultado = 2;
		
		//Act
		//Llamamos al método a testear
		float resta = Calculadora.restar(num1, num2);
		
		//Assert
		//Comprobamos que el resultado es correcto.
		Assert.assertEquals(resta, resultado, 0.00001);
	}
	
	/**
     * Test para comprobar que la resta no tiene la conmutativa. 
     */
    @Test
    public void testRestaConmutativaNumerosDiferentes(){
        
        //Arrange
        //Definimos los números a restar
        float num1 = 2;
        float num2 = 1;
        
        //Act
        //Llamamos al método a testear
        float resta1 = Calculadora.restar(num1, num2);
        float resta2 = Calculadora.restar(num2, num1);
        
        //Assert
        //Comprobamos que el resultado es correcto.
        Assert.assertNotEquals(resta1, resta2, 0.00001);
    }
}
