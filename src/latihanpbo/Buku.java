/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo;

/**
 *
 * @author ASUS
 */
public class Buku {
    private String kode_buku, judul_buku, kategori;
    
    public Buku(String kode_buku, String judul_buku, String kategori){
        this.kode_buku = kode_buku;
        this.judul_buku = judul_buku;
        this.kategori = kategori;
    }
    public String getKode_buku(){
        return kode_buku;
    }
    public String getJudul_buku(){
        return judul_buku;
    }
    public String getKategori(){
        return kategori;
    }
}
