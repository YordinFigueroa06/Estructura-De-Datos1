import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double notas[] = new double[10];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("ingrese la nota del estudiante " + i);
            if (notas.length >= 0 && notas.length <= 5) {
                notas[i] = scanner.nextDouble();
            } else {
                System.out.println("debe ingresar una nota valida-");
            }

        }
        System.out.println("el promedio de las notas es:" + promedio(notas));
        System.out.println("la nota minima fue: " + nota_minima(notas));
        System.out.println("la nota maxima fue: " + nota_maxima(notas));
        System.out.println("el numero de estudiantes aprobados fueron: " + aprobados(notas));
    }

    public static double promedio(double[] notas) {
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma / notas.length;

    }

    public static double nota_minima(double[] notas) {
        double minima = notas[0];
        for (double nota : notas) {
            if (nota < minima) {
                minima = nota;
            }
        }
        return minima;
    }

    public static double nota_maxima(double[] notas) {
        double maxima = notas[0];
        for (double nota : notas) {
            if (nota > maxima) {
                maxima = nota;
            }
        }
        return maxima;
    }

    public static byte aprobados(double[] notas) {
        byte contador = 0;
        for (double nota : notas) {
            if (nota >= 3.0) {
                contador++;
            }
        }
        return contador;
    }

}
