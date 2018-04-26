package tugas.kelompok18;

public class Tugas {
    String nama;
    String nim;
    
    public void daftar(){
        System.out.println("      PROGRAM KASIR SEDERHANA");
        System.out.println("---SELAMAT DATANG DI 18 SUPERMINI MARKET---");
        System.out.println(" ________________________________________  ");
        System.out.println("| No | Kode | Nama Barang | Harga Barang | ");
        System.out.println("|----|------|-------------|--------------| ");
        System.out.println("| 1  |   A  | Beras       | Rp 12.000,00 | ");
        System.out.println("| 2  |   B  | Gula        | Rp 6.500,00  | ");
        System.out.println("| 3  |   C  | Minyak      | Rp 10.000,00 | ");
        System.out.println("| 4  |   D  | Telur       | Rp 13.000,00 | ");
        System.out.println("| 5  |   E  | Tepung      | Rp 6.000,00  | ");
        System.out.println("|____|______|_____________|______________| \n"); 
    }
    public Tugas (){
        System.out.println("Program ini dibuat oleh : ");
    }
    public Tugas(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }
    public String kel(){
        return nama+" ("+nim+")";
    }
}
