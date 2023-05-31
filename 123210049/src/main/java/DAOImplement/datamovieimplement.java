/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImplement;

import java.util.List;
import model.*;
/**
 *
 * @author Lab Informatika
 */
public interface datamovieimplement {
    public void insert(datamovie p);
    public void update(datamovie p);
    public void delete(int id);
    public List<datamovie>getAll();
}
