package Vista;

import javax.swing.JButton;
import javax.swing.JLabel;

public class PanelComparendo extends javax.swing.JPanel {

    public PanelComparendo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblComparendoId = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblHoraT = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblTipoT = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblFechaT = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        lblPlacaT = new javax.swing.JLabel();
        btnVer = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblComparendoId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblComparendoId.setText("jLabel2");
        add(lblComparendoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 190, -1));

        lblHora.setText("Hora:");
        add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        lblHoraT.setText("jLabel3");
        add(lblHoraT, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 100, -1));

        lblTipo.setText("Tipo:");
        add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 65, -1, -1));

        lblTipoT.setText("jLabel3");
        add(lblTipoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 65, 100, -1));

        lblFecha.setText("Fecha:");
        add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        lblFechaT.setText("jLabel3");
        add(lblFechaT, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 100, -1));

        lblPlaca.setText("Placa: ");
        add(lblPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 115, -1, -1));

        lblPlacaT.setText("jLabel3");
        add(lblPlacaT, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 115, 100, -1));

        btnVer.setText("VER");
        btnVer.setToolTipText("");
        add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnVer() {
        return btnVer;
    }

    public void setBtnVer(JButton btnVer) {
        this.btnVer = btnVer;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getLblComparendoId() {
        return lblComparendoId;
    }

    public void setLblComparendoId(JLabel lblComparendoId) {
        this.lblComparendoId = lblComparendoId;
    }

    public JLabel getLblFecha() {
        return lblFecha;
    }

    public void setLblFecha(JLabel lblFecha) {
        this.lblFecha = lblFecha;
    }

    public JLabel getLblFechaT() {
        return lblFechaT;
    }

    public void setLblFechaT(JLabel lblFechaT) {
        this.lblFechaT = lblFechaT;
    }

    public JLabel getLblHora() {
        return lblHora;
    }

    public void setLblHora(JLabel lblHora) {
        this.lblHora = lblHora;
    }

    public JLabel getLblHoraT() {
        return lblHoraT;
    }

    public void setLblHoraT(JLabel lblHoraT) {
        this.lblHoraT = lblHoraT;
    }

    public JLabel getLblPlaca() {
        return lblPlaca;
    }

    public void setLblPlaca(JLabel lblPlaca) {
        this.lblPlaca = lblPlaca;
    }

    public JLabel getLblPlacaT() {
        return lblPlacaT;
    }

    public void setLblPlacaT(JLabel lblPlacaT) {
        this.lblPlacaT = lblPlacaT;
    }

    public JLabel getLblTipo() {
        return lblTipo;
    }

    public void setLblTipo(JLabel lblTipo) {
        this.lblTipo = lblTipo;
    }

    public JLabel getLblTipoT() {
        return lblTipoT;
    }

    public void setLblTipoT(JLabel lblTipoT) {
        this.lblTipoT = lblTipoT;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblComparendoId;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFechaT;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblHoraT;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblPlacaT;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTipoT;
    // End of variables declaration//GEN-END:variables
}
