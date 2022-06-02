/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

//import com.mysql.jdbc.PreparedStatement;
import java.awt.*;
import java.sql.*;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author juand
 */
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
        volver = new javax.swing.JPanel();
        volverLabel = new javax.swing.JLabel();
        azul = new javax.swing.JPanel();
        cedula = new javax.swing.JTextField();
        nombres = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        x = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        etiquetaCC = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        test = new javax.swing.JButton();
        hola = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(335, 340));
        setSize(new java.awt.Dimension(395, 340));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        volver.setBackground(new java.awt.Color(51, 153, 255));
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                volverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volverMouseExited(evt);
            }
        });
        volver.setLayout(new java.awt.GridBagLayout());

        volverLabel.setForeground(new java.awt.Color(255, 255, 255));
        volverLabel.setText("🢀");
        volverLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                volverLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volverLabelMouseExited(evt);
            }
        });
        volver.add(volverLabel, new java.awt.GridBagConstraints());

        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        azul.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout azulLayout = new javax.swing.GroupLayout(azul);
        azul.setLayout(azulLayout);
        azulLayout.setHorizontalGroup(
            azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 397, Short.MAX_VALUE)
        );
        azulLayout.setVerticalGroup(
            azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(azul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        cedula.setForeground(new java.awt.Color(51, 153, 255));
        cedula.setText("Número de cédula");
        cedula.setPreferredSize(new java.awt.Dimension(125, 25));
        cedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cedulaMouseEntered(evt);
            }
        });
        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaKeyTyped(evt);
            }
        });
        getContentPane().add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 190, -1));

        nombres.setForeground(new java.awt.Color(51, 153, 255));
        nombres.setText("Nombres y apellidos");
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
        getContentPane().add(nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 190, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("REGISTRO DE NUEVO USUARIO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        javax.swing.GroupLayout xLayout = new javax.swing.GroupLayout(x);
        x.setLayout(xLayout);
        xLayout.setHorizontalGroup(
            xLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        xLayout.setVerticalGroup(
            xLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, 50));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 140, 40));

        jLabel3.setText("         ");

        jLabel5.setText("Contraseña");

        jLabel6.setText("Confirmación");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3))
                    .addComponent(etiquetaCC)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addComponent(etiquetaCC)
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 90, 180));

        contraseña.setForeground(new java.awt.Color(51, 153, 255));
        contraseña.setText("jPasswordField1");
        contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contraseñaKeyTyped(evt);
            }
        });
        getContentPane().add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 190, -1));

        jPasswordField2.setForeground(new java.awt.Color(51, 153, 255));
        jPasswordField2.setText("jPasswordField2");
        getContentPane().add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 190, -1));

        test.setText("jButton1");
        test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testActionPerformed(evt);
            }
        });
        getContentPane().add(test, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));
        getContentPane().add(hola, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombresMouseClicked
        nombres.setText("");

    }//GEN-LAST:event_nombresMouseClicked

    private void nombresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombresMouseEntered

    }//GEN-LAST:event_nombresMouseEntered

    private void cedulaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cedulaMouseEntered
        if (("Número de cédula".equals(cedula.getText()))) {
            cedula.setText("");
        }
    }//GEN-LAST:event_cedulaMouseEntered

    private void nombresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombresMouseExited
        String nombre = nombres.getText();
        if (nombre.equals(vacio)) {
            nombres.setText("Nombres y apellidos");

        }
    }//GEN-LAST:event_nombresMouseExited

    private void nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombresActionPerformed

    }//GEN-LAST:event_nombresActionPerformed

    private void volverLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverLabelMouseEntered
    }//GEN-LAST:event_volverLabelMouseEntered

    private void volverLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverLabelMouseExited
         volverLabel.setBackground(new Color(51, 153, 255));    }//GEN-LAST:event_volverLabelMouseExited

    private void volverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseEntered
        volver.setBackground(new Color(50, 173, 255));
    }//GEN-LAST:event_volverMouseEntered

    private void volverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseExited
        volver.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_volverMouseExited

    public void setNombre_registro1(JTextField nombre_registro1) {
        this.nombres = nombre_registro1;
    }

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked
        login Login = new login();
        Login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_volverMouseClicked

    private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyTyped
        String a = cedula.getText();
        int cantidad = a.length();
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (cantidad >= 10) {
            evt.consume();
        }

    }//GEN-LAST:event_cedulaKeyTyped

    private void nombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombresKeyTyped
        String a = nombres.getText();
        int cantidad = a.length();
        char c = evt.getKeyChar();

        if (c < 'a' || c > 'z') {
            evt.consume();
        }
        if (cantidad >= 32) {
            evt.consume();
        }
    }//GEN-LAST:event_nombresKeyTyped

    private void testActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testActionPerformed
        //String a = cedula.getText();
        //int b = Integer.parseInt(a);
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test11", "root", "");
            PreparedStatement a = cn.prepareStatement("INSERT INTO"+" prueba (id,nombre)values(?,?) ");
            a.setInt(1, 0);
            a.setString(2, nombres.getText().trim() );
            /*
            pst.setString(2,nombres.getText().trim());
            pst.setString(2,contraseña.getText().trim());
            */
            a.executeUpdate();
            /*
            nombres.setText("");
            cedula.setText("");
            contraseña.setText("");*/
            hola.setText("listo");
            
            

        } catch (Exception e) {
            System.out.println("mal    "+e);
        }
    }//GEN-LAST:event_testActionPerformed

    private void contraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contraseñaKeyTyped
        String a = contraseña.getText();
        int cantidad = a.length();
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (cantidad >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_contraseñaKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registro().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel azul;
    private javax.swing.JTextField cedula;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel etiquetaCC;
    private javax.swing.JLabel hola;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField nombres;
    private javax.swing.JButton test;
    private javax.swing.JPanel volver;
    private javax.swing.JLabel volverLabel;
    private javax.swing.JPanel x;
    // End of variables declaration//GEN-END:variables
}
