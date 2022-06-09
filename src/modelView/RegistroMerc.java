/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelView;

import java.sql.*;
import javax.swing.*;
import view.inicio;

public class RegistroMerc {

    public void verificar(JTextField nombres, JTextField cedula, JTextField contraseña, JTextField confirmacion, JTextField codigoEmpresarial) {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/merc", "root", "");
            PreparedStatement a = cn.prepareStatement("select * from usuarios where cedula = ?");
            a.setString(1, cedula.getText());
            ResultSet resultado = a.executeQuery();

            if (nombres.getText().isEmpty() || contraseña.getText().isEmpty() || cedula.getText().isEmpty() || codigoEmpresarial.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Completa los campos restantes");
            } else {
                if (nombres.getText().length() < 15) {
                    JOptionPane.showMessageDialog(null, "Digita tus nombres y apellidos completos");
                } else {
                    if (cedula.getText().length() != 8 && cedula.getText().length() != 10) {
                        JOptionPane.showMessageDialog(null, "Comprueba que tu cédula sea correcta");
                    } else {
                        if (resultado.next()) {
                            JOptionPane.showMessageDialog(null, "Número de cédula existente");

                        } else {
                            if (!contraseña.getText().equals(confirmacion.getText())) {
                                JOptionPane.showMessageDialog(null, "Contraseña no coincide");
                            } else {
                                Connection cn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/merc", "root", "");
                                PreparedStatement a2 = cn2.prepareStatement("INSERT INTO usuarios  values(?,?,?) ");
                                a2.setString(1, cedula.getText().trim());
                                a2.setString(2, nombres.getText().trim());
                                a2.setString(3, contraseña.getText().trim());
                                a2.executeUpdate();
                                JOptionPane.showMessageDialog(null, "Usuario creado exitosamente");
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No es posible conectarse a la base de datos");
            System.out.println(e);
        }
    }

    public void buscar(JTextField usuario, JTextField contraseña, JFrame login) {
        Connection cn;
        inicio i = new inicio();

        try {
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/merc", "root", "");
            PreparedStatement a = cn.prepareStatement("select * from usuarios where cedula = ?");
            a.setString(1, usuario.getText());
            ResultSet rs = a.executeQuery();

            if (usuario.getText().isEmpty() || contraseña.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Completa los campos requeridos");

            } else {

                if (rs.next()) {
                    if (rs.getString("contraseña").equals(contraseña.getText())) { //comparar contraseña
                        i.setVisible(true);
                        login.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Usuario no encontrado");
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
