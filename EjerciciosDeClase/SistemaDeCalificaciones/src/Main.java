package sistemadecalificaciones;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese número de estudiantes: ");
        int estudiantes = sc.nextInt();

        System.out.print("Ingrese número de materias: ");
        int materias = sc.nextInt();

        double[][] notas = new double[estudiantes][materias];

        for (int i = 0; i < estudiantes; i++) {
            System.out.println("\nEstudiante " + (i + 1));
            for (int j = 0; j < materias; j++) {
                System.out.print("Ingrese nota materia " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < estudiantes; i++) {
            System.out.println("Promedio estudiante " + (i + 1) + ": " + promedioEstudiante(notas, i));
        }

        System.out.println("\nMejor estudiante: " + mejorEstudiante(notas));

        System.out.println("\nEstudiantes en riesgo académico:");
        riesgoAcademico(notas);
    }

    public static double promedioEstudiante(double[][] notas, int estudiante) {
        double suma = 0;

        for (int j = 0; j < notas[estudiante].length; j++) {
            suma += notas[estudiante][j];
        }

        return suma / notas[estudiante].length;
    }

    public static int mejorEstudiante(double[][] notas) {

        int mejor = 0;
        double mejorProm = promedioEstudiante(notas, 0);

        for (int i = 1; i < notas.length; i++) {
            double promActual = promedioEstudiante(notas, i);

            if (promActual > mejorProm) {
                mejorProm = promActual;
                mejor = i;
            }
        }

        return mejor + 1;
    }

    public static void riesgoAcademico(double[][] notas) {

        boolean hayRiesgo = false;

        for (int i = 0; i < notas.length; i++) {
            double prom = promedioEstudiante(notas, i);

            if (prom < 3) {
                System.out.println("Estudiante " + (i + 1) + " en riesgo con promedio: " + prom);
                hayRiesgo = true;
            }
        }

        if (!hayRiesgo) {
            System.out.println("Ningún estudiante está en riesgo.");
        }
    }
}