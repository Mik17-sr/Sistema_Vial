package Control;

import Modelo.Comparendo;
import Modelo.ComparendoDAO;
import Modelo.Propietario;
import Modelo.PropietarioDAO;
import Modelo.Vehiculo;
import Modelo.VehiculoDAO;
import Vista.PanelComparendo;
import Vista.Principal;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ControladorPrincipal implements ActionListener{
    Principal principal;
    ArrayList<Propietario> propietarios;
    ArrayList<Vehiculo> vehiculos;
    ArrayList<Comparendo> comparendos;

    public ControladorPrincipal(Principal principal) {
        this.principal = principal;
    }
    
    public ControladorPrincipal() {
        this.principal = new Principal();
        this.propietarios = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
        this.comparendos = new ArrayList<>();
    }
    
    public void iniciar(){
        principal.setTitle("SISTEMA");
        principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        principal.setResizable(false);
        principal.setLocationRelativeTo(null);
        
        anadirActionListener(principal);
        // Panel Ingreso de Propietarios
        iniciarTablaPropietarios();
        
        
        
        // Panel Ingreso Vehiculos
        iniciarTablaVehiculos();
        iniciarCombo();
        principal.getRdbGrupoTipoV().add(principal.getRdbAuto());
        principal.getRdbGrupoTipoV().add(principal.getRdbMoto());
        
        //Panel Comparendos
        principal.getPnlComparendos().setLayout(new GridLayout(0, 3, 10, 10));
        mostrarComparendos();
        
        
        principal.setVisible(true);
        
    }
    
    public void iniciarPropietarios(){
        PropietarioDAO propietarioDAO = new PropietarioDAO();
        propietarios = propietarioDAO.listarPropietarios();
    }
    
    public void iniciarVehiculos(){
        VehiculoDAO vehiculoDAO = new VehiculoDAO();
        vehiculos = vehiculoDAO.listarVehiculos(propietarios);
    }
    
    public void iniciarComparendos(){
        ComparendoDAO comparendoDAO = new ComparendoDAO();
        comparendos = comparendoDAO.listarComparendos(vehiculos);
    }
    
    // Tabla propietarios
    public void iniciarTablaPropietarios(){
        iniciarPropietarios();
        for(Propietario propietario : propietarios){
            agregarLineaPropietario((DefaultTableModel) principal.getTblPropietarios().getModel(), propietario);
        }
    }
    
    public void iniciarTablaVehiculos(){
        iniciarVehiculos();
        for(Vehiculo vehiculo : vehiculos){
            agregarLineaVehiculo((DefaultTableModel) principal.getTblVehiculos().getModel(), vehiculo);
        }
    }    
    
    public void agregarLineaPropietario(DefaultTableModel plantilla, Propietario propietario){
        plantilla.addRow(new Object[]{
            propietario.getIdPropietario(),
            propietario.getNombre(),
            propietario.getIdentificacion(),
            propietario.getCorreo(),
        });
    }
    
    public void agregarLineaVehiculo(DefaultTableModel plantilla, Vehiculo vehiculo){
        plantilla.addRow(new Object[]{
            vehiculo.getIdVehiculo(),
            vehiculo.getPlaca(),
            vehiculo.getMarca(),
            vehiculo.getModelo(),
            vehiculo.getTipoVehiculo(),
            vehiculo.getPropietario().getNombre() 
        });
    }
    
    public void iniciarCombo(){
        principal.getComboPropietario().addItem("");    
        for(Propietario propietario : propietarios){
            principal.getComboPropietario().addItem(propietario.getIdPropietario() + " " + propietario.getNombre());
        }
    }
    
    public void agregarTarjeta(PanelComparendo tarjeta){
        principal.getPnlComparendos().add(tarjeta);
        principal.getPnlComparendos().revalidate();
        principal.getPnlComparendos().repaint();
    }
    
    public void limpiarTarjetas(){
        principal.getPnlComparendos().removeAll();
    }
    
    private void mostrarComparendos(){
        iniciarComparendos();
        limpiarTarjetas();
        for(Comparendo c : comparendos){
            PanelComparendo tarjeta = new PanelComparendo();
            tarjeta.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            setValoresComparendo(c, tarjeta);
            tarjeta.setPreferredSize(new Dimension(190, 190));
            agregarTarjeta(tarjeta);
        }
    }
    
    private void setValoresComparendo(Comparendo c, PanelComparendo tarjeta){
        tarjeta.getLblComparendoId().setText("Comparendo " + c.getIdComparendo());
        tarjeta.getLblHoraT().setText(c.getHora().toString());
        tarjeta.getLblTipoT().setText(c.getTipo());
        tarjeta.getLblFechaT().setText(c.getFecha().toString());
        tarjeta.getLblPlacaT().setText(c.getVehiculo().getPlaca());
    }
    
    
    public void resetTextFields(Container c){
        principal.getRdbGrupoTipoV().clearSelection();
        for(Component component : c.getComponents()){
            if(component instanceof JTextField){
                ((JTextField) component).setText("");
            }else if(component instanceof JComboBox){
                ((JComboBox) component).setSelectedIndex(0);
            }else if(component instanceof Container){
                resetTextFields((Container) component);
            }
        }
    }
    
    public void anadirActionListener(Container c){
        for(Component component : c.getComponents()){
            if(component instanceof JButton){
                ((JButton) component).addActionListener(this);
            }else if(component instanceof Container){
                anadirActionListener((Container) component);
            }
        }
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(principal.getBtnEnviar())){
            Propietario propietario = new Propietario();
            PropietarioDAO propietarioDAO = new PropietarioDAO();
            propietario.setNombre(principal.getTxtNombre().getText());
            propietario.setIdentificacion(principal.getTxtIdentificacion().getText());
            propietario.setCorreo(principal.getTxtCorreo().getText());
            if(propietarioDAO.agregarPropietario(propietario)){
                propietarios.add(propietario);
                agregarLineaPropietario((DefaultTableModel) principal.getTblPropietarios().getModel(), propietario);
                resetTextFields(principal.getJPropietario());
                JOptionPane.showMessageDialog(principal, "Propietario agregado con éxito", "EXITO", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(principal, "Propietario no fue agregado con éxito", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        if(e.getSource().equals(principal.getBtnEnviarV())){
            Vehiculo vehiculo = new Vehiculo();
            VehiculoDAO vehiculoDAO = new VehiculoDAO();
            vehiculo.setPlaca(principal.getTxtPlaca().getText());
            vehiculo.setMarca(principal.getTxtMarca().getText());
            vehiculo.setModelo(principal.getYearModelo().getYear());
            if(principal.getRdbAuto().isSelected()){
               vehiculo.setTipoVehiculo("Carro");
            }else if(principal.getRdbMoto().isSelected()){
                vehiculo.setTipoVehiculo("Moto");
            }else{
                System.err.println("Seleccione tipo de vehiculo");    
            }
            if(!principal.getComboPropietario().getSelectedItem().toString().equals("")){
                String[] palabras = principal.getComboPropietario().getSelectedItem().toString().split(" ");
                for(Propietario propietario : propietarios){
                    if(Integer.parseInt(palabras[0]) == (propietario.getIdPropietario())){
                        vehiculo.setPropietario(propietario);
                    }
                }
            }else{
                System.err.println("Seleccione un item valido de propietario");
            }
            
            if(vehiculoDAO.agregarVehiculo(vehiculo)){
                vehiculos.add(vehiculo);
                agregarLineaVehiculo((DefaultTableModel) principal.getTblVehiculos().getModel(), vehiculo);
                resetTextFields(principal.getJVehiculo());
                JOptionPane.showMessageDialog(principal, "Vehiculo agregado con éxito", "EXITO", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(principal, "Vehiculo no fue agregado con éxito", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
}
