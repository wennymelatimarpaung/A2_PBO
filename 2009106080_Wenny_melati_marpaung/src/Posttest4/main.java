/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posttest4;
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
        ArrayList<Pasien> dataPasien = new ArrayList<>();
        ArrayList<Dokter> dataDokter = new ArrayList<>();
        int pilihan;
        String nama;
        while (true) {
            System.out.print("\n\n\n\n");
            System.out.println("\t\t\t#########################################");
            System.out.println("\t\t\t= PROGRAM DATA PASIEN RUMAH SAKIT MELODI=");
            System.out.println("\t\t\t=              DOKTER MELATI            =");
            System.out.println("\t\t\t#########################################");
            System.out.println("\t\t\t|           Tampilan Menu               |");
            System.out.println("\t\t\t#########################################");
            System.out.println("\t\t\t= PROGRAM DATA PASIEN RUMAH SAKIT MELODI ");
            System.out.println("\t\t\t= [1] Membuat data                       ");
            System.out.println("\t\t\t= [2] Melihat Data                       ");
            System.out.println("\t\t\t= [3] Mengedit Data                      ");
            System.out.println("\t\t\t= [4] Menghapus Data                     ");
            System.out.println("\t\t\t= [0] Exit                               ");
            System.out.println("\t\t\t#########################################");
            System.out.print(".....Input Menu.....: ");
            int menu = Integer.parseInt(input.readLine());
            switch (menu) {
                case 1:
                    System.out.println("---------------------------");
                    System.out.println("1. Pasien");
                    System.out.println("2. Dokter");
                    System.out.println("Masukan pilihan : ");
                    System.out.println("---------------------------");
                    pilihan = Integer.parseInt(input.readLine());
                    if (pilihan == 1) {
                        System.out.println("-------------------------");
                        System.out.print("Masukan nama             : ");
                        nama = input.readLine();
                        System.out.print("Masukan jenis kelamin    : ");
                        String jenisKelamin = input.readLine();
                        System.out.print("Masukan alamat           : ");
                        String alamat = input.readLine();
                        System.out.print("Masukan tanggal Lahir    : ");
                        String tanggalLahir = input.readLine();
                        System.out.print("Masukan Nomor Pasien     : ");
                        String nomorpasien= input.readLine();
                        System.out.print("Masukan Jenis Penyakit   : ");
                        String jenispenyakit= input.readLine();
                        dataPasien.add(new Pasien(nama, jenisKelamin, alamat, tanggalLahir, nomorpasien, jenispenyakit));
                    } else {
                        System.out.print("Masukan nama          : ");
                        nama = input.readLine();
                        System.out.print("Masukan Jenis Kelamin : ");
                        String jeniskelamin = input.readLine();
                        System.out.print("Masukan Alamat        : ");
                        String alamat = input.readLine();
                        System.out.print("Masukan Tanggal Lahir : ");
                        String tanggalLahir = input.readLine();
                        System.out.print("Masukan Jabatan       : ");
                        String jabatan = input.readLine();
                        System.out.print("Masukan nip           : ");
                        String nip = input.readLine();
                        dataDokter.add(new Dokter(nama, jeniskelamin, alamat, tanggalLahir, jabatan, nip));
                    }
                    break;
                case 2:
                    System.out.println("---------------------");
                    System.out.println("1. Pasien");
                    System.out.println("2. Dokter");
                    System.out.println("Masukan pilihan : ");
                    pilihan = Integer.parseInt(input.readLine());
                    System.out.println("---------------------");
                    if (pilihan == 1) {
                        for (int i = 0; i < dataPasien.size(); i++) {
                            System.out.println("Pasien ke - " + (i + 1));
                            dataPasien.get(i).display();
                        }
                    } else {
                        for (int i = 0; i < dataDokter.size(); i++) {
                            System.out.println("Dokter ke - " + (i + 1));
                            dataDokter.get(i).display();
                        }
                    }
                    break;
                case 3:
                    System.out.println("-------------------");
                    System.out.println("1. Pasien");
                    System.out.println("2. Dokter");
                    System.out.println("Masukan pilihan : ");
                    System.out.println("-------------------");
                    pilihan = Integer.parseInt(input.readLine());
                    if (pilihan == 1) {
                        System.out.println("Masukan nama Pasien : ");
                        nama = input.readLine();
                        for (Pasien i : dataPasien) {
                            if (i.getNama().equals(nama)) {
                                System.out.println("Masukan nama baru : ");
                                i.setNama(input.readLine());
                                System.out.println("Masukan jenis kelamin baru : ");
                                i.setJenisKelamin(input.readLine());
                                System.out.println("Masukan alamat baru : ");
                                i.setAlamat(input.readLine());
                                System.out.println("Masukan Tanggal Lahir Baru : ");
                                i.settanggalLahir(input.readLine());
                                System.out.println("Masukan Nomor Pasien Baru : ");
                                i.setnomorpasien(input.readLine());
                                System.out.println("Masukan Jenis Penyakit Baru : ");
                                i.setjenispenyakit(input.readLine());
                            }
                        }
                    } else {
                        System.out.println("Masukan nama Dokter : ");
                        nama = input.readLine();
                        for (Dokter i : dataDokter) {
                            if (i.getNama().equals(nama)) {
                                System.out.println("Masukan nama baru : ");
                                i.setNama(input.readLine());
                                System.out.println("Masukan jenis kelamin baru : ");
                                i.setJenisKelamin(input.readLine());
                                System.out.println("Masukan alamat baru : ");
                                i.setAlamat(input.readLine());
                                System.out.println("Masukan Jabatan baru : ");
                                i.setjabatan(input.readLine());
                                System.out.println("Masukan NIP Baru : ");
                                i.setNip(input.readLine());
                             
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("------------------");
                    System.out.println("1. Pasien");
                    System.out.println("2. Dokter");
                    System.out.println("Masukan pilihan : ");
                    System.out.println("------------------");
                    pilihan = Integer.parseInt(input.readLine());
                    if (pilihan == 1) {
                        System.out.println("Masukan nama Pasien : ");
                        nama = input.readLine();
                        for (int i = 0; i< dataPasien.size();i++) {
                            if (dataPasien.get(i).getNama().equals(nama)) {
                                dataPasien.remove(i);
                            }
                        }
                    } else {
                        System.out.println("Masukan nama Dokter : ");
                        nama = input.readLine();
                        for (int i = 0; i< dataDokter.size();i++) {
                            if (dataDokter.get(i).getNama().equals(nama)) {
                                dataDokter.remove(i);
                       
                            }
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Menu tidak ada");
                    break;
            }
        }
    }
}