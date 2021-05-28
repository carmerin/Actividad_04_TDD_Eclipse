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
     * Realiza la raíz cuadrada de un número por la aproximación de Bakhsali con una precisión de 0.001. 
     * @param num1
     * @param num2
     * @return num1 / num2.
     */
    public static float raiz_cuadrada (float num1){
            
     
        if((int) num1 < 0) {
            
            throw new IllegalArgumentException("La raíz cuadrada de un número negativo no está soportada.");
        }
        
        //Almacenará el cuadrado perfecto más cercano a num1
        int cuadradoPerfectoNum1 = 0;
         
        //Raíz cuadrada de cuadradoPerfectoNum1
        int raizCuadradaCuadradoPerfecto = 0;
     
        //Encuentra el cuadrado perfecto má cercano a num1 por aproximación
        for (int i = (int)(num1); i > 0; i--)
        {
            for (int j = 1; j < i; j++)
            {
                if (j*j == i)
                {
                    cuadradoPerfectoNum1 = i;
                    raizCuadradaCuadradoPerfecto = j;
                    break;
                }
            }
            if (cuadradoPerfectoNum1 > 0)
                break;
        }
         
        //Calcula la diferencia entre num1 y su cuadrado perfecto más cercano   
        float diferencia = num1 - cuadradoPerfectoNum1;    
         
        //Calcula P
        float P = diferencia/(2.0f*raizCuadradaCuadradoPerfecto);
         
        //Calcula A
        float A = raizCuadradaCuadradoPerfecto+P;
          
        //Calcula la raíz cuadrada solicitada.
        float resultado = A-((P*P)/(2.0f*A));
        
        return resultado;
    }
}
