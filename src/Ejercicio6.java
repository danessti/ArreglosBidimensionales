import java.util.Scanner;

public class Ejercicio6 {

    /*Diseñe un algoritmo que calcule y muestre la cantidad de números pares que hay en un arreglo
    * bidimensional de m x n elementos enteros.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero de filas: ");
        int m = sc.nextInt();

        System.out.print("Ingrese el numero de columnas: ");
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];

        matriz = ingresarValores(sc, matriz, m, n);

        mostrar(matriz, m, n);

    }

    public static int[][] ingresarValores(Scanner sc, int[][] matriz, int m, int n) {

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print("Ingrese un valor ("+(i+1)+", "+(j+1)+") ");
                matriz[i][j] = sc.nextInt();

            }

        }

        return matriz;

    }

    public static void mostrar(int[][] matriz, int m, int n) {

        int contador = 0;

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                if (matriz[i][j] % 2 == 0) {
                    System.out.print("| "+matriz[i][j]+" |");
                    contador++;
                } else {
                    System.out.print("|   |");
                }

            }
            System.out.println("");
        }
        System.out.println("Hay "+contador+" pares");
    }

}