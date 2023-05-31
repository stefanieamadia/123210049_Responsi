/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lab Informatika
 */
public class datamovie {
    private int id;
    private varchar judul;
    private double alur;
    private double penokohan;
    private double akting;
    private double nilai;
    
    public int getid(){
        return id;
    } 
     public void setid(int id){
         this.id = id;
     }
    
    public varchar getjudul(){
        return judul;
    } 
     public void setjudul(varchar judul){
         this.judul = judul;
     }
     
     public double alur(){
        return alur;
    } 
     public void setalur(double alur){
         this.alur = alur;
     }
     public double penokohan(){
        return penokohan;
    } 
     public void setpenokohan(double penokohan){
         this.penokohan = penokohan;
     }
     public double akting(){
        return akting;
    } 
     public void setakting(double akting){
         this.akting= akting;
     }
     public double nilai(){
        return nilai;
    } 
     public void setnilai(double nilai){
         this.nilai = nilai;
     }
     
     
    
    
}
