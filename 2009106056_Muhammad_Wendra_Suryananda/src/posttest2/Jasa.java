/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest2;

/**
 *
 * @author SHaneEZolDyC
 */
class Jasa {

    String namadesain,jenisdesain,ukurandesain;
    int hargajasa;
    
    public Jasa(String namadesain, String jenisdesain, String ukurandesain, int hargajasa) {
        this.namadesain = namadesain;
        this.jenisdesain = jenisdesain;
        this.ukurandesain = ukurandesain;
        this.hargajasa = hargajasa;
    }

     
    void Menambahkandata() {
        System.out.println("Data berhasil ditambahkan");
    }
    void Menghapusdata() {
        System.out.println("Data berhasil dihapus");
    }

    
}

