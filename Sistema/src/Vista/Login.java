package Vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JPanel();
        img = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        lblLogin2 = new javax.swing.JLabel();
        lblLogin1 = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblSistema = new javax.swing.JLabel();
        jTextUser = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        btnEnviar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        back.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login.jpg"))); // NOI18N
        lblIcon.setText("jLabel1");
        img.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 460, -1));

        back.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 460, 700));

        lblLogin2.setFont(new java.awt.Font("Roboto ExtraBold", 0, 18)); // NOI18N
        lblLogin2.setForeground(new java.awt.Color(0, 0, 0));
        lblLogin2.setText("CONTRASEÑA");
        back.add(lblLogin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 130, -1));

        lblLogin1.setFont(new java.awt.Font("Roboto ExtraBold", 0, 18)); // NOI18N
        lblLogin1.setForeground(new java.awt.Color(0, 0, 0));
        lblLogin1.setText("USUARIO");
        back.add(lblLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 80, -1));

        lblLogin.setFont(new java.awt.Font("Roboto ExtraBold", 0, 24)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(0, 0, 0));
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setText("Login");
        back.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 290, -1));

        lblSistema.setFont(new java.awt.Font("Roboto ExtraBold", 0, 36)); // NOI18N
        lblSistema.setForeground(new java.awt.Color(0, 0, 0));
        lblSistema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSistema.setText("SISTEMA VIAL");
        back.add(lblSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 290, -1));

        jTextUser.setForeground(new java.awt.Color(0, 0, 0));
        jTextUser.setBorder(null);
        back.add(jTextUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 300, 40));

        jPassword.setForeground(new java.awt.Color(0, 0, 0));
        jPassword.setBorder(null);
        back.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 300, 40));

        btnEnviar.setBackground(new java.awt.Color(0, 122, 122));
        btnEnviar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setText("Iniciar Sesión");
        btnEnviar.setBorder(new javax.swing.border.MatteBorder(null));
        back.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 230, 50));
        back.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 300, 30));

        jLabel2.setFont(new java.awt.Font("Roboto SemiCondensed", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cristian Camilo Barrera Franco - 20222578096");
        back.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 280, -1));

        jLabel4.setFont(new java.awt.Font("Roboto SemiCondensed", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Miguel Ángel Sierra Larrota - 20241578013");
        back.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 280, -1));

        jLabel3.setFont(new java.awt.Font("Roboto SemiCondensed", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Docente: Ximena Audrey Velazquez Moya");
        back.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 280, -1));

        jLabel5.setFont(new java.awt.Font("Roboto SemiCondensed", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Dylan Gerhard Arce Triviño - 20241578089");
        back.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 280, -1));

        jLabel1.setFont(new java.awt.Font("Roboto SemiCondensed", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Proyecto Física II: Electromagnetismo");
        back.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 280, -1));

        jLabel6.setFont(new java.awt.Font("Roboto SemiCondensed", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Kevin Mauricio Clavijo González - 20241578015");
        back.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 280, -1));

        jLabel7.setFont(new java.awt.Font("Roboto SemiCondensed", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Tomas David Lancheros Churque - 20241578201");
        back.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 280, -1));
        back.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 300, 30));

        lblError.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 0, 51));
        back.add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 300, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public JPanel getBack() {
        return back;
    }

    public void setBack(JPanel back) {
        this.back = back;
    }

    public JButton getBtnEnviar() {
        return btnEnviar;
    }

    public void setBtnEnviar(JButton btnEnviar) {
        this.btnEnviar = btnEnviar;
    }

    public JPanel getImg() {
        return img;
    }

    public void setImg(JPanel img) {
        this.img = img;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JPasswordField getjPassword() {
        return jPassword;
    }

    public void setjPassword(JPasswordField jPassword) {
        this.jPassword = jPassword;
    }

    public JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public void setjSeparator1(JSeparator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }

    public JSeparator getjSeparator2() {
        return jSeparator2;
    }

    public void setjSeparator2(JSeparator jSeparator2) {
        this.jSeparator2 = jSeparator2;
    }

    public JTextField getjTextUser() {
        return jTextUser;
    }

    public void setjTextUser(JTextField jTextUser) {
        this.jTextUser = jTextUser;
    }

    public JLabel getLblError() {
        return lblError;
    }

    public void setLblError(JLabel lblError) {
        this.lblError = lblError;
    }

    public JLabel getLblIcon() {
        return lblIcon;
    }

    public void setLblIcon(JLabel lblIcon) {
        this.lblIcon = lblIcon;
    }

    public JLabel getLblLogin() {
        return lblLogin;
    }

    public void setLblLogin(JLabel lblLogin) {
        this.lblLogin = lblLogin;
    }

    public JLabel getLblLogin1() {
        return lblLogin1;
    }

    public void setLblLogin1(JLabel lblLogin1) {
        this.lblLogin1 = lblLogin1;
    }

    public JLabel getLblLogin2() {
        return lblLogin2;
    }

    public void setLblLogin2(JLabel lblLogin2) {
        this.lblLogin2 = lblLogin2;
    }

    public JLabel getLblSistema() {
        return lblSistema;
    }

    public void setLblSistema(JLabel lblSistema) {
        this.lblSistema = lblSistema;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel back;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JPanel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextUser;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogin1;
    private javax.swing.JLabel lblLogin2;
    private javax.swing.JLabel lblSistema;
    // End of variables declaration//GEN-END:variables
}
