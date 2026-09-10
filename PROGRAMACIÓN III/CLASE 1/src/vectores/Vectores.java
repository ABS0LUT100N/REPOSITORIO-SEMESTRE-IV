package vectores;

import java.util.Scanner;

public class Vectores {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[10];
        vector[0] = 1991;
        vector[1] = 2006;
        vector[2] = 365;
        vector[3] = 404;
        vector[4] = 5543;
        vector[5] = 6032;
        vector[6] = 7020;
        vector[7] = 8000;
        vector[8] = 99;
        vector[9] = 1010;

        System.out.println(vector[0]);

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Digite un número para el vector en la posición " + i + ":");
            vector[i] = scanner.nextInt();
        }

        System.out.println("Los números ingresados son:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
}
