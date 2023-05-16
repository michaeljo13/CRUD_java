/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcModel;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author micha
 */
public class TabelModelHistoryPeminjaman extends AbstractTableModel{
    
    public TabelModelHistoryPeminjaman(List<HistoryPeminjaman> lstHistory){
        this.lstHistory = lstHistory;
    }
    
    @Override
    public int getRowCount() {
        return this.lstHistory.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }
    
    @Override
    public String getColumnName(int column){
        switch (column) {
            case 0:
                return "ID Admin";
            case 1:
                return "ID Buku";
            case 2:
                return "Judul";
            case 3:
                return "Tanggal Peminjaman";
            case 4:
                return "Nama Peminjam";
            case 5:
                return "Tanggal Pengembalian";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return lstHistory.get(rowIndex).getIdAdmin();
            case 1:
                return lstHistory.get(rowIndex).getIdBuku();
            case 2:
                return lstHistory.get(rowIndex).getJudul();
            case 3:
                return lstHistory.get(rowIndex).getTgl_peminjaman();
            case 4:
                return lstHistory.get(rowIndex).getNama_peminjam();
            case 5:
                return lstHistory.get(rowIndex).getTgl_pengembalian();
            default:
                return null;
        }
    }
    
    List<HistoryPeminjaman> lstHistory;
    
}
