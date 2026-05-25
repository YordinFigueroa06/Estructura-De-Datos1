package simulacionfinanciera;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese número de clientes: ");
        int clientes = sc.nextInt();

        System.out.print("Ingrese número de días: ");
        int dias = sc.nextInt();

        double[][] movimientos = new double[clientes][dias];

        for (int i = 0; i < clientes; i++) {
            System.out.println("\nCliente " + (i + 1));
            for (int j = 0; j < dias; j++) {
                System.out.print("Movimiento del día " + (j + 1) + ": ");
                movimientos[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < clientes; i++) {
            System.out.println("\nCliente " + (i + 1));
            System.out.println("Promedio diario: " + promedio(movimientos, i));
            System.out.println("Variación total: " + variacion(movimientos, i));
            System.out.println("Movimiento máximo: " + maximo(movimientos, i));
        }
    }

    public static double promedio(double[][] mov, int cliente) {
        double suma = 0;

        for (int j = 0; j < mov[cliente].length; j++) {
            suma += mov[cliente][j];
        }

        return suma / mov[cliente].length;
    }

    public static double variacion(double[][] mov, int cliente) {
        double primerDia = mov[cliente][0];
        double ultimoDia = mov[cliente][mov[cliente].length - 1];

        return ultimoDia - primerDia;
    }

    public static double maximo(double[][] mov, int cliente) {
        double max = mov[cliente][0];

        for (int j = 1; j < mov[cliente].length; j++) {
            if (mov[cliente][j] > max) {
                max = mov[cliente][j];
            }
        }

        return max;
    }
}