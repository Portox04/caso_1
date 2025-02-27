/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso_1;

import javax.swing.JOptionPane;

/**
 *
 * @author porto
 */
public class Caso_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Registro de Agente
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema de calculos de pagos por favor da click en OK");
        String nameAgent = JOptionPane.showInputDialog("Ingresa el nombre del Agente:");
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu numero de cedula"));
        String jobCode = JOptionPane.showInputDialog("Ingresa tu codigo de venta:");
        String office = JOptionPane.showInputDialog("Ingresa la sucursal que perteneces");
        String transport = JOptionPane.showInputDialog("Cuenta con transporte? (Si/No)");
        Agente agent = new Agente(nameAgent, id, jobCode, office, transport);

        JOptionPane.showMessageDialog(null, "Comencemos a Facturar");
        //Indicar el mes que vamos a facturar
        int month = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de mes empezando con 1 siendo Enero:"));
        //Validar un numero de mes correcto
        while (true) {
            if (month >= 12 || month == 0) {
                month = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un mes valido:"));
            } else {
                break;
            }
        }
        //Bucle de facturacion
        while (true) {
            //Registro de facturas
            String nameClient = JOptionPane.showInputDialog("Ingresa el nombre del Cliente:");
            String idClient = JOptionPane.showInputDialog("Ingresa la cedula del cliente:");
            int code = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu numero de factura"));
            double mount = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el monto de la factura:"));
            int electrical = Integer.parseInt(JOptionPane.showInputDialog("Cuantos productos electricos contiene?"));
            int builds = Integer.parseInt(JOptionPane.showInputDialog("Cuantos productos de construccion contiene?"));
            int motors = Integer.parseInt(JOptionPane.showInputDialog("Cuantos productos de automotriz contiene?"));
            Facturas factura = new Facturas(nameClient, idClient, code, month, electrical, motors, builds);
            factura.setMount(mount);
            factura.bonusCalculate(mount,electrical, motors, builds);
            //Loop de entrada
            String salida = JOptionPane.showInputDialog("Ingresa SI para agregar otra factura o NO para terminar");
            if (salida.compareTo("NO") == 0) {
                break;
            } else if (salida.compareTo("SI") == 0) {

            } else {
                salida = JOptionPane.showInputDialog("Ingresa SI o NO para terminar");
            }
        }
        
        JOptionPane.showMessageDialog(null, toString(factura));
        
    }
}
