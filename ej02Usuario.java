import java.io.*;
public class ej02Usuario {

        // 02 Ejercicio Vamos a saludar al usuario
        public static void main(String args[]) throws IOException {
            BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
            String nombre;
            System.out.println("Como te llamas?");
            nombre = bufEntrada.readLine();
            System.out.println("Hola "+nombre+" es un gusto saludarte");
        }


    }

