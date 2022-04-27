/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posttest5;


/**
 *
 * @author LENOVO
 */
public abstract class Manusia {
    protected String nama, jenisKelamin, tanggalLahir, alamat;  
    protected final int spesialis = 1;
    
    public abstract void menambah();

    public Manusia(String nama, String jenisKelamin, String tanggalLahir, String alamat) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.tanggalLahir = tanggalLahir;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    
    public String gettanggalLahir() {
        return tanggalLahir;
    }

    public void settanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
    
