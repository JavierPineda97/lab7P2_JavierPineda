
package spotify;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class adminArtistas {
   private ArrayList<Artistas> listaArtistas = new ArrayList();
   private File archivo = null;
   
   public adminArtistas(String path) {
        archivo = new File(path);
    }

    public ArrayList<Artistas> getListaArtistas() {
        return listaArtistas;
    }

    public void setListaArtistas(ArrayList<Artistas> listaArtistas) {
        this.listaArtistas = listaArtistas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setArtista(Artistas a){
        listaArtistas.add(a);
    }
    
    public void cargarArchivo() {
        try {            
            listaArtistas = new ArrayList();
            Artistas temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Artistas) objeto.readObject()) != null) {
                        listaArtistas.add(temp);
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
            for (Artistas a : listaArtistas) {
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

