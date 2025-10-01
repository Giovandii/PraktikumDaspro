package jobsheet5;
import java.util.Scanner;
public class Tugas2Flowchart14{
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);

    int angka;

    System.out.print("Masukan Jumlah Angka : ");
    angka =sc.nextInt();

    if (angka %2 == 0){
        System.out.println("Angka Tersebut Genap");
    }else{
        System.out.println("Angka Tersebut Ganjil");
    }
  }  
}