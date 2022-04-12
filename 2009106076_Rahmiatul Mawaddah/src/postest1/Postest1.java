/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package postest1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author Hp
 */

class Toko{
   public int Id;
   public int Jum;
   public String jenis;
   public String Barang;
   public int harga;

   Toko(int Id,int Jum, String jenis, String Barang, int harga){
      this.Id = Id;
      this.Jum = Jum;
      this.jenis = jenis;
      this.Barang = Barang;
      this.harga = harga;
   }
   public int getId(){
      return Id;
   }
   public int getjumlah(){
      return Jum;
   }
   public int getHarga(){
      return harga;
   }
   public String getJenis(){
      return jenis;
   }
   public String getBarang(){
      return Barang;
   }


   public String toString(){
      return Id+" "+Jum+" "+jenis+" "+Barang+" "+harga;
   }
}
public class Postest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      List<Toko> brg = new ArrayList<Toko>();
      Scanner s = new Scanner(System.in);
      Scanner s1 = new Scanner(System.in);
      int pilih;
      do{
         System.out.println("+------------------------------------+");
         System.out.println("|-----Daftar Menu Toko Muslimah -----|");
         System.out.println("+------------------------------------+");
         System.out.println("|      1. Tambah Data Barang         |");
         System.out.println("|      2. Lihat Data Barang          |");
         System.out.println("|      3. Hapus Data Barang          |");
         System.out.println("|      4. Update Data Barang         |");
         System.out.println("|      5. Keluar                     |");
         System.out.println("|------------------------------------|");
         System.out.print("Pilihan Menu Toko : ");
         pilih = s.nextInt();
         System.out.print("\n");

         switch(pilih){
            case 1:
               System.out.println("+-----------------------------------------------------------+");
               System.out.println("|-----------     TAMBAH DATA BARANG TOKO        ------------|");
               System.out.println("+-----------------------------------------------------------+");
               System.out.println("Masukkan ID Barang          : "); int no = s.nextInt();
               System.out.println("Masukkan Jumlah Barang      : "); int jum = s.nextInt();
               System.out.println("Masukkan Nama Barang Barang : "); String Barang = s1.nextLine();
               System.out.println("Masukkan Jenis Barang       : "); String Jenis = s1.nextLine();
               System.out.println("Masukkan harga Barang       : "); int harga = s.nextInt();
               System.out.println("-----------------------------------------------------------");

               brg.add(new Toko(no,jum,Barang,Jenis,harga));
            break;

            case 2:
               System.out.println("+-----------------------------------------------------------+");
               System.out.println("|---------      Barang Yang Tersedia Di Toko        --------|");
               System.out.println("+-----------------------------------------------------------+");
               Iterator<Toko> i = brg.iterator();
               
               for (Toko M : brg) {
                   System.out.println(" ");
                   System.out.println("\tID         : " + M.getId());
                   System.out.println("\tJumlah     : " + M.getjumlah());
                   System.out.println("\tbarang     : " + M.getBarang());
                   System.out.println("\tJenis      : " + M.getJenis());
                   System.out.println("\tHarga      : " + M.getHarga());
               }
               System.out.println("+----------------------------------------------------------+");
            break;

            

            case 3:
               System.out.println("+-----------------------------------------------------------+");
               System.out.println("|---------      Barang Yang Tersedia Di Toko        --------|");
               System.out.println("+-----------------------------------------------------------+");               
               for (Toko M : brg) {
                   System.out.println(" ");
                   System.out.println("\tID         : " + M.getId());
                   System.out.println("\tJumlah     : " + M.getjumlah());
                   System.out.println("\tbarang     : " + M.getBarang());
                   System.out.println("\tJenis      : " + M.getJenis());
                   System.out.println("\tHarga      : " + M.getHarga());
                 }
                    System.out.println("+----------------------------------------------------------+");
                boolean found = false;
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("------ Masukkan ID data Barang yang ingin dihapus ------- :");
                    System.out.println("-----------------------------------------------------------");
               int Id = s.nextInt();
                i = brg.iterator();
               while(i.hasNext()){
                  Toko e = i.next();
                  if(e.getId() == Id)  {
                     i.remove();
                     found = true;
                  }
               }
               
               if(!found){
                  System.out.println("+-----------------------------------------------------------+");
                  System.out.println("|               Data Barang tidak ditemukan                 |");
                  System.out.println("+-----------------------------------------------------------+");
               }else{
                  System.out.println("+-----------------------------------------------------------+");
                  System.out.println("|              Data Barang berhasil dihapus...!             |");
                  System.out.println("+-----------------------------------------------------------+");
               }
            break;
            
            case 4:
               System.out.println("+-----------------------------------------------------------+");
               System.out.println("|---------      Barang Yang Tersedia Di Toko        --------|");
               System.out.println("+-----------------------------------------------------------+");
               
               for (Toko M : brg) {
                   System.out.println(" ");
                   System.out.println("\tID         : " + M.getId());
                   System.out.println("\tJumlah     : " + M.getjumlah());
                   System.out.println("\tbarang     : " + M.getBarang());
                   System.out.println("\tJenis      : " + M.getJenis());
                   System.out.println("\tHarga      : " + M.getHarga());
               }
               System.out.println("+----------------------------------------------------------+");
               found = false;

               System.out.println("+-----------------------------------------------------------+");
               System.out.println("|          Masukkan ID data yang akan di Update :           |");
               System.out.println("+-----------------------------------------------------------+");
               Id = s.nextInt();
               
               ListIterator<Toko>li = brg.listIterator();
               while(li.hasNext()){
                  Toko e = li.next();
                  if(e.getId() == Id)  {
                     System.out.println("+------------------------------------------------------------+");
                     System.out.println("         Masukkan ID data Barang yang ingin diupdate :       |");
                     System.out.println("+------------------------------------------------------------+");
                     System.out.println("Masukkan Nama Barang Baru    : ");Barang = s1.nextLine();
                     System.out.println("Masukkan Jenis Baru          : ");Jenis = s1.nextLine();
                     System.out.println("Masukkan Jumlah Baru         : ");jum = s1.nextInt();
                     System.out.println("Masukkan Harga Baru          : ");harga = s.nextInt();
                     System.out.println("+-----------------------------------------------------------+");                     
                     li.set(new Toko(Id,jum,Barang,Jenis,harga));
                     found = true;
                  }
               }
               
               if(!found){
                  System.out.println("+-----------------------------------------------------------+");
                  System.out.println("|              Data Barang tidak ditemukan                  |");
                  System.out.println("+-----------------------------------------------------------+");
               }else{
                  System.out.println("+-----------------------------------------------------------+");
                  System.out.println("|              Data berhasil di Update...!!!                |");
                  System.out.println("+-----------------------------------------------------------+");
               }
               
            break;
            
            
            case 6:
              System.out.println("+--------------------------------------------------------------+");
              System.out.println("                  Program Selesai Terima Kasih!!!              |");
              System.out.println("+--------------------------------------------------------------+");
               
            break;

            
         }
      }while(pilih!=5);
        
    }
    
}