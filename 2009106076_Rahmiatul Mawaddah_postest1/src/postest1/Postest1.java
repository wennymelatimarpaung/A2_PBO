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
         System.out.println("|-----Daftar Menu Toko Muslimah -----|");
         System.out.println("| 1. Lihat Data Barang               |");
         System.out.println("| 2. Tambah Data Barang              |");
         System.out.println("| 3. Hapus Data Barang               |");
         System.out.println("| 4. Update Data Barang              |");
         System.out.println("| 5. Keluar                          |");
         System.out.println("|------------------------------------|");
         System.out.print("Pilihan Menu Toko : ");
         pilih = s.nextInt();
         System.out.print("\n");

         switch(pilih){
            case 1:
               System.out.println("|---------Barang Tersedia Di Toko --------|");
               Iterator<Toko> i = brg.iterator();
               
               for (Toko M : brg) {
                   System.out.println(" ");
                   System.out.println("\tID         : " + M.getId());
                   System.out.println("\tJumlah     : " + M.getjumlah());
                   System.out.println("\tbarang     : " + M.getBarang());
                   System.out.println("\tJenis      : " + M.getJenis());
                   System.out.println("\tHarga      : " + M.getHarga());
               }
               System.out.println("+---------------------------------+\n");
            break;
            
            case 2:
               System.out.print("Masukkan ID       : ");
               int no = s.nextInt();
               System.out.print("Masukkan Jumlah       : ");
               int jum = s.nextInt();
               System.out.print("Masukkan Barang    : ");
               String Barang = s1.nextLine();
               System.out.print("Masukkan Jenis : ");
               String Jenis = s1.nextLine();
               System.out.print("Masukkan harga    : ");
               int harga = s.nextInt();

               brg.add(new Toko(no,jum,Barang,Jenis,harga));
            break;
            
            case 0:
               boolean found = false;
                    System.out.print("Masukkan ID yang ingin di cari :");
                    int Id = s.nextInt();
                    System.out.println("+--------------------------+");
                    i = brg.iterator();
               while(i.hasNext()){
                    Toko e = i.next();
                  if(e.getId() == Id)  {
                     System.out.println(e);
                     found = true;
                  }
               }
               
               if(!found){
                  System.out.println("Data tidak ditemukan\n");
               }
               System.out.println("+--------------------------+\n");
            break;

            case 3:
                found = false;
                System.out.print("Masukkan ID data yang ingin dihapus :");
                Id = s.nextInt();
                i = brg.iterator();
               while(i.hasNext()){
                  Toko e = i.next();
                  if(e.getId() == Id)  {
                     i.remove();
                     found = true;
                  }
               }
               
               if(!found){
                  System.out.println("Data tidak ditemukan\n");
               }else{
                  System.out.println("Data berhasil dihapus...!\n");
               }
            break;
            
            case 4:
               found = false;
               System.out.print("Masukkan ID data yang akan diperbarui :");
               Id = s.nextInt();
               
               ListIterator<Toko>li = brg.listIterator();
               while(li.hasNext()){
                  Toko e = li.next();
                  if(e.getId() == Id)  {
                     System.out.print("Masukkan Barang Baru    : ");
                     Barang = s1.nextLine();
                     System.out.print("Masukkan Jenis Baru : ");
                     Jenis = s1.nextLine();
                     System.out.print("Masukkan Jumlah Baru : ");
                     jum = s1.nextInt();
                     System.out.print("Masukkan Harga Baru : ");
                     harga = s.nextInt();
                     
                     li.set(new Toko(Id,jum,Barang,Jenis,harga));
                     found = true;
                  }
               }
               
               if(!found){
                  System.out.println("Data tidak ditemukan");
               }else{
                  System.out.println("Data berhasil di Update...!\n");
               }
               
            break;
            
            
            case 6:
              System.out.println("Program Selesai ");
               
            break;

            
         }
      }while(pilih!=5);
        
    }
    
}
