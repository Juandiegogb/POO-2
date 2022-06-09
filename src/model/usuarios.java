package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.*;
import java.sql.*;


public class usuarios {
    
    
    ImageIcon icon = new ImageIcon("logo.png");
    
    public void crear (JTextField nombres,JTextField cedula,JTextField contraseña) {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/merc", "root", "");
            PreparedStatement a = cn.prepareStatement("INSERT INTO" + " usuarios values(?,?,?,?) ");
            a.setInt(1, 0);
            a.setString(2, cedula.getText().trim());
            a.setString(3, nombres.getText().trim());
            a.setString(4, contraseña.getText().trim());
            a.executeUpdate();
            JOptionPane.showInternalMessageDialog(null, "Usuario creado exitosamente", "",2,icon);
            nombres.setText("Nombres y apellidos");
            cedula.setText("Cedula de ciudadania");
            contraseña.setText("******");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la conexión con el servidor intentalo más tarde");
        }
}
}
