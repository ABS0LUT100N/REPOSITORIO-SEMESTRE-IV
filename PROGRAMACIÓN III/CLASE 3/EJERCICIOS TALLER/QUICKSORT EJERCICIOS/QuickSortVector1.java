public class QuickSortVector1 {

    final int TAMANIO=10;
    int lista[]={34,74,26,56,4,48,8,40,82,11};

    public static void main(String[] args) {
        QuickSortVector1 vector = new QuickSortVector1();
        int[] lista = vector.lista;

        System.out.println("Array de numeros sin ordenar:");
        imprimirArray(lista);
        System.out.println("");
        System.out.println("----------------------------------------");
        System.out.println("");

        quicksort(lista, 0, lista.length-1);

        System.out.println("Array de numeros ordenado:");
        imprimirArray(lista);
        System.out.println("");
        System.out.println("----------------------------------------");
        System.out.println("");
    }

    public static void imprimirArray (int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.print(lista[i]);
            if(i<lista.length-1){
                System.out.print(", ");
            }
        }
    }
    

     public static void quicksort (int lista[], int izq, int der){
        int i=izq;
        int j=der;
        int pivote=lista[(i+j)/2];
        do {
            while (lista[i]<pivote){
                i++;
            }
            while (lista[j]>pivote){
                j--;
            }
            if (i<=j){
                int aux=lista[i];
                lista[i]=lista[j];
                lista[j]=aux;
                i++;
                j--;
            }
        }while(i<=j);
        if (izq<j){
            quicksort(lista, izq, j);
        }
        if (i<der){
            quicksort(lista, i, der);
        }
    }



}
