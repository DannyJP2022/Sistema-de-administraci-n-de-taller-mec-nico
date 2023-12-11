
package tallermecanico.Graficas;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;
import tallermecanico.BaseDeDatos;
//no lo necesito por ahora y por eso lo coamento --->> import javax.swing.table.DefaultTableModel;
import tallermecanico.PaginaPrincipal;



public class jModuloInicioSesion extends javax.swing.JInternalFrame {

     BaseDeDatos conexion = new BaseDeDatos();
     PaginaPrincipal paginaPrincipal ;
     
    /*Empieza aqui la manera de activar y desactivar las opciones del menu principal desde esta clase*/
    private JMenuItem jMenuLogIn;
    private JMenuItem jMenuLogOut;
    private JMenuItem jMenuAdministrarUsuarios;

    public void setJMenuLogIn(JMenuItem jMenuLogIn) {
        this.jMenuLogIn = jMenuLogIn;
    }
    public void setJMenuLogOut(JMenuItem jMenuLogOut) {
        this.jMenuLogOut = jMenuLogOut;
    }
     public void setJMenuAdministrarUsuarios(JMenuItem jMenuAdministrarUsuarios) {
        this.jMenuAdministrarUsuarios = jMenuAdministrarUsuarios;
    }
    /*//////////////////////////////// termina aqui //////////////////////////////////////////////////*/

     public jModuloInicioSesion(PaginaPrincipal paginaPrincipal) { // CONSTRUCTOR DE LA VENTANA
    initComponents();
    limpiarCampos();
    this.paginaPrincipal = paginaPrincipal;
    this.conexion = new BaseDeDatos();  // inicializamos la conexion con el objeto 
}

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextUser = new javax.swing.JTextField();
        jButtonIngresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel1.setText("Inicio de sesion de usuario");

        jTextUser.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jTextUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUserActionPerformed(evt);
            }
        });

        jButtonIngresar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonIngresar.setText("Validar");
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Contraseña:");

        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jButtonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(192, 192, 192))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jTextUser, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextUser, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButtonIngresar)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextUserActionPerformed

    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
        String usuario = jTextUser.getText();
        String contraseña = null;

        try {
            if (validarCredenciales(usuario, contraseña)) {
                JOptionPane.showMessageDialog(null, "Credenciales válidas. Acceso permitido.");
                if (jMenuLogIn != null) {
                    jMenuLogIn.setEnabled(false);
                    jMenuLogOut.setEnabled(true);    
                    jMenuAdministrarUsuarios.setEnabled(true);
                }
                dispose();
            } else {             
                JOptionPane.showMessageDialog(null, "Credenciales inválidas. Acceso denegado.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(jModuloInicioSesion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonIngresarActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        String contraseña = jPasswordField1.getText();
    }//GEN-LAST:event_jPasswordField1ActionPerformed

 
    
    public boolean validarCredenciales(String usuario, String contraseña) throws ClassNotFoundException {
        String query = "SELECT * FROM proyecto.logininfo";

        try {
            Statement statement = conexion.conexionUsuarioDB().createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                String user = resultSet.getString("username");
                String password = resultSet.getString("password");
                String tipo = resultSet.getString("tipo");

                if (user.equals(usuario) && password.equals(contraseña)) {
                    paginaPrincipal.setSesionActiva(true);
                    paginaPrincipal.usuarioAutenticado.setId(id);
                    paginaPrincipal.usuarioAutenticado.setNombre(nombre);
                    paginaPrincipal.usuarioAutenticado.setApellido(apellido);
                    paginaPrincipal.usuarioAutenticado.setUsername(user);
                    paginaPrincipal.usuarioAutenticado.setTipo(tipo);

                    paginaPrincipal.mostrarInfoUsuarioEnPanel();
                    return true;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    return false; // Credenciales no encontradas o error en la base de datos
}

     public void limpiarCampos() {
        jTextUser.setText("");
        jPasswordField1.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextUser;
    // End of variables declaration//GEN-END:variables
}
