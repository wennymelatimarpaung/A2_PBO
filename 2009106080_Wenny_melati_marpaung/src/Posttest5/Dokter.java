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
public class Dokter extends Manusia {
    private String nip;

    // Constructor 
    public Dokter(String nama, String nip, String jenisKelamin, String alamat, String tanggalLahir, String jabatan) {
        super(nama, jenisKelamin, alamat, tanggalLahir);
        this.nip = nip;
    }

    // Setter & Getter
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void display() {
        System.out.println("---------------------------------------");
        System.out.println("Nama          : " + this.nama);
        System.out.println("Jenis Kelamin : " + this.jenisKelamin);
        System.out.println("Alamat        : " + this.alamat);
        System.out.println("Tanggal Lahir : " + this.tanggalLahir);
        System.out.println("NIP           : " + this.nip);
        System.out.println("Dokter Spesialis         : " + spesialis);
        System.out.println("----------------------------------------");
        this.menambah();
    }
    
    public void menambah(){
        System.out.println(this.nama + "Dapat menambah pasien baru");
    }
}
