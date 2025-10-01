package jobsheet5;
import java.util.Scanner;
public class ifCetakKRS14{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("---Cetak KRS SIAKAD---");
        System.out.println("Apakah UKT Anda Sudah Lunas? (true/false) : ");
        boolean uktlunas =sc.nextBoolean();

        if (uktlunas){
            System.out.println("Pembayaran UKT Terverivikasi");
            System.out.println("Silahkan Cetak KRS dan Minta TAnda Tangan DPA");
        }else{
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
            
        }String hasilCetak = uktlunas ? "Pembayaran UKT Terverifikasi\nSilahkan Cetak KRS dan Minta Tanda Tangan DPA"  : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";
        System.out.println(hasilCetak);
     }
}
