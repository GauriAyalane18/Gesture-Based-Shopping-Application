/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gesturebasedshopping;


import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Main {
    
    public static void main(String args[]){
         try { 
             UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); 
            } catch(ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ignored){}

            MainFrame lf = new MainFrame();
            lf.getContentPane().setBackground(Color.WHITE);
            lf.setVisible(true);
            lf.setExtendedState(MAXIMIZED_BOTH);
            
         GestureInfo.ht.setMainFrameObject(lf);
            GestureInfo.ht.start();
    }
    
}
