/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcModel;

import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
 * @author micha
 */
public class TabelModelBuku extends AbstractTableModel {
    
    public TabelModelBuku(List<Buku> lstBuku){
        this.lstBuku = lstBuku;
    }
    
    @Override
    public int getRowCount() {
        return this.lstBuku.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public String getColumnName(int column){
        switch (column) {
            case 0:
                return "ID Buku";
            case 1:
                return "Judul";
            case 2:
                return "Penulis";
            case 3:
                return "Penerbit";
            case 4:
                return "Tahun";    
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return lstBuku.get(rowIndex).getIdBuku();
            case 1:
                return lstBuku.get(rowIndex).getJudul();
            case 2:
                return lstBuku.get(rowIndex).getPenulis();
            case 3:
                return lstBuku.get(rowIndex).getPenerbit();
            case 4:
                return lstBuku.get(rowIndex).getTahun();    
            default:
                return null;
        }
    }
    
    List<Buku> lstBuku;
}
