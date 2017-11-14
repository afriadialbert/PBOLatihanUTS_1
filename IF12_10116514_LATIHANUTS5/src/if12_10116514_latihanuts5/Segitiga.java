/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if12_10116514_latihanuts5;

/**
 *
 * @author Acer
 */
public class Segitiga implements BangunDatar{
    private int luas;
    private int keliling;
    private final int sisiAb;
    private final int sisiBc;
    private final int sisiCd;
    private final int alas;
    private final int tinggi;
    
    public Segitiga(int sisiAb, int sisiBc, int sisiCd, int alas, int tinggi){
        this.sisiAb = sisiAb;
        this.sisiBc = sisiBc;
        this.sisiCd = sisiCd;
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public void hitungLuas() {
        luas = (int) (0.5*alas*tinggi);
        System.out.println("Luas Segitiga : "+luas);
    }

    @Override
    public void hitungKeliling() {
        keliling = (sisiAb + sisiBc + sisiCd);
        System.out.println("Keliling Segitiga : "+keliling);
    }
}
