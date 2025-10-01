import java.util.Scanner;
public class ifCetakKRS14{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("---Cetak KRS SIAKAD---");
        System.out.println("Apakah UKT Anda Sudah Lunas? (true/false) : ");
        boolean uktlunas =input.nextBoolean();

        if (uktlunas){
            System.out.println("Pembayaran UKT Terverivikasi");
            System.out.println("Silahkan Cetak KRS dan Minta TAnda Tangan DPA");
        }
    }
}
