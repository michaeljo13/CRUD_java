/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcModel;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tiara
 */
public class TabelModelAnggota extends AbstractTableModel{
    
    public TabelModelAnggota(List<Anggota>lstAnggota)
    {
        this.lstAnggota = lstAnggota;
    }
    @Override
    public int getRowCount() {
        return this.lstAnggota.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }
    
    @Override
    public String getColumnName(int column){
    switch (column) {
            case 0:
                return "ID Anggota";
            case 1:
                return "Nama";
            case 2:
                return "No Hp";
            case 3:
                return "Email";
            case 4:
                return "Alamat";  
            case 5:
                return "Tanggal Registrasi";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return lstAnggota.get(rowIndex).getIdAnggota();
            case 1:
                return lstAnggota.get(rowIndex).getNama();
            case 2:
                return lstAnggota.get(rowIndex).getNo_hp();
            case 3:
                return lstAnggota.get(rowIndex).getEmail();
            case 4:
                return lstAnggota.get(rowIndex).getAlamat();
            case 5:
                return lstAnggota.get(rowIndex).getTgl_registrasi();
            default:
                return null;
        }
    }
    
    List <Anggota> lstAnggota;
    
}
