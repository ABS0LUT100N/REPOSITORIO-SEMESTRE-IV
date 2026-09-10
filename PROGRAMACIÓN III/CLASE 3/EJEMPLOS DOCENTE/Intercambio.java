package intercambio;

public class Intercambio {

    
    public static void main(String[] args) {
        
        final int TAMANIO=5;
        int lista[]={34,74,26,56,4,48,8,40,82,11};
        //rellenarArray(lista);

        String lista_String[]={"americano", "Zagal", "pedro",
            "Tocado", "coz"};

        System.out.println("Array de números sin ordenar:");
        imprimirArray(lista);
        System.out.println("");
        System.out.println("-------------------");
        System.out.println("");

        //ordenamos el array
        intercambio(lista);

        System.out.println("Array de números ordenado:");
        imprimirArray(lista);
        System.out.println("");
        System.out.println("-------------------");
        System.out.println("");

//        System.out.println("Array de String sin ordenar:");
//        imprimirArray(lista_String);
//        System.out.println("-------------------");
//        System.out.println("");
//
//        //ordenamos el array
//        intercambioPalabras(lista_String);
//
//        System.out.println("Array de String ordenado:");
//        imprimirArray(lista_String);
    }
 
    public static void imprimirArray (int lista[]){
        for(int i=0;i<lista.length;i++){
                System.out.print(lista[i]);
                 if(i<lista.length-1){
                System.out.print(", ");
            }
        }
    }

    public static void imprimirArray (String lista[]){
        for(int i=0;i<lista.length;i++){
                System.out.print(lista[i]+", ");
        }
    }

    public static void rellenarArray (int lista[]){
        for(int i=0;i<lista.length;i++){
                lista[i]=numeroAleatorio();
        }
    }

    private static int numeroAleatorio (){
        return ((int)Math.floor(Math.random()*10));
    }

    public static void intercambio(int lista[]){
        
        //Usamos un bucle anidado
        
        // 0, 1, 2, 3, 4   posiciones 
        
        // 8, 3, 6, 1, 9   elementos
        
        // 3, 8, 6, 1, 9
        
        // 1, 8, 6, 3, 9
        
        // 1, 6, 8, 3, 9
        
        // 1, 3, 8, 6, 9
        
        // 1, 3, 6, 8, 9
        int variableauxiliar=0;
        int k=0;
        int l=0;
        for(int i=0;i<(lista.length-1);i++){
            l++;
            System.out.println("**********");
            System.out.println("Ciclo: "+l);
            System.out.println("**********");
                                   
            for(int j=i+1;j<lista.length;j++){ 
                
                if(lista[i]>lista[j]){
                    //Intercambiamos valores
                    k++;
                    System.out.println("iteracion "+k);
                    variableauxiliar=lista[i];
                    lista[i]=lista[j];
                    lista[j]=variableauxiliar;
                    imprimirArray(lista);
                    System.out.println("");
                    System.out.println("----------------------------------");
                    System.out.println("");
                }
            }
        }
    }

    public static void intercambioPalabras(String lista[]){

        //Usamos un bucle anidado
        
        String variableauxiliar="";
        int k=0;
        int l=0;
        for(int i=0;i<(lista.length-1);i++){
            l++;
            System.out.println("**********");
            System.out.println("Ciclo: "+l);
            System.out.println("**********");
            for(int j=i+1;j<lista.length;j++){
                    
                if(lista[i].compareToIgnoreCase(lista[j])>0){
                    k++;
                    System.out.println("iteracion "+k);
                    //Intercambiamos valores
                    variableauxiliar=lista[i];
                    lista[i]=lista[j];
                    lista[j]=variableauxiliar;
                    imprimirArray(lista);
                    System.out.println("");
                    System.out.println("----------------------------------");
                    System.out.println("");
                }
            }
        }
    }  
}
    
