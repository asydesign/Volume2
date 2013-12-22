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
public class DCylinder extends Figura {
    private double r,h,R;
    private  double one_price,DDC;
    
    public DCylinder(double r, double h, double R){
       this.r = r;
       this.h = h;
       this.R = R;
   }
    
    @Override
    public double V(){
        return (Math.round(100*h*Math.PI*Math.abs(r*r-R*R)))/100.;
    }
    
    @Override
    public String getNameFigura(){
        return "DCylinder";
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
