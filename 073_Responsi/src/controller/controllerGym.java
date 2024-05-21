/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import Model.*;
import Model.DAOgym;
import connector.*;
import frame.mainview;
import java.util.List;


/**
 *
 * @author Lab Informatika
 */
public class controllerGym {
    mainview frame;
    interfaceDAOgym impdatagym;
    List<ModelGym>dm;
    
    public controllerGym(mainview frame){
        this.frame = frame;
        impdatagym = new DAOgym();
        dm = impdatagym.getAll();
        }
    public void isitabel(){
        dm = impdatagym.getAll();
        ModelTableGym mm = new ModelTableGym(dm);
        frame.getTabelGym().setModel(mm);
       }
}
