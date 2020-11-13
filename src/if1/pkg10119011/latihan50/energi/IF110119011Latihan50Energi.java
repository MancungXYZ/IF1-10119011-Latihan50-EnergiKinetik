/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan50.energi;

/**
 *
 * @author 
 *  Nama        : Reihan Wiyanda
 *  Kelas       : IF-1
 *  Nim         : 10119011
 */
public class IF110119011Latihan50Energi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ekin ek = new Ekin(145, 25);
        System.out.println("Energi kinetiknya adalah " + ek.hitungEkin());
        System.out.println("Besaran usahanya adalah " + ek.hitungUsaha(0));
        
    }
    
}
