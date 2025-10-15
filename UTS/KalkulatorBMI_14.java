//Import Scanner
import java.util.Scanner;
public class KalkulatorBMI_14 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//User Input BB dan TB
        System.out.print("Masukan Berat Badan(kg) : ");
        double beratbadan =sc.nextDouble();
        System.out.print("Masukan Tinggi Badan(m) : ");
        double tinggibadan = sc.nextDouble();
//Perhitungan Nilai BMI user
        double hasilbmi = beratbadan / (tinggibadan * tinggibadan) ;
        System.out.print("Hasil nilai BMI anda\t: " +hasilbmi);
        System.out.println(" ");
//Mengkatagorikan user sebagai
        if (hasilbmi < 18.5 ){
            System.out.println("Keterangan\t\t: Kurang Berat Badan (Under Weight)");
            System.out.println("Risiko Kesehatan\t: Kekurangan Gizi, Osteoporosis, Penurunan Sistem Kekebalan Tubuh");
        }else if (hasilbmi >= 18.5 && hasilbmi < 25){
            System.out.println("Keterangan\t\t: Berat Badan Normal (Normal Weight)");
            System.out.println("Risiko Kesehatan\t: Relatif Rendah");
        }else if (hasilbmi >= 25 && hasilbmi <30){
            System.out.println("Keterangan\t\t: Kelebihan Berat Badan (Over Weight)");
            System.out.println("Risiko Kesehatan\t: Meningkatnya risiko penyakit jantung, Diabetes, Tekanan darah tinggi");
        }else if (hasilbmi >= 30){
            System.out.println("Keterangan\t\t: Obesitas (Obese)");
            System.out.println("Risiko Kesehatan\t: Risiko tinggi penyakit jantung, Diabetes, Tekanan darah tinggi, Masalah Pernapasan, dan beberapa jenis kanker");
        }
    }
}