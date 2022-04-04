/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POSTTEST1;
import java.util.ArrayList; 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


/**
 *
 * @author nizar
 */
public class Main {
    static ArrayList<Barang> barang = new ArrayList<Barang>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        barang.add(new Barang());
        barang.get(0).nama = "Ikan Gupy";
        barang.get(0).harga = 12500;
        barang.get(0).stock = 14;
        barang.get(0).jenis = "Ikan";
        barang.add(new Barang());
        barang.get(1).nama = "Ikan Koi";
        barang.get(1).harga = 25000;
        barang.get(1).stock = 100;
        barang.get(1).jenis = "Ikan"; 
        
        while (true) {
            menu();
        }
    }
    public static void menu()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("||========== MENU ==========||");
        System.out.println("||1.Mengisi barang   =======||");
        System.out.println("||2.Melihat barang   =======||");
        System.out.println("||3.Merubah barang   =======||");
        System.out.println("||4.Menghapus barang =======||");
        System.out.println("||5.Exit             =======||");
        System.out.println("||==========================||");
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
        for (int i = 0; i < barang.size(); i++){
            System.out.println("barang ke-" + (i + 1));
            System.out.println("Nama barang : " + barang.get(i).nama);
            System.out.println("Harga barang : " + barang.get(i).harga);
            System.out.println("Stock barang : " + barang.get(i).stock);
            System.out.println("Jenis barang : " + barang.get(i).jenis);
        }
        System.out.println(" ");
    }
    public static void createBarang()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1;
        int input2;
        int input3;
        String input4;
        
        System.out.print("Masukan nama barang : ");
        input1 = br.readLine();
        System.out.print("Masukan harga barang : ");
        input2 = Integer.parseInt(br.readLine());
        System.out.print("Masukan stock barang : ");
        input3 = Integer.parseInt(br.readLine());
        System.out.print("Masukan Jenis barang : ");
        input4 = br.readLine();
        
        Barang buatbarang = new Barang();
        buatbarang.nama = input1;
        buatbarang.harga = input2;
        buatbarang.stock = input3;
        buatbarang.jenis = input4;
        barang.add(buatbarang);
    }
    public static void updateBarang()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputind;
        String input1;
        int input2;
        int input3;
        String input4;
        
        readBarang();
        
        System.out.print("Masukan barang ke-");
        inputind = Integer.parseInt(br.readLine());
        int indexe = inputind-1;
        
        System.out.print("Masukan nama barang : ");
        input1 = br.readLine();
        System.out.print("Masukan harga barang : ");
        input2 = Integer.parseInt(br.readLine());
        System.out.print("Masukan stock barang : ");
        input3 = Integer.parseInt(br.readLine());
        System.out.print("Masukan Jenis barang : ");
        input4 = br.readLine();
        
        barang.get(indexe).nama = input1;
        barang.get(indexe).harga = input2;
        barang.get(indexe).stock = input3;
        barang.get(indexe).jenis = input4;
    }
    public static void deleteBarang()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputd;
        
        readBarang();
        
        System.out.println("Barang yang ingin di hapus");
        System.out.print("Masukan barang ke-");
        inputd = Integer.parseInt(br.readLine());
        int indexd = inputd-1;
        
        barang.remove(indexd);
    }
 
}
