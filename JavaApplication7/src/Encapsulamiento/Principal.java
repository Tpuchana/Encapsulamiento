/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Encapsulamiento;
import javax.swing.JOptionPane;



public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Auto A1 = new Auto("ABC123", "BMW", "Azul");
        
        JOptionPane.showMessageDialog(null, "La placa del auto es: " + A1.getPlaca());
        
        //Modificamos placa
//        A1.placa = "Perro";
        
        A1.setPlaca("1Perro");
        JOptionPane.showMessageDialog(null, "La placa del auto es: " + A1.getPlaca()+
                                        "\nnumero caracteres: " + A1.getPlaca().lenght());

        
        JOptionPane.showInternalMessageDialog(null, "Primer caracter: "+ C1);
        
                
    }
    
}
