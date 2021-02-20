/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_UAS_2;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program menampilkan target saldo
 */
public class PBO_IF2_10116414_UAS_2 {
    public static void main(String[] args) {
        // TODO code application logic here
        int saldoAwal = 100000, bonus, i;
        int bulan = 5;
        saldoAwal = saldoAwal + 500;
        for  (i = 1; i <= bulan ; i++) {
            System.out.println("Saldo di bulan ke-" + i +  " : " + saldoAwal);
            saldoAwal = saldoAwal + 500;
        }
    }
}
