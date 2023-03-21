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
public class Motor {
    
    private String numeroSerie;
    private int cilndraje;
    private double velocidad;
    private boolean motorOn;
    
            //Metodos

    public Motor(String numeroSerie, int cilndraje) {
        this.numeroSerie = numeroSerie;
        this.cilndraje = cilndraje;
        this.velocidad = 0;
        this.motorOn = false;
        
    }
    
    //getters
    public String getNumeroSerie(){
        return numeroSerie;
    }

    public int getCilndraje() {
        return cilndraje;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public boolean isMotorOn(){
        
        return motorOn;
    }
    
    //Encendido y Apagado
    
    public void encenderMotor(){
        if(this.isMotorOn()){
            this.motorOn = false;
            JOptionPane.showMessageDialog(null, "El motor está encendido");
        }else{
            this.motorOn = true;
            JOptionPane.showMessageDialog(null, "Encendiendo motor...");
        }
        
    }
    public void apagarMotor(){
        if(this.isMotorOn()){
            if (this.velocidad == 0){
               this.motorOn = false;
               JOptionPane.showMessageDialog(null, "apagando motor..."); 
            }
            
        }else{
            
            JOptionPane.showMessageDialog(null, "El vehículo está en movimiento  ");
        }
        
    }
    public void acelerarMotor(){
        if (this.isMotorOn()){
            this.velocidad += 10;
            //this.velocidad = this.velocidad + 10;
            JOptionPane.showMessageDialog(null, "Acelerando...");
        }else{
            JOptionPane.showMessageDialog(null, "El motor está apagado, enciéndalo");
            
        }
        
    }
      public void acelerarMotor(float velocidad){
        if (this.isMotorOn()){
            this.velocidad += velocidad;
            //this.velocidad = this.velocidad + 10;
            JOptionPane.showMessageDialog(null, "Acelerando...");
        }else{
            JOptionPane.showMessageDialog(null, "El motor está apagado, enciéndalo");
            
        }
        
    }
    public void frenarMotor(){
            this.velocidad -= velocidad;            
            if (this.velocidad>=0){           
            JOptionPane.showMessageDialog(null, "Frenando..."); 
            }else{
                this.velocidad = 0;
                JOptionPane.showMessageDialog(null, "Está frenado");                
            }
             public void frenarMotor(float velocidad){
            this.velocidad -= 10;            
            if (this.velocidad>=0){           
            JOptionPane.showMessageDialog(null, "Frenando..."); 
            }else{
                this.velocidad = 0;
                JOptionPane.showMessageDialog(null, "Está frenado");                
            }     
            
       
    }

    @Override
    public String toString() {
        return "Motor{" + "numeroSerie=" + numeroSerie + ", cilndraje=" + cilndraje + ", velocidad=" + velocidad + ", motorOn=" + motorOn + '}';
    }
   
    
    
    
}