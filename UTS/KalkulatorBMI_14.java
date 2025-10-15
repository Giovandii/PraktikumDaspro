import java.util.Scanner;
public class KalkulatorBMI_14 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Masukan Berat bada(kg) : ");
        double beratbadan =sc.nextDouble();
        System.out.print("Masukan Tinggi Badan(m) : ");
        double tinggibadan = sc.nextDouble();

        double hasilbmi = beratbadan / tinggibadan * tinggibadan ;
        System.out.print("Hasil nilai BMI anda : " +hasilbmi);
        System.out.println(" ");

        if (hasilbmi < 18.5 ){
            System.out.println("Kurang Berat Badan (Under Weight)");
            System.out.println("Risiko Kesehatan : Kekurangan Gizi, Osteoporosis, Penurunan Sistem Kekebalan Tubuh");
        }else if (hasilbmi >= 18.5 && hasilbmi < 25){
            System.out.println("Berat Badan Normal (Normal Weight)");
            System.out.println("Risiko Kesehatan Relatif Rendah");
        }else if (hasilbmi >= 25 && hasilbmi <30){
            System.out.println("Kelebihan Berat Badan (Over Weight)");
            System.out.println("Risiko Kesehatan : Meningkatnya risiko penyakit jantung, Diabetes, Tekanan darah tinggi");
        }else if (hasilbmi >= 30){
            System.out.println("Obesitas (Obese)");
            System.out.println("Risiko Kesehatan : Risiko tinggi penyakit jantung, Diabetes, Tekanan darah tinggi, Masalah Pernapasan, dan beberapa jenis kanker");
        }
    }
}