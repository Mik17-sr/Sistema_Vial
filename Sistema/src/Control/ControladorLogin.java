package Control;

import Modelo.Propietario;
import Vista.Login;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;

public class ControladorLogin implements ActionListener{
    private Login login;
    private String usuario = "admin_user";
    private String password = "admin2025";

    public ControladorLogin(Login login) {
        this.login = login;
    }
    
    public ControladorLogin() { 
        this.login = new Login();
    }
    
    public void iniciar(){
        login.setTitle("Login");
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setResizable(false);
        login.setLocationRelativeTo(null);
        login.getBtnEnviar().addActionListener(this);
        
        
        login.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(login.getBtnEnviar())){
            if(login.getjTextUser().getText().equalsIgnoreCase(usuario) && String.valueOf(login.getjPassword().getPassword()).equals(password)){
                login.dispose();
                Principal principal = new Principal();
                ControladorPrincipal objCPrincipal = new ControladorPrincipal(principal);
                objCPrincipal.iniciar();
            }else{
                login.getLblError().setText("Error: Credenciales Invalidas");
            }
        }
    }
    
    
    
    
}
