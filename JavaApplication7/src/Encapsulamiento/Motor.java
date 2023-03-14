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
            this.motorOn = false;
            JOptionPane.showMessageDialog(null, "El motor ya está apagado");
        }else{
            this.motorOn = true;
            JOptionPane.showMessageDialog(null, "Apagando motor...  ");
        }
        
    }

    void setMotorOn(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
