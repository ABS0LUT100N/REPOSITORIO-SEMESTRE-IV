package matrices;

public class Matriz {

    public static void main(String[] args) {
        int[][] matriz = new int[3][2];
    
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100); // Genera un número aleatorio entre 0 y 99
            }
        }

        // Imprime la matriz
        System.out.println("Matriz generada:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }
    
}
