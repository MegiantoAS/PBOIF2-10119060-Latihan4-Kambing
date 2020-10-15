/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan4.kambing;
import java.util.Scanner;

/**
 *
 * @author Megianto Adi saputra
 * Nama         : Megianto Adi Saputra
 * Kelas        : IF-2
 * NIM          : 10119060
 * Deskripsi    : Program ini menampilkan jumlah kambing
 */
public class PBOIF210119060Latihan4Kambing {
    public void tambahKambing(){
        int jumlahKambing = 0 ;
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing Setelah ditambah" + jumlahKambing);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PBOIF210119060Latihan4Kambing KambingJantan = new PBOIF210119060Latihan4Kambing ();
        KambingJantan.tambahKambing();
        
    }
    
}
