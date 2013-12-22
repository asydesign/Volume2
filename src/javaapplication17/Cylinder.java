/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication17;

/**
 *
 * @author photo
 */
public class Cylinder extends Figura {
    private double r,h;
    private  double one_price,DDC;
   
    public Cylinder(double r, double h){
       this.r = r;
       this.h = h;
    }
    @Override
    public double V(){
        return (Math.round(100*r*r*h*Math.PI))/100.;
              
    }
    @Override
    public String getNameFigura(){
        return "Cylinder";
    }
    
    @Override
    public void setPrice(double one_price, double DDC){
        this.one_price = one_price;
        this.DDC = DDC;
    }
    
    @Override
    public double getPrice(){
        return (Math.round(100*V()*one_price*(1+DDC/100)))/100.;
    }
}


