/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {
static ArrayList<String> perbaikan = new ArrayList<String>();
static ArrayList<Integer> biaya = new ArrayList<Integer>();
    static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        perbaikan.add("GantiHardisk");
        biaya.add(625000);
home();
}    
    static void home(){
        System.out.println("========HOMELAPTOP SERVICE========");
        System.out.println("----------------------------------------------------");
        System.out.println("1. Tambah Daftar Perbaikan");
        System.out.println("2. Lihat Daftar Perbaikan"); 
        System.out.println("3. Ubah Daftar Perbaikan");
        System.out.println("4. Hapus Daftar Perbaikan");
        System.out.println("5. EXIT");
        System.out.println("----------------------------------------------------");
        System.out.println("Pilih[1-5] = ");
        int h = input.nextInt();
        switch (h){
        case 1:
                tambahdaftar();
                break;
        case 2:
                lihatdaftar();
                break;
        case 3:
                ubahdaftar();
                break;
        case 4:
                hapusdaftar();
                break;
        case 5:
                System.out.println("Homelaptop Service Keluar");
                break;
        default:
            home(); 
        } 
    }

static void tambahdaftar(){
            System.out.println("Jenis Perbaikan = ");
            String tambah = input.next();
            System.out.println("Biaya Perbaikan = ");
            int tambahb = input.nextInt();
            perbaikan.add(tambah);
            biaya.add(tambahb);
            home();
        }

static void lihatdaftar(){
            for(int i = 0 ; i < perbaikan.size();i++){
            System.out.println("Perbaikan["+ i +"] : "+ perbaikan.get(i) + " Biaya : " + biaya.get(i));
            }
            home();
}

static void ubahdaftar(){
            for(int i = 0 ; i < perbaikan.size();i++){
            System.out.println("Perbaikan["+ i +"] : "+ perbaikan.get(i) + " Biaya : " + biaya.get(i));}
        System.out.println("Ubah daftar yang ke berapa = ");
        int ubah = input.nextInt();
        System.out.println("Ubah jadi = ");
        String jenis = input.next();
        perbaikan.set(ubah, jenis);
        System.out.println("Biaya Perbaikan = ");
        int harga = input.nextInt();
        biaya.set(ubah, harga);
        home();
}

static void hapusdaftar(){
    for(int i = 0 ; i < perbaikan.size();i++){
    System.out.println("Perbaikan["+ i +"] : "+ perbaikan.get(i) + " Biaya : " + biaya.get(i));}
    System.out.println("Hapus daftar yang ke berapa = ");
    int d = input.nextInt();
    perbaikan.remove(d);
    biaya.remove(d);
    home();
    }
}
