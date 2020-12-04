package uts.if2.pkg10119079.rafikhalifananazanan.no2;
import java.util.Scanner;
/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class UTSIF210119079RAFIKHALIFANANAZANANNo2 {

    public static void main(String[] args) {
        int jumlahAmbil;
        Scanner input = new Scanner(System.in);
                
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukan Saldo Awal : ");
        Tabungan stabungan = new Tabungan(input.nextInt());
        System.out.print("Jumlah Uang yang Diambil : ");
        jumlahAmbil=stabungan.ambilUang(input.nextInt());
        System.out.println("saldo Anda sekarang : "+jumlahAmbil);
    }    
}
