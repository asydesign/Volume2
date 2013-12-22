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
public class JavaApplication17 {

    public static void main(String[] args) {
        User alex = new User();
        Figura myCylinder = new Cylinder(1,2);
        alex.setFigura(myCylinder);
        myCylinder.setPrice(4,20);
        alex.getInfo();
        
        User asy = new User();
        Figura myDCylinder = new DCylinder(1,2,2);
        asy.setFigura(myDCylinder);
        myDCylinder.setPrice(3,20);
        asy.getInfo();
    }
    
}
