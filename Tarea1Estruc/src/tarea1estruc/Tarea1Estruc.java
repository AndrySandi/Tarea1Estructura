package tarea1estruc;

public class Tarea1Estruc {

    public static void main(String[] args) {

        int matriz[][] = new int[4][4];
        int dato = 1;

        System.out.println("================= MATRIZ =================");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = dato;
                dato++;
            }

        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("\t" + matriz[i][j]);
            }
            System.out.println(" ");
        }
        int D1[] = new int[matriz.length];
        int D2[] = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (i == j) {
                    D1[i] = matriz[i][j];
                }
                if ((i + j) == matriz.length - 1) {
                    D2[i] = matriz[i][j];
                }
            }
        }
        System.out.println("==========================================");
        int sumatoria1 = 0;
        System.out.println("\nLa primer diagonal es: ");

        for (int elemento : D1) {
            System.out.print("\t" + elemento);
            sumatoria1 = sumatoria1 + elemento;
        }
        System.out.print(" = " + sumatoria1);
        System.out.println(" ");

        System.out.println("==========================================");
        int sumatoria2 = 0;
        System.out.println("\nLa segunda diagonal es: ");
        for (int elemento : D2) {
            System.out.print("\t" + elemento);
            sumatoria2 = sumatoria2 + elemento;
        }
        System.out.print(" = " + sumatoria2);
        System.out.println(" ");
        System.out.println("==========================================");

        System.out.println(" ");
        int totalSum = 0;
        totalSum = sumatoria1 + sumatoria2;
        System.out.println("LA SUMA DE AMBAS DIAGONALES ES DE: " + totalSum);
        System.out.println("==========================================");

    }

}
