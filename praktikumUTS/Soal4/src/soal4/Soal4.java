/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal4;

/**
 *
 * @author Yohanda Gita Pratiwi
 */
public class Soal4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        LimasSegiEmpat limasSegiEmpat1 = new LimasSegiEmpat(1, 1, 1);
        LimasSegiEmpat limasSegiEmpat2 = new LimasSegiEmpat(30, 40, 50);
        LimasSegiEmpat limasSegiEmpat3 = new LimasSegiEmpat(25, 35, 45);
    
        System.out.println("Limas Segi Empat Poin 1 ");
        limasSegiEmpat1.setLuasAlas(1);
        limasSegiEmpat1.setLuasSelubung(1);
        limasSegiEmpat1.setTinggi(1);
        System.out.println("Luasnya = " + limasSegiEmpat1.getLuas());
        System.out.println("Volumenya = " + limasSegiEmpat1.getVolume());
        
        System.out.println("Limas Segi Empat Poin 2 ");
        limasSegiEmpat2.setLuasAlas(30);
        limasSegiEmpat2.setLuasSelubung(40);
        limasSegiEmpat2.setTinggi(50);
        System.out.println("Luasnya = " + limasSegiEmpat2.getLuas());
        System.out.println("Volumenya = " + limasSegiEmpat2.getVolume());
        
        System.out.println("Limas Segi Empat Poin 3 ");
        limasSegiEmpat3.setLuasAlas(25);
        limasSegiEmpat3.setLuasSelubung(35);
        limasSegiEmpat3.setTinggi(45);
        System.out.println("Luasnya = " + limasSegiEmpat3.getLuas());
        System.out.println("Volumenya = " + limasSegiEmpat3.getVolume());
    }
    
}
