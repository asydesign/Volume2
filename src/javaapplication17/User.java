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
public class User {
    Figura myFigura;
    
    public void setFigura(Figura myFigura){
        this.myFigura = myFigura;
    }
    
    
    public void getInfo(){
        System.out.println(myFigura.getNameFigura() + " has Volume: " + myFigura.V() + " and Price: " + myFigura.getPrice());
    }
}
