/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest1;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class HomeCare{
   private String nama;
   private String alamat;
   private String riwayatsakit;
   private HomeCare data;
   //private ArrayList<HomeCare> HomeCare = new ArrayList<HomeCare>();
   private int num;
   
   HomeCare( String nama, String alamat, String riwayatsakit){
      
      this.nama = nama;
      this.alamat = alamat;
      this.riwayatsakit = riwayatsakit;
   }
   public String getnama(){
      return nama;
   }
   public String getalamat(){
      return alamat;
   }
   public String getriwayatsakit(){
      return riwayatsakit;
   }
   
   public String toString(){
      return nama+" "+alamat+" "+riwayatsakit+" ";
   }
public class Posttest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
    List <HomeCare> h = new ArrayList<HomeCare>();  
    Scanner input = new Scanner(System.in);
        int Menu;
        do{
          System.out.println("*******************");
          System.out.println("WELCOME TO HOME CARE");
          System.out.println("*******************");
          System.out.println("1. Tambah Data Pasien");
          System.out.println("2. Tampilkan Data Pasien");
          System.out.println("3. Edit Data Pasien");
          System.out.println("4. Delete Data");
       
          System.out.print("Masukan Pilihan : ");
          Menu = input.nextInt(); input.nextLine();
        if(Menu > 0) {
                menu_HomeCare(Menu);
            }
        } while(Menu != 0);
        
        System.out.println("\nProgram selesai.");
        System.exit(0);
    }
    
    
    public static void menu_HomeCare(int Menu) {
        switch(Menu) {
            case 1:
                create_data();
                break;
            case 2:
                read_data();
                continue_input();
                break;
            case 3:
                update_data();
                break;
            case 4:
                delete_data();
                break;
            default:
                System.out.println("TIDAK ADA PILIHAN");
                continue_input();
        }
    }
    
    public static void create_data() {
    Scanner input = new Scanner(System.in);
    
        System.out.println("Buat Data Pasien");
        System.out.print("NAMA: ");
        String nama = input.nextLine();
        System.out.print("Alamat : ");
        String alamat = input.nextLine();
        System.out.print("Mengidap Penyakit : ");
        String riwayatsakit = input.nextLine();
        System.out.print(" ");
        
               h.add(new h(nama,alamat,riwayatsakit));
            break;
    }

    private static void read_data() {
        System.out.println("\n    Daftar Data Pasien  ");
        System.out.println("*****************************");
        System.out.println("No  Nama \talamat \triwayatsakit");

        for (HomeCare data: HomeCare){
            System.out.println(data.getnama() + " \t " + data.getalamat() + "\t  " + data.getriwayatsakit());
        }
        System.out.println();
    }
    
    private static void update_data() {
        read_data();
        System.out.println("Mengubah Data");

        System.out.print("Pilih Nomor Data Pasien  : ");
        int num = input.nextInt(); input.nextLine();
        boolean ubah = false;
        
        for (HomeCare data : HomeCare) {
            if(data.getId() == nomor) {
                System.out.print("Nama  : ");
                String nama = input.nextLine();
                System.out.print("Alamat :");
                int alamat = input.nextInt();
                System.out.print("Riwayat Sakit  : ");
                int riwayatsakit = input.nextInt(); input.nextLine();
                
                data.setNama(nama);
                data.setalamat(alamat);
                data.setriwayatsakit(riwayatsakit);

                ubah = true;
                break;
            }
        }

        if(ubah == false) {
            System.out.println("\nNomor perental tidak ditemukan.");
            continue_input();
        } else {
            System.out.println("\nData perental berhasil diubah.");
            continue_input();
        }
    }

    private static void delete_data() {
        read_data();
        System.out.println(" Menghapus Data Pasien   ");
        System.out.print("Masukkan Pilihan Data Pasien : ");
        int num = input.nextInt(); input.nextLine();
        boolean Delete = false;
        
        for (HomeCare data : HomeCare){
                HomeCare.remove(data);
                Delete = true;
                break;
            }
        }

        if(Delete == false) {
            System.out.println("Data Tidak Ada.");
            continue_input();
        } else {
            System.out.println("Data  Berhasil Dihapus.");
            continue_input();
        }
    }
    public static void continue_input() {
        System.out.print("Klik Space Untuk Kembali Ke Menu.");
        input.nextLine();
        
        }
}
    


