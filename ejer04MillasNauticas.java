import java.net.StandardSocketOptions;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.io.*;
public class ejer04MillasNauticas {
    static Scanner read= new Scanner(System.in);
    public static void main (String args [] ){
    // Convertir una distancia en metros a millas nauticas.
    double millas; //Valor en millas ingresado por el usuario
    double MNt; //Valor de las millas totales
    double Mmetros=1852 ;   //El valor de una milla nautica
    System.out.println("Hola Usuario ingresa una distancia en Millas nauticas para calcular su valor en metros:");
    millas = read.nextDouble();
    MNt = millas * Mmetros;
    System.out.println( millas +" Millas Nauticas son equivalentes a :" +MNt);











    }

}
