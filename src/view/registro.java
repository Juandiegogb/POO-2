/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

//import com.mysql.jdbc.PreparedStatement;
import modelView.RegistroMerc;
import java.awt.*;
import java.sql.*;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class registro extends javax.swing.JFrame {

    String vacio = "";

    public registro() {
        initComponents();
        this.setLocationRelativeTo(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        azul = new javax.swing.JPanel();
        atras = new javax.swing.JButton();
        cedula = new javax.swing.JTextField();
        nombres = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        confirmacion = new javax.swing.JPasswordField();
        guardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        codigoEmpresarial = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(335, 340));
        setSize(new java.awt.Dimension(395, 340));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        azul.setBackground(new java.awt.Color(51, 153, 255));

        atras.setBackground(new java.awt.Color(51, 153, 255));
        atras.setForeground(new java.awt.Color(255, 255, 255));
        atras.setText("🢀");
        atras.setBorder(null);
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout azulLayout = new javax.swing.GroupLayout(azul);
        azul.setLayout(azulLayout);
        azulLayout.setHorizontalGroup(
            azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(azulLayout.createSequentialGroup()
                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        azulLayout.setVerticalGroup(
            azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(atras, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        getContentPane().add(azul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, -1));

        cedula.setForeground(new java.awt.Color(51, 153, 255));
        cedula.setPreferredSize(new java.awt.Dimension(125, 25));
        cedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cedulaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cedulaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cedulaMouseExited(evt);
            }
        });
        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaKeyTyped(evt);
            }
        });
        getContentPane().add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 190, 30));

        nombres.setForeground(new java.awt.Color(51, 153, 255));
        nombres.setPreferredSize(new java.awt.Dimension(125, 25));
        nombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nombresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nombresMouseExited(evt);
            }
        });
        nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombresActionPerformed(evt);
            }
        });
        nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombresKeyTyped(evt);
            }
        });
        getContentPane().add(nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 190, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("REGISTRO DE NUEVO USUARIO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        contraseña.setForeground(new java.awt.Color(51, 153, 255));
        contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contraseñaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                contraseñaMouseExited(evt);
            }
        });
        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });
        contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contraseñaKeyTyped(evt);
            }
        });
        getContentPane().add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 190, 30));

        confirmacion.setForeground(new java.awt.Color(51, 153, 255));
        confirmacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmacionMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmacionMouseExited(evt);
            }
        });
        confirmacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmacionActionPerformed(evt);
            }
        });
        getContentPane().add(confirmacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 190, 30));

        guardar.setBackground(new java.awt.Color(51, 153, 255));
        guardar.setForeground(new java.awt.Color(255, 255, 255));
        guardar.setText("Guardar");
        guardar.setBorder(null);
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 80, 30));

        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("Contraseña");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        jLabel6.setForeground(new java.awt.Color(51, 153, 255));
        jLabel6.setText("Confirmación");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, -1));

        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("Número de cédula");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("Nombres y apellidos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, -1, 40));

        codigoEmpresarial.setForeground(new java.awt.Color(51, 153, 255));
        codigoEmpresarial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                codigoEmpresarialMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                codigoEmpresarialMouseExited(evt);
            }
        });
        codigoEmpresarial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoEmpresarialActionPerformed(evt);
            }
        });
        codigoEmpresarial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoEmpresarialKeyTyped(evt);
            }
        });
        getContentPane().add(codigoEmpresarial, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 190, 30));

        jLabel7.setForeground(new java.awt.Color(51, 153, 255));
        jLabel7.setText("Código empresarial");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombresMouseClicked
        if (nombres.getText().equals(vacio)) {
            nombres.setText(vacio);
        }
    }//GEN-LAST:event_nombresMouseClicked

    private void nombresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombresMouseEntered

    }//GEN-LAST:event_nombresMouseEntered

    private void cedulaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cedulaMouseEntered

    }//GEN-LAST:event_cedulaMouseEntered

    private void nombresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombresMouseExited

    }//GEN-LAST:event_nombresMouseExited

    private void nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombresActionPerformed

    }//GEN-LAST:event_nombresActionPerformed

    public void setNombre_registro1(JTextField nombre_registro1) {
        this.nombres = nombre_registro1;
    }

    private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyTyped
        String a = cedula.getText();
        int cantidad = a.length();
        char c = evt.getKeyChar();

        if (c < '0' || c > '9' || cantidad >= 10) {
            evt.consume();
        }

    }//GEN-LAST:event_cedulaKeyTyped

    private void nombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombresKeyTyped

    }//GEN-LAST:event_nombresKeyTyped

    private void contraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contraseñaKeyTyped

    }//GEN-LAST:event_contraseñaKeyTyped

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        RegistroMerc registroMerc = new RegistroMerc();
        registroMerc.verificar(nombres, cedula, contraseña, confirmacion, codigoEmpresarial);
    }//GEN-LAST:event_guardarActionPerformed

    private void cedulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cedulaMouseClicked

    }//GEN-LAST:event_cedulaMouseClicked

    private void cedulaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cedulaMouseExited
        /*
            nombres.setText("Número de cédula");    }//GEN-LAST:event_cedulaMouseExited
*/
    }
    private void contraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñaMouseClicked
        contraseña.setText(vacio);
    }//GEN-LAST:event_contraseñaMouseClicked

    private void confirmacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmacionMouseClicked
        confirmacion.setText(vacio);
    }//GEN-LAST:event_confirmacionMouseClicked

    private void contraseñaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñaMouseExited

    }//GEN-LAST:event_contraseñaMouseExited

    private void confirmacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmacionMouseExited

    }//GEN-LAST:event_confirmacionMouseExited

    private void confirmacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmacionActionPerformed

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        login lg = new login();
        lg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_atrasActionPerformed

    private void codigoEmpresarialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codigoEmpresarialMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoEmpresarialMouseClicked

    private void codigoEmpresarialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codigoEmpresarialMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoEmpresarialMouseExited

    private void codigoEmpresarialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoEmpresarialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoEmpresarialActionPerformed

    private void codigoEmpresarialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoEmpresarialKeyTyped
        int cantidad = codigoEmpresarial.getText().length();
        char c = evt.getKeyChar();
        if (c < '0' || c > '9' || cantidad >= 6) {
            evt.consume();
        }
    }//GEN-LAST:event_codigoEmpresarialKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registro().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JPanel azul;
    private javax.swing.JTextField cedula;
    private javax.swing.JPasswordField codigoEmpresarial;
    private javax.swing.JPasswordField confirmacion;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombres;
    // End of variables declaration//GEN-END:variables
}
