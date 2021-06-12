
package spotify;

import java.io.Serializable;
import java.util.ArrayList;


public class Playlist implements Serializable {
    private String nombre;
    private ArrayList<Canciones>canciones;
    private static final long SerialVersionUID=774L;

    public Playlist(String Nombre, ArrayList<Canciones>canciones) {
        this.nombre = nombre;
        this.canciones = canciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = nombre;
    }

    

    public ArrayList<Canciones> getCanciones() {
        return canciones;
    }

    public void setC(ArrayList<Canciones>canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "Playlist{" + "Nombre=" + nombre + ", Canciones=" + canciones + '}';
    }
}
