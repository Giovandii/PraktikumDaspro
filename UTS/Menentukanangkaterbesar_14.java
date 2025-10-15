import java.util.Scanner;
public class Menentukanangkaterbesar_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
//User memasukan angka
        System.out.println("Masukan 3 angka : ");
        int angka1 = sc.nextInt();
        int angka2 = sc.nextInt();
        int angka3 = sc.nextInt();

       
//Penilaian jika hanya salah satu yang besar
       if (angka1 > angka2 && angka1 > angka3 ){
            System.out.println("Angka terbesar adalah : " +angka1); 
        }else if (angka2 > angka1 && angka2 > angka3 ){
            System.out.println("Angka terbesar adalah : " +angka2); 
        }else {
            System.out.println("Angka terbesar adalah : " +angka3); 
        }
//Penilaian jika ada beberapa angka yang sama besar
        if (angka1==angka2 && angka1>angka3){
            System.out.println("Nilai Yang Sama Besar " +angka1 +" dan "+angka2);
        }else if (angka2 == angka3 && angka2 > angka1){
             System.out.println("Nilai Yang Sama Besar " +angka2 +" dan "+angka3);
        }else if (angka3 == angka1 && angka3>angka2){
             System.out.println("Nilai Yang Sama Besar " +angka1 +" dan "+angka3);
        }else if (angka1 == angka2 && angka1 == angka3){
             System.out.println("Nilai Yang Sama Besar " +angka1 +","+angka3+" dan "+angka2);
        }else{
            System.out.println("Angka Tidak Ada yang sama");
        }
    }
}