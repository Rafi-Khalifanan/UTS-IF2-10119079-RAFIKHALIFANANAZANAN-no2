package uts.if2.pkg10119079.rafikhalifananazanan.no2;

/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class Tabungan {
    private int saldo;
    
    public Tabungan(int saldo){
        this.saldo=saldo;
    }
    
    public int ambilUang(int jumlah){
        saldo=saldo-jumlah;
        return saldo;
    }
    
}