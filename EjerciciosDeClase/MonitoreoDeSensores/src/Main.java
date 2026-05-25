package monitoredesensores;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] temp = new double[3][3];


        for (int i = 0; i < temp.length; i++) {
            System.out.println("Zona " + (i + 1));

            for (int j = 0; j < temp[i].length; j++) {
                System.out.print("Ingrese temperatura del sensor " + (j + 1) + ": ");
                temp[i][j] = sc.nextDouble();
            }
        }


        mostrarPromedioZonas(temp);
        System.out.println("Promedio general de la planta: " + promedioGeneral(temp));
        System.out.println("Cantidad de valores críticos: " + cantidadCriticos(temp));

        sc.close();
    }


    public static void mostrarPromedioZonas(double[][] temp) {

        for (int i = 0; i < temp.length; i++) {
            double suma = 0;

            for (int j = 0; j < temp[i].length; j++) {
                suma += temp[i][j];
            }

            double promedio = suma / temp[i].length;
            System.out.println("Promedio Zona " + (i + 1) + ": " + promedio + " °C");
        }
    }

    public static double promedioGeneral(double[][] temp) {

        double suma = 0;
        int cantidad = 0;

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                suma += temp[i][j];
                cantidad++;
            }
        }

        return suma / cantidad;
    }

    public static byte cantidadCriticos(double[][] temp) {

        byte contador = 0;

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {

                if (temp[i][j] > 35) {
                    System.out.println("⚠ ALERTA en Zona " + (i + 1)
                            + " Sensor " + (j + 1)
                            + " -> " + temp[i][j] + " °C");
                    contador++;
                }
            }
        }

        return contador;
    }
    }
