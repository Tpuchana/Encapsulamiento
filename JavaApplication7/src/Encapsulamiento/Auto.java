/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulamiento;

import javax.swing.JOptionPane;

/**
 *
 * @author SALA
 */
public class Auto {
    private String placa;
    private String marca;
    private String color;
    

    public Auto(String placa, String marca, String color) {
        this.placa = placa;
        this.marca = marca;
        this.color = color;
    }
    
    //Get placa
    
    public String getPlaca(){
        
        return this.placa;
    }
    
            //setPlaca
    
    public void setPlaca(String placa){
        int numCaracteres = placa.length();
        String C1,C2,C3,C4,C5,C6;
        String Numeros = "1234567890";
        boolean esPlaca = false;
        if (numCaracteres == 6){  
        C1 = placa.substring(0,1);
        C2 = placa.substring(1,2); 
        C3 = placa.substring(2,3); 
        C4 = placa.substring(3,4); 
        C5 = placa.substring(4,5); 
        C6 = placa.substring(5,6); 
        this.placa = placa;
        //for
        for(int i = 0; i<Numeros.length(); i++){
            if (C1.equalsIgnoreCase(Numeros.substring(i,i+1))== false){
                esPlaca = true;
                
            }
        }
        
        if (esPlaca){
            this.placa = placa;
        }else{
            JOptionPane.showMessageDialog(, esPlaca);
        }
    }else{
            JOptionPane.showMessageDialog(null, "La placa no es valida");
        }
    }
    
    
            
    
}
