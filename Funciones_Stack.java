
package funciones_stack;


public class Funciones_Stack {

    
    public static void main(String[] args) {
        System.out.println("Inicia Main");
        A();
        System.out.println("Termina Main");
    }
    
    public static void A(){
        System.out.println("Incia A");
        B();
        System.out.println("Termina A");
    }
    public static void B(){
        System.out.println("Incia B");
        C();
        System.out.println("Termina B");
    }
    public static void C(){
        System.out.println("Incia C");
        D();
        System.out.println("Termina C");
    }
    public static void D(){
        System.out.println("Incia D");
        System.out.println("Termina D");
    }
}
