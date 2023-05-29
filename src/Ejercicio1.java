import java.util.Scanner;

public class Ejercicio1 {

    /*Diseñe un subalgoritmo que permita leer el contenido de un arreglo bidimensional.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un valor para las filas");
        int filas = sc.nextInt();

        System.out.println("Ingrese un valor para las columnas");
        int columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];

        arreglosBi(matriz, filas, columnas, sc);

    }

    public static void arreglosBi (int[][] matriz, int filas, int columnas, Scanner sc) {

        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                System.out.println("Ingrese un valor ("+(i+1)+", "+(j+1)+")");
                matriz[i][j] = sc.nextInt();

            }

        }

        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                System.out.print(matriz[i][j]+" ");

            }
            System.out.println("");
        }

    }

}