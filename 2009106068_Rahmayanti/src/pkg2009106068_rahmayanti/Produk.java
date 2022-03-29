/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2009106068_rahmayanti;

/**
 *
 * @author ASUS
 */
public class Produk {

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }
    private String nama;
    private int harga;
    private String ukuran;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private int id;
    
    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public String getUkuran() {
        return ukuran;
    }
    
    
}
