package posttest2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author Hp GK
 */
public class Sistem {
    // variabel global
    
    static ArrayList<Barang> barang = new ArrayList<Barang>();
    // main utama
    public static void main(String[]args) throws IOException{
        // data ArrayList
        barang.add(new Barang("Jaka", "Helm", "Merah", "Padat", 1,"08.00", 15000));
//        barang.get(0).nama_Penitip = "Jaka";
//        barang.get(0).nama_Barang = "Helm";
//        barang.get(0).waktu_Serah = "08.00";
//        barang.get(0).harga_Penitipan = 15000;
        barang.add(new Barang("Yaya", "Tas", "Putih", "Padat", 1,"07.23", 15000));
//        barang.get(1).nama_Penitip = "Yaya";
//        barang.get(1).nama_Barang = "Tas";
//        barang.get(1).waktu_Serah = "07.23";
//        barang.get(1).harga_Penitipan = 15000;
        barang.add(new Barang("Reni", "Buku", "Orange", "Padat", 5,"09.25", 15000));
//        barang.get(2).nama_Penitip = "Reni";
//        barang.get(2).nama_Barang = "Buku";
//        barang.get(2).waktu_Serah = "09.25";
//        barang.get(2).harga_Penitipan = 15000;
        
        // menjalankan fungsi menu()
        menu();
        
    }
    public static void menu() throws IOException{
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader pilih = new BufferedReader(input);
        System.out.println("|-------------------------------------------|");
        System.out.println("|   Sistem penitipan barang Univ Mulawarman |");
        System.out.println("|-------------------------------------------|");
        System.out.println("|1. Lihat barang titipan                    |");
        System.out.println("|2. Tambah barang titipan                   |");
        System.out.println("|3. Update barang titipan                   |");
        System.out.println("|4. Hapus barang titipan                    |");
        System.out.println("|9. Exit                                    |");
        System.out.println("|-------------------------------------------|");
        
        System.out.print("Pilih menu : ");
        int Pilihan = Integer.valueOf(pilih.readLine());
        if (Pilihan == 1){
            lihatBarang();
        } 
        else if(Pilihan == 2){
            tambahBarang();
        }
        else if (Pilihan == 3){
            updateBarang();
        }
        else if (Pilihan == 4){
            deleteBarang();
        }
        else if (Pilihan == 9){
            System.exit(0);
        }
        else {
            System.out.println("Inputan salah! Coba Lagi!");
            menu();
        }
    }
    public static void lihatBarang() throws IOException{
        
        System.out.println("|---------------------------------------|");
        System.out.println("|   Daftar Barang yang telah terinput   |");
        System.out.println("|---------------------------------------|");
        for (int a = 0; a < barang.size(); a++){
            System.out.println("Data ke-" + (a + 1));
            System.out.println("Nama Pemilik        : " + barang.get(a).nama_penitip);
            System.out.println("Nama Barang         : " + barang.get(a).nama_barang);
            System.out.println("Warna Barang        : " + barang.get(a).warna_barang);
            System.out.println("Jenis Barang        : " + barang.get(a).jenis_barang);
            System.out.println("Jumlah Barang       : " + barang.get(a).banyak_barang);
            System.out.println("Waktu Terima Barang : " + barang.get(a).waktu_serah);
            System.out.println("Harga Penitipan     : " + barang.get(a).harga_penitipan);
        }
        back();
        
    }
    public static void tambahBarang() throws IOException{
        String nama_penitip, nama_barang, warna_barang, jenis_barang, waktu_serah;
        int harga_penitipan, banyak_barang;
        
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader add = new BufferedReader(input);
        System.out.println("|-------------------------------|");
        System.out.println("|   Silahkan Tambahkan Barang   |");
        System.out.println("|-------------------------------|");
        System.out.print("Masukkan nama Penitip : ");
        nama_penitip = add.readLine();
        System.out.print("Masukkan nama Barang : ");
        nama_barang = add.readLine();
        System.out.print("Input Warna Barang : ");
        warna_barang = add.readLine();
        System.out.print("Input Jenis Barang : ");
        jenis_barang = add.readLine();
        System.out.print("Input Banyak Barang");
        banyak_barang = Integer.parseInt(add.readLine());
        System.out.print("Masukkan jam Serah : ");
        waktu_serah = add.readLine();
        System.out.print("Masukkan harga : ");
        harga_penitipan = Integer.parseInt(add.readLine());
        System.out.println("");
        System.out.println("Success!");
        
        
        
        // add ke ArrarList
        Barang databaru = new Barang(nama_penitip, nama_barang, warna_barang, jenis_barang, banyak_barang, waktu_serah, harga_penitipan);
//        databaru.nama_Penitip = nama_Penitip;
//        databaru.nama_Barang = nama_Barang;
//        databaru.waktu_Serah = waktu_Serah;
//        databaru.harga_Penitipan = harga_Penitipan;
        databaru.taruhBarang();
        barang.add(databaru);
        
        back();
    }
    public static void updateBarang() throws IOException{
        String nama_penitip, nama_barang, warna_barang, jenis_barang, waktu_serah;
        int harga_penitipan, banyak_barang;
        
        System.out.println("|---------------------------|");
        System.out.println("|   Update Barang Titipan   |");
        System.out.println("|---------------------------|");
        for (int a = 0; a < barang.size(); a++){
            System.out.println("Data ke-" + (a + 1));
            System.out.println("Nama Pemilik        : " + barang.get(a).nama_penitip);
            System.out.println("Nama Barang         : " + barang.get(a).nama_barang);
            System.out.println("Warna Barang        : " + barang.get(a).warna_barang);
            System.out.println("Jenis Barang        : " + barang.get(a).jenis_barang);
            System.out.println("Jumlah Barang       : " + barang.get(a).banyak_barang);
            System.out.println("Waktu Terima Barang : " + barang.get(a).waktu_serah);
            System.out.println("Harga Penitipan     : " + barang.get(a).harga_penitipan);
        }
        
        InputStreamReader lama = new InputStreamReader(System.in);
        BufferedReader baru = new BufferedReader(lama);
        System.out.print("Pilih data yang ingin diubah :");
        int nomor;
        nomor = Integer.parseInt(baru.readLine()); nomor++;
        System.out.print("Perbarui nama Pemilik : ");
        nama_penitip = baru.readLine();
        System.out.print("Perbarui nama Barang : ");
        nama_barang = baru.readLine();
        System.out.print("Perbarui warna Barang : ");
        warna_barang = baru.readLine();
        System.out.print("Perbarui jenis Barang : ");
        jenis_barang = baru.readLine();
        System.out.print("Perbarui banyak Barang : ");
        banyak_barang = Integer.parseInt(baru.readLine());
        System.out.print("Perbarui jam Terima : ");
        waktu_serah = baru.readLine();
        System.out.print("Perbarui Harga : ");
        harga_penitipan = Integer.parseInt(baru.readLine());
        System.out.println("Success!");
        
        barang.get(nomor).nama_penitip = nama_penitip;
        barang.get(nomor).nama_barang = nama_barang;
        barang.get(nomor).warna_barang = warna_barang;
        barang.get(nomor).jenis_barang = jenis_barang;
        barang.get(nomor).banyak_barang = banyak_barang;
        barang.get(nomor).waktu_serah = waktu_serah;
        barang.get(nomor).harga_penitipan = harga_penitipan;
        back();
        
    }
    public static void deleteBarang() throws IOException{
        int isi;
        System.out.println("Barang yang tersedia");
        for (int a = 0; a < barang.size(); a++){
            System.out.println("Data ke-"+ (a + 1));
            System.out.println("Nama Pemilik        : " + barang.get(a).nama_penitip);
            System.out.println("Nama Barang         : " + barang.get(a).nama_barang);
            System.out.println("Warna Barang        : " + barang.get(a).warna_barang);
            System.out.println("Jenis Barang        : " + barang.get(a).jenis_barang);
            System.out.println("Jumlah Barang       : " + barang.get(a).banyak_barang);
            System.out.println("Waktu Terima Barang : " + barang.get(a).waktu_serah);
            System.out.println("Harga Penitipan     : " + barang.get(a).harga_penitipan);
        }
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader hapus = new BufferedReader(input);
        System.out.print("Pilih data yang telah diambil : ");
        isi = Integer.parseInt(hapus.readLine());isi--;
        
        barang.get(isi).ambilBarang();
        barang.remove(isi);
        back();
    }
    public static void clear() throws IOException{
        for (int i = 0; i < 10; i++){
            System.out.println("\n\n\n\n\n\n");
        }
    }
    public static void back()throws IOException{
        System.out.println("Kembali lagi ke menu?");
        System.out.println("(y/n)((1 = ya) atau (2 = keluar))"); 
        System.out.print("pilihan anda : ");
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader pilih = new BufferedReader(input);
        
        int Pilih = Integer.parseInt(pilih.readLine());
        if (Pilih == 1){
            clear();
            menu();
        }
        else{
            System.exit(0);
        }
    }
    
}

