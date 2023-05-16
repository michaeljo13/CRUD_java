/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mvcDAO;

import java.util.List;
import mvcModel.HistoryPeminjaman;

/**
 *
 * @author micha
 */
public interface IDAOHistoryPeminjaman {
    //read data
    public List<HistoryPeminjaman> getAll();
    
    //insert data
    public void insert(HistoryPeminjaman hist);
    
    //update data
    public void update(HistoryPeminjaman hist);
    
    //delete data
    public void delete(String idHistory);
    
    //search data
    public List<HistoryPeminjaman> getAllByName(String nama_peminjam);
}
