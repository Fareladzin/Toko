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
public class Pembeli extends Barang{
    public String idpembeli;
    public String nama;
    public String alamat;
    public String notelp;
    
    public Pembeli(String idpembeli,String nama, String alamat, String notelp, String idbarang, String namabarang, String merk, String harga){
        super(idbarang, namabarang, merk, harga);
        this.idpembeli = idpembeli;
        this.nama = nama;
        this.alamat = alamat;
        this.notelp = notelp;
    }
    
    @Override
    public void info(){
        Scanner masukan = new Scanner(System.in);
        System.out.print(" Id Pembeli         : "+this.idpembeli);
        this.idpembeli = masukan.next();
        System.out.print(" Nama Pembeli       : "+ this.nama);
        this.nama = masukan.next();
        System.out.print(" Alamat             : "+this.alamat);
        this.alamat = masukan.next();
        System.out.print(" No Telepon         : "+this.notelp);
        this.notelp = masukan.next();
        System.out.println(" ================================= ");
        super.info();
    }
    
}
