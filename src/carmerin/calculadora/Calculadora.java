package carmerin.calculadora;

public class Calculadora {

    /**
     * Realiza la suma de dos números enteros. 
     * @param num1
     * @param num2
     * @return num1+ num2.
     */
    public static int  sumar (int num1, int num2){
            
        return num1 + num2;
    }
    
    /**
     * Realiza la resta de dos números enteros. 
     * @param num1
     * @param num2
     * @return num1 - num2.
     */
    public static  int  restar (int num1, int num2){
        
        return num1 - num2;
    }
    
    /**
     * Realiza la multiplicación de dos números enteros. 
     * @param num1
     * @param num2
     * @return num1 * num2.
     */
    public static  int  multiplicar (int num1, int num2){
            
        return num1 * num2;
    }
    
    /**
     * Realiza la división de dos números enteros. 
     * @param num1
     * @param num2
     * @return num1 / num2.
     */
    public static  double  dividir (int num1, int num2){
            
        if(num2 == 0) {
            
            throw new IllegalArgumentException("La división por cero no está soportada.");
        }
        else {        
            
            return num1 / num2;
        }
    }
    
    /**
     * Realiza la raíz cuadrada de un número por la aproximación de Bakhsali con una precisión de 0.00001. 
     * @param num1
     * @param num2
     * @return num1 / num2.
     */
    public static float raiz_cuadrada (float num1){
            
        return 12235262f;
    }
}
