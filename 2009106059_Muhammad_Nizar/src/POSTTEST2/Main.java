/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POSTTEST2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 *
 * @author nizar
 */
public class Main {
    static ArrayList<Barang> dataBarang = new ArrayList<Barang>();

    
    public static void main(String[] args)throws IOException {
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
        for (int i = 0; i < dataBarang.size(); i++){
            System.out.println("barang ke-" + (i + 1));
            System.out.println("Nama barang : " + dataBarang.get(i).nama);
            System.out.println("Harga Barang: " + dataBarang.get(i).harga);
            System.out.println("Jumlah stock: " + dataBarang.get(i).stock);
            System.out.println("Jenis stock : " + dataBarang.get(i).jenis);
        }
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
        
        Barang dataTerbaru = new Barang(input1,input2,input3,input4);
        dataBarang.add(dataTerbaru);
        dataTerbaru.nambahBarang();
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
        
        dataBarang.get(indexe).nama = input1;
        dataBarang.get(indexe).harga = input2;
        dataBarang.get(indexe).stock = input3;
        dataBarang.get(indexe).jenis = input4;
        
        dataBarang.get(indexe).updateBarang();
    }
    public static void deleteBarang()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputd;
        
        readBarang();
        
        System.out.println("Barang yang ingin di hapus");
        System.out.print("Masukan barang ke-");
        inputd = Integer.parseInt(br.readLine());
        int indexd = inputd-1;
        if (dataBarang.size() > indexd){
            dataBarang.get(indexd).hapusBarang();
            dataBarang.remove(indexd);
        }
    }
 
}
