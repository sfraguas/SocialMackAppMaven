package br.com.mack.controller.impl;

import java.util.logging.Level;
import java.util.logging.Logger;


public class ControllerFactory {

    public static Controller getInstanceByName(String name) {
        Controller instance = null;
        
        System.out.println("**************** " + name + " ****************************");
        
        String className = "br.com.mack.controller.impl." + name + "Controller";
        try {
            instance = (Controller)Class.forName(className).newInstance();
            System.out.println("Instancia da classe criada");
        } catch (Exception ex) {
            Logger.getLogger(ControllerFactory.class.getName()).log(Level.SEVERE, null, ex);
        }

        return instance;
    }
}