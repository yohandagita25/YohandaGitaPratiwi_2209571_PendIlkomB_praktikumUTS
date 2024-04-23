/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal3;

import java.util.Scanner;

/**
 *
 * @author Yohanda Gita Pratiwi
 */
public class Soal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat: ");
        long bill = input.nextLong();
        System.out.println("Jumlah digit dalam bilangan adalah: " + sumDigits(bill));
    }
    
     public static int sumDigits(long n) {
         
        int jumlahDigit = 0;
        n = Math.abs(n);
        
        while(n > 0){
        int digit = (int) (n % 10);
        jumlahDigit += digit;
        n /= 10;
        }
        return jumlahDigit;
     }
    
}
