
package spotify;

import java.io.Serializable;


public class Canciones implements Serializable {
    //Atributos
    private String nombre;
    private String duracion;
    private String nombreCompositor;
    private String nombreDistribuidor;
    private String nombreProductor;
    private String nombreArtista;
    
    private static final long SerialVersionUID=007L;
    
    //Constructores
        public Canciones(){
    
}
    
        public Canciones(String nombre, String duracion, String nombreCompositor, String nombreDistribuidor, String nombreProductor, String nombreArtista) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.nombreCompositor = nombreCompositor;
        this.nombreDistribuidor = nombreDistribuidor;
        this.nombreProductor = nombreProductor;
        this.nombreArtista = nombreArtista;
    }

    Canciones(String showInputDialog, int cant) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Mutadores
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getNombreCompositor() {
        return nombreCompositor;
    }

    public void setNombreCompositor(String nombreCompositor) {
        this.nombreCompositor = nombreCompositor;
    }

    public String getNombreDistribuidor() {
        return nombreDistribuidor;
    }

    public void setNombreDistribuidor(String nombreDistribuidor) {
        this.nombreDistribuidor = nombreDistribuidor;
    }

    public String getNombreProductor() {
        return nombreProductor;
    }

    public void setNombreProductor(String nombreProductor) {
        this.nombreProductor = nombreProductor;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }  
        
    //To String
    @Override
    public String toString() {
        return "Canciones{" + "nombre=" + nombre + ", duracion=" + duracion + ", nombreCompositor=" + nombreCompositor + ", nombreDistribuidor=" + nombreDistribuidor + ", nombreProductor=" + nombreProductor + ", nombreArtista=" + nombreArtista + '}';
    }

 

 
    
}
