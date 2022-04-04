package Posttest1;
import java.util.Scanner;
import java.util.ArrayList;

class Makan {
    String nama;
    String alamat;
    String restoran;
    String pesan;
    int jumlah;
    int total;
    String bayar;
    
    Makan(String nama, String alamat, String restoran, String pesan, int jumlah, int total, String bayar){
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
        ArrayList<Makan> delivery = new ArrayList<Makan>();
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
                    delivery.add(new Makan(nama, alamat, restoran, pesan, jumlah, total, bayar));

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