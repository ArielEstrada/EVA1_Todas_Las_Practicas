
package memoria;


public class Memoria {

    
    public static void main(String[] args) {
        Memoria pObj = new Memoria();
        //Para deshacerce de la memoria de un objeto
        pObj = null; //Liberamos la memoria para crear el objeto
        /*Todo objeto en memoria que nos es referenciado por alguna variable 
         es eliminado por el garbaje*/
        Memoria pObj2 = new Memoria();
        Memoria pCopia = pObj2;
        /*
        No duplicamos el onjeto, duplicamos la dieccion
        
        
        queremos eliminar pObj2
        */
        pObj2 = null; //No se elimina el objeto, porque sigue apuntado
        pCopia = null; //Ahora si, el objeto se elimina, no quedan mas referencias
    }
    
}
