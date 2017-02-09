/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.geometria;

/**
 *
 * @author utente
 */

public class Cerchio implements CerchioIntf, Forma{
    
    private double r;
    public Cerchio() {
        r=1.0;
    }
    public Cerchio(double r){
        this.r= r;
    }
    @Override 
    public double getR() {
        return r;
    }
    @Override 
    public void setR(double raggio) {
        r = raggio;
    }
    @Override 
    public double area() {
        return  Math.PI * r * r;
    }
}



