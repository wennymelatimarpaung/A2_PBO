package Posttest2;

public class Jurnal extends Referensi{
    String publikasi;
    int isu;
    String halaman;
    String doi;

    public Jurnal(String judul, String penulis, int tahun, int volume, String publikasi, int isu, String halaman, String doi) {
        super(judul, penulis, tahun, volume);
        this.publikasi = publikasi;
        this.isu = isu;
        this.halaman = halaman;
        this.doi = doi;
    }

    // fungsi untuk menampilkan detail item
    // memanggil fungsi tampilkandetail parent class dulu untuk menampilkan judul, penulis, tahun, dan volume
    public void tampilkanDetail() {
        super.tampilkanDetail();
        System.out.println("Publikasi : " + this.publikasi);
        System.out.println("Isu       : " + this.isu);
        System.out.println("Halaman   : " + this.halaman);
        System.out.println("DOI       : " + this.doi);
    }

    public String buatBibliografi() {
        String penulisDanTahun = super.bibliografiPenulisDanTahun();
//        Pratiwi, N., & Pritanova, N. (2017). PENGARUH LITERASI DIGITAL TERHADAP PSIKOLOGIS ANAK DAN REMAJA. Semantik, 6(1), 11–24. https://doi.org/10.22460/semantik.v6i1.p11-24
        return penulisDanTahun + " " + this.judul + ". " + this.publikasi + ", " + this.volume + "(" + this.isu + "), " + this.halaman + ". " + this.doi;
    }
}
