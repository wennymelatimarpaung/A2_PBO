/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Posttest1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static ArrayList<Menu> Menu = new ArrayList<Menu>();
    
    public static void main(String[] args)throws IOException {
        //Author
        System.out.println("Nama    : Nurulfiqri Istiqamah Tahir");
        System.out.println("Nim     : 2009106083"); 
        System.out.println("Kelas   : Informatika B 2020"); 
        
        while (true) {
            menu();
        }
    }
    private static class Menu {
        private float ID;
        private String Seri;
        private String Nama;
        private int Regular;
        private int Large;

        public Menu() {
        }
    }
    public static void menu()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n=============================================");
        System.out.println("|                   Menu                    |");
        System.out.println("=============================================");
        System.out.println("| 1. Input data                             |");
        System.out.println("| 2. Tampilkan data                         |");
        System.out.println("| 3. Edit data                              |");
        System.out.println("| 4. Hapus data                             |");
        System.out.println("| 0. Exit                                   |");
        System.out.println("=============================================");
        System.out.print("| Masukkan pilihan (0-4): ");
        int pilih = Integer.parseInt(br.readLine());
        System.out.println("=============================================\n");
        
        switch(pilih){
            case 1:
                Buat();
                break;
            case 2:
                Tampilkan();
                break;
            case 3:
                Edit();
                break;
            case 4:
                Hapus();
                break;
            case 0:
                System.exit(1);
            default:
                System.out.println(" Pilihan 0-4 !!!");
        }
    }
    public static void Buat()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("=============================================");
        System.out.println("|                Input Data                 |");
        System.out.println("=============================================");
        System.out.print("| ID menu     : ");
        float input1    = Float.parseFloat(br.readLine());
        System.out.print("| Seri menu   : ");
        String input2   = br.readLine();
        System.out.print("| Nama menu   : ");
        String input3   = br.readLine();
        System.out.print("| Regular     : ");
        int input4      = Integer.parseInt(br.readLine());
        System.out.print("| Large       : ");
        int input5      = Integer.parseInt(br.readLine());
        System.out.println("=============================================");
        
        Menu membuatmenu    = new Menu();
        membuatmenu.ID      = input1;
        membuatmenu.Seri    = input2;
        membuatmenu.Nama    = input3;
        membuatmenu.Regular = input4;
        membuatmenu.Large   = input5;
        Menu.add(membuatmenu);
    }
    public static void Tampilkan()throws IOException{
        System.out.println("\n=============================================");
        System.out.println("|                Semua Menu                 |");
        System.out.println("=============================================");
        for (int i = 0; i < Menu.size(); i++){
            System.out.println("| Menu ke-" + (i + 1));
            System.out.println("---------------------------------------------");
            System.out.println("| ID menu       : " + Menu.get(i).ID);
            System.out.println("| Seri menu     : " + Menu.get(i).Seri);
            System.out.println("| Nama menu     : " + Menu.get(i).Nama);
            System.out.println("| Regular       : " + Menu.get(i).Regular);
            System.out.println("| Large         : " + Menu.get(i).Large);
            System.out.println("=============================================");
        }
    }
    public static void Edit()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Tampilkan();
        
        System.out.println("\n=============================================");
        System.out.println("|                  Update                   |");
        System.out.println("=============================================");
        System.out.print("| Masukkan menu ke-");
        int inputedit   = Integer.parseInt(br.readLine());
        int indexe      = inputedit-1;
        System.out.println("=============================================");
        
        System.out.print("| ID menu     : ");
        float input1    = Float.parseFloat(br.readLine());
        System.out.print("| Seri menu   : ");
        String input2   = br.readLine();
        System.out.print("| Nama menu   : ");
        String input3   = br.readLine();
        System.out.print("| Regular     : ");
        int input4      = Integer.parseInt(br.readLine());
        System.out.print("| Large       : ");
        int input5      = Integer.parseInt(br.readLine());
        System.out.println("=============================================");
        
        Menu.get(indexe).ID      = input1;
        Menu.get(indexe).Seri    = input2;
        Menu.get(indexe).Nama    = input3;
        Menu.get(indexe).Regular = input4;
        Menu.get(indexe).Large   = input5;
        
        Tampilkan();
    }
    public static void Hapus()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Tampilkan();
        
        System.out.println("\n=============================================");
        System.out.println("|                  Delete                   |");
        System.out.println("=============================================");
        System.out.print("| Masukan barang ke-");
        int inputhapus  = Integer.parseInt(br.readLine());
        System.out.println("=============================================");
        
        int indexd      = inputhapus-1;
        Menu.remove(indexd);
        
        Tampilkan();
    }
}
