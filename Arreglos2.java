
package arreglos2;


public class Arreglos2 {

    public static final int ARRE_TAMA = 30;
    public static void main(String[] args) {
       int iEdades[] = new int [ARRE_TAMA]; //Declaramos el tamaño del arreglo
       //Los arreglos siempre empiezan desde cero 
       //el limite del arreglo es N-1
       //for(int i=0 < iEdades.leng; i++) esta declaracion es equivalente y mas adecuado
       for(int i = 0; i < ARRE_TAMA; i++){//leemos el arreglo
           System.out.println("iEdades[" + i + "]= " + iEdades[i]);
           
       }
       //iEdades[0]= 20;//Asignamos el valor 20 a la pocision 0 del arreglo (metodo manual)
        System.out.println("\n");
       //Llenar entre 0 y 36
       for(int j=0; j< iEdades.length; j++){
           //Math.random regresa valores entre 0 y 1 0.123456789
           //Hay que hacer un casting de double a int
           iEdades[j] = (int)(Math.random()*36);
       }
       for(int i = 0; i < ARRE_TAMA; i++){//leemos el arreglo
           System.out.println("iEdades[" + i + "]= " + iEdades[i]);
           
       }
    }
    
}
