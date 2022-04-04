/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2009106068_rahmayanti;

/**
 *
 * @author ASUS
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class method {
    public static int GetInt(){
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
