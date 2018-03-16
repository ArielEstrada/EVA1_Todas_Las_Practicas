
package arreglos3;

import java.util.Scanner;


public class Arreglos3 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int iArr[];//Arreglo sin capturar
        Scanner Cap = new Scanner(System.in);//Captura desde teclado
        //System.out.println(iArr[2]);
        System.out.println("Introduce la cantidad de edades a capturar: ");
        int iTam = Cap.nextInt();//captura desde el teclado al dar enter
        iArr = new int [iTam];
        for(int i = 0; i<iArr.length; i++){
            System.out.println("Introduce la edad: ");
            iArr[i]= Cap.nextInt();
        }
        /*for(int i = 0; i<iArr.length; i++){
            System.out.println("iArr["+ i + "]="+ iArr[i]);
            
        }*/
        for( int i: iArr){//ciclo for each; sólo sirve para leer arreglos
            System.out.println("Edad= "+ i);  
        }
    }
    
}
