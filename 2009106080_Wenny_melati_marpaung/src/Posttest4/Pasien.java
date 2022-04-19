/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posttest4;

/**
 *
 * @author LENOVO
 */
public class Pasien extends Manusia {
    private String jenispenyakit, nomorpasien;

    public Pasien(String nama, String jenisKelamin, String alamat, String tanggalLahir, String nomorpasien, String jenispenyakit) {
        super(nama, jenisKelamin, alamat, tanggalLahir);
        this.nomorpasien = nomorpasien;
        this.jenispenyakit = jenispenyakit;
    }

    public String getjenispenyakit() {
        return jenispenyakit;
    }

    public void setjenispenyakit(String jenispenyakit) {
        this.jenispenyakit = jenispenyakit;
    }
    
    public String getnomorpasien() {
        return nomorpasien;
    }

    public void setnomorpasien(String nomorpasien) {
        this.nomorpasien = nomorpasien;
    }

    public void display() {
        System.out.println("Nama          : " + this.nama);
        System.out.println("Jenis Kelamin : " + this.jenisKelamin);
        System.out.println("Alamat        : " + this.alamat);
        System.out.println("Tanggal Lahir : " + this.tanggalLahir);
        System.out.println("Nomor Pasien  : " + this.nomorpasien);
        System.out.println("Jenis Penyakit: " + this.jenispenyakit);
    }
}