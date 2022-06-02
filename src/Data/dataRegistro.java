/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class dataRegistro {

    public void verificar(JTextField cedula, JTextField contraseña, JTextField confirmacion, JLabel checkCedula, JLabel checkContraseña, JButton botonCrear) {
        if (cedula.getText().length() == 8 || cedula.getText().length() == 10) {
            checkCedula.setForeground(Color.green);
            checkCedula.setText("✓");
            botonCrear.setVisible(true);

        } else {
            checkCedula.setForeground(Color.red);
            checkCedula.setText("!");
            botonCrear.setVisible(false);

        }
        if (contraseña.getText().equals(confirmacion.getText())) {
            checkContraseña.setForeground(Color.green);
            checkContraseña.setText("✓");
            botonCrear.setVisible(true);

        } else {
            checkContraseña.setForeground(Color.red);
            checkContraseña.setText("Contraseñas no coinciden");
            botonCrear.setVisible(false);
        }
    }
}
