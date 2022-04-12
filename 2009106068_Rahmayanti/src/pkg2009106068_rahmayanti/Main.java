/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2009106068_rahmayanti;
import java.util.*;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System. in);
        ArrayList<Produk> ListProduk = new ArrayList<>();
        int id=0;
        while (true){
            System.out.println("======DATA PRODUK IBOX======");
            System.out.println("1. Daftar Produk Baru");
            System.out.println("2. Lihat List Produk");
            System.out.println("3. Ubah Data Produk");
            System.out.println("4. Hapus Data Produk");
            System.out.println("5. Keluar");
            System.out.println("============================");
            System.out.println("Pilih Option (Angka) : ");int a=GetInt();
            if (a!=5){
                if(a==1){
                    int i;
                    Produk data = new Produk ();
                    System.out.println("====Produk IBOX====");
                    data.setId(id+1);
                    System.out.print("Nama\t: ");data.setNama(input.nextLine());
                    System.out.print("Harga\t: ");data.setHarga(GetInt());
                    System.out.print("Ukuran\t: ");data.setUkuran(input.nextLine());
                    ListProduk.add(data);
                    id++;
                }
                else if(a==2){
                    System.out.println("===List Produk iBox===");
                    System.out.println("No ID Nama\t\tUkuran\t\t\tHarga");
                    for(int i=0;i<ListProduk.size();i++){
                        System.out.println((i+1)+" "+ListProduk.get(i).getId()+" "+ListProduk.get(i).getNama()+"\t\t"+ListProduk.get(i).getUkuran()+"\t\t"+ListProduk.get(i).getHarga());
                    }
                    System.out.println("======================");
                }
                else if(a==3){
                    System.out.println("===List Produk iBox===");
                    System.out.println("No ID Nama\t\tUkuran\t\t\tHarga");
                    for(int i=0;i<ListProduk.size();i++){
                        System.out.println((i+1)+" "+ListProduk.get(i).getId()+" "+ListProduk.get(i).getNama()+"\t\t"+ListProduk.get(i).getUkuran()+"\t\t"+ListProduk.get(i).getHarga());
                    }
                    System.out.println("======================");
                    
                    System.out.println("!!Pencarian Data Produk Sesuai ID Produk!!");
                    System.out.print(">>");int cari = GetInt();
                    for (int i=0;i<ListProduk.size();i++){
                        if(cari==ListProduk.get(i).getId()){
                            System.out.println("===Data Sebelumnya===");
                            System.out.println("ID\t\t: ");ListProduk.get(i).getId();
                            System.out.println("Nama\t: ");ListProduk.get(i).getNama();
                            System.out.println("Ukuran\t: ");ListProduk.get(i).getUkuran();
                            System.out.println("Harga\t: ");ListProduk.get(i).getHarga();
                            ListProduk.remove(i);
                            Produk data = new Produk();
                            System.out.println("===Data Baru===");
                            System.out.println("ID\t\t: "+id);data.setId(i+1);
                            System.out.print("Nama\t: ");data.setNama(input.nextLine());
                            System.out.print("Harga\t: ");data.setHarga(GetInt());
                            System.out.print("Ukuran\t: ");data.setUkuran(input.nextLine());
                            ListProduk.add(data);
                        }
                    }
                    System.out.println("===List Produk iBox===");
                    System.out.println("No ID Nama\t\tUkuran\t\t\tHarga");
                    for(int i=0;i<ListProduk.size();i++){
                        System.out.println((i+1)+" "+ListProduk.get(i).getId()+" "+ListProduk.get(i).getNama()+"\t\t"+ListProduk.get(i).getUkuran()+"\t\t"+ListProduk.get(i).getHarga());
                    }
                    System.out.println("======================");
                }
                else if (a==4){
                    System.out.println("===List Produk iBox===");
                    System.out.println("No ID Nama\t\tUkuran\t\t\tHarga");
                    for(int i=0;i<ListProduk.size();i++){
                        System.out.println((i+1)+" "+ListProduk.get(i).getId()+" "+ListProduk.get(i).getNama()+"\t\t"+ListProduk.get(i).getUkuran()+"\t\t"+ListProduk.get(i).getHarga());
                    }
                    System.out.println("======================");
                    
                    System.out.println("!!Pencarian Data Produk Sesuai ID Produk!!");
                    System.out.print(">>");int cari = GetInt();
                    for (int i=0;i<ListProduk.size();i++){
                        if(cari==ListProduk.get(i).getId()){
                            ListProduk.remove(i);
                            id--;
                        }
                    }
                    System.out.println("===List Produk iBox===");
                    System.out.println("No ID Nama\t\tUkuran\t\t\tHarga");
                    for(int i=0;i<ListProduk.size();i++){
                        System.out.println((i+1)+" "+ListProduk.get(i).getId()+" "+ListProduk.get(i).getNama()+"\t\t"+ListProduk.get(i).getUkuran()+"\t\t"+ListProduk.get(i).getHarga());
                    }
                    System.out.println("======================");
                }
                else if (a==5){
                    System.out.println("===System Shut===");
                    System.exit(1);
                }
            }
        }
    }

    private static int GetInt() {
        Scanner input = new Scanner (System.in);
        while (true){
            try{
                return input.nextInt();
            }
            catch (InputMismatchException e){
                input.nextLine();
                System.out.println("Input Salah Coba Lagi: ");
            }
        }
    }
}
