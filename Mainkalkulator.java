/* 
NIM  : 13020240075
Nama : Airil Nasbi
Hari/Tanggal : (rabu-15-04)
Waktu : (22:50)
*/
import java.util.Scanner;

public class Mainkalkulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char lagi;

        do {
            System.out.print("Masukkan angka 1: ");
            double a1 = sc.nextDouble();

            System.out.print("Masukkan angka 2: ");
            double a2 = sc.nextDouble();

            System.out.print("Operator (+, -, *, /): ");
            char op = sc.next().charAt(0);

            // buat objek
            Kalkulator k = new Kalkulator(a1, a2, op);

            // tampilkan hasil
            k.tampilHasil();

            System.out.print("Hitung lagi? (y/n): ");
            lagi = sc.next().charAt(0);

            System.out.println();

        } while (lagi == 'y' || lagi == 'Y');

        System.out.println("Program selesai.");
    }
}