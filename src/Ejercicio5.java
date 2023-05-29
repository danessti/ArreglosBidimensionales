public class Ejercicio5 {

    /*Diseñe un algoritmo que genere las tablas de multiplicar del uno al diez en un solo arreglo bidimensional y
    * posteriormente imprima dicho arreglo.*/

    public static void main(String[] args) {

        int[][] tabla = new int[11][11];

        mostrar(tabla);

    }

    public static void mostrar(int[][] tabla) {

        for (int i = 1; i < 11; i++) {

            for (int j = 1; j < 11; j++) {
                System.out.println(i+" * "+j+" = "+(i*j)+"|");
            }
            System.out.println("");
        }

    }

}