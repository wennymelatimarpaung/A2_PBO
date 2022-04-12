package posttest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class main {
    static InputStreamReader inp = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inp);
    static ArrayList<baju> list = new ArrayList<>();
    
    static void menu() throws IOException{
        System.out.println("=====MENU=====");
        System.out.print("[1] Tambah\n[2] Lihat\n[3] Perbarui\n[4] Hapus\n[5] Keluar\nPilih Menu : ");
        int select = Integer.valueOf(input.readLine());
        
        switch(select){
            case 1 -> tambah();
            case 2 -> tampil();
            case 3 -> edit();
            case 4 -> hapus();
            case 5 -> System.exit(0);
            default -> System.out.println("Tidak ditemukan..."); 
        }
    }
    
    static void tambah() throws IOException{
        baju createBaju = new baju();
        System.out.print("Model baju : ");
        createBaju.model = input.readLine();
        System.out.print("Ukuran : ");
        createBaju.ukuran = input.readLine();
        System.out.print("Warna : ");
        createBaju.warna = input.readLine();
        System.out.print("Jumlah : ");
        createBaju.jumlah = Integer.parseInt(input.readLine());
        list.add(createBaju);
    }
    
    static void tampil(){
        
        if(list.isEmpty()){
            System.out.println("No Data...");
        }else{
            for(int i = 0; i < list.size(); i++){
                System.out.println((i + 1) + "\t" + list.get(i).model + "\t" + list.get(i).ukuran + "\t" + list.get(i).warna + "\t" + list.get(i).jumlah);
            }
        }
    }
    
    static void edit() throws IOException{
        int select;
        tampil();
        
        System.out.print("Pilih nomor pesanan : ");
        select = Integer.parseInt(input.readLine());
        select--;
        
        System.out.print("Model baju : ");
        list.get(select).model = input.readLine();
        System.out.print("Ukuran : ");
        list.get(select).ukuran = input.readLine();
        System.out.print("Warna : ");
        list.get(select).warna = input.readLine();
        System.out.print("Jumlah : ");
        list.get(select).jumlah = Integer.parseInt(input.readLine());
    }
    
    static void hapus() throws IOException{
        int select;
        tampil();
        
        System.out.print("Pilih nomor pesanan : ");
        select = Integer.parseInt(input.readLine());
        select--;
        
        list.remove(select);
    }
    
    public static void main(String[] args) throws IOException{
        while(true){
            menu();
        }
    }
}

