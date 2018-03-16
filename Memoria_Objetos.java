
package memoria_objetos;


public class Memoria_Objetos {

    
    public static void main(String[] args) {
        int iOtroVal= 11;
        double iSalario = 1500.50;
        Prueba pObj = new Prueba();
        System.out.println("Otro valor " + iOtroVal);
        System.out.println("Salario " + iSalario);
        System.out.println("Obj " + pObj);//Estoy imprimiendo la direccion de la maquina virtual
        System.out.println("Valor del obj " + pObj.iVal);
    }
    
}

class Prueba{
    int iVal= 5;
}
