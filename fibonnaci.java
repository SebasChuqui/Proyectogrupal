public class Fibonacci {


    // Método recursivo para calcular el n-ésimo término
    public static int fibonacciRecursivo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }
 main

    public static void main(String[] args) {
        int limite = 10; // Cantidad de términos a mostrar
        
        System.out.println("Serie Fibonacci (Algoritmo Recursivo):");
        for (int i = 0; i < limite; i++) {
            System.out.print(fibonacciRecursivo(i) + " ");
        }

        System.out.println();


        System.out.print(modificado);
main
    }
}