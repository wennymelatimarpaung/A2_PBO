package posttest1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
static ArrayList dapes = new ArrayList();
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        menu();   
    }
    
    static void menu(){
        System.out.println("+----------------------------+");
        System.out.println("|           M E N U          +");
        System.out.println("+----------------------------+");
        System.out.println("|   1. Memasukkan Data       |"); //create
        System.out.println("|   2. Menampilkan Data      |"); //read
        System.out.println("|   3. Mengubah Data         |"); //update
        System.out.println("|   4. Menghapus Data        |"); //delete
        System.out.println("|   5. Keluar                |");
        System.out.println("+----------------------------+");
        
        System.out.print  ("Pilih Menu : ");
        int pilih = input.nextInt();
        
        switch (pilih){
        case 1:
            tambah();
            break;
        case 2:
            tampil();
            break;
        case 3:
            ubah();
            break;
        case 4:
            hapus();
            break;
        case 5:
            System.out.println("== SEMOGA BERMANFAAT ==");
            break;
        default:
            menu(); 
        } 
    }

    static void tampil(){
        for(int i=0; i<dapes.size(); i++){
            System.out.println("Nama Peserta indeks["+ i +"] : "+ dapes.get(i));
        }
        kembali();
    }

    static void tambah(){
        System.out.println("Masukkan Data Pelatihan UMKM");
        
        int e = dapes.size() + 1;
        
        System.out.print("Nama Pendaftar " + e + " : ");
        String a = input.next();
        
        dapes.add(a);
        
        System.out.println("\n\n- DATA BERHASIL DITAMBAHKAN -");
        kembali();
    }

    static void ubah(){
        for(int i=0; i<dapes.size(); i++){
            System.out.println("Nama Peserta indeks["+ i +"] : "+ dapes.get(i));
        }
        
        System.out.print("Masukkan Indeks      : ");
        int j = input.nextInt();
            
        System.out.print("Masukkan Nilai Baru  : ");          
        String k = input.next();
            
        dapes.set(j,k);
        System.out.println("\n\n- DATA BERHASIL DIUBAH -");
            
        kembali();
    }

    static void hapus(){
        System.out.print("Masukkan Indeks/Nilai : ");
        int l = input.nextInt();
        
        if(l==0 && l<dapes.size()){
            System.out.println("menghapus dengan indeks ");
            dapes.remove(l);
        }else{
            System.out.println("menghapus dengan nilai  ");
            dapes.remove(l);
        }
        
        System.out.println("\n\n- DATA BERHASIL DIHAPUS -");
        kembali();
    }
    
    static void kembali(){
        System.out.print("Masukkan Y untuk lanjut (apapun juga bisa)...");
        input.next();
        menu();
    }
}
