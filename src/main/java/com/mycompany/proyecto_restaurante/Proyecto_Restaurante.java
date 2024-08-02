
package com.mycompany.proyecto_restaurante;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane; //importacion
public class Proyecto_Restaurante {

    public static void main(String[] args) {
        //Variables clase cliente
        int cedula = 0;
        String nombre = " ";
        String apellido = " ";
        String VIP=" ";
        String lista=" ";
        // Definir la ruta de la imagen
        String rutaImagen = "src\\main\\java\\com\\mycompany\\logo.jpg";
        ImageIcon icono = new ImageIcon(rutaImagen);

        // Verificar si la imagen se ha cargado correctamente
        if (icono.getIconWidth() == -1) {
            JOptionPane.showMessageDialog(null, "La imagen no se pudo cargar. Verifique la ruta: " + rutaImagen);
        } else {
            JOptionPane.showMessageDialog(null, "Bienvenido al restaurante Delicias Gourmet", "Logo", JOptionPane.INFORMATION_MESSAGE, icono);
        }
        
        //Declaración de constantes
        String cliente = "root";
        int password =  1234;

        //Declaración de variables
        int verificarContra = 0, intentos = 0, opcion = 0;
        String verificarUsuario = "";
        
        //Descripción del Negocio
        String descripcionNegocio = "Delicias Gourmet \n**Con buena expriencia en lo Gourmet**"
                                    + "\n**Nos adaptamos a las nuevas demandas**"
                                    + "\n**Y contamos con un excelente servicio al cliente**";
        JOptionPane.showMessageDialog(null,descripcionNegocio);

        //Login
        while (intentos < 3){
            verificarUsuario = JOptionPane.showInputDialog("Ingrese su usuario");
            verificarContra = Integer.parseInt(JOptionPane.showInputDialog("ingrese su contraseña"));

            if (verificarUsuario.equals(cliente) && verificarContra == password){  //se usa .equals para comparar ya que el == no sirve en el string
                //Creacion del bucle en donde se estara implimiendo el menu
                while(opcion != 5){
                    //Impresion del menu con opciones
                    opcion = Integer.parseInt(JOptionPane.showInputDialog("***** MENU DELICIAS GOURMET *****" + 
                                                                            "\n Bienvenido al menu DELICIAS GOURMET" + cliente + 
                                                                            "\n Seleccione un opcion: " + 
                                                                            "\n 1- Módulo de registro de clientes." + 
                                                                            "\n 2- Agenda de reservas." + 
                                                                            "\n 3- Módulo de ventas de productos." + 
                                                                            "\n 4- Reportes de atención." + 
                                                                            "\n 5- Salir."));
                    //Apertura de un switch donde se manejaran los modulos escogidos por el usuario
                    switch(opcion){
                    case 1:
                        //Módulo de registro de clientes
                        cliente[] arrCliente = new cliente[100];

                        //LLenado del arreglo con objetos
                        for(int i=0; i<arrCliente.length; i++){
                            //Solicitud de datos 
                            cedula=Integer.parseInt(JOptionPane.showInputDialog("Dar cedula "+i));
                            nombre=JOptionPane.showInputDialog("Dar nombre "+i);
                            apellido=JOptionPane.showInputDialog("Dar apellido "+i);
                            VIP=JOptionPane.showInputDialog("Tienes membresia VIP? Si o no "+i);
                            //Guardar datos en el arreglo por instancia
                            arrCliente[i]=new cliente(cedula,nombre,apellido,VIP);
                        }
                        for(int i=0; i<arrEstudiante.length;i++){
                            lista+=("Cliente N"+i+" "+
                            arrCliente[i].getCedula()+" "+
                            arrCliente[i].getNombre()+" "+
                            arrCliente[i].getApellido()+" "+
                            arrCliente[i].getVIP()+"\n");
                        }
                        JOptionPane.showMessageDialog(null, lista); 
                        break;
                    case 2:
                        //Agenda de reservas
                            JOptionPane.showMessageDialog(null, "Modulo en Mantenimiento");
                        break;
                    case 3:
                        //Módulo de ventas de productos
                            JOptionPane.showMessageDialog(null, "Modulo en Mantenimiento");
                        break;
                    case 4:
                        //Reportes de atención
                            JOptionPane.showMessageDialog(null, "Modulo en Mantenimiento");
                        break;
                    case 5:
                        //Salir
                        JOptionPane.showMessageDialog(null,"Fin del Sistema");
                        break;
                    }
                }
            break;
            }else{
                JOptionPane.showMessageDialog(null, "Contraseña Incorrecta");
                intentos ++;
            }
           }if (intentos == 3) {
                JOptionPane.showMessageDialog(null, "Intentos máximos alcanzados");
            }
    }
}
