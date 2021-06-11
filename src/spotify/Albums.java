
package spotify;

import java.io.Serializable;
import java.util.ArrayList;


public class Albums implements Serializable{
    private ArrayList<Canciones> canciones = new ArrayList();
    
//Atributos
    private String nombre;
    private String publicacion;
    private String genero;
    private String formatoPublicacion;
    private String alias;
    
    private static final long SerialVersionUID=777l;
    
    //Constructores
        public Albums(String nombre, String publicacion, String genero, String formatoPublicacion, String alias) {
        this.nombre = nombre;
        this.publicacion = publicacion;
        this.genero = genero;
        this.formatoPublicacion = formatoPublicacion;
        this.alias = alias;
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

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFormatoPublicacion() {
        return formatoPublicacion;
    }

    public void setFormatoPublicacion(String formatoPublicacion) {
        this.formatoPublicacion = formatoPublicacion;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
    
        
    //To String
    @Override
    public String toString() {
        return "Albums{" + "canciones=" + canciones + ", nombre=" + nombre + ", publicacion=" + publicacion + ", genero=" + genero + ", formatoPublicacion=" + formatoPublicacion + ", alias=" + alias + '}';
    }
    

    

  
}
