/* 
NIM  : 13020240075
Nama : Airil Nasbi
Hari/Tanggal : (rabu-15-04)
Waktu : (22:30)
*/

package datamahasiswa;

import java.util.Scanner;

public class Mainmahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("NIM  : ");
        String nim = sc.nextLine();
        System.out.print("Jml MK: ");
        int jmlMK = sc.nextInt();

        Mahasiswa mhs = new Mahasiswa(nama, nim, jmlMK);
        mhs.inputNilai(sc);
        mhs.tampilRapor();
    }
}