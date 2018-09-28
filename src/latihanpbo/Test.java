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
public class Test {
    public static void main(String[] args){
        Anggota gopal = new Anggota("A01", "Gopal", "Panjen wingi", "XR5");
        Siswa galih = new Siswa("Galih", "Ngawalulub", "XR5 pindah R6");
        Buku matematika = new Buku("B01", "Matematika Dasar", "Sains");
        Buku english = new Buku("B02", "Bahasa Inggris", "Bahasa");
        Buku geografi = new Buku("B03", "Geografi Dasar", "Sosial");
        
        Peminjaman pinjam1 = new Peminjaman();
        pinjam1.setSiswa(gopal);
        pinjam1.addBuku(matematika);
        pinjam1.addBuku(geografi);
        pinjam1.tampilIdentitasPeminjam();
        pinjam1.tampilBuku();
        System.out.println("Biaya Pinjam: "+pinjam1.getBiaya());
        System.out.println("==========================================");
        
        Peminjaman pinjam2 = new Peminjaman();
        pinjam2.setSiswa(galih);
        pinjam2.addBuku(matematika);
        pinjam2.addBuku(geografi);
        pinjam2.addBuku(english);
        pinjam2.tampilIdentitasPeminjam();
        pinjam2.tampilBuku();
        System.out.println("Biaya Pinjam: "+pinjam2.getBiaya());
    }
}
