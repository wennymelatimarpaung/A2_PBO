/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pembayaran;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Pembayaran {
    static ArrayList<Riwayat> riwayat = new ArrayList<Riwayat>();
    public static void main(String[] args) throws IOException {
        riwayat.add(new Riwayat());
        riwayat.get(0).nama = "Ray";
        riwayat.get(0).notelp = "085959174997";
        riwayat.get(0).status = "Sudah Dibayar";
        
        while (true) {
            Menu();
        }
    }
        public static void Menu() throws IOException{
        InputStreamReader input2 = new InputStreamReader(System.in);
        BufferedReader input3 = new BufferedReader(input2);
            System.out.println("");
        System.out.println("Selamat Datang Di Pembayaran Kost Zalfa");
        System.out.println("1. Liat Pembayaran");
        System.out.println("2. Tambah Pembayaran");
        System.out.println("3. Uppdate Status Pembayaran");
        System.out.println("4. Hapus Pembayaran");
        System.out.println("5. Exit");
        System.out.print("Silahkan Pilih Menu : ");
            System.out.print("");
        int pilih = Integer.parseInt(input3.readLine());
        switch (pilih) {
            case 1:
                read();
                break;
            case 2:
                create();
                break;
            case 3:
                update();
                break;
            case 4:
                delete();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Menu Tidak Tersedia");
                Menu();
                
        }
}
    
    public static void create() throws IOException{
        InputStreamReader create = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(create);
        
        String nama_baru;
        String notelp_baru;
        String status_baru;
        
        System.out.print("Masukkan Nama : ");
        nama_baru = input.readLine();
        System.out.print("Masukkan Nomor Telepon : ");
        notelp_baru = input.readLine();
        System.out.print("Masukkan Status : ");
        status_baru = input.readLine();
        
        if("".equals(nama_baru) || "".equals(notelp_baru) || "".equals(status_baru)){
            System.out.println("Data Tidak Bisa Ditambahkan");
            return;
        }else {
            System.out.println("data berhasil ditambahkan");
        }
        
        Riwayat databaru = new Riwayat();
        databaru.nama = nama_baru;
        databaru.notelp = notelp_baru;
        databaru.status = status_baru;
        riwayat.add(databaru);
       
    }
    public static void read()throws IOException{
        System.out.println("");
        for(int i = 0; i < riwayat.size(); i++){
            System.out.println(i + 1);
            System.out.println("Nama : " + riwayat.get(i).nama);
            System.out.println("Nomor Telepon : " + riwayat.get(i).notelp);
            System.out.println("Status : " + riwayat.get(i).status);
   
    }
}
    public static void update()throws IOException{
        InputStreamReader update = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(update);
        read();
        System.out.println("Update");
        String status_baru;
        int index;
        System.out.print("Pilih Pembayaran Mana Yang Ingin Diubah Statusnya :");
        index = Integer.parseInt(input.readLine());
        index--;
        
        System.out.print("Ubah Status : ");
        status_baru = input.readLine();
        
        riwayat.get(index).status = status_baru;
    }
    public static void delete()throws IOException{
        read();
        InputStreamReader delete = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(delete);
        int index;
        System.out.print("Pilih Pembayaran Mana Yang Ingin Dihapus : ");
        index = Integer.parseInt(input.readLine());
        index--;
        
        riwayat.remove(index);
    }
}
