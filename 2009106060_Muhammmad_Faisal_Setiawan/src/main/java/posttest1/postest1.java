package posttest1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class postest1 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<String> nama_penyewa = new ArrayList<>();
    static ArrayList<String> merk_mobil = new ArrayList<>();
    static ArrayList<Integer> harga = new ArrayList<>();
    public static void main(String[] args) throws IOException { 
        menu();
    }
       static void pesan() throws IOException{
         //merk
         System.out.println("Daftar Merk Mobil");    
         System.out.println("1. Xenia");
         System.out.println("2. Inova");
         System.out.println("3. Pajero");
         System.out.println(" Pilih merk mobil yang inging disewa: ");
         int sewa = Integer.parseInt(input.readLine());
         switch (sewa){
           case 1:
                merk_mobil.add("Xenia");
                break;
                case 2:
                merk_mobil.add("Inova");
                break;
            case 3:
                merk_mobil.add("Pajero");
                break;
             default :
                String lanjut = input.readLine();
                menu();
         }
         
         //harga
         System.out.println("Daftar Harga Mobil");    
         System.out.println("1. 8 jam = 150000  ");
         System.out.println("2. 12 jam = 200000");
         System.out.println("3. 24jam = 550000");
         System.out.println(" masukan harga mobil: ");
         int price = Integer.parseInt(input.readLine());
         if (price == 1){
            harga.add(150000);
        } else if (price == 2){
            harga.add(200000);
        }else if (price == 3){
            harga.add(550000);
        }else{
   
            System.out.println("|          Salah         |");
            String lanjut = input.readLine();
            menu();
        }  
        //nama
        System.out.println(" Nama : ");
        String nama = input.readLine();
        nama_penyewa.add(nama);
     }
     //menampilkan pesanan
    static void lihat(){
        System.out.println("*================================*");
        System.out.println("|     Daftar sewa mobil       |");
        for(int i = 0 ; i < merk_mobil.size();i++){
            System.out.println("*================================*");
            System.out.println(" Nomor   : ["+i+"]");
            System.out.println(" Nama    : "+ nama_penyewa.get(i));
            System.out.println(" Merk    : "+ merk_mobil.get(i));
            System.out.println(" Harga   : "+ harga.get(i));
            System.out.println("*================================*");
        }
    }
    static void ubah() throws IOException{
        //menentukan indeks
        System.out.println(" Indeks Berapa yang Ingin Diubah? : ");
        int a = Integer.parseInt(input.readLine());
        
        //mengganti nama
        System.out.println(" Nama Baru : ");
        String nama_baru = input.readLine();
        nama_penyewa.set(a, nama_baru);
         System.out.println("Daftar Merk Mobil");    
         System.out.println("1. Xenia");
         System.out.println("2. Inova");
         System.out.println("3. Pajero");
         System.out.println(" Pilih merk mobil yang inging disewa: ");
         int sewa = Integer.parseInt(input.readLine());
         switch (sewa){
           case 1:
                merk_mobil.set(a,"Xenia");
                break;
                case 2:
                merk_mobil.set(a,"Inova");
                break;
            case 3:
                merk_mobil.set(a,"Pajero");
                break;
             default :
                String lanjut = input.readLine();
                menu();
         }
    }
        //menghapus pesanan
    static void delete() throws IOException{
        System.out.println(" Indeks Berapa yang Ingin Dihapus? : ");
        int hps = Integer.parseInt(input.readLine());
        nama_penyewa.remove(hps);
        merk_mobil.remove(hps);
        harga.remove(hps);
}
       //menu utama
    static void menu() throws IOException{
        
        System.out.println("|    CV Faisal Transportation     |");
        System.out.println("|  Menu :                        |");
        System.out.println("|  1. Sewa                        |");
        System.out.println("|  2. Lihat daftar sewa           |");
        System.out.println("|  3. Ganti pesanan               |");
        System.out.println("|  4. Hapus data                 |");
        System.out.println("|  5. Keluar                     |");
        System.out.println(" Masukkan Pilihan [1-5] : ");
        int pilihan = Integer.parseInt(input.readLine());
        switch (pilihan){
            case 1 -> {
                pesan();
                System.out.println("|     Berhasil Ditambahkan       |");
                String lanjut = input.readLine();
                lihat();
                menu();
            }
            case 2 -> {
                if (merk_mobil.isEmpty() == true){
                    System.out.println("|           Kosong          |");
                }else {
                    lihat();
                }
                String lanjut = input.readLine();
                menu();
            }
            case 3 -> {
                if (merk_mobil.isEmpty() == true){
                    System.out.println("\n*================================*");
                    System.out.println("|              kosong        |");
                    System.out.println("*================================*\n");
                }else{
                    lihat();
                    ubah();
                    System.out.println("\n*================================*");
                    System.out.println("|       Berhasil Diubah          |");
                    System.out.println("*================================*\n");
                    String lanjut = input.readLine();
                    lihat();
                }
                String lanjut = input.readLine();
                menu();
            }
            case 4 -> {
                if (merk_mobil.isEmpty() == true){
                    System.out.println("|  kosong                         |");
                }else{
                    lihat();
                    delete();
                    System.out.println("|       Berhasil Dibatalkan      |");
                    String lanjut = input.readLine();
                    lihat();
                }
                String lanjut = input.readLine();
                menu();
            }
            case 5 -> {
                System.out.println("|         Thank You        |");
            }
            default -> {
                System.out.println("|         Masukkan Salah         |");
                String lanjut = input.readLine();
                menu();
            }
        }
}
}
