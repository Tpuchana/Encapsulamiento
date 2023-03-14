/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Encapsulamiento;
import javax.swing.JOptionPane;



public class Principal {

    public static void main(String[] args) {       
        
        Auto A1 = new Auto("ABC123", "BMW", "Azul",new Motor("QWER54T", 2500));
        
        JOptionPane.showMessageDialog(null, "La placa del auto es: " + A1.getPlaca());
//        A1.setPlaca("1CD456");
//        A1.setPlaca("B3D456");
//        A1.setPlaca("BC5456");
//        A1.setPlaca("BCDB56");
//        A1.setPlaca("BCD4C6");
//        A1.setPlaca("BCD45D");
//        A1.setPlaca("BCD456");
//    
//        
//        //Modificamos placa
////        A1.placa = "Perro";
//        
//        A1.setPlaca("1Perro");
//        JOptionPane.showMessageDialog(null, "La placa del auto es: " + A1.getPlaca()+
//                                        "\nnumero caracteres: " + A1.getPlaca().lenght());
//
//        
//        JOptionPane.showInternalMessageDialog(null, "Primer caracter: "+ C1);
//
//        
        
        
        
                
//    Encender auto
        A1.encenderAuto();
        System.out.println("Motor Encendido: " + A1.getMotor().isMotorOn());
    
}
}
