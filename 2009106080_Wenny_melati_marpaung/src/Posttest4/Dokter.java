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
public class Dokter extends Manusia {
    private String nip,jabatan;

    // Constructor 
    public Dokter(String nama, String nip, String jenisKelamin, String alamat, String tanggalLahir, String jabatan) {
        super(nama, jenisKelamin, alamat, tanggalLahir);
        this.nip = nip;
        this.jabatan = jabatan;
    }

    // Setter & Getter
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public String getjabatan() {
        return jabatan;
    }

    public void setjabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void display() {
        System.out.println("Nama          : " + this.nama);
        System.out.println("Jenis Kelamin : " + this.jenisKelamin);
        System.out.println("Alamat        : " + this.alamat);
        System.out.println("Tanggal Lahir : " + this.tanggalLahir);
        System.out.println("Jabatan       : " + this.jabatan);
        System.out.println("NIP           : " + this.nip);
    }
}
