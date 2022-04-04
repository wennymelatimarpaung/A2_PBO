package Posttest2;

public class Buku extends Referensi{
    public int edisi;
    public String penerbit;

    public Buku(String judul, String penulis, int tahun, int volume, int edisi, String penerbit) {
        super(judul, penulis, tahun, volume);
        this.edisi = edisi;
        this.penerbit = penerbit;
    }

    // fungsi untuk menampilkan detail item
    // memanggil fungsi tampilkandetail parent class dulu untuk menampilkan judul, penulis, tahun, dan volume
    public void tampilkanDetail() {
        super.tampilkanDetail();
        System.out.println("Edisi     : " + this.edisi);
        System.out.println("Penerbit  : " + this.penerbit);
    }

    public String buatBibliografi() {
        String penulisDanTahun = super.bibliografiPenulisDanTahun();
//        Sagan, C. (2016). Kosmos (8 ed., Vol. 3). PT Gramedia.
        return penulisDanTahun + " " + this.judul + " (" + this.edisi + " ed., Vol. " + this.volume + "). " + this.penerbit + ".";
    }
}
