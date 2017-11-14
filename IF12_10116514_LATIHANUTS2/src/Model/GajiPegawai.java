/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Acer
 */
public class GajiPegawai {
    private String nama;
    private String alamat;
    private int uTrans;
    private int uTun;
    private int gajiPokok;
    private int totalGaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getuTrans() {
        return uTrans;
    }

    public void setuTrans(int uTrans) {
        this.uTrans = uTrans;
    }

    public int getuTun() {
        return uTun;
    }

    public void setuTun(int uTun) {
        this.uTun = uTun;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    
    public int totalGaji (int uTun, int uTrans, int gajiPokok){
        return totalGaji = uTun + uTrans + gajiPokok;
    }
}
