/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posttest2;
    import java.util.Scanner;
    import java.util.ArrayList;
    import java.io.IOException;

/**
 *
 * @author LENOVO
 */
public class posttest2pbo {
    static ArrayList<Long> data_nomor_antrian = new ArrayList<>();
    static ArrayList<String> data_nama_pasien = new ArrayList<>();
    static ArrayList<String> data_tempat_tinggal = new ArrayList<>();
    static ArrayList<String> data_tanggal_periksa = new ArrayList<>();
    static ArrayList<String> data_jenis_kelamin = new ArrayList<>();
    static ArrayList<String> data_agama = new ArrayList<>();
    static ArrayList<String> data_status = new ArrayList<>();
    static ArrayList<String> data_jenis_penyakit = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);
    
    static void clearScreen() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                // clear screen untuk windows
                new ProcessBuilder("cmd", "/c", "cls")
                        .inheritIO()
                        .start()
                        .waitFor();
            } else {
                // clear screen untuk Linux, Unix, Mac
                Runtime.getRuntime().exec("clear");
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final IOException | InterruptedException e) {
            System.out.println("Error karena: " + e.getMessage());
        }
    }
    
    static void menampilkan(){
        clearScreen();
        System.out.print("\n\n\n\n");
        System.out.println("\t\t\t############################################");
        System.out.println("\t\t\t=  PROGRAM DATA PASIEN RUMAH SAKIT MELODI  =");
        System.out.println("\t\t\t=              DOKTER MELATI               =");
        System.out.println("\t\t\t############################################");
        
        System.out.print("\n\t\t\ttekan [ENTER] untuk melanjutkan....");
        input.nextLine();
    }
    
    static void menu_data(){
        Scanner masukkan = new Scanner(System.in);
       
        clearScreen();
        System.out.println("\n\n\n\n");
        System.out.println("\t\t\t#########################################");
        System.out.println("\t\t\t= PROGRAM DATA PASIEN RUMAH SAKIT MELODI ");
        System.out.println("\t\t\t= [1] Membuat data                       ");
        System.out.println("\t\t\t= [2] Melihat Data                       ");
        System.out.println("\t\t\t= [3] Mengedit Data                      ");
        System.out.println("\t\t\t= [4] Menghapus Data                     ");
        System.out.println("\t\t\t= [5] Tampilkan Tugas Postest 2          ");
        System.out.println("\t\t\t= [0] Exit                               ");
        System.out.println("\t\t\t#########################################");
        System.out.print("\t\t\tPilih menu : ");
        int pilihMenu = masukkan.nextInt();
        switch (pilihMenu) {
            case 0:
                clearScreen();
                System.out.println("\n\n\n\n");
                System.out.println("\t\t\t=== Terima kasih telah menggunakan program ini ===");
                System.exit(0);
            case 1:
                clearScreen();
                System.out.println("\n\n\n");
                System.out.println("\t\t\t##############################################");
                System.out.println("\t\t\t=  MENGINPUT DATA PASIEN RUMAH SAKIT MELODI  =");
                System.out.println("\t\t\t##############################################");
                System.out.print("Masukan banyak data : ");
                int banyak = input.nextInt();
                for(int y = 0 ; y < banyak; y++){
                    System.out.print("Masukan nomor antrian : ");
                    long nomor_antrian = input.nextLong();
                    input.nextLine(); 
                    data_nomor_antrian.add(nomor_antrian);
                    System.out.print("Masukan nama pasien : ");
                    String nama_pasien = input.nextLine();
                    data_nama_pasien.add(nama_pasien);
                    System.out.print("Masukan tempat tinggal : ");
                    String tempat_tinggal = input.nextLine();
                    data_tempat_tinggal.add(tempat_tinggal);
                    System.out.print("Masukan tanggal periksa : ");
                    String tanggal_periksa = input.nextLine();
                    data_tanggal_periksa.add(tanggal_periksa);
                    System.out.print("Masukan jenis kelamin : ");
                    String jenis_kelamin = input.nextLine();
                    data_jenis_kelamin.add(jenis_kelamin);
                    System.out.print("Masukan agama : ");
                    String agama = input.nextLine();
                    data_agama.add(agama);
                    System.out.print("Masukan status : ");
                    String status = input.nextLine();
                    data_status.add(status);
                    System.out.print("Masukan jenis_penyakit : ");
                    String jenis_penyakit = input.nextLine();
                    data_jenis_penyakit.add(jenis_penyakit);
                    
                    System.out.print("\n\nDATA BERHASIL DITAMBAHKAN!");
                }
                
                System.out.print("\ntekan [ENTER] untuk kembali...");
                input.nextLine();
                menu_data();
                break;
                
            case 2:
                clearScreen();
                System.out.println("= DATA PASIEN RUMAH SAKIT MELODI =");
                
                for(int y = 0; y < data_nomor_antrian.size(); y++){
                   System.out.println("PASIEN KE-" + (y+1));
                   System.out.println("Nomor antrian         : "+data_nomor_antrian.get(y));
		   System.out.println("Nama pasien           : "+data_nama_pasien.get(y));
                   System.out.println("Tempat tinggal        : "+data_tempat_tinggal.get(y));
                   System.out.println("Tanggal periksa       : "+data_tanggal_periksa.get(y));
                   System.out.println("Jenis kelamin         : "+data_jenis_kelamin.get(y));
                   System.out.println("Agama                 : "+data_agama.get(y));
                   System.out.println("Status                : "+data_status.get(y));
                   System.out.println("Jenis penyakit        : "+data_jenis_penyakit.get(y));
                   System.out.println("=====================");
                   
                }
                
                System.out.print("tekan [ENTER] untuk kembali...");
                input.nextLine();
                menu_data();
                break;
                
            case 3 :
                clearScreen();
                System.out.println("= DATA PASIEN RUMAH SAKIT MELODI =");
                
                for(int y = 0; y < data_nomor_antrian.size(); y++){
                   System.out.println("PENDUDUK KE-" + (y+1));
                   System.out.println("Nomor antrian       : "+data_nomor_antrian.get(y));
		   System.out.println("Nama pasien         : "+data_nama_pasien.get(y));
                   System.out.println("Tempat tinggal      : "+data_tempat_tinggal.get(y));
                   System.out.println("Tanggal periksa     : "+data_tanggal_periksa.get(y));
                   System.out.println("Jenis kelamin       : "+data_jenis_kelamin.get(y));
                   System.out.println("Agama               : "+data_agama.get(y));
                   System.out.println("Status              : "+data_status.get(y));
                   System.out.println("Jenis penyakit      : "+data_jenis_penyakit.get(y));
                   System.out.println("#################################################");
                   
                }
                
                System.out.println(" = MENGUBAH DATA PASIEN =");
                System.out.print("Data pasien yang diubah : ");
                int edit = input.nextInt();
		
                System.out.print("SILAHKAN UBAH DATA PASIEN : ");
		System.out.print("Masukan Nomor antrian : ");
                long nomor_antrian2 = input.nextLong();
                input.nextLine(); //biar ga lompat 
                data_nomor_antrian.set((edit-1), nomor_antrian2);
                System.out.print("Masukan nama pasien : ");
                String nama_pasien2 = input.nextLine();
                data_nama_pasien.set((edit-1), nama_pasien2);
                System.out.print("Masukan tempat tinggal : ");
                String tempat_tinggal2 = input.nextLine();
                data_tempat_tinggal.set((edit-1),tempat_tinggal2);
                System.out.print("Masukan tanggal periksa : ");
                String tanggal_periksa2 = input.nextLine();
                data_tanggal_periksa.set((edit-1),tanggal_periksa2);
                System.out.print("Masukan jenis kelamin : ");
                String jenis_kelamin2 = input.nextLine();
                data_jenis_kelamin.set((edit-1),jenis_kelamin2);
                System.out.print("Masukan agama : ");
                String agama2 = input.nextLine();
                data_agama.set((edit-1),agama2);
                System.out.print("Masukan status : ");
                String status2 = input.nextLine();
                data_status.set((edit-1),status2);
                System.out.print("Masukan jenis penyakit: ");
                String jenis_penyakit2 = input.nextLine();
                data_jenis_penyakit.set((edit-1),jenis_penyakit2);
                
                System.out.print("\nDATA BERHASIL DIUBAH!");
	
                System.out.print("\ntekan [ENTER] untuk kembali...");
                input.nextLine();
                menu_data();
                break;
		
               
            case 4 :
                clearScreen();
                System.out.println("= DATA PASIEN RUMAH SAKIT MELODI =");
                
                for(int y = 0; y < data_nomor_antrian.size(); y++){
                   System.out.println("PASIEN KE-" + (y+1));
                   System.out.println("Nomor antrian       : "+data_nomor_antrian.get(y));
		   System.out.println("Nama pasien         : "+data_nama_pasien.get(y));
                   System.out.println("Tempat tinggal      : "+data_tempat_tinggal.get(y));
                   System.out.println("Tanggal periksa     : "+data_tanggal_periksa.get(y));
                   System.out.println("Jenis kelamin       : "+data_jenis_kelamin.get(y));
                   System.out.println("Agama               : "+data_agama.get(y));
                   System.out.println("Status              : "+data_status.get(y));
                   System.out.println("Jenis penyakit      : "+data_jenis_penyakit.get(y));
                   System.out.println("#################################################");
                }
		
		System.out.println(" = MENGHAPUS DATA PASIEN =");
                System.out.print("Data pasien yang dihapus : ");
                int hapus = input.nextInt();
		data_nomor_antrian.remove((hapus-1));
		data_nama_pasien.remove((hapus-1));
		data_tempat_tinggal.remove((hapus-1));
		data_tanggal_periksa.remove((hapus-1));
		data_jenis_kelamin.remove((hapus-1));
		data_agama.remove((hapus-1));
		data_status.remove((hapus-1));
		data_jenis_penyakit.remove((hapus-1));

                System.out.print("tekan [ENTER] untuk kembali...");
                input.nextLine();
                menu_data();
                break;
		
            case 5:
                clearScreen();
                
                Pasien pasien1 = new Pasien("Mira", "Tanah Hulu", "4 April 2022", 01);
                Pasien pasien2 = new Pasien("Lidya", "Manado", "5 April 2022", 02);
                
                System.out.println("Class Pasien");
                System.out.print("Nama            : ");
                System.out.println(pasien1.nama);
                System.out.print("Tempat Tinggal  : ");
                System.out.println(pasien1.tempat_tinggal);
                System.out.print("Tanggal Periksa : ");
                System.out.println(pasien1.tanggal_periksa);
                System.out.print("Nomor Antrian   : ");
                System.out.println(pasien1.nomor_antrian);
                System.out.print("Tugas           :");
                pasien1.pasien1();
                System.out.println("=======================================");
                System.out.print("Nama            : ");
                System.out.println(pasien2.nama);
                System.out.print("Tempat Tinggal  : ");
                System.out.println(pasien2.tempat_tinggal);
                System.out.print("Tanggal Periksa : ");
                System.out.println(pasien2.tanggal_periksa);
                System.out.print("Nomor Antrian   : ");
                System.out.println(pasien2.nomor_antrian);
                System.out.print("Tugas           :");
                pasien2.pasien2();
                System.out.println("=======================================");
                
            default:
                clearScreen();
                System.out.println("Pilihan tidak ada di menu!");
                System.out.print("tekan [ENTER] untuk kembali...");
                input.nextLine();
                menu_data();
                break;
        }
    }
   public static void main(String[] args) {
       menampilkan(); 
       menu_data();
    }
    
}
 

   
