/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posttest2;

/**
 *
 * @author LENOVO
 */
public class Pasien {
    String nama; 
    String tempat_tinggal; 
    String tanggal_periksa;
    long nomor_antrian; 

public Pasien(String nama, String tempat_tinggal, String tanggal_periksa, long nomor_antrian){
    this.nama = nama;
    this.tempat_tinggal = tempat_tinggal;
    this.tanggal_periksa = tanggal_periksa;
    this.nomor_antrian = nomor_antrian;
}

void pasien1(){
    System.out.println(" Meminum Obat Yang diberi oleh Dokter");
}
void pasien2(){
    System.out.println(" Melakukan Terapi Secara Berkala Sesuai Saran Dokter");
}
    
}

 
