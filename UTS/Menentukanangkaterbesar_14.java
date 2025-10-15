import java.util.Scanner;
public class Menentukanangkaterbesar_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Masukan 3 angka : ");
        int angka1 = sc.nextInt();
        int angka2 = sc.nextInt();
        int angka3 = sc.nextInt();

       

       if (angka1 > angka2 || angka1 > angka3 ){
            System.out.println("Angka terbesar adalah : " +angka1); 
        }else if (angka2 > angka1 || angka2 > angka3 ){
            System.out.println("Angka terbesar adalah : " +angka2); 
        }else if (angka3 > angka2 || angka3 > angka2 ){
            System.out.println("Angka terbesar adalah : " +angka3); 
        }else {
            System.out.println("Ada beberapa angka yang sama : " +angka1 +angka2 +angka3);
        }
    }
}