
package spotify;

import java.io.Serializable;
import java.util.ArrayList;


public class Artistas implements Serializable {
    private ArrayList<Canciones> canciones = new ArrayList();
    
    //Atributos
    private  String nombre;
    private String genero;
    private String nombreDisquera;
    private String nombreConocido;
    private String registro;
    
      private static final long SerialVersionUID=696l;
    
    //Constructores
    public Artistas(String nombre, String genero, String nombreDisquera, String nombreConocido, String registro) {
        this.nombre = nombre;
        this.genero = genero;
        this.nombreDisquera = nombreDisquera;
        this.nombreConocido = nombreConocido;
        this.registro = registro;
    }
      
       
    //Mutadores
    public ArrayList<Canciones> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Canciones> canciones) {
        this.canciones = canciones;
    }
        
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombreDisquera() {
        return nombreDisquera;
    }

    public void setNombreDisquera(String nombreDisquera) {
        this.nombreDisquera = nombreDisquera;
    }

    public String getNombreConocido() {
        return nombreConocido;
    }

    public void setNombreConocido(String nombreConocido) {
        this.nombreConocido = nombreConocido;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
    
    //To String
    @Override
    public String toString() {
        return "Artistas{" + "canciones=" + canciones + ", nombre=" + nombre + ", genero=" + genero + ", nombreDisquera=" + nombreDisquera + ", nombreConocido=" + nombreConocido + ", registro=" + registro + '}';
    }
    
     
}

   
