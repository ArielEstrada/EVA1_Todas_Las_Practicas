
public class PRINCIPAL {

    
    public static void main(String[] args) {
        //Matriz ----> Arreglo de dos dimenciones
        int[][] Matriz = new int [3][3];
        System.out.println(Matriz);
        Matriz[0][0] = 10;
        Matriz[0][1] = 20;
        Matriz[0][2] = 30;
        Matriz[1][0] = 40;
        Matriz[1][1] = 50;
        Matriz[1][2] = 60;
        Matriz[2][0] = 70;
        Matriz[2][1] = 80;
        Matriz[2][2] = 90;
        System.out.println(Matriz[0]);
        System.out.println(Matriz[1]);
        System.out.println(Matriz[2]);
        //Para recorrer la matriz, necesitamos un ciclo para cada dimencion;
        //los ciclos son anidados: uno dentro de otro
        for(int i = 0; i<3;i++){//Recorremos las filas
            for(int j = 0; j<3; j++){//Recorremos las columnas
                System.out.println(Matriz[i][j]);
            }
        }
        
    }
    
}
