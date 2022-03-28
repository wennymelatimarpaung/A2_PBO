package posttest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    // inisialisasi ArrayList
    public static ArrayList<Object> itemList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        String pilihan = "";
        while (!pilihan.equalsIgnoreCase("k")) {
            // inisialisasi input
            BufferedReader input = input();

            // menu utama
            bersihkanKonsol();
            System.out.println("MANAJER REFERENSI KARYA ILMIAH\n");
            System.out.println("[T]ambah item");
            System.out.println("[L]ihat item");
            System.out.println("[K]eluar");
            System.out.print(">> ");

            // masukan user
            pilihan = input.readLine();

            // logika menu
            switch (pilihan.toLowerCase()) {
                case "t":
                    bersihkanKonsol();
                    tambahItem();
                    break;
                case "l":
                    String pilihanLihatItem;
                    bersihkanKonsol();
                    while (true) {
                        bersihkanKonsol();
                        lihatItem();
                        System.out.println("[D]etail item");
                        System.out.println("[U]bah item");
                        System.out.println("[H]apus item");
                        System.out.println("[M]enu utama");
                        System.out.print(">> ");
                        pilihanLihatItem = input.readLine();
                        if (pilihanLihatItem.equalsIgnoreCase("m")) {
                            break;
                        }

                        System.out.print("Nomor item : ");
                        int nomorItem= Integer.parseInt(input.readLine());
                        bersihkanKonsol();

                        switch (pilihanLihatItem.toLowerCase()) {
                            case "d" -> tampilkanDetailItem(nomorItem);
                            case "u" -> ubahItem(nomorItem);
                            case "h" -> hapusItem(nomorItem);
                        }
                    }
                case "k":
                    break;
                default:
                    System.out.println("Fitur belum tersedia...");
            }
        }
    }

    public static void tambahItem() throws IOException {
        BufferedReader input = input();

        // pilih jenis referensi
        System.out.println("Jenis item dapat berupa [B]uku atau [J]urnal");
        System.out.print("Jenis (B|J) : ");
        String jenis = input.readLine();

        // masukkan data referensi
        // buku : Sagan, C. (2016). Kosmos (8 ed., Vol. 3). PT Gramedia.
        // jurnal : Munir, S., & Hidayatullah, A. (2021). PEMANFAATAN MADING BERMUATAN BARCODE EBOOK UNTUK. Abdimas Galuh, 3(1), 83–90. https://doi.org/10.25157/ag.v3i1.4954
        bersihkanKonsol();
        System.out.println("Masukkan metadata referensi");
        System.out.println("Untuk data yang lebih dari 1 (misal: Penulis), pisahkan dengan koma\n");
        System.out.print("Judul     : ");
        String judul = input.readLine();
        System.out.print("Penulis   : ");
        String penulis = input.readLine();
        System.out.print("Tahun     : ");
        int tahun = Integer.parseInt(input.readLine());
        System.out.print("Volume    : ");
        // TODO buat error handling input kosong
        int volume = Integer.parseInt(input.readLine());

        // buat objek sesuai jenis referensi dan masukkan ke list
        switch (jenis.toLowerCase()) {
            case "b" -> {
                // buat objek buku
                Buku buku = new Buku();
                buku.judul = judul;
                buku.penulis = penulis;
                buku.tahun = tahun;
                buku.volume = volume;

                // metadata khusus buku
                System.out.print("Edisi     : ");
                buku.edisi = Integer.parseInt(input.readLine());

                // masukkan ke list
                itemList.add(buku);
            }
            case "j" -> {
                // buat objek jurnal
                Jurnal jurnal = new Jurnal();
                jurnal.judul = judul;
                jurnal.penulis = penulis;
                jurnal.tahun = tahun;
                jurnal.volume = volume;

                // metadata khusus jurnal
                System.out.print("Publikasi : ");
                jurnal.publikasi = input.readLine();
                System.out.print("Isu       : ");
                jurnal.isu = Integer.parseInt(input.readLine());
                System.out.print("Halaman   : ");
                jurnal.halaman = input.readLine();
                System.out.print("DOI       : ");
                jurnal.doi = input.readLine();

                // masukkan ke list
                itemList.add(jurnal);
            }
        }
    }

    // mencetak item ke layar
    public static void lihatItem() {
        // header
        int batasKarakter = 27;
        String formatHeader = "%-3s%-" + batasKarakter + "s%-" + batasKarakter + "s\n";
        System.out.printf(formatHeader, "NO", "JUDUL", "PENULIS");

        // konten
        String judul;
        String penulis;
        String formatKonten = "%-3d%-" + batasKarakter + "s%-" + batasKarakter + "s\n";
        // loop kedalam itemList
        for (int i=0; i< itemList.size(); i++) {
            // jika bertipe Buku
            if (itemList.get(i).getClass().getName().equals("posttest1.Buku")) {
                Buku buku = (Buku) itemList.get(i);
                judul = buku.judul.length()<batasKarakter ? buku.judul : buku.judul.substring(0, batasKarakter - 5) + "...";
                penulis = buku.penulis;

            // jika bertipe selain buku
            } else {
                Jurnal jurnal = (Jurnal) itemList.get(i);
                judul = jurnal.judul.length()<batasKarakter ? jurnal.judul : jurnal.judul.substring(0, batasKarakter - 5) + "...";
                penulis = jurnal.penulis;
            }

            System.out.printf(formatKonten, i+1, judul, penulis);
        }
        System.out.println("=".repeat(batasKarakter*2+3));
    }

    public static void ubahItem(int pilihanUbah) throws IOException {
        int pilihanItem = pilihanUbah - 1;
        BufferedReader input = input();

        System.out.println("Silahkan pilih metadata yang mau diubah");
        System.out.println("[J]udul");
        System.out.println("[P]enulis");
        System.out.println("[T]ahun");
        System.out.println("[V]olume");

        // cek nama kelas item dulu
        // lalu tampilkan pilihan khusus pada item
        if (itemList.get(pilihanItem).getClass().getName().equals("posttest1.Buku")) {
            Buku buku = (Buku) itemList.get(pilihanItem);

            System.out.println("[E]disi");

            System.out.print(">> ");
            String pilihanData = input.readLine();

            System.out.print("Masukkan nilai baru : ");
            String nilaiBaru = input.readLine();

            switch (pilihanData.toLowerCase()) {
                case "j":
                    buku.judul = nilaiBaru;
                    break;
                case "p":
                    buku.penulis = nilaiBaru;
                    break;
                case "t":
                    buku.tahun = Integer.parseInt(nilaiBaru);
                    break;
                case "v":
                    buku.volume = Integer.parseInt(nilaiBaru);
                case "e":
                    buku.edisi = Integer.parseInt(nilaiBaru);
            }

            // kembalikan object yang diubah ke list
            itemList.set(pilihanItem, buku);
        } else {
            Jurnal jurnal = (Jurnal) itemList.get(pilihanItem);

            System.out.println("P[u]blikasi");
            System.out.println("[I]su");
            System.out.println("[H]alaman");
            System.out.println("[D]OI");

            System.out.print(">> ");
            String pilihanData = input.readLine();

            System.out.println("Masukkan nilai baru");
            String nilaiBaru = input.readLine();

            switch (pilihanData.toLowerCase()) {
                case "j" -> jurnal.judul = nilaiBaru;
                case "p" -> jurnal.penulis = nilaiBaru;
                case "t" -> jurnal.tahun = Integer.parseInt(nilaiBaru);
                case "v" -> jurnal.volume = Integer.parseInt(nilaiBaru);
                case "u" -> jurnal.publikasi = nilaiBaru;
                case "i" -> jurnal.isu = Integer.parseInt(nilaiBaru);
                case "h" -> jurnal.halaman = nilaiBaru;
                case "d" -> jurnal.doi = nilaiBaru;
            }

            // kembalikan object jurnal yang baru ke list
            itemList.set(pilihanItem, jurnal);
        }
    }

    public static void hapusItem(int pilihanHapus) throws IOException {
        int pilihanItem = pilihanHapus - 1;
        BufferedReader input = input();
        System.out.print("Apakah Anda yakin (Y|N) : ");
        String yakin = input.readLine();
        switch (yakin.toLowerCase()) {
            case "y":
                itemList.remove(pilihanItem);
                break;
            case "n":
                break;
            default:
                System.out.println("Isi dengan y atau n");
        }
    }

    public static void tampilkanDetailItem(int pilihanDetailItem) throws IOException {
        int pilihanItem = pilihanDetailItem - 1;
        if (itemList.get(pilihanItem).getClass().getName().equals("posttest1.Buku")) {
            Buku buku = (Buku) itemList.get(pilihanItem);
            System.out.println("Judul   : " + buku.judul);
            System.out.println("Penulis : " + buku.penulis);
            System.out.println("Tahun   : " + buku.tahun);
            System.out.println("Volume  : " + buku.volume);
            System.out.println("Edisi   : " + buku.edisi);
        } else {
            Jurnal jurnal = (Jurnal) itemList.get(pilihanItem);
            System.out.println("Judul     : " + jurnal.judul);
            System.out.println("Penulis   : " + jurnal.penulis);
            System.out.println("Tahun     : " + jurnal.tahun);
            System.out.println("Volume    : " + jurnal.volume);
            System.out.println("Publikasi : " + jurnal.publikasi);
            System.out.println("Isu       : " + jurnal.isu);
            System.out.println("Halaman   : " + jurnal.halaman);
        }

        // pause
        System.in.read();
    }
    // fungsi untuk menggunakan input
    public static BufferedReader input() {
        // inisialisasi input
        InputStreamReader inputStream = new InputStreamReader(System.in);
        return new BufferedReader(inputStream);
    }

    public static void bersihkanKonsol() {
        System.out.println(System.lineSeparator().repeat(100));
    }
}
