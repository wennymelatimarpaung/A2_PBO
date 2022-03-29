/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 *
 * @author VITARACOM
 */
public class Posttest1  {static ArrayList<NamaBarang> Namabarang = new ArrayList<NamaBarang>();
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         // TODO code application logic here
        Namabarang.add(new NamaBarang());
        Namabarang.get(0).Merek = "IKEA";
        Namabarang.get(0).Bahan = "kayu Jati";
        Namabarang.get(0).jumlah = 10;
        Namabarang.get(0).harga = 5000000;
        Namabarang.add(new NamaBarang());
        Namabarang.get(1).Merek = "PORTABLE";
        Namabarang.get(1).Bahan = "Aluminium";
        Namabarang.get(1).jumlah = 25;
        Namabarang.get(1).harga = 2500000; 
        
        while (true) {
            menu();
        }
    }
    public static void menu()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("**************** TOKO LEMARI MEUBLE ***************");
        System.out.println("************** 1.Menginput Data  ***********");
        System.out.println("************** 2.Menampilkan Data ***********");
        System.out.println("************** 3.Mengubah Data   ***********");
        System.out.println("************** 4.Menghapus Data *********");
        System.out.println("************** 5.Exit ************* ");
        System.out.println("*******************************************");
        String inputan_m;
        System.out.print("Masukan Menu :");
        inputan_m = br.readLine();
        if(inputan_m.equals("1")){
            createBarang();
        } else if (inputan_m.equals("2")){
            readBarang();
        } else if (inputan_m.equals("3")){
            updateBarang();
        } else if (inputan_m.equals("4")){
            deleteBarang();
        } else if (inputan_m.equals("5")){
            System.exit(1);
        } else {
            System.out.println("SALAH PILIH MENU");
        }    
    }
    public static void readBarang()throws IOException{
        for (int i = 0; i < Namabarang.size(); i++){
            System.out.println("barang ke-" + (i + 1));
            System.out.println("Merek  : " + Namabarang.get(i).Merek);
            System.out.println("Bahan  : " + Namabarang.get(i).Bahan);
            System.out.println("jumlah : " + Namabarang.get(i).jumlah);
            System.out.println("harga  : " + Namabarang.get(i).harga);
        }
        System.out.println(" ");
    }
    public static void createBarang()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1;
        String input2;
        int input3;
        int input4;
        
        System.out.print("Masukan merek barang : ");
        input1 = br.readLine();
        System.out.print("Masukan Bahan barang : ");
        input2 = br.readLine();
        System.out.print("Masukan jumlah barang : ");
        input3 = Integer.parseInt(br.readLine());
        System.out.print("Masukan harga barang : ");
        input4 = Integer.parseInt(br.readLine());
        
        NamaBarang buatbarang = new NamaBarang();
        buatbarang.Merek = input1;
        buatbarang.Bahan = input2;
        buatbarang.jumlah = input3;
        buatbarang.harga = input4;
        Namabarang.add(buatbarang);
    }
    public static void updateBarang()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputind;
        String input1;
        String input2;
        int input3;
        int input4;
        
        readBarang();
        
        System.out.print("Masukan barang ke-");
        inputind = Integer.parseInt(br.readLine());
        int indexe = inputind-1;
        
        System.out.print("Masukan Merek barang : ");
        input1 = br.readLine();
        System.out.print("Masukan Bahan barang : ");
        input2 = br.readLine();
        System.out.print("Masukan jumlah barang : ");
        input3 = Integer.parseInt(br.readLine());
        System.out.print("Masukan harga barang : ");
        input4 = Integer.parseInt(br.readLine());
        
        Namabarang.get(indexe).Merek = input1;
        Namabarang.get(indexe).Bahan = input2;
        Namabarang.get(indexe).jumlah = input3;
        Namabarang.get(indexe).harga = input4;
    }
    public static void deleteBarang()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputd;
        
        readBarang();
        
        System.out.println("Barang yang ingin di hapus");
        System.out.print("Masukan barang ke-");
        inputd = Integer.parseInt(br.readLine());
        int indexd = inputd-1;
        
        Namabarang.remove(indexd);
    }

    private static class NamaBarang {

        private String Merek;
        private String Bahan;
        private Object jumlah;
        private int harga;

        public NamaBarang() {
        }
    }
 
}
