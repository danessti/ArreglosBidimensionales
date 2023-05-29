public class Ejercicio4 {

    /*Diseñe una función que permita crear el siguiente arreglo bidimensional.
      1\0\0\0\0
      0\1\0\0\0
      0\0\1\0\0
      0\0\0\1\0
      0\0\0\0\1*/

    public static void main(String[] args) {

        int[][] matriz = new int[5][5];

        diagonal(matriz);

    }

    public static void diagonal(int[][] matriz) {

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                if (i == j) {
                    matriz[i][j] = 1;
                    System.out.print(matriz[i][j]+" ");
                } else {
                    System.out.print(matriz[i][j]+" ");
                }

            }
            System.out.println("");
        }

    }

}