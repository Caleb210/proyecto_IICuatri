
package com.mycompany.proyecto_restaurante;

import javax.swing.JOptionPane; //importacion
public class Proyecto_Restaurante {

    public static void main(String[] args) {
        //Declaración de constantes
        String cliente = "root";
        int password =  1234;

        //Declaración de variables
        int verificarContra;
        int intentos = 0;
        String verificarUsuario = "";

        //Login
        while (intentos < 3){
            verificarUsuario = JOptionPane.showInputDialog("Ingrese su usuario");
            verificarContra = Integer.parseInt(JOptionPane.showInputDialog("ingrese su contraseña"));

            if (verificarUsuario.equals(cliente) && verificarContra == password){  //se usa .equals para comparar ya que el == no sirve en el string
            JOptionPane.showMessageDialog(null, "Bienvenido al restaurante Delicias Gourmet");
            break;

            }else{
                JOptionPane.showMessageDialog(null, "Contraseña Incorrecta");
                intentos ++;
            }
           }
            if (intentos == 3) {
                JOptionPane.showMessageDialog(null, "Intentos máximos alcanzados");
            }
    }
}
