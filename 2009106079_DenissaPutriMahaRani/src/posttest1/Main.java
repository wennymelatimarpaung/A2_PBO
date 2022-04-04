/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest1;

/**
 *
 * @author Hp
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
//            Scanner input2 = new Scanner(System.in);
            ArrayList data = new ArrayList();
            
            int pilihMenu = 0;
            do{
                System.out.println("=========================================");
                System.out.println("   SISTEM PENDATAAN KSR KOTA SAMARINDA   ");
                System.out.println("=========================================");
                System.out.println("Menu :");
                System.out.println("1. Tambahkan Data");
                System.out.println("2. Tampilkan Data");
                System.out.println("3. Ubah Data");
                System.out.println("4. Hapus Data");
                System.out.println("5. keluar");
                System.out.println("=========================================");
                System.out.print("Pilih >> ");
                pilihMenu = input.nextInt();
                switch (pilihMenu){
                    case 1:
                        System.out.println("====================");
                        System.out.println("** Tambahkan data **");
                        System.out.println("====================");
                        System.out.println(" ");
                        System.out.print("Masukkan nama instansi   : ");
                        String nama = input.next();
                        data.add(nama);
                        System.out.print("Masukkan asal instansi   : ");
                        String asal = input.next();
                        data.add(asal);
                        System.out.print("Masukkan alamat          : ");
                        String alamat = input.next();
                        data.add(alamat);
                        System.out.print("Masukkan jumlah anggota  : ");
                        int jumlah = input.nextInt();
                        data.add(jumlah);
                        System.out.print("Masukkan tahun berdiri   : ");
                        int tahun = input.nextInt();
                        data.add(tahun);
                        System.out.print("Dibawah naungan PMI(y/t) : ");
                        var naungan = input.next();
                        data.add(naungan);
                        break;
                    case 2:
                        System.out.print(" ");
                        System.out.println("====================");
                        System.out.println("** Tampilkan data **");
                        System.out.println("====================");
                        for (int i=0; i < data.size(); i++){
                            System.out.println((i+1) + "." + data.get(i));
                        }
                        break;
                    case 3:
                        System.out.println("====================");
                        System.out.println("** Ubah data **");
                        System.out.println("===================="); 
                        System.out.print("Masukkan nama instansi yang datanya ingin diubah :");
                        nama = input.next();
                        for (int i=1; i < data.size(); i++){
                            System.out.println("Data ke- "+ i +" : "+ data.get(i));
                        }
                        System.out.print("Ubah data ke -     : ");
                        int urutan = input.nextInt();
                        
                        System.out.print("Masukkan data terbaru  : ");          
                        String dataBaru = input.next();
                        data.set(urutan, dataBaru);
                        break;
                    case 4:
                        System.out.println("======================");
                        System.out.println("** Menghapus data **");
                        System.out.println("======================");
                        data.clear();
                        break;
                    case 5:
                        System.out.println(" ");
                        System.out.println("** Terimakasih telah menggunakan program :) **");
                        System.out.println(" ");
                        break;
                    default:
                        System.out.println("");
                        System.out.println("*** Maaf pilihan tidak tersedia ***");
                        System.out.println("");
                    break;

                }
            }
            while (pilihMenu != 5);
        }
    }
    

