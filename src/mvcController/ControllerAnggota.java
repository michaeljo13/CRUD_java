/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcController;

import java.util.List;
import javax.swing.JOptionPane;
import mvcDAO.DAOAnggota;
import mvcDAO.IDAOAnggota;
import mvcModel.Anggota;
import mvcModel.TabelModelAnggota;
import mvcView.FormAnggota;

/**
 *
 * @author tiara
 */
public class ControllerAnggota {
     public ControllerAnggota(FormAnggota frmAnggota) {
        this.frmAnggota = frmAnggota;
        iAnggota = new DAOAnggota();
        //iBuku.getAll();
    }
    
    public void isiTable(){
        lstAnggota = iAnggota.getAll();
        TabelModelAnggota tabelAnggota = new TabelModelAnggota(lstAnggota);
        frmAnggota.getTabelData().setModel(tabelAnggota);
    }
    
    public void insert(){
        Anggota anggota = new Anggota();
        anggota.setIdAnggota(frmAnggota.gettxtIdAnggota().getText());
        anggota.setNama(frmAnggota.gettxtNama().getText());
        anggota.setNo_hp(frmAnggota.gettxtNo_hp().getText());
        anggota.setEmail(frmAnggota.gettxtEmail().getText());
        anggota.setAlamat(frmAnggota.gettxtAlamat().getText());
        anggota.setTgl_registrasi(frmAnggota.gettxtTgl_registrasi().getDate());
        iAnggota.insert(anggota);
        //JOptionPane.showConfirmDialog(null, "Yakin ingin menambahkan?");
        JOptionPane.showMessageDialog(null, "Input Berhasil");
    }
    
    public void reset(){
        if(!frmAnggota.gettxtIdAnggota().isEnabled())
            frmAnggota.gettxtIdAnggota().setEnabled(true);
        frmAnggota.gettxtIdAnggota().setText("");
        frmAnggota.gettxtNama().setText("");
        frmAnggota.gettxtNo_hp().setText("");
        frmAnggota.gettxtEmail().setText("");
        frmAnggota.gettxtAlamat().setText("");
        frmAnggota.gettxtTgl_registrasi().setDate(null);
    }
    
    public void isiField(int row){
        frmAnggota.gettxtIdAnggota().setEnabled(false);
        frmAnggota.gettxtIdAnggota().setText(lstAnggota.get(row).getIdAnggota());
        frmAnggota.gettxtNama().setText(lstAnggota.get(row).getNama());
        frmAnggota.gettxtNo_hp().setText(lstAnggota.get(row).getNo_hp());
        frmAnggota.gettxtEmail().setText(lstAnggota.get(row).getEmail());
        frmAnggota.gettxtAlamat().setText(lstAnggota.get(row).getAlamat());
        frmAnggota.gettxtTgl_registrasi().setDate(lstAnggota.get(row).getTgl_registrasi());
    }
    
    public void update(){
        Anggota anggota = new Anggota();
        anggota.setNama(frmAnggota.gettxtNama().getText());
        anggota.setNo_hp(frmAnggota.gettxtNo_hp().getText());
        anggota.setEmail(frmAnggota.gettxtEmail().getText());
        anggota.setAlamat(frmAnggota.gettxtAlamat().getText());
        anggota.setTgl_registrasi(frmAnggota.gettxtTgl_registrasi().getDate());
        anggota.setIdAnggota(frmAnggota.gettxtIdAnggota().getText());
        iAnggota.update(anggota);
        //JOptionPane.showConfirmDialog(null, "Yakin ingin menambahkan?");
        JOptionPane.showMessageDialog(null, "Update Berhasil");
    }
    
    public  void delete(){
        Anggota anggota = new Anggota();
        iAnggota.delete(frmAnggota.gettxtIdAnggota().getText());
        //JOptionPane.showConfirmDialog(null, "Yakin ingin menambahkan?");
        JOptionPane.showMessageDialog(null, "Delete Berhasil");
    }
    
   public void search(){
        lstAnggota = iAnggota.getAllByName(frmAnggota.gettxtCariNama().getText());
        TabelModelAnggota tabelAnggota = new TabelModelAnggota(lstAnggota);
        frmAnggota.getTabelData().setModel(tabelAnggota);
    }
   
    
//    private Date Date(String text) {
//        Date date = Calendar.getInstance().getTime();  
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
//        String strDate = dateFormat.format(date);
//        return null;
//    }
    
    FormAnggota frmAnggota;
    IDAOAnggota iAnggota;
    List<Anggota> lstAnggota;
    
}
