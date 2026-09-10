public class Burbuja {
    
    public static void main(String[] args) {
        
        final int TAMANIO=10;
        int lista[]={34,74,26,56,4,48,8,40,82,11};
        //rellenarArray(lista);

//      String lista_String[]={"americano", "Zagal", "pedro", "Tocado", "coz"};
//
        System.out.println("Array de numeros sin ordenar:");
        imprimirArray(lista);
        System.out.println("");
        System.out.println("----------------------------------------");
        System.out.println("");

        //ordenamos el array
        burbuja(lista);

        System.out.println("Array de numeros ordenado:");
        imprimirArray(lista);
        System.out.println("");
        System.out.println("----------------------------------------");
        System.out.println("");

//        System.out.println("Array de String sin ordenar:");
//        imprimirArray(lista_String);
//        System.out.println("-------------------");
//        System.out.println("");
//
//        //ordenamos el array
//        burbujaPalabras (lista_String);
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
            System.out.print(lista[i]+",");
            if(i<lista.length-1){
                System.out.print(",");
            }
        }
    }

    public static void rellenarArray (int lista[]){
        for(int i=0;i<lista.length;i++){
            lista[i]=numeroAleatorio();
        }
    }

    private static int numeroAleatorio (){
        return ((int)Math.floor(Math.random()*100));
    }

    public static void burbuja (int lista[]){
        int cuentaintercambios=0;
        int k=0;
        int j=0;
        //Usamos un bucle anidado, saldra cuando este ordenado el array
        for (boolean ordenado=false;!ordenado;){
            k++;
            System.out.println("**********");
            System.out.println("Ciclo: "+k);
            System.out.println("**********");
            // 0, 1, 2, 3, 4   posiciones
            
            // 8, 3, 6, 1, 9   elementos
            
            // 3, 8, 6, 1, 9
            
            // 3, 6, 8, 1, 9
            
            // 3, 6, 1, 8, 9
            
            // 3, 6, 1, 8
            
            // 3, 1, 6, 8
            
            // 3, 1, 6,
            
            // 1, 3, 6,
            
            // 1, 3
            
            //           0      3          3
            
            
            for (int i=0;i<lista.length-(1+k-1);i++){ //0 valor i
                                                      //3 valor k
                //      1         3
                if (lista[i]>lista[i+1]){ 
                    j++;
                    System.out.println("iteracion "+j);

                    //Intercambiamos valores
                    int variableauxiliar=lista[i];
                    lista[i]=lista[i+1];
                    lista[i+1]=variableauxiliar;
                    //indicamos que hay un cambio
                    cuentaintercambios++; 
                    imprimirArray(lista);
                    System.out.println("");
                    System.out.println("----------------------------------");
                    System.out.println("");

                    
                    
                }
            }
            //Si no hay intercambios, es que esta ordenado.
            if (cuentaintercambios==0){
                ordenado=true;
            }
            //Inicializamos la variable de nuevo para que empiece a contar de nuevo
            cuentaintercambios=0;
        }
    }

    public static void burbujaPalabras (String lista_palabras[]){
        boolean ordenado=false;
        int cuentaIntercambios=0;
        int k=0;
        //Usamos un bucle anidado, saldra cuando este ordenado el array
        while(!ordenado){
            k++;
            for(int i=0;i<lista_palabras.length-1;i++){
                if (lista_palabras[i].compareToIgnoreCase(lista_palabras[i+1])>0){
                    //Intercambiamos valores
                    String aux=lista_palabras[i];
                    lista_palabras[i]=lista_palabras[i+1];
                    lista_palabras[i+1]=aux;
                    //indicamos que hay un cambio
                    cuentaIntercambios++;
                }
            }
            //Si no hay intercambios, es que esta ordenado.
            if (cuentaIntercambios==0){
                ordenado=true;
            }
            //Inicializamos la variable de nuevo para que empiece a contar de nuevo
            cuentaIntercambios=0;
        }

    }
}
        
