/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import java.util.Scanner;

/**
 *
 * @author Fareladzin Wibi
 */
public class Barang {
    public String idbarang;
    public String namabarang;
    public String merk;
    public String harga;
    
    public Barang(String idbarang, String namabarang, String merk, String harga){
        this.idbarang = idbarang;
        this.namabarang = namabarang;
        this.merk = merk;
        this.harga = harga;
    }
    
    public void info(){
        Scanner masukan = new Scanner(System.in);
        System.out.print(" Id Barang         : "+this.idbarang);
        this.idbarang = masukan.next();
        System.out.print(" Nama Barnag       : "+this.namabarang);
        this.namabarang = masukan.next();
        System.out.print(" Merk Barang       : "+this.merk);
        this.merk = masukan.next(); 
        System.out.print(" Harga Barang      : "+this.harga);
        this.harga = masukan.next();
    }
    
}
