import java.util.Scanner;
import java.util.ArrayList;

class Makanan {
    String nama;
    String alamat;
    String restoran;
    String pesan;
    int jumlah;
    int total;
    String bayar;
    
    Makanan(String nama, String alamat, String restoran, String pesan, int jumlah, int total, String bayar){
        this.nama = nama;
        this.alamat = alamat;
        this.restoran = restoran;
        this.pesan = pesan;
        this.jumlah = jumlah;
        this.total = total;
        this.bayar = bayar;
    }
}

public class Posttest1 {
    public static void main(String[] args) {
        ArrayList<Makanan> delivery = new ArrayList<Makanan>();
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("\n============================");
            System.out.println("Pelayanan Delivery Makanan");
            System.out.println("============================");
            System.out.println("1. Buat Pesanan             ");
            System.out.println("2. Membaca Pesanan          ");
            System.out.println("3. Update Pesanan           ");
            System.out.println("4. Hapus Semua Pesanan      ");
            System.out.println("5. Exit                     ");
            System.out.print("Masukkan pilihan menu : ");
            pilihan = input.nextInt();

            switch(pilihan){
                case (1) -> {
                    System.out.print("Nama                  : ");
                    String nama = input.next();
                    System.out.print("Alamat                : ");
                    String alamat = input.next();
                    System.out.print("Restoran              : ");
                    String restoran = input.next();
                    System.out.print("Makanan Yang Dipesan  : ");
                    String pesan = input.next();
                    System.out.print("Jumlah Makanan        : ");
                    int jumlah = input.nextInt();
                    System.out.print("Total + Ongkir        : ");
                    int total = input.nextInt();
                    System.out.print("Metode Pembayaran     : ");
                    String bayar = input.next();
                    
                    System.out.print("\nMakananmu Berhasil Dipesan!!!\n");
                    delivery.add(new Makanan(nama, alamat, restoran, pesan, jumlah, total, bayar));

                }
                    
                case (2) -> {
                    if(delivery.isEmpty()) {
                        System.out.println("\nTidak Ada Pesanan!!!");
                    }
                    else {
                        for(int i=0; i<delivery.size(); i++){
                        System.out.println("\n===========================");
                        System.out.println("    DAFTAR PESANAN  - " + (i +1));
                        System.out.println("===========================");
                        System.out.println("Nama                  : " + delivery.get(i).nama);
                        System.out.println("Alamat                : " + delivery.get(i).alamat);
                        System.out.println("Restoran              : " + delivery.get(i).restoran);
                        System.out.println("Makanan Yang Dipesan  : " + delivery.get(i).pesan);
                        System.out.println("Jumlah Makanan        : " + delivery.get(i).jumlah);
                        System.out.println("Total + Ongkir        : " + delivery.get(i).total);
                        System.out.println("Metode Pembayaran     : " + delivery.get(i).bayar);
                        System.out.println("============================\n");
                        }               
                    }
                }
                
                case (3) -> {
                    
                }
                
                case (4) -> {
                    for (int j= 0; j<delivery.size(); j++){
                        delivery.removeAll(delivery);
                    }
                    System.out.println("\nPesanan Berhasil Dihapus!!!\n");
                }

                case (5) -> {
                    System.out.println("\nAnda telah keluar dari program\n");
                    System.exit(0);
                }
            }
        }
        while(pilihan != 5);
        }
    }

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//package posttest1;
//Mar'atus Sholeha 
// 2009106067

// Penyewaan DVD 
import java.util.*;

class dvd{
   final int No;
   final String Nama_DVD;
   final String Nama_penyewa;
   final int harga;
   final int tanggal;

   dvd(int No, String Nama_DVD, String Nama_penyewa, int harga, int tanggal){
      this.No = No;
      this.Nama_DVD = Nama_DVD;
      this.Nama_penyewa = Nama_penyewa;
      this.harga = harga;
      this.tanggal = tanggal;
   }

   public int getNo(){
      return No;
   }
   public int getharga(){
      return harga;
   }
   public int gettanggal(){
      return tanggal; 
   }
   public String getNama_DVD(){
      return Nama_DVD;
   }
   public String getNama_penyewa(){
      return Nama_penyewa;
   }

   @Override
   public String toString(){
      return No+" "+Nama_DVD+" "+Nama_penyewa+" "+harga+" "+ tanggal;
   }
}

class menu_CRUDDemo{
   public static void main(String[] args) {
      
      List<dvd> c = new ArrayList<>();
      Scanner s = new Scanner(System.in);
      Scanner s1 = new Scanner(System.in);
      int ch;
      do{
         System.out.println("=========MENU========");
         System.out.println("| 1.Masukkan Data   |");
         System.out.println("| 2.Tampilkan Data  |");
         System.out.println("| 3.Menghapus Data  |");
         System.out.println("| 4.Mengupdate Data |");
         System.out.println("| 0.Keluar          |");
         System.out.println("=====================");
         System.out.print("Masukkan Pilihan : ");
         ch = s.nextInt();

        switch(ch){
            case 1 -> {
                System.out.print("Masukkan No : ");
                int No = s.nextInt();
                System.out.print("Masukkan Nama DVD : ");
                String Nama_DVD = s1.nextLine();
                System.out.print("Masukkan Nama Penyewa : ");
                String Nama_penyewa = s1.nextLine();
                System.out.print("Masukkkan harga sewa: ");
                int harga = s.nextInt();
                System.out.print("Masukkkan tanggal Penyewaan: ");
                int tanggal = s.nextInt();
                
                
                c.add(new dvd(No,Nama_DVD,Nama_penyewa,harga,tanggal));
              }
            case 2 -> {
                
                System.out.println("----------------------------");
                Iterator<dvd> i = c.iterator();
                while(i.hasNext()){
                    dvd e = i.next();
                    System.out.println(e);
                }
                System.out.println("----------------------------");
              }
            case 3 -> {
                boolean found = false;
                System.out.print("Masukkan No yang ingin di hapus :");
                  int No = s.nextInt();
                  System.out.println("----------------------------");
                  Iterator<dvd> i = c.iterator();
                  while(i.hasNext()){
                      dvd e = i.next();
                      if(e.getNo() == No)  {
                          i.remove();
                          found = true;
                      }
                  }  if(!found){
                      System.out.println("DATA TIDAK DITEMUKAN!!!!");
                  }else{
                      System.out.println("Data Berhasil Di Hapus :D!!!");
                  }  System.out.println("----------------------------");
              }
                
            case 4 -> {
                boolean found = false;
                  System.out.print("Masukkan No yang ingin di update :");
                  int No = s.nextInt();
                  ListIterator<dvd>li = c.listIterator();
                  int harga;
                  int tanggal;
                  String Nama_DVD;
                  String Nama_penyewa;
                  while(li.hasNext()){
                      dvd e = li.next();
                      if(e.getNo() == No)  {
                          System.out.print("Masukkan Nama DVD baru : ");
                          Nama_DVD = s1.nextLine();
                          
                          System.out.print("Masukkan Nama Penyewa : ");
                          Nama_penyewa = s1.nextLine();
                          
                          System.out.print("Masukkan Harga Baru : ");
                          harga = s.nextInt();
                          
                          System.out.print("Masukkan Tanggal Penyewaan Baru  : ");
                          tanggal = s.nextInt();
                          li.set(new dvd(No,Nama_DVD,Nama_penyewa,harga,tanggal));
                          found = true;
                      }
                  }  if(!found){
                      System.out.println("Record Not Found");
                  }else{
                      System.out.println("Record is Updated Successfully...!");
                  }
              }

         }
      }while(ch!=0); {
       System.out.println("Terimakasih Telah Mengunjungi Toko Kami :D");
        }
   }
   }
//}
//}

