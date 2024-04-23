/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author Yohanda Gita Pratiwi
 */
public class RandomMonth {
    private int nomorBulan = 0;
    
    public int getNomorBulan(){
        return nomorBulan = (int)(Math.random() * 13);
    }
    
    public String NamaBulan(){
        switch(nomorBulan){
            case 1:
               return "Januari";
            case 2:
               return "Februari";
            case 3:
               return "Maret";
            case 4:
               return "April";
            case 5:
               return "Mei";
            case 6:
               return "Juni";   
            case 7:
               return "July";
            case 8:
               return "Agustus";
            case 9:
               return "September";   
            case 10:
               return "Oktober";   
            case 11:
               return "November";   
            case 12:
               return "Desember";
            default:
               return "Inputan Tidak Valid";
        }
    }
}
