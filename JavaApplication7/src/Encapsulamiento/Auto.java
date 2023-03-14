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
    private Motor motor;
    

    public Auto(String placa, String marca, String color, Motor motor) {
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.motor = motor;
    }
    
    //Get placa
    
    public String getPlaca(){
        
        return this.placa;
    }
    
            //setPlaca
    
    public void setPlaca(String placa){
        int numCaracteres = placa.length();
        String Letras, Numeros;
        String listaNumeros = "1234567890";
        boolean esNumero = false;
        boolean esLetra = true;
        
        if (numCaracteres == 6){  
        Letras = placa.substring (0,3);
        Numeros = placa.substring (3,6);
        this.placa = placa;
        //for
        for(char i : Letras.toCharArray()){
            esLetra = true;            
            for(char j : listaNumeros.toCharArray() ){
                if (i == j){
                    esLetra = false;
                }
                
            }
            if (esLetra == false){
                break;
            }
        }
        
       for (char i : Numeros.toCharArray()){
           for(char j : listaNumeros.toCharArray()){
               if (i == j){
                   esNumero = true;
               }
           }
       }
       if(esNumero && esLetra){
           this.placa = placa;
       }else{
           JOptionPane.showMessageDialog(null, "La placa no es valida");
       }
    
    
    
            
    
}else{
    JOptionPane.showMessageDialog(null, "la placa no es valida");    
}

}

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public Motor getMotor() {
        return motor;
    }
    
 public void encenderAuto(){
     this.motor.encenderMotor();
 }
    public boolean isEncendido(){
        return this.motor.isMotorOn();
        
    }
}
        
