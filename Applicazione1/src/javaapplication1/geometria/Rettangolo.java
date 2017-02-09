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
public class Rettangolo implements Forma{
    private double b;
    private double h;
    
    public Rettangolo(){}
    public Rettangolo( double b, double h){
        b=20.00;
        h=15.00;    
    }
//    public double getB() {
//        return b;
//    }
//    public double getH() {
//        return h;
//    }    
    public void setB(double base) {
        b = base;
    }
    public void setH(double height) {
        h = height;
    }
    @Override
    public double area(){        
       return b * h;
    }
}
