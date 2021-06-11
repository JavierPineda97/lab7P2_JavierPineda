
package spotify;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class AdminAlbums {
    private ArrayList<Albums> listaAlbums = new ArrayList();
   private File archivo = null;
   
   public AdminAlbums(String path) {
        archivo = new File(path);
    }

    public ArrayList<Albums> getListaAlbums() {
        return listaAlbums;
    }

    public void setListaAlbums(ArrayList<Albums> listaAlbums) {
        this.listaAlbums = listaAlbums;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setArtista(Albums a){
        listaAlbums.add(a);
    }
    
     public void cargarArchivo() {
        try {            
            listaAlbums = new ArrayList();
            Albums temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Albums) objeto.readObject()) != null) {
                        listaAlbums.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

   public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Albums a : listaAlbums) {
                bw.writeObject(a);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
   }
    
}
