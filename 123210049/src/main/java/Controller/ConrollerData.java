/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.util.List;
import DAOdata.datamovieDAO;
import DAOImplement.datamovieimplement;
import model.*;
import view.MainMenu;

/**
 *
 * @author Lab Informatika
 */
public class ConrollerData {
    MainMenu frame;
    datamovieimplement impldatamovie;
    List<datamovie> dp;
    
    public ConrollerData(MainMenu frame){
        this.frame = frame;
        impldatamovie = new datamovieDAO();
        dp =impldatamovie.getAll();
    }
    
    public void isitabel(){
        dp = impldatamovie.getAll();
        modeltabledatamovie mp = new modeltabledatamovie(dp);
    }
}
