/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest2;

/**
 *
 * @author SHaneEZolDyC
 */
//import library
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Desain {
    static ArrayList<Jasa> jasa = new ArrayList<Jasa>();
    
    public static void main(String[]args) throws Exception{
       
        while (true) {
                menu();
            }
        
    }
    //Tampilan Menu
    private static void menu() throws IOException {
        InputStreamReader menu = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(menu);
        System.out.println("|=========================================|");
        System.out.println("|= Progam Sistem Pemesanan Desain Grafis =|");
        System.out.println("|= 1. Tambah Jasa Desain                 =| ");
        System.out.println("|= 2. Lihat Jasa Desain Yang tersedia    =|");
        System.out.println("|= 3. Update Harga Jasa Desain           =|");
        System.out.println("|= 4. Delete Jasa Desain                 =|");
        System.out.println("|= 0. Exit                               =|");
        System.out.println("|=========================================|");
        
        System.out.print("Pilih Menu Yang Anda Inginkan : ");
        int PilihMenu = Integer.valueOf(input.readLine());
        switch(PilihMenu){
            case 1:
                tambahjasa();
                break;
            case 2:
                lihatjasa();
                break;
            case 3:
                updatejasa();
                break;
            case 4:
                deletejasa();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan Anda Salah!");
                menu();
            
        }
        
       
    }
    public static void tambahjasa() throws IOException{
        InputStreamReader tambah = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(tambah);
        
        String namadesain;
        String jenisdesain;
        String ukurandesain;
        int hargajasa;
       
        
//      menambahkan data
        System.out.println("Masukkan Nama Desain : ");
        namadesain = input.readLine();
        System.out.println("Masukkan jenis desain : ");
        jenisdesain = input.readLine();
        System.out.println("Masukkan ukurandesain : ");
        ukurandesain = input.readLine();
        System.out.println("Masukkan Harga jasa : ");
        hargajasa = Integer.parseInt(input.readLine());
        
        
        if("".equals(namadesain) || "".equals(jenisdesain) || "".equals(ukurandesain) || "".equals(hargajasa)){
            System.out.println("data gagal ditambahkan");
            return;
        }
        
//      Memasukkan data ke dalam arraylist

        Jasa buatdatabaru = new Jasa(namadesain, jenisdesain, ukurandesain,hargajasa);
        buatdatabaru.namadesain = namadesain;
        buatdatabaru.jenisdesain = jenisdesain;
        buatdatabaru.ukurandesain = ukurandesain;
        buatdatabaru.hargajasa = hargajasa;
        jasa.add(buatdatabaru);
        buatdatabaru.Menambahkandata();
          
    }
    public static void lihatjasa()throws IOException{
        System.out.println("Jasa Desain dan Harga yang Tersedia");
        for(int i = 0; i < jasa.size(); i++){
            System.out.println(i + 1);
            System.out.println("Nama Desain :" + jasa.get(i).namadesain);
            System.out.println("Jenis Desain :" + jasa.get(i).jenisdesain);
            System.out.println("Ukuran Desain :" + jasa.get(i).ukurandesain);
            System.out.println("Harga Desain :" + jasa.get(i).hargajasa);
            
        }
    }
    public static void updatejasa()throws IOException {
        InputStreamReader tambah = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(tambah);
        lihatjasa();
        System.out.println("update jasa");
        String namadesain;
        String jenisdesain;
        String ukurandesain;
        int hargajasa;
        int index;
        System.out.println("pilih data yang ingin diupdate");
        index = Integer.parseInt(input.readLine());
        index--;
        
        System.out.println("Masukkan Nama Desain : ");
        namadesain = input.readLine();
        System.out.println("Masukkan jenis desain : ");
        jenisdesain = input.readLine();
        System.out.println("Masukkan ukuran desain : ");
        ukurandesain = input.readLine();
        System.out.println("Masukkan Harga jasa : ");
        hargajasa = Integer.parseInt(input.readLine());
        
        jasa.get(index).namadesain = namadesain;
        jasa.get(index).jenisdesain = jenisdesain;
        jasa.get(index).ukurandesain = ukurandesain;
        jasa.get(index).hargajasa = hargajasa;
        
        
    }
    public static void deletejasa() throws IOException {
        lihatjasa();
        InputStreamReader tambah = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(tambah);
        int index;
        System.out.println("Masukkan Data Mana Yang ingin dihapus :");
        index = Integer.parseInt(input.readLine());
        index--;
        
        jasa.get(index).Menghapusdata();
        jasa.remove(index);
        
    }
    
    
}
