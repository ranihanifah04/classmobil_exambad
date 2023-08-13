/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mobil;

/**
 *
 * @author This PC
 */
public class Mobil extends Kendaraan {
    int jumlahPenumpang;

        Mobil(String merk, int tahun, int jumlahPenumpang) {
        super(merk, tahun);
        this.jumlahPenumpang = jumlahPenumpang;
    }
        
    public int getJumlahPenumpang() {
        return jumlahPenumpang;
    }
    
    public void setJumlahPenumpang(int jumlahPenumpang){
        this.jumlahPenumpang = jumlahPenumpang;
    }
    
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", 2020, 5);
      
        System.out.println("Detail Mobil");
        System.out.println("============================");
        System.out.println("Merk Mobil: " + mobil.getMerk());
        System.out.println("Tahun Pembuatan: " + mobil.getTahun());
        System.out.println("Jumlah Kapasitas Penumpang:" + mobil.getJumlahPenumpang());
    }
}