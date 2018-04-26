package tugas.kelompok18;

import java.util.Scanner;

public class case_ {
    Scanner in = new Scanner(System.in);
    int j,k,l,m,n,total;
    public void caseA(){
        System.out.print("Masukkan jumlah barang : ");
        j = in.nextInt();
        j=j*12000;
        System.out.println("Total : "+j);
    }
    public  void caseB(){
        System.out.print("Masukkan jumlah barang : ");
        k = in.nextInt();
        k=k*6500;
        System.out.println("Total : "+k);
    }
    public void caseC(){
        System.out.print("Masukkan jumlah barang : ");
        l = in.nextInt();
        l=l*10000;
        System.out.println("Total : "+l);
    }
    public void caseD(){
        System.out.print("Masukkan jumlah barang : ");
        m = in.nextInt();
        m=m*13000;
        System.out.println("Total : "+m);
    }
    public void caseE(){
        System.out.print("Masukkan jumlah barang : ");
        n = in.nextInt();
        n=n*6000;
        System.out.println("Total : "+n);
    }
    public void casedef(){
        System.out.println("Kode barang tidak ditemukan");
    }
}
