
package tallermecanico.Graficas;

import tallermecanico.Graficas.jModuloInicioSesion;
import java.util.logging.Level;
import java.util.logging.Logger;
import tallermecanico.TallerMecanico;

public class PaginaPrincipal extends javax.swing.JFrame {

    jModuloInicioSesion moduloInicioSesion = new jModuloInicioSesion(this);
    AdministrarUsuarios administrarUsuarios = new AdministrarUsuarios();

    public PaginaPrincipal() {
        initComponents();
        sinUsuarioVerificado();
        jModuloInicioSesion moduloInicioSesion = new jModuloInicioSesion(this);
        //AdministrarUsuarios administrarUsuarios = new AdministrarUsuarios(this);
        /*borrar es una prueba */ this.add(moduloInicioSesion);
        this.add(administrarUsuarios);
    }

    public static boolean sesionActiva;
    Usuario usuarioAutenticado = new Usuario();

    public Usuario getUsuarioAutenticado() {
        return usuarioAutenticado;
    }

    public void setUsuarioAutenticado(Usuario usuarioAutenticado) {
        this.usuarioAutenticado = usuarioAutenticado;
    }

    public static boolean isSesionActiva() {
        return sesionActiva;
    }

    public static void setSesionActiva(boolean sesionActiva) {
        PaginaPrincipal.sesionActiva = sesionActiva;
    }

    public void mostrarInfoUsuarioEnPanel() {
        if (sesionActiva == true) {
            lblNombreUsuario.setText(usuarioAutenticado.getNombre());
            jPanelUsuarioActivo.setVisible(true);
            jMenuModulos.setEnabled(true);
            jMenuAdministrarUsuarios.setVisible(true);            
        }

    }

    private void sinUsuarioVerificado() {
        sesionActiva = false;
        jMenuLogOut.setEnabled(false);
        jMenuModulos.setEnabled(false);
        jPanelUsuarioActivo.setVisible(false);
        usuarioAutenticado.setId(0);
        usuarioAutenticado.setNombre("");
        usuarioAutenticado.setApellido("");
        usuarioAutenticado.setUsername("");
        usuarioAutenticado.setTipo("");
        
        this.add(moduloInicioSesion);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelUsuarioActivo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        jMenuBarraPrincipal = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuLogIn = new javax.swing.JMenuItem();
        jMenuLogOut = new javax.swing.JMenuItem();
        jMenuModulos = new javax.swing.JMenu();
        jMenuAdministrarUsuarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario activo:");

        lblNombreUsuario.setText("jLabel2");

        javax.swing.GroupLayout jPanelUsuarioActivoLayout = new javax.swing.GroupLayout(jPanelUsuarioActivo);
        jPanelUsuarioActivo.setLayout(jPanelUsuarioActivoLayout);
        jPanelUsuarioActivoLayout.setHorizontalGroup(
            jPanelUsuarioActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuarioActivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelUsuarioActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUsuarioActivoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addComponent(lblNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelUsuarioActivoLayout.setVerticalGroup(
            jPanelUsuarioActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuarioActivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNombreUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuArchivo.setText("Archivo");
        jMenuArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuArchivoActionPerformed(evt);
            }
        });

        jMenuLogIn.setText("Iniciar Sesion");
        jMenuLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLogInActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuLogIn);

        jMenuLogOut.setText("Cerrar sesion");
        jMenuLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLogOutActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuLogOut);

        jMenuBarraPrincipal.add(jMenuArchivo);

        jMenuModulos.setText("Modulos");

        jMenuAdministrarUsuarios.setText("Administrar usuarios");
        jMenuAdministrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAdministrarUsuariosActionPerformed(evt);
            }
        });
        jMenuModulos.add(jMenuAdministrarUsuarios);

        jMenuBarraPrincipal.add(jMenuModulos);

        setJMenuBar(jMenuBarraPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(816, Short.MAX_VALUE)
                .addComponent(jPanelUsuarioActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelUsuarioActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(430, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLogInActionPerformed
        moduloInicioSesion.limpiarCampos();
        moduloInicioSesion.setJMenuLogIn(jMenuLogIn);
        moduloInicioSesion.setJMenuLogOut(jMenuLogOut);
        moduloInicioSesion.setJMenuAdministrarUsuarios(jMenuAdministrarUsuarios);
        moduloInicioSesion.show();

    }//GEN-LAST:event_jMenuLogInActionPerformed

    private void jMenuArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuArchivoActionPerformed

    }//GEN-LAST:event_jMenuArchivoActionPerformed

    private void jMenuLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLogOutActionPerformed
        jMenuLogOut.setEnabled(false);
        jMenuLogIn.setEnabled(true);
        jMenuAdministrarUsuarios.setEnabled(false);
        sinUsuarioVerificado() ;        
    }//GEN-LAST:event_jMenuLogOutActionPerformed

    private void jMenuAdministrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAdministrarUsuariosActionPerformed
        administrarUsuarios.show();
    }//GEN-LAST:event_jMenuAdministrarUsuariosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuAdministrarUsuarios;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBarraPrincipal;
    private javax.swing.JMenuItem jMenuLogIn;
    private javax.swing.JMenuItem jMenuLogOut;
    private javax.swing.JMenu jMenuModulos;
    private javax.swing.JPanel jPanelUsuarioActivo;
    private javax.swing.JLabel lblNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
