/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcModel;

import java.util.Date;

/**
 *
 * @author tiara
 */
public class Anggota {

    /**
     * @return the idAnggota
     */
    public String getIdAnggota() {
        return idAnggota;
    }

    /**
     * @param idAnggota the idAnggota to set
     */
    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the no_hp
     */
    public String getNo_hp() {
        return no_hp;
    }

    /**
     * @param no_hp the no_hp to set
     */
    public void setNo_hp(String no_hp) {
       this.no_hp = no_hp;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the tgl_registrasi
     */
    public Date getTgl_registrasi() {
        return tgl_registrasi;
    }

    /**
     * @param tgl_registrasi the tgl_registrasi to set
     */
    public void setTgl_registrasi(Date tgl_registrasi) {
        this.tgl_registrasi = tgl_registrasi;
    }
    
    private String idAnggota;
    private String nama;
    private String no_hp;
    private String email;
    private String alamat;
    private Date tgl_registrasi;
}
