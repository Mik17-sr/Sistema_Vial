package sistema;

import Control.ControladorLogin;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTAtomOneLightIJTheme;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Sistema {

    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(new FlatMTAtomOneLightIJTheme());
        }catch(UnsupportedLookAndFeelException e){
            System.err.println("Error al inicializar");
        }
        ControladorLogin objC = new ControladorLogin();
        objC.iniciar();
    }
    
}
