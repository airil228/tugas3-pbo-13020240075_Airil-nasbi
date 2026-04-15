/* 
NIM  : 13020240075
Nama : Airil Nasbi
Hari/Tanggal : (rabu-15-04)
Waktu : (22:08)
*/

package datamahasiswa;

import java.util.Scanner;

public class Mahasiswa {
    private final String nama;
    private final String nim;
    private final int jumlahMK;
    private final int[] nilai;

    // Konstruktor
    public Mahasiswa(String nm, String ni, int jmlMK) {
        this.nama = nm;
        this.nim = ni;
        this.jumlahMK = jmlMK;
        this.nilai = new int[jmlMK];
    }

    // Input nilai tiap MK
    public void inputNilai(Scanner sc) {
        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Nilai MK-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
    }

    // Hitung rata-rata
    public double hitungRataRata() {
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return (double) total / jumlahMK;
    }

    // Tentukan grade
    public char tentukanGrade() {
        double avg = hitungRataRata();
        if (avg >= 85) return 'A';
        else if (avg >= 75) return 'B';
        else if (avg >= 60) return 'C';
        else return 'D';
    }

    // Cek lulus
    public boolean lulus() {
        return hitungRataRata() >= 60.0;
    }

    // Tampilkan rapor
    public void tampilRapor() {
        System.out.println("\n=== RAPOR ===");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("Nilai:");
        for (int i = 0; i < jumlahMK; i++) {
            System.out.println(" MK-" + (i + 1) + " : " + nilai[i]);
        }
        double rata = hitungRataRata();
        System.out.printf("Rata : %.2f\n", rata);
        System.out.println("Grade : " + tentukanGrade());
        System.out.println("Lulus : " + lulus());
    }
}