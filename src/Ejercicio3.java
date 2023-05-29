import java.util.Scanner;

public class Ejercicio3 {

    /*Diseñe una función que calcule y devuelva la suma de dos matrices.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero de filas");
        int fil = sc.nextInt();

        System.out.println("Ingrese un numero de columnas");
        int col = sc.nextInt();

        int[][] matriz1 = new int[fil][col];
        int[][] matriz2 = new int[fil][col];
        int[][] matriz3 = new int[fil][col];

        matriz1 = ingreso1(sc, fil, col);
        matriz2 = ingreso2(sc, fil, col);

        mostrar1(matriz1, fil, col);
        mostrar2(matriz2, fil, col);

        matriz3 = suma(fil, col, matriz1, matriz2);

    }

    public static int[][] ingreso1 (Scanner sc, int fil, int col) {

        System.out.println("MATRIZ 1");

        int[][] matriz1 = new int[fil][col];

        for (int i = 0; i < fil; i++) {

            for (int j = 0; j < col; j++) {

                System.out.println("Ingrese un valor ("+(i+1)+","+(j+1)+")");
                matriz1[i][j] = sc.nextInt();

            }

        }

        return matriz1;

    }

    public static void mostrar1(int[][] matriz1, int fil, int col) {

        System.out.println("MATRIZ 1");

        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matriz1[i][j]+" ");
            }
            System.out.println("");
        }

    }

    public static int[][] ingreso2 (Scanner sc, int fil, int col) {

        System.out.println("MATRIZ 2");

        int[][] matriz2 = new int[fil][col];

        for (int i = 0; i < fil; i++) {

            for (int j = 0; j < col; j++) {

                System.out.println("Ingrese un valor ("+(i+1)+","+(j+1)+")");
                matriz2[i][j] = sc.nextInt();

            }

        }

        return matriz2;

    }

    public static void mostrar2(int[][] matriz2, int fil, int col) {

        System.out.println("MATRIZ 2");

        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matriz2[i][j]+" ");
            }
            System.out.println("");
        }

    }

    public static int[][] suma(int fil, int col, int[][] matriz1, int[][] matriz2) {

        int[][] matriz3 = new int[fil][col];

        System.out.println("RESULTADO DE LA SUMA");

        for (int i = 0; i < fil; i++) {

            for (int j = 0; j < col; j++) {

                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
                System.out.print(matriz3[i][j]+" ");

            }
            System.out.println("");
        }

        return matriz3;

    }

}