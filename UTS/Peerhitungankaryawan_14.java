import java.util.Scanner;
public class Peerhitungankaryawan_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// User memasukan gaji pokok, nilai, dan lama bekerja
        System.out.print("Masukan Gaji pokok\t\t\t:");
        int gajipokok = sc.nextInt();
        System.out.print("Masukan Nilai Pekerja\t\t\t: ");
        int nilai = sc.nextInt();
        System.out.print("Masukan Lama Bekerja(tahun)\t\t: ");
        int lamabekerja =sc.nextInt();
        double bonus = 0;
//penentuan bonus gaji nilai diatas 70 dan dibawah 90
        if(nilai >= 70 && nilai < 90){
            if (lamabekerja < 2){
                System.out.println("Bonus Anda\t\t\t\t: " +(bonus=gajipokok*0.01));
            }else if (lamabekerja >= 2 && lamabekerja <5){
                System.out.println("Bonus Anda\t\t\t\t: "+(bonus=gajipokok*0.03));
            }else if(lamabekerja >= 5){
                System.out.println("Bonus Anda\t\t\t\t: " +(bonus=gajipokok*0.05));
            }
// penentuan bonus gaji nilai diatas 90
        }else if (nilai >= 90){
           if (lamabekerja < 2){
             System.out.println("Bonus Anda\t\t\t\t: " +(bonus =gajipokok*0.02));
           }else if(lamabekerja >= 2 && lamabekerja <5){
            System.out.println("Bonus Anda\t\t\t\t: " +(bonus = gajipokok*0.04));
           }else if (lamabekerja >= 5){
            System.out.println("Bonus Anda\t\t\t\t: " +(bonus =(gajipokok*0.07)));
           }

        }else {
            System.out.println("Tingkatkan Kinerja Anda Agar Mendapat Bonus");
        }
//menginput apakah punya sertifikat
        String sertifikasi;
        System.out.print("Memiliki Sertifikasi nasional(Ya/Tidak) : ");
        
        sertifikasi = sc.next();
       
        
//penentuan tambah bonus gaji atau tidak, berdasar inputan diatas
        if (sertifikasi.equalsIgnoreCase("ya")){
            System.out.println("Total Bonus Anda Saat ini\t\t: " +(bonus+500000) );
        }else {
            System.out.println("Total Bonus Anda Saat ini\t\t: " +bonus);
        }
    }
}