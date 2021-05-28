Archivo Leeme de la Actividad 4 de Ingeniería de Sotware Avanzada
-----------------------------------------------------------------

Desarrollo dirigido por pruebas.

En la historia de la rama main están todos los commits realizados para completar la actividad.

Para probar que los Tests son correctos, he generado un JAR y he metido en la carpeta ejecutable las librerías necesarias para realizar una ejecución desde línea de comandos de cada una de las clases de test.

Es conveniente ejecutar las clases con JDK 1.7.

Debemos ponernos en el directorio raíz del proyecto y ejecutar:

`\_c\jdk1.7.0_80\bin\java -cp ejecutable/* org.junit.runner.JUnitCore carmerin.calculadora.tests.CalculadoraSumaTest`

`\_c\jdk1.7.0_80\bin\java -cp ejecutable/* org.junit.runner.JUnitCore carmerin.calculadora.tests.CalculadoraRestaTest`

`\_c\jdk1.7.0_80\bin\java -cp ejecutable/* org.junit.runner.JUnitCore carmerin.calculadora.tests.CalculadoraMultiplicarTest`

`\_c\jdk1.7.0_80\bin\java -cp ejecutable/* org.junit.runner.JUnitCore carmerin.calculadora.tests.CalculadoraDivideTest`

`\_c\jdk1.7.0_80\bin\java -cp ejecutable/* org.junit.runner.JUnitCore carmerin.calculadora.tests.CalculadoraRaizCuadradaTest`