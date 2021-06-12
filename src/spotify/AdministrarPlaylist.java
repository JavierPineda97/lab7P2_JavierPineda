
package spotify;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class AdministrarPlaylist {
    private ArrayList<Playlist> listaPlaylists = new ArrayList();
    private File archivo = null;
    
    public AdministrarPlaylist(String path) {
        archivo = new File(path);
    }

    public ArrayList<Playlist> getListaPlaylists() {
        return listaPlaylists;
    }

    public void setListaPlaylists(ArrayList<Playlist> listaPlaylists) {
        this.listaPlaylists= listaPlaylists;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    //extra mutador
    public void setPlayList(Playlist p) {
        this.listaPlaylists.add(p);
    }
    
    public void cargarArchivo() {
        try {            
            listaPlaylists = new ArrayList();
            Playlist temp;
            if (archivo.exists()) {
                  FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Playlist) objeto.readObject()) != null) {
                        listaPlaylists.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            } //fin if           
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
            for (Playlist t : listaPlaylists) {
                bw.writeObject(t);
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
