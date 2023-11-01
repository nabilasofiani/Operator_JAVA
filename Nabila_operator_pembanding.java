/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nabila_operator_pembanding;

/**
 *
 * @author nabila sofiani
 */
import java.util.Scanner;
public class Nabila_operator_pembanding {
    public static void main(String[] args) {
        int a;
        int b;
        boolean hasil;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("input angka-1 : ");
        a = keyboard.nextInt();
        System.out.println("inpit angka-2 : ");
        b = keyboard.nextInt();
        
        //lebih besar
        hasil = a > b;
        System.out.println(" hasil a> b :" +hasil);
        
        System.out.println("input angka-1 : ");
        a = keyboard.nextInt();
        System.out.println("input angka-1 : ");
        b = keyboard.nextInt();
        
        //lebih kecil
        hasil = a < b;
        System.out.println("hasil a < b : " +hasil);
        
        System.out.println("input angka-1 : ");
        a = keyboard.nextInt();
        System.out.println("input angka-1 : ");
        b = keyboard.nextInt();
        
        //sama dengan
        hasil = a == b;
        System.out.println("hasil a == b : " +hasil);
        
        System.out.println("input angka-1 : ");
        a = keyboard.nextInt();
        System.out.println("input angka-1 : ");
        b = keyboard.nextInt();
        
        //tidak sama dengan
        hasil = a != b;
        System.out.println("hasil a!= b : " +hasil);
        
        System.out.println("input angka-1 : ");
        a = keyboard.nextInt();
        System.out.println("input angka-1 : ");
        b = keyboard.nextInt();
        
        //hasil lebih besar sama dengan
        hasil = a >= b;
        System.out.println("hasil a >= b :  " +hasil);
        
        System.out.println("input angka-1 : ");
        a = keyboard.nextInt();
        System.out.println("input angka-1 : ");
        b = keyboard.nextInt();
        
        //hasil lebih kecil sama dengan
        hasil= a <= b;
        System.out.println("hasil a <= b :" +hasil);
    }

   
    
    
}
