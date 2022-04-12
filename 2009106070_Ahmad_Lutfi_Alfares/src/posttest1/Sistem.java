package posttest1;

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
        barang.add(new Barang());
        barang.get(0).nama_Penitip = "Jaka";
        barang.get(0).nama_Barang = "Helm";
        barang.get(0).waktu_Serah = "08.00";
        barang.get(0).harga_Penitipan = 15000;
        barang.add(new Barang());
        barang.get(1).nama_Penitip = "Yaya";
        barang.get(1).nama_Barang = "Tas";
        barang.get(1).waktu_Serah = "07.23";
        barang.get(1).harga_Penitipan = 15000;
        barang.add(new Barang());
        barang.get(2).nama_Penitip = "Reni";
        barang.get(2).nama_Barang = "Buku";
        barang.get(2).waktu_Serah = "09.25";
        barang.get(2).harga_Penitipan = 15000;
        
        // menjalankan fungsi menu()
        menu();
        
    }
    public static void menu() throws IOException{
        System.out.println("|---------------------------------------|");
        System.out.println("|Sistem penitipan barang Univ Mulawarman|");
        System.out.println("|---------------------------------------|");
        System.out.println("|1. Lihat barang titipan                |");
        System.out.println("|2. Tambah barang titipan               |");
        System.out.println("|3. Update barang titipan               |");
        System.out.println("|4. Hapus barang titipan                |");
        System.out.println("|9. Exit                              |");
        System.out.println("|---------------------------------------|");
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader pilih = new BufferedReader(input);
        System.out.println("Pilih menu :");
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
            System.out.println("Data ke-"+ a + 1);
            System.out.println("Nama Pemilik : " + barang.get(a).nama_Penitip);
            System.out.println("Nama Barang : " + barang.get(a).nama_Barang);
            System.out.println("Waktu Terima Barang : " + barang.get(a).waktu_Serah);
            System.out.println("Harga Penitipan : " + barang.get(a).harga_Penitipan);
        }
        back();
        
    }
    public static void tambahBarang() throws IOException{
        String nama_Penitip;
        String nama_Barang;
        String waktu_Serah;
        int harga_Penitipan;
        
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader add = new BufferedReader(input);
        System.out.println("|-------------------------------|");
        System.out.println("|   Silahkan Tambahkan Barang   |");
        System.out.println("|-------------------------------|");
        System.out.println("Masukkan nama Penitip : ");
        nama_Penitip = add.readLine();
        System.out.println("Masukkan nama Barang : ");
        nama_Barang = add.readLine();
        System.out.println("Masukkan jam Serah : ");
        waktu_Serah = add.readLine();
        System.out.println("Masukkan harga : ");
        harga_Penitipan = Integer.parseInt(add.readLine());
        System.out.println("Success!");
        
        
        // add ke ArrarList
        Barang databaru = new Barang();
        databaru.nama_Penitip = nama_Penitip;
        databaru.nama_Barang = nama_Barang;
        databaru.waktu_Serah = waktu_Serah;
        databaru.harga_Penitipan = harga_Penitipan;
        barang.add(databaru);
        
        back();
    }
    public static void updateBarang() throws IOException{
        String nama_Barang;
        String nama_Penitip;
        String waktu_Serah;
        int harga_Penitipan;
        
        System.out.println("|---------------------------|");
        System.out.println("|   Update Barang Titipan   |");
        System.out.println("|---------------------------|");
        
        lihatBarang();
        InputStreamReader lama = new InputStreamReader(System.in);
        BufferedReader baru = new BufferedReader(lama);
        System.out.println("Pilih data yang ingin diubah :");
        int nomor;
        nomor = Integer.parseInt(baru.readLine()); nomor--;
        
        System.out.println("Perbarui nama Pemilik : ");
        nama_Penitip = baru.readLine();
        System.out.println("Perbarui nama Barang : ");
        nama_Barang = baru.readLine();
        System.out.println("Perbarui jam Terima : ");
        waktu_Serah = baru.readLine();
        System.out.println("Perbarui Harga : ");
        harga_Penitipan = Integer.parseInt(baru.readLine());
        System.out.println("Success!");
        back();
        
    }
    public static void deleteBarang() throws IOException{
        int isi;
        System.out.println("Barang yang tersedia");
        for (int a = 0; a < barang.size(); a++){
            System.out.println("Data ke-"+ a + 1);
            System.out.println("Nama Pemilik : " + barang.get(a).nama_Penitip);
            System.out.println("Nama Barang : " + barang.get(a).nama_Barang);
            System.out.println("Waktu Terima Barang : " + barang.get(a).waktu_Serah);
            System.out.println("Harga Penitipan : " + barang.get(a).harga_Penitipan);
        }
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader hapus = new BufferedReader(input);
        System.out.println("Pilih data yang telah diambil : ");
        
        isi = Integer.parseInt(hapus.readLine());isi--;
        barang.remove(isi);
        System.out.println("Barang telah terhapus!");
        back();
    }
    public static void clear() throws IOException{
        for (int i = 0; i < 10; i++){
            System.out.println("\n\n\n\n\n\n");
        }
    }
    public static void back()throws IOException{
        System.out.print("Kembali lagi ke menu (y/n)((1 = ya) atau (2 = keluar)) pilihan anda : \n");
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

