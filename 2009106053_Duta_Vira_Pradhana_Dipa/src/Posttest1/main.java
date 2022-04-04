/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class main {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    //membuat array list
    static ArrayList<String> rute = new ArrayList<>();
    static ArrayList<Integer> harga = new ArrayList<>();
    static ArrayList<String> pembeli = new ArrayList<>();
    static ArrayList<Integer> tanggal = new ArrayList<>();
    public static void main(String[] args) throws IOException { 
        menu();
    }
    
    //menambah pesanan
    static void pesan() throws IOException{
        System.out.println("\n*=============================================*");
        System.out.println("| No |   Asal   -  Tujuan   | Waktu | Harga   |");
        System.out.println("|=============================================|");
        System.out.println("|  1 | Samarinda - Lombok   |  5PM  |  800K   |");
        System.out.println("|  2 | Samarinda - Denpasar |  8PM  |  1200K  |");
        System.out.println("|  3 | Samarinda - Jakarta  |  10PM |  1000K  |");
        System.out.println("|  4 | Samarinda - Surabaya |  1AM  |  600K   |");
        System.out.println("|  5 | Samarinda - Manado   |  3AM  |  900K   |");
        System.out.println("*=============================================*");
        System.out.print(" Masukkan Pilihan [1-5] : ");
        int pil = Integer.parseInt(input.readLine());
        
        //menambah data harga
        if (pil == 1){
            harga.add(8000000);
        } else if (pil == 2){
            harga.add(12000000);
        }else if (pil == 3){
            harga.add(10000000);
        }else if (pil == 4){
            harga.add(6000000);
        }else if (pil == 5){
            harga.add(9000000);
        }else{
            System.out.println("\n*================================*");
            System.out.println("|         Masukkan Salah         |");
            System.out.println("*================================*\n");
            next();
            menu();
        }
        
        //menambah data rute
        switch (pil){
            case 1:
                rute.add("Samarinda - Lombok (5PM)");
                break;
            case 2:
                rute.add("Samarinda - Denpasar (8PM)");
                break;
            case 3:
                rute.add("Samarinda - Jakarta (10PM)");
                break;
            case 4:
                rute.add("Samarinda - Surabaya (1AM)");
                break;
            case 5:
                rute.add("Samarinda - Manado (3AM)");
                break;
            default :
                next();
                menu();
        }
        
        //menambahkan nama pemesan
        System.out.print(" Masukkan Nama Anda : ");
        String nama = input.readLine();
        pembeli.add(nama);
        
        //menambahkan tanggal pemesan
        System.out.print(" Masukkan Tanggal Keberangkatan (DDMMYY) : ");
        int tgl = Integer.parseInt(input.readLine());
        tanggal.add(tgl);
    }
    
    //menampilkan pesanan
    static void tampil(){
        System.out.println("*================================*");
        System.out.println("|     Daftar Pesanan Tiket       |");
        for(int i = 0 ; i < rute.size();i++){
            System.out.println("*================================*");
            System.out.println(" Nomor   : ["+i+"]");
            System.out.println(" Nama    : "+ pembeli.get(i));
            System.out.println(" Rute    : "+ rute.get(i));
            System.out.println(" Harga   : "+ harga.get(i));
            System.out.println(" Tanggal : "+ tanggal.get(i));
            System.out.println("*================================*");
        }
    }
    
    //mengubah pesanan
    static void ubah() throws IOException{
        //menentukan indeks
        System.out.print(" Indeks Berapa yang Ingin Diubah? : ");
        int a = Integer.parseInt(input.readLine());
        
        //mengganti nama
        System.out.print(" Nama Baru : ");
        String nama_baru = input.readLine();
        pembeli.set(a, nama_baru);
        
        //mengganti rute sekaligus harga
        System.out.println(" Pilih Rute Baru : ");
        System.out.println("*=============================================*");
        System.out.println("| No |   Asal   -  Tujuan   | Waktu | Harga   |");
        System.out.println("|=============================================|");
        System.out.println("|  1 | Samarinda - Lombok   |  5PM  |  800K   |");
        System.out.println("|  2 | Samarinda - Denpasar |  8PM  |  1200K  |");
        System.out.println("|  3 | Samarinda - Jakarta  |  10PM |  1000K  |");
        System.out.println("|  4 | Samarinda - Surabaya |  1AM  |  600K   |");
        System.out.println("|  5 | Samarinda - Manado   |  3AM  |  900K   |");
        System.out.println("*=============================================*");
        System.out.print(" Masukkan Pilihan [1-5] : ");
        int pilbaru = Integer.parseInt(input.readLine());
        
        //mengganti data harga
        if (pilbaru == 1){
            harga.set(a, 8000000);
        } else if (pilbaru == 2){
            harga.set(a, 12000000);
        }else if (pilbaru == 3){
            harga.set(a, 10000000);
        }else if (pilbaru == 4){
            harga.set(a, 6000000);
        }else if (pilbaru == 5){
            harga.set(a, 9000000);
        }else{
            System.out.println("\n*================================*");
            System.out.println("|         Masukkan Salah         |");
            System.out.println("*================================*\n");
            next();
            ubah();
        }
        
        //mengubah data rute
        switch (pilbaru){
            case 1:
                rute.set(a, "Samarinda - Lombok (5PM)");
                break;
            case 2:
                rute.set(a, "Samarinda - Denpasar (8PM)");
                break;
            case 3:
                rute.set(a, "Samarinda - Jakarta (10PM)");
                break;
            case 4:
                rute.set(a, "Samarinda - Surabaya (1AM)");
                break;
            case 5:
                rute.set(a, "Samarinda - Manado (3AM)");
                break;
            default :
                next();
                ubah();
        }
        
        //mengubah tanggal
        System.out.print(" Tanggal Baru (DDMMYY) : ");
        int tgl_baru = Integer.parseInt(input.readLine());
        tanggal.set(a, tgl_baru);
    }
    
    //menghapus pesanan
    static void hapus() throws IOException{
        System.out.print(" Indeks Berapa yang Ingin Dihapus? : ");
        int hps = Integer.parseInt(input.readLine());
        pembeli.remove(hps);
        rute.remove(hps);
        harga.remove(hps);
        tanggal.remove(hps);
    }
    
    //untuk melanjutkan
    static void next() throws IOException{
        String lanjut = input.readLine();
    }
    
    //menu utama
    static void menu() throws IOException{
        System.out.println("\n*================================*");
        System.out.println("|    Pemesanan Tiket Pesawat     |");
        System.out.println("|================================|");
        System.out.println("|  Menu :                        |");
        System.out.println("|  1. Pesan Tiket                |");
        System.out.println("|  2. Lihat Tiket Saya           |");
        System.out.println("|  3. Ubah Tiket Saya            |");
        System.out.println("|  4. Batalkan Tiket             |");
        System.out.println("|  5. Keluar                     |");
        System.out.println("*================================*");
        System.out.print(" Masukkan Pilihan [1-5] : ");
        int pilihan = Integer.parseInt(input.readLine());
        switch (pilihan){
            case 1 -> {
                pesan();
                System.out.println("\n*================================*");
                System.out.println("|     Berhasil Ditambahkan       |");
                System.out.println("*================================*\n");
                next();
                tampil();
                menu();
            }
            case 2 -> {
                if (rute.isEmpty() == true){
                    System.out.println("\n*================================*");
                    System.out.println("|   Tidak Ada Pemesanan Tiket    |");
                    System.out.println("*================================*\n");
                }else {
                    tampil();
                }
                next();
                menu();
            }
            case 3 -> {
                if (rute.isEmpty() == true){
                    System.out.println("\n*================================*");
                    System.out.println("|   Tidak Ada Pemesanan Tiket    |");
                    System.out.println("*================================*\n");
                }else{
                    tampil();
                    ubah();
                    System.out.println("\n*================================*");
                    System.out.println("|       Berhasil Diubah          |");
                    System.out.println("*================================*\n");
                    next();
                    tampil();
                }
                next();
                menu();
            }
            case 4 -> {
                if (rute.isEmpty() == true){
                    System.out.println("\n*================================*");
                    System.out.println("|   Tidak Ada Pemesanan Tiket    |");
                    System.out.println("*================================*\n");
                }else{
                    tampil();
                    hapus();
                    System.out.println("\n*================================*");
                    System.out.println("|       Berhasil Dibatalkan      |");
                    System.out.println("*================================*\n");
                    next();
                    tampil();
                }
                next();
                menu();
            }
            case 5 -> {
                System.out.println("\n*================================*");
                System.out.println("|           TERIMAKASIH          |");
                System.out.println("*================================*\n");
            }
            default -> {
                System.out.println("\n*================================*");
                System.out.println("|         Masukkan Salah         |");
                System.out.println("*================================*\n");
                next();
                menu();
            }
        }
    }
}
