package jobsheet5;
import java.util.Scanner;
public class AksesWifi14{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String Pengguna;

        System.out.println("Masukan Pengguna (Dosen/Mahasiswa/Lainya) : ");
        Pengguna =sc.nextLine();

        if (Pengguna.equalsIgnoreCase("Dosen")){
            System.out.println("Akses Wifi diberikan");

        }else if(Pengguna.equalsIgnoreCase("Mahasiswa")){
            System.out.print("Masukan Jumlah SKS : ");
            int sks =sc.nextInt();

            if (sks >= 12){
                System.out.println("Akses Wifi Dibeikan");
            }else{
                System.out.println("Akses Wifi Ditolak");
            }
        }else {
            System.out.println("Akses Wifi Ditolak");
        }
    }
}