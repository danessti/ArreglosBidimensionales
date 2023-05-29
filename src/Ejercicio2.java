import java.util.Scanner;

public class Ejercicio2 {

    /*Diseñe un subalgoritmo que permita escribir el contenido de un arreglo bidimensional.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero de filas");
        int fil = sc.nextInt();

        System.out.println("Ingrese el numero de columnas");
        int col = sc.nextInt();

        int[][] matriz = new int[fil][col];

        matriz = arreglo(fil, col, sc);

        mostrar(matriz, fil, col);

    }

    public static int[][] arreglo(int fil, int col, Scanner sc) {

        int[][] matriz = new int[fil][col];

        for (int i = 0; i < fil; i++) {

            for (int j = 0; j < col; j++) {

                System.out.println("Ingrese un valor ("+(i+1)+", "+(j+1)+")");
                matriz[i][j] = sc.nextInt();

            }
        }

        return matriz;

    }

    public static void mostrar(int[][] matriz, int fil, int col) {

        for (int i = 0; i < fil; i++) {

            for (int j = 0; j < col; j++) {

                System.out.print(matriz[i][j]+" ");

            }
            System.out.println("");
        }

    }

}