/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcModel;

import java.util.Date;

/**
 *
 * @author micha
 */
public class HistoryPeminjaman {

    /**
     * @return the idAdmin
     */
    public String getIdAdmin() {
        return idAdmin;
    }

    /**
     * @param idAdmin the idAdmin to set
     */
    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    /**
     * @return the idBuku
     */
    public String getIdBuku() {
        return idBuku;
    }

    /**
     * @param idBuku the idBuku to set
     */
    public void setIdBuku(String idBuku) {
        this.idBuku = idBuku;
    }

    /**
     * @return the judul
     */
    public String getJudul() {
        return judul;
    }

    /**
     * @param judul the judul to set
     */
    public void setJudul(String judul) {
        this.judul = judul;
    }

    /**
     * @return the tgl_peminjaman
     */
    public Date getTgl_peminjaman() {
        return tgl_peminjaman;
    }

    /**
     * @param tgl_peminjaman the tgl_peminjaman to set
     */
    public void setTgl_peminjaman(Date tgl_peminjaman) {
        this.tgl_peminjaman = tgl_peminjaman;
    }

    /**
     * @return the nama_peminjam
     */
    public String getNama_peminjam() {
        return nama_peminjam;
    }

    /**
     * @param nama_peminjam the nama_peminjam to set
     */
    public void setNama_peminjam(String nama_peminjam) {
        this.nama_peminjam = nama_peminjam;
    }

    /**
     * @return the tgl_pengembalian
     */
    public Date getTgl_pengembalian() {
        return tgl_pengembalian;
    }

    /**
     * @param tgl_pengembalian the tgl_pengembalian to set
     */
    public void setTgl_pengembalian(Date tgl_pengembalian) {
        this.tgl_pengembalian = tgl_pengembalian;
    }
    private String idAdmin;
    private String idBuku;
    private String judul;
    private Date tgl_peminjaman;
    private String nama_peminjam;
    private Date tgl_pengembalian;
}
