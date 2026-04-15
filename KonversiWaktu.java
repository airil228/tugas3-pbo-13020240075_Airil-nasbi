/* 
NIM  : 13020240075
Nama : Airil Nasbi
Hari/Tanggal : (rabu-15-04)
Waktu : (22:50)
*/
import java.util.Scanner;

public class KonversiWaktu {

    // ===== ATRIBUT (6 variabel long) =====
    private final long totalDetik;
    private long detikSekarang;
    private long totalMenit;
    private long menitSekarang;
    private long totalJam;
    private long jamSekarang;
  

    // ===== KONSTRUKTOR =====
    public KonversiWaktu(long td) {
        this.totalDetik = td;
    }

    // ===== METHOD HITUNG =====
    public long hitungDetikSekarang() {
        detikSekarang = totalDetik % 60;
        return detikSekarang;
    }

    public long hitungTotalMenit() {
        totalMenit = totalDetik / 60;
        return totalMenit;
    }

    public long hitungMenitSekarang() {
        menitSekarang = totalMenit % 60;
        return menitSekarang;
    }

    public long hitungTotalJam() {
        totalJam = totalMenit / 60;
        return totalJam;
    }

    public long hitungJamSekarang() {
        jamSekarang = totalJam % 24;
        return jamSekarang;
    }

    // ===== METHOD KONVERSI (jalankan semua hitung) =====
    public void konversi() {
        hitungDetikSekarang();
        hitungTotalMenit();
        hitungMenitSekarang();
        hitungTotalJam();
        hitungJamSekarang();
    }

    // ===== METHOD TAMPILKAN OUTPUT =====
    public void tampilkanWaktu() {
        System.out.println("Total detik: " + totalDetik);
        System.out.println("================");
        System.out.printf("Waktu: %02d:%02d:%02d%n", jamSekarang, menitSekarang, detikSekarang);
        System.out.println("================");
        System.out.println("Total Detik    : " + totalDetik);
        System.out.println("detikSaat ini  : " + detikSekarang);
        System.out.println("menitSaat ini  : " + menitSekarang);
        System.out.println("jamSaat ini    : " + jamSekarang);
        System.out.println("Total Menit    : " + totalMenit);
        System.out.println("Total Jam      : " + totalJam);
        
    }

    // ===== MAIN METHOD =====
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Masukkan total detik: ");
            long totalDetik = sc.nextLong();
            
            KonversiWaktu kw = new KonversiWaktu(totalDetik);
            kw.konversi();
            kw.tampilkanWaktu();
            
            // Contoh lain
            System.out.println("\n--- Contoh lain ---");
            KonversiWaktu kw2 = new KonversiWaktu(3661);
            kw2.konversi();
            System.out.print("Input : 3661\n");
            System.out.printf("Output: %02d:%02d:%02d%n", kw2.hitungJamSekarang(),
                    kw2.hitungMenitSekarang(), kw2.hitungDetikSekarang());
            
            KonversiWaktu kw3 = new KonversiWaktu(86400);
            kw3.konversi();
            System.out.print("\nInput : 86400\n");
            System.out.printf("Output: %02d:%02d:%02d (tepat 1 hari)%n", kw3.hitungJamSekarang(),
                    kw3.hitungMenitSekarang(), kw3.hitungDetikSekarang());
        }
    }
}