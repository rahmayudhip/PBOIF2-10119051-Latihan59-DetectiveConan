/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119051.latihan59.detectiveconan;

/**
 *
 * @author RYP
 */
public class KarakterPemain {
    protected String nama;
    protected String makanan;
    protected String sifat;
    protected int umur;
    
    public KarakterPemain(String name, String food, String sifat, int umur){
        this.nama=name;
        this.makanan=food;
        this.sifat=sifat;
        this.umur=umur;
}
    public void displayKarakter(){
        System.out.println("Nama : "+nama);
        System.out.println("Makanan kesukaan : "+makanan);
        System.out.println("sifat : "+sifat);
        System.out.println("umur : "+umur);
    }
}
