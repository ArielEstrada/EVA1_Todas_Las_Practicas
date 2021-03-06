
package arrelgo3_obj;

public class Arrelgo3_Obj {

    
    public static void main(String[] args) {
        //Arreglo de 5 objetos de tipo persona
        Persona iGente[]= new Persona[5];
        iGente[0] = new Persona();//Constructor sin parametros
        iGente[1] = new Persona("Pancho", "Rodriguez", 49);//constructor con parametros
        iGente[2] = new Persona("Juna", "Castro", 52);//constructor con parametros
        iGente[3] = new Persona("Martin", "Acosta", 68);//constructor con parametros
        iGente[4] = new Persona("Daniela", "Gonzalez", 21 );//constructor con parametros
        for(int i=0; i<iGente.length; i++){
            System.out.println("Nombre: " + iGente[i].getiNomb() );
            System.out.println("Apellido: " + iGente[i].getiApe());
            System.out.println("Edad: " + iGente[i].getiEdad());
           
        }
        Persona iCopia[] = new Persona[iGente.length];
        for(int i =0; i<iGente.length; i++){
            //Esto no funciona
            //iCopia[i] = iGente[i];//Copia de referencias
            iCopia[i]= new Persona();//Crear objetos
            iCopia[i].setiNomb(iGente[i].getiNomb());
            iCopia[i].setiApe(iGente[i].getiApe());
            iCopia[i].setiEdad(iGente[i].getiEdad());
             
        }
         System.out.println("\n");
        
        //Hice trampa :v
        //iGente[1] = new Persona("Rodrigo", "Rodriguez", 49);
        iGente[1].setiNomb("Hola");
        iGente[1].setiApe("Mundo");
        iGente[1].setiEdad(23);
        //Imrpimir copia
        for(int i=0; i<iCopia.length; i++){
            System.out.println("Nombre: " + iCopia[i].getiNomb() );
            System.out.println("Apellido: " + iCopia[i].getiApe());
            System.out.println("Edad: " + iCopia[i].getiEdad());
            
        }
        System.out.println("\n");
        for(int i=0; i<iGente.length; i++){
            System.out.println("Nombre: " + iGente[i].getiNomb() );
            System.out.println("Apellido: " + iGente[i].getiApe());
            System.out.println("Edad: " + iGente[i].getiEdad());
           
        }
    }
    
}

class Persona{
    private String iNomb;
    private String iApe;
    private int iEdad;

    public Persona() {
        iNomb = "Ariel Josue";
        iApe = "Estrada Orozco";
        iEdad = 19;
        
    }
    //Constructor con parámetros de entrada
    public Persona(String iNomb, String iApe, int iEdad) {
        this.iNomb = iNomb;
        this.iApe = iApe;
        this.iEdad = iEdad;
    }

    public String getiNomb() {
        return iNomb;
    }

    public void setiNomb(String iNomb) {
        this.iNomb = iNomb;
    }

    public String getiApe() {
        return iApe;
    }

    public void setiApe(String iApe) {
        this.iApe = iApe;
    }

    public int getiEdad() {
        return iEdad;
    }

    public void setiEdad(int iEdad) {
        this.iEdad = iEdad;
    }
    
    
    
}