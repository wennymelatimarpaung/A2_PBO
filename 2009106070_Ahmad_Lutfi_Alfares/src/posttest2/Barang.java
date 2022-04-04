package posttest2;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp GK
 */
class Barang {
    //karakteristik benda
    String nama_penitip, warna_barang, nama_barang, jenis_barang, waktu_serah;
    int harga_penitipan, banyak_barang;
    
    
    //untuk inputan data penitip
    
    
    public Barang(String nama_penitip, String nama_barang, String warna_barang, String jenis_barang, int banyak_barang, String waktu_serah, int harga_penitipan){
        this.nama_penitip = nama_penitip;
        this.nama_barang = nama_barang;
        this.warna_barang = warna_barang;
        this.jenis_barang = jenis_barang;
        this.banyak_barang = banyak_barang;
        this.waktu_serah = waktu_serah;
        this.harga_penitipan = harga_penitipan;
    }
    
    //metodh
    void taruhBarang(){
        System.out.println("Barang diletakkan ke tempat aman");
    }
    void ambilBarang(){
        System.out.println("Barang telah dikembalikan ke penitip");
    }
}
