import java.util.Scanner;

public class Monitoreo {
 
    public static void registrarTemperaturas(double[][] matriz) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Zona " + (i + 1));
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingrese temperatura del Sensor " + (j + 1) + ": ");
                matriz[i][j] = sc.nextDouble();
            }
        }
    }

    public static void promedioPorZona(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            double suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
            double promedio = suma / matriz[i].length;
            System.out.println("Promedio Zona " + (i + 1) + ": " + promedio);
        }
    }

    public static void promedioGeneral(double[][] matriz) {
        double suma = 0;
        int total = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
                total++;
            }
        }

        double promedio = suma / total;
        System.out.println("Promedio General: " + promedio);
    }

    public static void detectarCriticos(double[][] matriz, double limite) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > limite) {
                    System.out.println("⚠ Valor crítico en Zona "
                            + (i + 1) + ", Sensor "
                            + (j + 1) + ": "
                            + matriz[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {

        double[][] sensores = new double[3][3];

        registrarTemperaturas(sensores);
        promedioPorZona(sensores);
        promedioGeneral(sensores);
        detectarCriticos(sensores, 50);
    }
}
