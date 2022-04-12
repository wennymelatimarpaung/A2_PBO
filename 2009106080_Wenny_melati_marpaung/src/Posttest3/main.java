/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posttest3;
    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class main {
        public static void main(String[] args) throws NumberFormatException, IOException {
        
        InputStreamReader prepare = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(prepare);
        ArrayList<Pasien> datapasien = new ArrayList<>();
        
        //Author
        System.out.print("\n\n\n\n");
        System.out.println("\t\t\t############################################");
        System.out.println("\t\t\t=  PROGRAM DATA PASIEN RUMAH SAKIT MELODI  =");
        System.out.println("\t\t\t=              DOKTER MELATI               =");
        System.out.println("\t\t\t############################################");

        while (true) {
            System.out.println("\n...........................................\n");
            System.out.println("|                Tampilan Menu                |");
            System.out.println("\n...........................................\n");
            System.out.println("\t\t\t#########################################");
            System.out.println("\t\t\t= PROGRAM DATA PASIEN RUMAH SAKIT MELODI ");
            System.out.println("\t\t\t= [1] Membuat data                       ");
            System.out.println("\t\t\t= [2] Melihat Data                       ");
            System.out.println("\t\t\t= [3] Mengedit Data                      ");
            System.out.println("\t\t\t= [4] Menghapus Data                     ");
            System.out.println("\t\t\t= [0] Exit                               ");
            System.out.println("\t\t\t#########################################");
            System.out.print("| Masukkan pilihan (0-4): ");
            System.out.println("\n=============================================\n");  
            int menu = Integer.parseInt(input.readLine());
            
            switch (menu) {
                case 1:
                    System.out.println("=============================================");
                    System.out.println("|                Membuat data                 |");
                    System.out.println("=============================================");
                    System.out.print("| nama                  : ");
                    String nama = input.readLine();
                    System.out.print("| tempat_tinggal        : ");
                    String tempat_tinggal = input.readLine();
                    System.out.print("| tanggal_periksa       : ");
                    String tanggal_periksa = input.readLine();
                    System.out.print("| nomor_antrian         : ");
                    int nomor_antrian = Integer.parseInt(input.readLine());
                    System.out.println("=============================================");
                    
                    Pasien dataBaru = new Pasien(nama, tempat_tinggal, tanggal_periksa, nomor_antrian);
                    datapasien.add(dataBaru);
                    break;
                    
                case 2:
                    System.out.println("\n=============================================");
                    System.out.println("|                Melihat data                 |");
                    System.out.println("=============================================");
                    for (int i = 0; i < datapasien.size(); i += 1) {
                        System.out.println("| Pasien ke-" + (i + 1));
                        System.out.println("---------------------------------------------");
                        datapasien.get(i).menampilkan();
                    }
                  
                    break;
                case 3:
                    System.out.println("\n=============================================");
                    System.out.println("|                  Mengedit data                   |");
                    System.out.println("=============================================");
                    System.out.print("| Masukkan nama pasien-");
                    String name = input.readLine();
                    System.out.println("=============================================");
                    for (Pasien pasien : datapasien) {
                        if (pasien.getnama().equals(name)) {
                            System.out.print("| nama                  : ");
                            pasien.Setnama(input.readLine());
                            System.out.print("| tempat_tinggal        : ");
                            pasien.Settempat_tinggal(input.readLine());
                            System.out.print("| tanggal_periksa       : ");
                            pasien.Settanggal_periksa(input.readLine());
                            System.out.print("| nomor_antrian         : ");
                            pasien.Setnomor_antrian(Integer.parseInt(input.readLine()));
                            System.out.println("=============================================");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("\n=============================================");
                    System.out.println("|                  Menghapus data                  |");
                    System.out.println("=============================================");
                    System.out.print("| Masukan nama   : ");
                    String namaa = input.readLine();
                    System.out.println("=============================================");
                    for (int i = 0; i < datapasien.size(); i++) {
                        if (datapasien.get(i).getnama().equals(namaa)) {
                            datapasien.remove(i);
                            break;
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak ada");
                    break;
            }
        }
    }
}