/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal4;

/**
 *
 * @author Yohanda Gita Pratiwi
 */
public class LimasSegiEmpat {
    private double luasAlas = 0;
    double luasSelubungLimas = 0;
    double tinggi = 0;
    
//    LimasSegiEmpat(){}
    
    LimasSegiEmpat(double luasAlasBaru, double luasSelubungLimasBaru, double tinggiBaru){
        luasAlas = luasAlasBaru;
        luasSelubungLimas = luasSelubungLimasBaru;
        tinggi = tinggiBaru;
    }
    
    double getLuas(){
        return luasAlas + luasSelubungLimas;
    }
    
    double getVolume(){
        return luasAlas * tinggi * 1/3;
    }
    
    public void setLuasAlas(double luasAlasBaru){
        luasAlas = luasAlasBaru;
        System.out.println("Luas = " + luasAlas );
    }
    
    public void setLuasSelubung(double luasSelubungLimasBaru){
        luasSelubungLimas = luasSelubungLimasBaru;
        System.out.println("Luas Selubung Limas = " + luasSelubungLimas);
    }
    
    public void setTinggi(double tinggiBaru){
        tinggi = tinggiBaru;
        System.out.println("TInggi = " + tinggi);
    }
}
