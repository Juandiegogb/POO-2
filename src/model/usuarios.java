/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class usuarios {
    
    String name;
    int posicion;
    int numero;
    String integrantes;
    
    
    public void crear (JTextField nombres,JTextField cedula,JTextField contraseña) {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/merc", "root", "");
            PreparedStatement a = cn.prepareStatement("INSERT INTO" + " usuarios values(?,?,?,?) ");
            a.setInt(1, 0);
            a.setString(2, cedula.getText().trim());
            a.setString(3, nombres.getText().trim());
            a.setString(4, contraseña.getText().trim());
            a.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario creado exitosamente");
            nombres.setText("Nombres y apellidos");
            cedula.setText("Cedula de ciudadania");
            contraseña.setText("******");
            
        } catch (Exception e) {
            System.out.println("mal    " + e);
        }
}
}
