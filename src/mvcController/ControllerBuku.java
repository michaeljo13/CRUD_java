/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcController;

import mvcDAO.DAOBuku;
import mvcDAO.IDAOBuku;
import mvcModel.Buku;
import mvcModel.TabelModelBuku;
import mvcView.FormBuku;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author micha
 */
public class ControllerBuku {
    
    public ControllerBuku(FormBuku frmBuku) {
        this.frmBuku = frmBuku;
        iBuku = new DAOBuku();
        //iBuku.getAll();
    }
    
    public void isiTable(){
        lstBuku = iBuku.getAll();
        TabelModelBuku tabelBuku = new TabelModelBuku(lstBuku);
        frmBuku.getTabelData().setModel(tabelBuku);
    }
    
    public void insert(){
        Buku book = new Buku();
        book.setIdBuku(frmBuku.gettxtIdBuku().getText());
        book.setJudul(frmBuku.gettxtJudul().getText());
        book.setPenulis(frmBuku.gettxtPenulis().getText());
        book.setPenerbit(frmBuku.gettxtPenerbit().getText());
        book.setTahun(Integer.parseInt(frmBuku.gettxtTahun().getText()));
        iBuku.insert(book);
        //JOptionPane.showConfirmDialog(null, "Yakin ingin menambahkan?");
        JOptionPane.showMessageDialog(null, "Input Berhasil");
    }
    
    public void reset(){
        if(!frmBuku.gettxtIdBuku().isEnabled())
            frmBuku.gettxtIdBuku().setEnabled(true);
        frmBuku.gettxtIdBuku().setText("");
        frmBuku.gettxtJudul().setText("");
        frmBuku.gettxtPenulis().setText("");
        frmBuku.gettxtPenerbit().setText("");
        frmBuku.gettxtTahun().setText("");
    }
    
    public void isiField(int row){
        frmBuku.gettxtIdBuku().setEnabled(false);
        frmBuku.gettxtIdBuku().setText(lstBuku.get(row).getIdBuku());
        frmBuku.gettxtJudul().setText(lstBuku.get(row).getJudul());
        frmBuku.gettxtPenulis().setText(lstBuku.get(row).getPenulis());
        frmBuku.gettxtPenerbit().setText(lstBuku.get(row).getPenerbit());
        frmBuku.gettxtTahun().setText(lstBuku.get(row).getTahun().toString());
    }
    
    public void update(){
        Buku book = new Buku();
        
        book.setJudul(frmBuku.gettxtJudul().getText());
        book.setPenulis(frmBuku.gettxtPenulis().getText());
        book.setPenerbit(frmBuku.gettxtPenerbit().getText());
        book.setTahun(Integer.parseInt(frmBuku.gettxtTahun().getText()));
        book.setIdBuku(frmBuku.gettxtIdBuku().getText());
        iBuku.update(book);
        //JOptionPane.showConfirmDialog(null, "Yakin ingin menambahkan?");
        JOptionPane.showMessageDialog(null, "Update Berhasil");
    }
    
    public  void delete(){
        Buku book = new Buku();
        iBuku.delete(frmBuku.gettxtIdBuku().getText());
        //JOptionPane.showConfirmDialog(null, "Yakin ingin menambahkan?");
        JOptionPane.showMessageDialog(null, "Delete Berhasil");
    }
    
    public void search(){
        lstBuku = iBuku.getAllByName(frmBuku.gettxtCariNama().getText());
        TabelModelBuku tabelBuku = new TabelModelBuku(lstBuku);
        frmBuku.getTabelData().setModel(tabelBuku);
    }
    
    FormBuku frmBuku;
    IDAOBuku iBuku;
    List<Buku> lstBuku;
}
