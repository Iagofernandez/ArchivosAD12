
package serializacion1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializacion1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
// Crear unha clase chamada mclase 
// que implemente a interfaz serializable  (implements Serializable). 
// Dita clase debe ter tres atributos  :
// unha variable String  (nome)  outra int (numero1) e outra double (numero2) 
        MClase obx = new MClase("ola",-7,2.7E10);
        
        
        FileOutputStream escribir = new FileOutputStream("/home/oracle/Desktop/Eje11/serial.txt");
        ObjectOutputStream escribir1 = new ObjectOutputStream(escribir);
        
        //El metodo writeObject d eObjectOutputStream
        //permite escribir el objeto en el archivo ObjectOutputStream
        //todo excpeto las variables de tipo transient
        escribir1.writeObject(obx);
        
    }
    
}
class MClase implements Serializable{
    private String serial;
    
    
    //Las variables tipo transient
    //demarcan el valor temporal de una variable
    //y indicamos que si el objeto que vamos a serializar, pues esta variable no lo hará
    private transient int nSerial;
    private double nSerial2;

    public MClase(String serial, int nSerial, double nSerial2) {
        this.serial = serial;
        this.nSerial = nSerial;
        this.nSerial2 = nSerial2;
    }

    @Override
    public String toString() {
        return "MClase{" + "serial=" + serial + ", nSerial=" + nSerial + ", nSerial2=" + nSerial2 + '}';
    }
    
    
}
