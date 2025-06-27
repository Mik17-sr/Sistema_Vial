package Vista;

import com.toedter.calendar.JYearChooser;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdbGrupoTipoV = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        JPropietario = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblIdentificacion = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnEnviar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPropietarios = new javax.swing.JTable();
        JVehiculo = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        lblPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        lblModelo = new javax.swing.JLabel();
        YearModelo = new com.toedter.calendar.JYearChooser();
        lblMarca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        rdbAuto = new javax.swing.JRadioButton();
        rdbMoto = new javax.swing.JRadioButton();
        lblPropietario = new javax.swing.JLabel();
        comboPropietario = new javax.swing.JComboBox<>();
        btnEnviarV = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVehiculos = new javax.swing.JTable();
        JComparendos = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        pnlComparendos = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPropietario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNombre.setText("Nombre");
        JPropietario.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 20));
        JPropietario.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 320, 40));

        lblCorreo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCorreo.setText("Correo");
        JPropietario.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, 20));
        JPropietario.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 320, 40));

        lblIdentificacion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblIdentificacion.setText("Identificación");
        JPropietario.add(lblIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 20));
        JPropietario.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 320, 40));
        JPropietario.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 720, 50));

        btnEnviar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEnviar.setText("ENVIAR");
        JPropietario.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 320, 40));

        tblPropietarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Propietario", "Nombre", "Identificación", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPropietarios);

        JPropietario.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 640, 260));

        jTabbedPane1.addTab("Registrar Propietario", JPropietario);

        JVehiculo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        JVehiculo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 720, 40));

        lblPlaca.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPlaca.setText("Placa");
        JVehiculo.add(lblPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 20));
        JVehiculo.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 320, 40));

        lblModelo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblModelo.setText("Modelo");
        JVehiculo.add(lblModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, 20));

        YearModelo.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        JVehiculo.add(YearModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 320, 40));

        lblMarca.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblMarca.setText("Marca");
        JVehiculo.add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 20));
        JVehiculo.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 320, 40));

        lblTipo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTipo.setText("Tipo");
        JVehiculo.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 155, -1, 30));

        rdbAuto.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        rdbAuto.setText("Carro");
        JVehiculo.add(rdbAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 191, -1, 40));

        rdbMoto.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        rdbMoto.setText("Moto");
        JVehiculo.add(rdbMoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, 40));

        lblPropietario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPropietario.setText("Propietario");
        JVehiculo.add(lblPropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 275, -1, 30));

        JVehiculo.add(comboPropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 320, 40));

        btnEnviarV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEnviarV.setText("ENVIAR");
        JVehiculo.add(btnEnviarV, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 320, 40));

        tblVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Vehiculo", "Placa", "Marca", "Modelo", "Tipo Vehiculo", "Nombre Propietario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblVehiculos);

        JVehiculo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 640, 150));

        jTabbedPane1.addTab("Registrar Vehiculo", JVehiculo);

        JComparendos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout pnlComparendosLayout = new javax.swing.GroupLayout(pnlComparendos);
        pnlComparendos.setLayout(pnlComparendosLayout);
        pnlComparendosLayout.setHorizontalGroup(
            pnlComparendosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );
        pnlComparendosLayout.setVerticalGroup(
            pnlComparendosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );

        jScrollPane3.setViewportView(pnlComparendos);

        JComparendos.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 16, 690, 510));

        jTabbedPane1.addTab("Ver Comparendos", JComparendos);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 720, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public JPanel getJComparendos() {
        return JComparendos;
    }

    public void setJComparendos(JPanel JComparendos) {
        this.JComparendos = JComparendos;
    }

    public JPanel getJPropietario() {
        return JPropietario;
    }

    public void setJPropietario(JPanel JPropietario) {
        this.JPropietario = JPropietario;
    }

    public JPanel getJVehiculo() {
        return JVehiculo;
    }

    public void setJVehiculo(JPanel JVehiculo) {
        this.JVehiculo = JVehiculo;
    }

    public JYearChooser getYearModelo() {
        return YearModelo;
    }

    public void setYearModelo(JYearChooser YearModelo) {
        this.YearModelo = YearModelo;
    }

    public JButton getBtnEnviar() {
        return btnEnviar;
    }

    public void setBtnEnviar(JButton btnEnviar) {
        this.btnEnviar = btnEnviar;
    }

    public JComboBox<String> getComboPropietario() {
        return comboPropietario;
    }

    public void setComboPropietario(JComboBox<String> comboPropietario) {
        this.comboPropietario = comboPropietario;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public void setjSeparator1(JSeparator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }

    public JTabbedPane getjTabbedPane1() {
        return jTabbedPane1;
    }

    public void setjTabbedPane1(JTabbedPane jTabbedPane1) {
        this.jTabbedPane1 = jTabbedPane1;
    }

    public JLabel getLblCorreo() {
        return lblCorreo;
    }

    public void setLblCorreo(JLabel lblCorreo) {
        this.lblCorreo = lblCorreo;
    }

    public JLabel getLblIdentificacion() {
        return lblIdentificacion;
    }

    public void setLblIdentificacion(JLabel lblIdentificacion) {
        this.lblIdentificacion = lblIdentificacion;
    }

    public JLabel getLblMarca() {
        return lblMarca;
    }

    public void setLblMarca(JLabel lblMarca) {
        this.lblMarca = lblMarca;
    }

    public JLabel getLblModelo() {
        return lblModelo;
    }

    public void setLblModelo(JLabel lblModelo) {
        this.lblModelo = lblModelo;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblPlaca() {
        return lblPlaca;
    }

    public void setLblPlaca(JLabel lblPlaca) {
        this.lblPlaca = lblPlaca;
    }

    public JLabel getLblPropietario() {
        return lblPropietario;
    }

    public void setLblPropietario(JLabel lblPropietario) {
        this.lblPropietario = lblPropietario;
    }

    public JLabel getLblTipo() {
        return lblTipo;
    }

    public void setLblTipo(JLabel lblTipo) {
        this.lblTipo = lblTipo;
    }

    public JRadioButton getRdbAuto() {
        return rdbAuto;
    }

    public void setRdbAuto(JRadioButton rdbAuto) {
        this.rdbAuto = rdbAuto;
    }

    public ButtonGroup getRdbGrupoTipoV() {
        return rdbGrupoTipoV;
    }

    public void setRdbGrupoTipoV(ButtonGroup rdbGrupoTipoV) {
        this.rdbGrupoTipoV = rdbGrupoTipoV;
    }

    public JRadioButton getRdbMoto() {
        return rdbMoto;
    }

    public void setRdbMoto(JRadioButton rdbMoto) {
        this.rdbMoto = rdbMoto;
    }

    public JTable getTblPropietarios() {
        return tblPropietarios;
    }

    public void setTblPropietarios(JTable tblPropietarios) {
        this.tblPropietarios = tblPropietarios;
    }

    public JTextField getTxtCorreo() {
        return txtCorreo;
    }

    public void setTxtCorreo(JTextField txtCorreo) {
        this.txtCorreo = txtCorreo;
    }

    public JTextField getTxtIdentificacion() {
        return txtIdentificacion;
    }

    public void setTxtIdentificacion(JTextField txtIdentificacion) {
        this.txtIdentificacion = txtIdentificacion;
    }

    public JTextField getTxtMarca() {
        return txtMarca;
    }

    public void setTxtMarca(JTextField txtMarca) {
        this.txtMarca = txtMarca;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtPlaca() {
        return txtPlaca;
    }

    public void setTxtPlaca(JTextField txtPlaca) {
        this.txtPlaca = txtPlaca;
    }

    public JButton getBtnEnviarV() {
        return btnEnviarV;
    }

    public void setBtnEnviarV(JButton btnEnviarV) {
        this.btnEnviarV = btnEnviarV;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JSeparator getjSeparator2() {
        return jSeparator2;
    }

    public void setjSeparator2(JSeparator jSeparator2) {
        this.jSeparator2 = jSeparator2;
    }

    public JTable getTblVehiculos() {
        return tblVehiculos;
    }

    public void setTblVehiculos(JTable tblVehiculos) {
        this.tblVehiculos = tblVehiculos;
    }

    public JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public void setjScrollPane3(JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
    }

    public JPanel getPnlComparendos() {
        return pnlComparendos;
    }

    public void setPnlComparendos(JPanel pnlComparendos) {
        this.pnlComparendos = pnlComparendos;
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JComparendos;
    private javax.swing.JPanel JPropietario;
    private javax.swing.JPanel JVehiculo;
    private com.toedter.calendar.JYearChooser YearModelo;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnEnviarV;
    private javax.swing.JComboBox<String> comboPropietario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblIdentificacion;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblPropietario;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JPanel pnlComparendos;
    private javax.swing.JRadioButton rdbAuto;
    private javax.swing.ButtonGroup rdbGrupoTipoV;
    private javax.swing.JRadioButton rdbMoto;
    private javax.swing.JTable tblPropietarios;
    private javax.swing.JTable tblVehiculos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
