
package copia_arreglos2;

/**
 *
 * @author Ariel
 */
public class Copia_Arreglos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int Arr[]= new int[5];
        Arr[0]=10;
        Arr[1]=20;
        Arr[2]=30;
        Arr[3]=40;
        Arr[4]=50;
        //Copia del arreglo
        int ArrCop[] = new int[Arr.length];
        //Esto no sirve:
        //ArrCop= Arr;
        //Esto si
        for(int i =0; i<Arr.length; i++){
            ArrCop[i] = Arr[i];
        }
        for(int i:ArrCop){
            System.out.println("Copia " + i);
        }
        Arr[2]=300000;
        System.out.println("\n");
        for(int i:ArrCop){
            System.out.println("Copia " + i);
        }
        System.out.println(Arr);
        System.out.println(ArrCop);//Direcciones completamente distintas, por lo tanto son copias independientes
        
    }
    
}
