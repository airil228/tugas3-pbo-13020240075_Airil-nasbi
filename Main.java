/* 
NIM  : 13020240075
Nama : Airil Nasbi
Hari/Tanggal : (rabu-15-04)
Waktu : (23:30)
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // 1. Inisialisasi Array of Object sesuai gambar
        Buah[] katalog = new Buah[3];
        katalog[0] = new Buah("Apel", 15000, 10);
        katalog[1] = new Buah("Jeruk", 12000, 8);
        katalog[2] = new Buah("Mangga", 20000, 5);

        int pilih, qty;
        double totalBelanja = 0;

        // 2. Loop utama menggunakan do-while atau while
        do {
            System.out.println("\n--- Katalog Toko Buah ---");
            for (int i = 0; i < katalog.length; i++) {
                System.out.println((i + 1) + ". " + katalog[i].getInfo());
            }

            System.out.print("\nPilih (0=stop): ");
            pilih = input.nextInt();

            if (pilih >= 1 && pilih <= 3) {
                System.out.print("Jumlah (kg): ");
                qty = input.nextInt();

                // 3. Verifikasi stok via method tersedia(qty)
                if (katalog[pilih - 1].tersedia(qty)) {
                    double subTotal = katalog[pilih - 1].hitungTotal(qty);
                    totalBelanja += subTotal;
                    System.out.println("OK +Rp" + (int)subTotal);
                } else {
                    System.out.println("Stok tidak cukup!");
                }
            } else if (pilih != 0) {
                System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 0);

        // 4. Output akhir
        System.out.println("Total: Rp" + (int)totalBelanja);
    }
}