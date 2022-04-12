package Posttest2;
import java.util.ArrayList;
import java.util.Scanner;

public class Pottest2 {
    public static void main(String[] args) {
        ArrayList<Makanan> delivery = new ArrayList<Makanan>();
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        while (true) {
            System.out.println("\n============================");
            System.out.println("Pelayanan Delivery Makanan");
            System.out.println("============================");
            System.out.println("1. Buat Pesanan             ");
            System.out.println("2. Membaca Pesanan          ");
            System.out.println("3. Update Pesanan           ");
            System.out.println("4. Hapus Pesanan            ");
            System.out.println("5. Constructor              ");
            System.out.println("6. Exit                     ");
            System.out.print("Masukkan pilihan menu : ");
            pilihan = input.nextInt();

            switch(pilihan){
                case 1:
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
                    break;
                    
                case 2:
                    if(delivery.isEmpty()) {
                        System.out.println("\nTidak Ada Pesanan!!!");
                        break;
                    }
                    else {
                        for(int i=0; i<delivery.size(); i++){
                        System.out.println("\n==========================================");
                        System.out.println("        DAFTAR PESANAN  - " + (i +1));
                        System.out.println("==========================================");
                        delivery.get(i).display();
                        System.out.println("==========================================\n");
                        }
                        break;
                    }
                
                case 3:
                    System.out.print("Masukkan Nama Restoran : ");
                    String namaRestoran = input.next();
                    for (Makanan makanan : delivery) {
                        if (makanan.restoran.equals(namaRestoran)) {
                            System.out.print("Masukkan Nama                 : ");
                            makanan.setNama(input.next());
                            System.out.print("Masukkan Alamat               : ");
                            makanan.setAlamat(input.next());
                            System.out.print("Masukkan Restoran             : ");
                            makanan.setRestoran(input.next());
                            System.out.print("Masukkan Makanan Yang Dipesan : ");
                            makanan.setPesan(input.next());
                            System.out.print("Masukkan Jumlah Makanan       : ");
                            makanan.setJumlah(input.nextInt());
                            System.out.print("Total + Ongkir                : ");
                            makanan.setTotal(input.nextInt());
                            System.out.print("Metode Pembayaran             : ");
                            makanan.setBayar(input.next());
                            break;
                        }
                    }
                    break;
                
                case 4:
                    System.out.print("Masukkan Nama Restoran : ");
                    String NamaRestoran = input.next();
                    for (int i = 0; i < delivery.size(); i++) {
                        if (delivery.get(i).restoran.equals(NamaRestoran)) {
                            delivery.remove(i);
                            break;
                        }
                    }
                    System.out.println("\nPesanan Berhasil Dihapus!!!\n");
                    break;
                
                case 5:
                    Makanan Andi = new Makanan("Andi", "Sempaja Selatan No. 17", "Burger King", "Burger", 5, 120000, "Cash");
                    Makanan Andika = new Makanan("Andika", "Sempaja Barat N0. 7", "Ayam Gepuk Mba Wanda", "Ayam Gepuk", 4, 70000, "OVO");
                    
                    System.out.println("\n");
                    System.out.println("=====================================");
                    System.out.println(Andi.nama);
                    System.out.println(Andi.alamat);
                    System.out.println(Andi.restoran);
                    System.out.println(Andi.pesan);
                    System.out.println(Andi.jumlah);
                    System.out.println(Andi.total);
                    System.out.println(Andi.bayar);
                    System.out.println("=====================================");
                    System.out.println(Andika.nama);
                    System.out.println(Andika.alamat);
                    System.out.println(Andika.restoran);
                    System.out.println(Andika.pesan);
                    System.out.println(Andika.jumlah);
                    System.out.println(Andika.total);
                    System.out.println(Andika.bayar);
                    System.out.println("=====================================");
                    
                    System.out.print("Andi, ");
                    Andi.Antar();
                    System.out.print("Andika, ");
                    Andika.Tidak();
                    break;

                case 6:
                    System.out.println("\nAnda telah keluar dari program\n");
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nAnda salah pilih menu!!!");
                    break;
            }
        }
    }
}