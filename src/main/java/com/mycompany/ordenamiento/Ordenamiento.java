package com.mycompany.ordenamiento;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Ordenamiento {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuál es la longitud de tu arreglo?");

        int num = leer.nextInt();
        int[] matriz = new int[num];
        System.out.println("Tus números aleatorios y arreglo:");
        Random rand = new Random();

        for (int i = 0; i < num; i++) {
            matriz[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(matriz));

        System.out.println("Seleccione el tipo de ordenamiento que desea aplicar: ");
        System.out.println("1. Ordenamiento por burbuja");
        System.out.println("2. Ordenamiento por selección");
        System.out.println("3. Ordenamiento por inserción");
        System.out.println("4. Quicksort");
        System.out.println("5. Shell");
        System.out.print("Opción: ");
        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                Burbuja.burbuja(matriz);
                break;
            case 2:
                Seleccion.seleccion(matriz);
                break;
            case 3:
                Insercion.insercion(matriz);
                break;
                case 4:
                Quicksort.sort(matriz);
                break;
                case 5:
                Shell.shellSort(matriz);
                break;
            default:
                System.out.println("Opción no válida.");
        }

        System.out.println("Arreglo ordenado:");
        System.out.println(Arrays.toString(matriz));
    }
}
