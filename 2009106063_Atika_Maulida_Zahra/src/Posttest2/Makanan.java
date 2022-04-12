package Posttest2;

public class Makanan {
    String nama;
    String alamat;
    String restoran;
    String pesan;
    int jumlah;
    int total;
    String bayar;

    public Makanan(String nama, String alamat, String restoran, String pesan, int jumlah, int total, String bayar) {
        this.nama = nama;
        this.alamat = alamat;
        this.restoran = restoran;
        this.pesan = pesan;
        this.jumlah = jumlah;
        this.total = total;
        this.bayar = bayar;
    }
    
    void display() {
        System.out.println("Nama                    : " + this.nama);
        System.out.println("Alamat                  : " + this.alamat);
        System.out.println("Restoran                : " + this.restoran);
        System.out.println("Makanan Yang Dipesan    : " + this.pesan);
        System.out.println("Jumlah Makanan          : " + this.jumlah);
        System.out.println("Total + Ongkir          : " + this.total);
        System.out.println("Metode Pembayaran       : " + this.bayar);
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setRestoran(String restoran) {
        this.restoran = restoran;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setBayar(String bayar) {
        this.bayar = bayar;
    }
    
    void Antar(){
        System.out.println("Pesananmu berhasil diantar");
    }
    
    void Tidak(){
        System.out.println("Pesananmu gagal diantar");
    }
}