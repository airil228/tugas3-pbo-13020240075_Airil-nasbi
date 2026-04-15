/* 
NIM  : 13020240075
Nama : Airil Nasbi
Hari/Tanggal : (rabu-15-04)
Waktu : (23:00)
*/
public class Buah {
    private final String nama;
    private final double harga;
    private int stok;

    // Konstruktor sesuai gambar (n:nama, h:harga, s:stok)
    public Buah(String n, double h, int s) {
        this.nama = n;
        this.harga = h;
        this.stok = s;
    }

    public String getInfo() {
        return nama + "   Rp " + (int)harga + " (stok:" + stok + " kg)";
    }

    public double hitungTotal(int qty) {
        return harga * qty;
    }

    public boolean tersedia(int qty) {
        if (stok >= qty) {
            stok -= qty; // Kurangi stok jika tersedia
            return true;
        } else {
            return false;
        }
    }
}