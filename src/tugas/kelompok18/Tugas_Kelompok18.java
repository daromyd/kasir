package tugas.kelompok18;
import java.util.Scanner;

public class Tugas_Kelompok18 {
    
    static double total1(double total1 ){
        total1=total1*90/100;
        return total1;
    }

  public static void main(String[] args) {
      int z,total,bayar,kembalian;
      char kode,out;
      do{
        Scanner in = new Scanner(System.in);
        Tugas objek = new Tugas();
        objek.daftar();
        case_ cs = new case_();
        System.out.print("Jumlah jenis barang yang dibeli : ");
        z = in.nextInt();
        for (int x=0;x<z;x++) {
            System.out.print("Masukkan kode barang : ");
            kode = in.next().charAt(0);
            switch (kode){
                case 'a':
                case 'A':
                    cs.caseA();
                    break;
                case 'b':
                case 'B':
                    cs.caseB();
                    break;
                case 'c':
                case 'C':
                    cs.caseC();
                    break;
                case 'd':
                case 'D':
                    cs.caseD();
                    break;
                case 'e':
                case 'E':
                    cs.caseE();
                    break;
                default:
                    cs.casedef();
                    x--;
                    break;  }   }
        System.out.println("");
        
        total=cs.j+cs.k+cs.l+cs.m+cs.n;

        if(total>=200000){
            System.out.println("Total belanjaan Anda : "+total);
            System.out.println("Selamat Anada mendapatan diskon 10%");
            total=(int) total1(total);
            System.out.println("Total akhir : "+total+"\n");   }
        else{
            System.out.println("Total belanjaan Anda : "+total+"\n");   }
        
        System.out.print("Uang yang dibayarkan : ");
        bayar = in.nextInt();
        kembalian=bayar-total;
        System.out.println("Kembalian Anda : "+kembalian);
        System.out.println("----TERIMAKASIH TELAH BERKUNJUNG----");
        
          System.out.println("Keluar dari program?(y/n)");
          out= in.next().charAt(0);
    } while(out=='n');
        System.out.println("\n\n\n");
        Tugas ab = new Tugas();
        
        Tugas ac = new Tugas("Daromy Darojat", "21120117130066");
        System.out.println(ac.kel());
        
        Tugas ad = new Tugas ("Yarnish Dwi S.F.","21120117130049");
        System.out.println(ad.kel());
}  }
