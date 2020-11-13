/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan50.energi;

/**
 *
 * @author 
 *  Nama       : Reihan Wiyanda
 *  Kelas      : IF-1
 *  Nim        : 10119011
 */
public class Ekin {
    private double massa, kecepatan;

    public Ekin (double massa, double kecepatan) {
         this.massa = massa;
         this.kecepatan = kecepatan;
    }

    public double getMassa() {
        return massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }
    
    public double hitungEkin () {
        return 0.5 * massa * Math.pow(kecepatan, 2);
    }
    
    public double hitungUsaha(double kecepatanAwal) {
        return 0.5 * massa * (Math.pow(kecepatan, 2) - Math.pow(kecepatanAwal, 2));
    }
}
