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
public class PemeranPendukung extends KarakterPemain {
     private String panggilan;

    public PemeranPendukung(String name, String food, String sifat, int umur) {
        super(name, food, sifat, umur);
        this.nama=name;
        this.makanan=food;
        this.sifat=sifat;
        this.umur=umur;
    }

    public String getPanggilan() {
        return panggilan;
    }

    public void setPanggilan(String panggilan) {
        this.panggilan = panggilan;
    }
    
    
}
