/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2;

import java.util.Scanner;

/**
 *
 * @author Yohanda Gita Pratiwi
 */
public class Soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        int bill = 0;
        int jumlahPositif = 0;
        int jumlahNegatif = 0;
        float total = 0;
        int jumlahData = 0;
        
        System.out.println("Masukan bilangan integer, program akan berhenti jika memasukan nilai 0: ");
        
        do {
            bill = input.nextInt();
            
            if(bill > 0){
                jumlahPositif++;
                total += bill;
                jumlahData++;
            } else if (bill < 0){
                jumlahNegatif++;
                total += bill;
                jumlahData++;
            }
        } while(bill !=0);
        
        float Ratarata = total / jumlahData;
        
        System.out.println("Jumlah bilangan positif adalah " + jumlahPositif);
        System.out.println("Jumlah bilangan negatif adalah " + jumlahNegatif);
        System.out.println("Nilai total adalah " + total);
        System.out.println("Nilai rata - rata " + Ratarata);
    }
    
}
