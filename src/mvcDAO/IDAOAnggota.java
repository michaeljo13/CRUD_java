/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mvcDAO;

import java.util.List;
import mvcModel.Anggota;

/**
 *
 * @author tiara
 */
public interface IDAOAnggota {
     //read data
    public List<Anggota> getAll();
    
    //insert data
    public void insert(Anggota anggota);
    
    //update data
    public void update(Anggota anggota);
    
    //delete data
    public void delete(String idAnggota);
    
    //search data
    public List<Anggota> getAllByName(String nama);
}
