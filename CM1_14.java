import java.lang.classfile.instruction.SwitchCase;
//Memanggil Scanner
import java.util.Scanner;

public class CM1_14 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
// User Input Nama dan NIM
        System.out.println("Data Mahasiswa Nama dan NIM : ");
        String mahasiswa =input.nextLine();
        String nim =input.nextLine();
//Deklarasi Ratarata 
        System.out.println(" ");
        double ratarata,ratarata2, ratarata3;
//USer input nilai Mahasiswa matakuliah 1
        System.out.println("---Mata Kuliah 1: Algoritma dan Pemograman---");
        System.out.print("Masukan Nilai UTS   : ");
        int uts = input.nextInt();
        System.out.print("Masukan Nilai UAS   : ");
        int uas = input.nextInt();
        System.out.print("Masukan Nilai Tugas : ");
        int tugas = input.nextInt();

        System.out.println(" ");
//hitung rata rata mata kuliah 1
        ratarata =((uts*0.3)+(uas*0.4)+(tugas*0.3));
        
//user input nilai mahasiswa matakuliah 2
        System.out.println("---Mata Kuliah 2: Struktur Data---");
        System.out.print("Masukan Nilai UTS   :");
        int uts2 =input.nextInt();
        System.out.print("Masukan Nilai UAS   : ");
        int uas2 =input.nextInt();
        System.out.print("Masukan Nilai Tugas : ");
        int tugas2 =input.nextInt();
//hitung rata rata mata kuliah 2
        ratarata2= ((uts2*0.3)+(uas2*0.4)+(tugas2*0.3));

        System.out.println(" ");
//outout untuk hasil akhir
        System.out.println("=== Hasil Penilaian Akademik ===");
        System.out.println("Nama : " +mahasiswa);
        System.out.println("NIM  : " +nim);
//deklarasi pesan
        String pesanhuruf="",pesanhuruf2="", pesan1="", pesan2="", pesann="";

        
  //Pemilihan nilai huruf untuk mata kuliah 1          
            if(ratarata >80 || ratarata==100 ){
               pesanhuruf= "A";

            }else if(ratarata >73 || ratarata==80){
                pesanhuruf = "B+";

            }else if(ratarata >65 || ratarata==73){
                pesanhuruf = "B";

            }else if(ratarata >60 || ratarata==65){
                pesanhuruf = "C+";

            }else if (ratarata >50 || ratarata==60){
                pesanhuruf ="C";

            }else if (ratarata >39 || ratarata==50){
                pesanhuruf ="D";

            }else{
                pesanhuruf ="E";
            }
        

        System.out.println(" ");

  //pemilihan nilai huruf mata kuliah 2      
            if(ratarata2 >80 || ratarata2==100 ){
               pesanhuruf2= "A";

            }else if(ratarata2 >73 || ratarata2==80){
                pesanhuruf2 = "B+";

            }else if(ratarata2 >65 || ratarata2==73){
                pesanhuruf2 = "B";

            }else if(ratarata2 >60 || ratarata2==65){
                pesanhuruf2 = "C+";

            }else if (ratarata2 >50 || ratarata2==60){
                pesanhuruf2 ="C";

            }else if (ratarata2 >39 || ratarata2==50){
                pesanhuruf2 ="D";

            }
            else {
                pesanhuruf2 ="E";
            }
   //Pemilihan Lulus atau Tidak Lulus Mata Kuliah    
           if (ratarata>=70){
            pesan1 = "LULUS";
           }else{
            pesan1 = "TIDAK LULUS";
           }
           if (ratarata2>=70){
            pesan2 = "LULUS";
           }else{
            pesan2 = "TIDAK LULUS";
           }
        
// output akhir nilai
        System.out.println("Mata Kuliah              UTS UAS Tugas  Nilai Akhir  Nilai Huruf Status");
        System.out.println("---------------------------------------------------------");
        System.out.println("Algorima dan Pemrogaman  "+uts+"   "+uas+"   "+tugas+"     "+ratarata+"        "+pesanhuruf+"   "+pesan1);
        System.out.println("Struktur Data            "+uts2+"   "+uas2+"   "+tugas2+"     "+ratarata2+"        "+pesanhuruf2+"   "+pesan2);
        
           ratarata3 =(ratarata+ratarata2)/2;
//Pemilihan lulus tidak lulus akhir semester
           if (pesan1.equalsIgnoreCase("LULUS")&&pesan2.equalsIgnoreCase("LULUS")){
               if (ratarata3 >=70){
                   pesann = "LULUS";
                }else{
                    pesann ="TIDAK LULUS (Rata - Rata < 70)";
                }
            }else{
                pesann = "Tidak Lulus";
            }
// output nilai rata rata akhir dan pesan lulus tidak lulus
            System.out.println("Nilai Rata Rata Akhir : " +ratarata3);
            System.out.println("Status Semester "+pesann);
    }
}