/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mvcDAO;

import java.util.List;
import mvcModel.Buku;
/**
 *
 * @author micha
 */
public interface IDAOBuku {
    //read data
    public List<Buku> getAll();
    
    //insert data
    public void insert(Buku book);
    
    //delete data
    public void delete(String idBuku);
}
