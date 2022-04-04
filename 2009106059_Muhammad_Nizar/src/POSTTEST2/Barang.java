/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTTEST2;

/**
 *
 * @author nizar
 */
public class Barang {
    String nama;
    int harga;
    int stock;
    String jenis;

    public Barang(String nama, int harga, int stock, String jenis) {
        this.nama = nama;
        this.harga = harga;
        this.stock = stock;
        this.jenis = jenis;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    void nambahBarang(){
        System.out.println("Barang ini," + this.nama +" sudah ditambahkan");    
    }
    void updateBarang(){
        System.out.println("Barang ini," + this.nama +" sudah diperbarui");
    }
    void hapusBarang(){
        System.out.println("Barang ini," + this.nama +" sudah dihapus");
    }
}
