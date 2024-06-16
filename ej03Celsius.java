import java.util.Scanner;

public class ej03Celsius{
public static void main(String args[]) {


    // 03 Ejercicio vamos a calcular la temperatura kelvin a partir de la formula
    // K=C+273   => C=grados celsius

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola Usuario ingresa una temperatura en grados celsius para calcular su valor en Grados Kelvin:  " );
        double C = scanner.nextDouble();
        double K = C + 273;
        System.out.println(C + " Grados Celsius es igual a " + K + " Grados Kelvin");
    }
}