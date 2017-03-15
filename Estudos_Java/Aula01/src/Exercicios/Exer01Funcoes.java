package Exercicios;


public class Exer01Funcoes {
    private static void trocaB(String a, String b) {
        String tap = a;
        a = b;
        b = tap;
    }

    private static void trocaC(int array[], String a) {
        for (int x = 0; x < array.length; x++) {
            array[x] = array[x] * Integer.valueOf(a);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void Run() {
        int array[] = {1, 2, 3, 4, 5};
        String a = "2", b = "5";
        trocaB(a, b);
        trocaC(array, a);
        System.out.println(a + " " + b + " ");
        for (int x = 0; x < array.length; x++) {
            System.out.println(array[x] + " ");
        }
    }
}
