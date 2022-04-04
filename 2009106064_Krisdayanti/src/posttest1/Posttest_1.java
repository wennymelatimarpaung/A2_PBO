/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package posttest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class Posttest_1 {

    static InputStreamReader input = new InputStreamReader(System.in);
    static BufferedReader input1 = new BufferedReader(input);
    static ArrayList<Data> list = new ArrayList<>();
    
    static void dian() throws IOException{
        System.out.println("+------------------------------------+");
        System.out.println("| POSTTEST 1                         |");
        System.out.println("+------------------------------------+");
        System.out.println("| Nama    : Krisdayanti              |");
        System.out.println("| NIM     : 2009106064               |");
        System.out.println("| Kelas   : Informatika B 2020 (A2)  |");
        System.out.println("+------------------------------------+\n\n");
        
    }
    
    static void daftarMerch() throws IOException{
        System.out.println("\nJenis Merchandise :");
        System.out.println("- Album \t - Photobook");
        System.out.println("- Lightstick \t - Mini Banners");
        System.out.println("- Photocards \t - Cheering Slogan");
        System.out.println("- Postcards \t - Boneka");
        System.out.println("- Poster \t - Gantungan Kunci/Tas\n");
    }
    
    static void menu() throws IOException{
        System.out.println("+-------------------------+");
        System.out.println("Pemesanan Merchandise KPOP");
        System.out.println("+-------------------------+");
        System.out.println("|         M E N U         |");
        System.out.println("| [1] Tambah Pesanan      |");
        System.out.println("| [2] Lihat Pesanan       |");
        System.out.println("| [3] Update Data Pesanan |");
        System.out.println("| [4] Hapus Pesanan       |");
        System.out.println("| [0] Keluar              |");
        System.out.println("+-------------------------+");
        System.out.print("Pilih Menu : ");
        int pilih = Integer.valueOf(input1.readLine());
        
        switch(pilih){
            case 1 -> addData();
            case 2 -> showData();
            case 3 -> updateData();
            case 4 -> deleteData();
            case 0 -> System.exit(0);
            default -> System.out.println("\nMenu tidak tersedia!\n"); 
        }
    }
    
    static void addData() throws IOException{
        daftarMerch();
        
        Data createdata = new Data();
        
        System.out.println(" ");
        System.out.println("          Membuat Pesanan");
        
        System.out.print("Nama Pemesan \t : ");
        createdata.nama_pemesan = input1.readLine();
        
        System.out.print("Alamat Pemesan \t : ");
        createdata.alamat = input1.readLine();
        
        System.out.print("Alamat Email \t : ");
        createdata.email = input1.readLine();
        
        System.out.print("Merchandise \t : ");
        createdata.merch = input1.readLine();
        
        System.out.print("Idol Group \t : ");
        createdata.grup = input1.readLine();
        
        System.out.print("Jumlah Pesanan \t : ");
        createdata.jumlah = Integer.parseInt(input1.readLine());
        System.out.println(" ");
        list.add(createdata);
    }
    
    static void showData(){
        System.out.println(" ");
        System.out.println("          Pesanan");
        
        if(list.isEmpty()){
            System.out.println("\nTidak ada pesanan\n");
        }else{
            for(int i = 0; i < list.size(); i++){
                System.out.println("Nomor Pesanan \t : " + (i + 1));
                System.out.println("Nama Pesanan \t : " + list.get(i).nama_pemesan);
                System.out.println("Alamat Pemesan \t : " + list.get(i).alamat);
                System.out.println("Email Pemesan \t : " + list.get(i).email);
                System.out.println("Merchandise \t : " + list.get(i).merch);
                System.out.println("Idol Group \t : " + list.get(i).grup);
                System.out.println("Jumlah Pesanan \t : " + list.get(i).jumlah);
                System.out.println(" ");
            }
        }
    }
    
    static void updateData() throws IOException{
        System.out.println(" ");
        System.out.println("          Update Pesanan");
        
        int pilih;
        
        showData();
        
        System.out.print("Pilih nomor pesanan : ");
        pilih = Integer.parseInt(input1.readLine());
        pilih--;
        
        System.out.print("Nama Pemesan \t : ");
        list.get(pilih).nama_pemesan = input1.readLine();
        
        System.out.print("Alamat Pemesan \t : ");
        list.get(pilih).alamat = input1.readLine();
        
        System.out.print("Alamat Email \t : ");
        list.get(pilih).email = input1.readLine();
        
        System.out.print("Merchandise \t : ");
        list.get(pilih).merch = input1.readLine();
        
        System.out.print("Idol Group \t : ");
        list.get(pilih).grup = input1.readLine();
        
        System.out.print("Jumlah Pemesan \t : ");
        list.get(pilih).jumlah = Integer.parseInt(input1.readLine());
        System.out.println(" ");
    }
    
    static void deleteData() throws IOException{
        System.out.println(" ");
        System.out.println("          Hapus Pesanan");
        
        int pilih;
        
        showData();
        
        System.out.print("Pilih Nomor Pesanan : ");
        pilih = Integer.parseInt(input1.readLine());
        pilih--;
        
        list.remove(pilih);
    }
    
    public static void main(String[] args) throws IOException{
        dian();
        
        while(true){
            menu();
        }
    }
}
