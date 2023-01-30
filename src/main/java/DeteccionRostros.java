import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;

public class DeteccionRostros {

    public static void ejecutar(){
        Desktop desktop = java.awt.Desktop.getDesktop();
        
        try {
            //specify the protocol along with the URL
            URI oURL = new URI("http://localhost:63342/ImageTransformations/FacexDetection/RECORD/index.html?_ijt=a65o5kq3te2gk8een204lhhon1&_ij_reload=RELOAD_ON_SAVE");
            JOptionPane.showMessageDialog(null,"EJECUTANDO DETECTOR DE ROSTRO EN NAVEGADOR");
            desktop.browse(oURL);
        } catch (URISyntaxException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
                                                    }
                                }
                            }
