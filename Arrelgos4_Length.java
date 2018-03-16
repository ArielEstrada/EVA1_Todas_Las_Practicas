
package arrelgos4_length;

/**
 *
 * @author Ariel
 */
public class Arrelgos4_Length {

    
    public static void main(String[] args) {
        int Arreglo[] = new int[5];
        Arreglo[0] = 12;
        Arreglo[1] = 13;
        Arreglo[2] = 34;
        Arreglo[3] = 45;
        Arreglo[4] = 23;
        for(int i:Arreglo){
            System.out.println("Arreglo " + i);
           
        }
        int ArrCopia[] = new int[Arreglo.length];
        for(int i=0; i<Arreglo.length; i++){
            ArrCopia[i]=Arreglo[i];
        }
        for(int i:ArrCopia){
            System.out.println("ArrCopia "+i);
        }
        Arreglo = new int[10];//Aquí cambió el tamaño del arreglo original
        for(int i=0; i<ArrCopia.length; i++){
            Arreglo[i]= ArrCopia[i];
        }
        System.out.println("Despues de cambiar el tamaño del arreglo");
        for(int i:Arreglo){
            System.out.println("Arreglo " + i);
           
        }
        
        
        
    }
    
}
