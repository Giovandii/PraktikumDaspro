import java.util.Scanner;
public class Peerhitungankaryawan_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gajipokok = 5000000;
        System.out.print("Masukan Nilai Pekerja : ");
        int nilai = sc.nextInt();
        System.out.print("Masukan Lama Bekerja(tahun) : ");
        int lamabekerja =sc.nextInt();
        double bonus = 0;

        if(nilai >= 70 && nilai < 90){
            if (lamabekerja < 2){
                System.out.println("Bonus Anda : " +(bonus=gajipokok*0.01));
            }else if (lamabekerja >= 2 && lamabekerja <5){
                System.out.println("Bonus Anda : "+(bonus=gajipokok*0.03));
            }else if(lamabekerja >= 5){
                System.out.println("Bonus Anda : " +(bonus=gajipokok*0.05));
            }

        }else if (nilai >= 90){
           if (lamabekerja < 2){
             System.out.println("Bonus Anda : " +(bonus =gajipokok*0.02));
           }else if(lamabekerja >= 2 && lamabekerja <5){
            System.out.println("Bonus Anda : " +(bonus = gajipokok*0.04));
           }else if (lamabekerja >= 5){
            System.out.println("Bonus Anda : " +(bonus =(gajipokok*0.07)));
           }

        }else {
            System.out.println("Tingkatkan Kinerja Anda Agar Mendapat Bonus");
        }
        String sertifikasi;
        System.out.print("Apakah Anda Memiliki Sertifikasi nasional (Ya/Tidak) : ");
        
        sertifikasi = sc.next();
       
        

        if (sertifikasi.equalsIgnoreCase("ya")){
            System.out.println("Total Bonus Anda Saat ini : " +(bonus+500000) );
        }else {
            System.out.println("Total Bonus Anda Saat ini : " +bonus);
        }
    }
}