package jobsheet5;
import java.util.Scanner;
public class nestedUjianSkripsi14{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String pesan ;
        
        System.out.print("Apakah Mahasiswa Sudah Bebas Kompen (Ya/Tidak) : ");
        String bebasKompen =sc.nextLine().trim();

        System.out.print("Masukan Jumlah Log Bimbingan Pembimbing 1 : ");
        int bimbingan1 =sc.nextInt();
        System.out.print("Masukan Jumlah Log Bimbingan Pembimbing 2 : ");
        int bimbingan2 =sc.nextInt();

        if(bebasKompen.equalsIgnoreCase("Ya")){
            if(bimbingan1 >= 8 && bimbingan2 >= 4){
                pesan = "Semua Syarat Terpenuhi. Mahasiswa Boleh Mengikuti Ujian skripsi";
                
            }else if(bimbingan1 < 8 && bimbingan2 < 4){
                pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan bimbingan P2 kurang dari 4 kali";

            }else if(bimbingan1 < 8){
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali" ;

            }else{
                pesan = "Gagal! Log bimbingan 2 belum mencapai 4 kali";

            }
        }else {
            pesan = "Gagal Mahasiswa Masih Memiliki Tanggungan  Kompen ";
        }
        System.out.println(pesan);
    }
}