/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOdata;
import java.sql.*;
import java.util.*;
import koneksi.connector;
import model.*;
import DAOImplement.datamovieimplement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lab Informatika
 */
public class datamovieDAO implements datamovieimplement{
    Connection connection;
    
    final String select = "SELECT * FROM movie";
    
    public datamovieDAO(){
        connection = connector.connection()
    }
    
    @Override
    public void insert(datamovie p){
        
    }
    @Override
    public void update(datamovie p){
        
    }
    @Override
    public void delete(int id){
        
    }
    @Override
    public List<datamovie> getAll(){
        List<datamovie> dp = null;
        try{
            dp = new ArrayList<datamovie>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                datamovie movie = new datamovie();
                movie.setid(rs.getInt("id"));
                movie.setjudul(rs.getvarchar("judul"));
                movie.setalur(rs.getdouble("alur"));
                movie.setpenokohan(rs.getdouble("penokohan"));
                movie.setakting(rs.getdouble("akting"));
                movie.setnilai(rs.getdouble("nilai"));
            }
        }catch(SQLException){
            Logger.getLogger(datamovieDAO.class.getName()).Log(Level.SEVERE,null,ex);
        }
        return dp;
    }
    
    
}
