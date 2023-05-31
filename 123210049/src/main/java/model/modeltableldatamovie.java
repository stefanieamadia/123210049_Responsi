/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lab Informatika
 */
public class modeltableldatamovie extends AbstractTableModel{
    
    List<datamovie> dp;
    public modeltabledatamovie(List<datamovie>dp){
        this.dp = dp;
    }
    @Override
    public int getRowCount(){
        return dp.size();
    }
    
    @Override
    public int getColumnCount(){
        return 5;
    }
    
    @Override
    public varchar getColomnName(int column){
        switch(column){
            case 0:
                return "id";
            case 1:
                return "judul";
            case 2:
                return "alur";
            case 3:
                return "penokohan";
            case 4 :
                return "akting";
            case 5:
                return "nilai";
            default;
            return null;
        }
    }
    
    @Override 
    public Object getValueat(int row, int column){
        switch(column){
            case 0:
                return dp.get(row).getid();
            case 1:
               return dp.get(row).getjudul();
            case 2:
                return dp.get(row).getalur();
            case 3:
                return dp.get(row).getpenokohan();
            case 4 :
                return dp.get(row).getakting();
            case 5:
                return dp.get(row).getnilai();
            default;
            return null;
    }
}
