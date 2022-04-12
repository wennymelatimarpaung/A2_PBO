/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posttest3;
/**
 *
 * @author LENOVO
 */
public class Pasien {
    private String nama, tempat_tinggal, tanggal_periksa;
    private int nomor_antrian;
    
    public Pasien (String nama, String tempat_tinggal, String tanggal_periksa, int nomor_antrian){
        this.nama              = nama;
        this.tempat_tinggal    = tempat_tinggal;
        this.tanggal_periksa   = tanggal_periksa;
        this.nomor_antrian     = nomor_antrian;
    }
    
     void menampilkan() {
        System.out.println("###############################################");
        System.out.println("| nama             : " + this.nama);
        System.out.println("| tempat_tinggal   : " + this.tempat_tinggal);
        System.out.println("| tanggal_periksa  : " + this.tanggal_periksa);
        System.out.println("| nomor_antrian    : " + this.nomor_antrian);
        System.out.println("################################################");
    }
    
    public void Setnama(String nama){
        // System.out.println("Nama   : ");
        this.nama   = nama;
    }
    public void Settempat_tinggal(String tempat_tinggal){
        // System.out.println("Tempat_tinggal : ");
        this.tempat_tinggal    = tempat_tinggal;
    }
    public void Settanggal_periksa(String tanggal_periksa){
        // System.out.println("Tanggal_periksa    : ");
        this.tanggal_periksa       = tanggal_periksa;
    }
    public void Setnomor_antrian(int nomor_antrian){
        // System.out.println("nomor_antrian      : ");
        this.nomor_antrian         = nomor_antrian;
    }
    
    public String getnama(){
        return nama;
    }
    public String gettempat_tinggal(){
        return tempat_tinggal;
    }
    public String gettanggal_periksa(){
        return tanggal_periksa;
    }
    public int getnomor_antrian(){
        return nomor_antrian;
    }
   
    void input(){
        System.out.println(" Berhasil menambahkan!!!");
    }
    
    void edit(){
        System.out.println(" Berhasil mengupdate!!!");
    }
    
}

