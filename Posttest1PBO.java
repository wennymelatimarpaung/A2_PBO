/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest1pbo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;

class Posttest1 {
    public int jumlah_hewan;
    public int jumlah_hari;
    public int harga;
    public int jam;
    public float umur_hewan;
    public float nomor_telepon;
    public String nama_hewan;
    public String nama_pemilik;
    public String jenis_hewan;
    
    Posttest1 (int jumlah_hewan, int jumlah_hari, 
            int harga, int jam, float umur_hewan, float nomor_telepon, 
            String nama_hewan, String nama_pemilik, String jenis_hewan) {
        
        this.jumlah_hewan = jumlah_hewan;
        this.jumlah_hari = jumlah_hari;
        this.harga = harga;
        this.jam = jam;
        this.umur_hewan = umur_hewan;
        this.nomor_telepon = nomor_telepon;
        this.nama_hewan = nama_hewan;
        this.nama_pemilik = nama_pemilik;
        this.jenis_hewan = jenis_hewan;
    }
    
    public int getjumlah_hewan() {
        return jumlah_hewan; }
    
    public int getjumlah_hari() {
        return jumlah_hari; }
    
    public int getharga() {
        return harga; }
    
    public int getjam() {
        return jam; }
    
    public float getumur_hewan() {
        return umur_hewan; }
    
    public float getnomor_telepon() {
        return nomor_telepon; }
    
    public String getnama_hewan() {
        return nama_hewan; }
    
    public String getnama_pemilik() {
        return nama_pemilik; }
    
    public String getjenis_hewan() {
        return jenis_hewan; }
    
    public String toString() {
        return nomor_telepon+ " " +nama_pemilik+ " " +jenis_hewan+
                " " +nama_hewan+ " " +jumlah_hewan+ " " +umur_hewan+ 
                " " +jumlah_hari+ " " +jam+ " " +harga;
    }
    
}

public class Posttest1PBO {
    public static void main(String[] args) {
        List<Posttest1> daftar = new ArrayList<Posttest1>();
        Scanner input_bil = new Scanner(System.in);
        Scanner input_data = new Scanner (System.in);
        int pilihan;
        
        Scanner waitForKeypress = new Scanner(System.in);
//        System.out.print("Tekan Enter Untuk Melanjutkan...");
//        waitForKeypress.nextLine();
        
        do {
            System.out.println("    ___________________________________________");
            System.out.println("    | Selamat Datang di Penitipan Hewan Ceria |");
            System.out.println("    |============= PILIHAN MENU ==============|");
            System.out.println("    | 1. Menampilkan Data                     |");
            System.out.println("    | 2. Menambahkan Data                     |");
            System.out.println("    | 3. Menghapus Data                       |");
            System.out.println("    | 4. Mengupdate Data                      |");
            System.out.println("    | 9. Exit                                 |");
            System.out.println("    |_________________________________________|");
            
            System.out.print("    Masukkan Pilihan Menu : ");
            pilihan = input_bil.nextInt();
            
            switch(pilihan) {    
                case 1:
                    System.out.println("__________________________________________");
                    System.out.println("| Data Hewan Peliharaan                   |");
                    System.out.println("|_________________________________________|");
                    Iterator<Posttest1>i = daftar.iterator();
                    
                    for(Posttest1 R : daftar) {
                        System.out.println(" ");
                        System.out.println("Nomor Telepon : " + R.getnomor_telepon());
                        System.out.println("Nama Pemilik : " + R.getnama_pemilik());
                        System.out.println("Jenis Hewan : " + R.getjenis_hewan());
                        System.out.println("Nama Hewan : " + R.getnama_hewan());
                        System.out.println("Jumlah Hewan : " + R.getjumlah_hewan());
                        System.out.println("Umur Hewan : " + R.getumur_hewan());
                        System.out.println("Jumlah Hari : " + R.getjumlah_hari());
                        System.out.println("Waktu : " + R.getjam());
                        System.out.println("Harga : " + R.getharga());
                    }
                    
                    System.out.print("    \nTekan Enter Untuk Melanjutkan...");
                    waitForKeypress.nextLine();
                    
                break;
                
                    
                case 2:
                    System.out.print(" Menambahkan Data Hewan Peliharaan ");
                    System.out.print("Masukkan Nomor Telepon : ");
                    float nomor_telepon = input_bil.nextFloat();
                    System.out.print("Masukkan Nama Pemilik : ");
                    String nama_pemilik = input_data.nextLine();
                    System.out.print("Masukkan Jenis Hewan : ");
                    String jenis_hewan = input_data.nextLine();
                    System.out.print("Masukkan Nama Hewan : ");
                    String nama_hewan = input_data.nextLine();
                    System.out.print("Masukkan Jumlah Hewan : ");
                    int jumlah_hewan = input_bil.nextInt();
                    System.out.print("Masukkan Umur Hewan : ");
                    float umur_hewan = input_bil.nextFloat();
                    System.out.print("Masukkan Jumlah Hari : ");
                    int jumlah_hari = input_bil.nextInt();
                    System.out.print("Masukkan Jumlah Jam : ");
                    int jam = input_bil.nextInt();
                    System.out.println("Masukkan Harga : ");
                    int harga = input_bil.nextInt();
                    
                    daftar.add(new Posttest1(jumlah_hewan, jumlah_hari, 
                            harga, jam, umur_hewan, nomor_telepon, nama_hewan, 
                            nama_pemilik, jenis_hewan));
                    
                    System.out.print("    \nTekan Enter Untuk Melanjutkan...");
                    waitForKeypress.nextLine();
                    
                break;
                
                case 0:
                    boolean found = false;
                        System.out.println("    Mencari Data Hewan Peliharaan ");
                        System.out.print("    Masukkan Nomor Telepon : ");
                        nomor_telepon = input_bil.nextFloat();
                        i = daftar.iterator();
                    while(i.hasNext()) {
                        Posttest1 a = i.next();
                        if(a.getnomor_telepon() == nomor_telepon) {
                            System.out.println(a);
                            found = true;
                        }
                    }
                    
                    if(!found) {
                        System.out.println("    OOPS DATA TIDAK DITEMUKAN!!!");
                    }
                    
                    System.out.println("    Data Tidak Ditemukan");
                break;
                
                case 3:
                    found = false;
                    System.out.println("    Menghapus Data Hewan Peliharaan");
                    System.out.print("    Masukkan Nomor Telepon : ");
                    nomor_telepon = input_bil.nextFloat();
                    i = daftar.iterator();
                    while(i.hasNext()) {
                        Posttest1 a = i.next();
                        if(a.getnomor_telepon() == nomor_telepon) {
                            i.remove();
                            found = true;
                        }
                    }
                    
                    if(!found) {
                        System.out.println("    OOPS DATA TIDAK DITEMUKAN!!!");
                    }
                    
                    System.out.println("    Data Berhasil Di Hapus");
                    
                    System.out.print("    \nTekan Enter Untuk Melanjutkan...");
                    waitForKeypress.nextLine();
                    
                break;
                
                case 4:
                    found = false;
                    System.out.println("    Update Data Hewan Peliharaan");
                    System.out.print("    Masukkan Nomor Telepon : ");
                    nomor_telepon = input_bil.nextFloat();
                    
                    ListIterator<Posttest1>rs = daftar.listIterator();
                    while(rs.hasNext()) {
                        Posttest1 a = rs.next();
                        if(a.getnomor_telepon() == nomor_telepon) {
                            System.out.print("    Masukkan Nomor Telepon Baru : ");
                            nomor_telepon = input_bil.nextFloat();
                            System.out.print("    Masukkan Nama Pemilik Baru : ");
                            nama_pemilik = input_data.nextLine();
                            System.out.print("    Masukkan Jenis Hewan Baru : ");
                            jenis_hewan = input_data.nextLine();
                            System.out.print("    Masukkan Nama Hewan Baru : ");
                            nama_hewan = input_data.nextLine();
                            System.out.print("    Masukkan Jumlah Hewan Baru : ");
                            jumlah_hewan = input_bil.nextInt();
                            System.out.print("    Masukkan Umur Hewan Baru : ");
                            umur_hewan = input_bil.nextFloat();
                            System.out.print("    Masukkan Jumlah Hari Baru : ");
                            jumlah_hari = input_bil.nextInt();
                            System.out.print("    Masukkan Jumlah Jam Baru : ");
                            jam = input_bil.nextInt();
                            System.out.print("    Masukkan Harga Baru: ");
                            harga = input_bil.nextInt();
                            
                            rs.set(new Posttest1(jumlah_hewan, jumlah_hari, 
                            harga, jam, umur_hewan, nomor_telepon, nama_hewan, 
                            nama_pemilik, jenis_hewan));
                            
                            found = true;
                        }
                    }
                    
                    if(!found) {
                        System.out.println("    OOPS DATA TIDAK DITEMUKAN!!!");
                    } else {
                        System.out.println("    Data Telah Berhasil Di Update!!");
                    }
                    
                    System.out.print("    \nTekan Enter Untuk Melanjutkan...");
                    waitForKeypress.nextLine();
                    
                break;
                
                case 9:
                    System.out.println("    ----- THANK YOU ----- ");
                    System.exit(0);
                break;
            }
        } 
        while (pilihan != 0);
        
    }
    
}