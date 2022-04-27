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
public class Pasien extends Manusia {
    private String jenispenyakit;

    public Pasien(String nama, String jenisKelamin, String alamat, String tanggalLahir, String nomorpasien, String jenispenyakit) {
        super(nama, jenisKelamin, alamat, tanggalLahir);
        this.jenispenyakit = jenispenyakit;
    }

    final String getjenispenyakit() {
        return jenispenyakit;
    }

    public void setjenispenyakit(String jenispenyakit) {
        this.jenispenyakit = jenispenyakit;
    }
    

    public void display() {
        System.out.println("Nama          : " + this.nama);
        System.out.println("Jenis Kelamin : " + this.jenisKelamin);
        System.out.println("Alamat        : " + this.alamat);
        System.out.println("Tanggal Lahir : " + this.tanggalLahir);
        System.out.println("Jenis Penyakit: " + this.jenispenyakit);
        this.menambah();
    }
    
    public void menambah(){
        System.out.println(this.nama+ "Berhasil menambah");
    }
}