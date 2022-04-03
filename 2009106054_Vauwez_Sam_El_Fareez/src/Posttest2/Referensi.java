package Posttest2;

public class Referensi {
    String judul;
    String penulis;
    int tahun;
    int volume;

    public Referensi(String judul, String penulis, int tahun, int volume) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
        this.volume = volume;
    }

    public String[] judulDanPenulis() {
        String[] tampungJudulPenulis = new String[2];
        tampungJudulPenulis[0] = this.judul;
        tampungJudulPenulis[1] = this.penulis;
        return tampungJudulPenulis;
    }

    public void tampilkanDetail() {
        System.out.println("Judul     : " + this.judul);
        System.out.println("Penulis   : " + this.penulis);
        System.out.println("Tahun     : " + this.tahun);
        System.out.println("Volume    : " + this.volume);
    }

    public String bibliografiPenulisDanTahun() {
        // pisahkan string nama penulis berdasarkan spasi pertama
        // sehingga cuma ada dua elemen array string: nama depan dan namabelakang
        String[] penulis = this.penulis.split(" ", 2);
        // mendapatkan akhiran nama penulis
        String namaKeluarga = penulis[1];
        String namaDepan = penulis[0];
        // Sagan, C. (2016).
        return namaKeluarga + ", " + namaDepan.charAt(0) + ". (" + this.tahun + ")." ;
    }
}
