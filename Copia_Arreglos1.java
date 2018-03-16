
package copia_arreglos1;


public class Copia_Arreglos1 {

    
    
    public static void main(String[] args) {
        
        int Arr[]= new int[5];
        Arr[0]=10;
        Arr[1]=20;
        Arr[2]=30;
        Arr[3]=40;
        Arr[4]=50;
        //Copia del arreglo
        int ArrCop[];
        ArrCop= Arr;
        //imprimir copia
        for(int i: ArrCop){
            System.out.println(i);
        }
        //Modifico Arr
        Arr[2]=999;
        System.out.println("\n");
        //Vuelvo a imprimir copia
        for(int i: ArrCop){
            System.out.println(i);
        }//No es una copia :v, es solo el duplicado de la direccion de memoria
        System.out.println(Arr);
        System.out.println(ArrCop);//es la misma direccion, por lo tanto no es una copia independiente
        
    }
    
}
