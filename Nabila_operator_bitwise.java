/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nabila_operator_bitwise;

/**
 *
 * @author nabila sofiani
 */
import java.util.Scanner;
public class Nabila_operator_bitwise {
    public static void main(String[] args) {
        int a;
        int b;
        int hasil;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("input angka-1 : ");
        a = keyboard.nextInt();
        System.out.println("input angka-1 : ");
        b = keyboard.nextInt();
        
        //bistwise and
        hasil = a & b;
        System.out.println("hasil bitwise AND : " +hasil);
        
        System.out.println("input angka-1 : ");
        a = keyboard.nextInt();
        System.out.println("input angka-1 : ");
        b = keyboard.nextInt();
        
        //bitwise OR
        hasil = a | b;
        System.out.println("hasil bitwise OR : " +hasil);
        
        System.out.println("input angka-1 : ");
        a = keyboard.nextInt();
        System.out.println("input angka-1 : ");
        b = keyboard.nextInt();
        
        //bitwise XOR
        hasil = a ^ b;
        System.out.println("hasil bitwise XOR : " +hasil);
        
        System.out.println("input angka-1 : ");
        a = keyboard.nextInt();
        System.out.println("input angka-1 : ");
        b = keyboard.nextInt();
        
        //bitwise negasi
        hasil = ~a;
        System.out.println("hasi bitwise negasi : " +hasil);
        
        System.out.println("input angka-1 : ");
        a = keyboard.nextInt();
        System.out.println("input angka-1 : ");
        b = keyboard.nextInt();
        
        //bitwise left shift
        hasil = a << b;
        System.out.println("hasil bitwise lefft shift : " +hasil);
        
        System.out.println("input angka-1 : ");
        a = keyboard.nextInt();
        System.out.println("input angka-1 : ");
        b = keyboard.nextInt();
        
        //bitwise right shift
        hasil = a >> b;
        System.out.println("hasil bitwise right shift : " +hasil);
        
    }
   
    
}
