/* 
NIM  : 13020240075
Nama : Airil Nasbi
Hari/Tanggal : (rabu-15-04)
Waktu : (22:45)
*/
public class Kalkulator {
    // atribut (enkapsulasi)
    private final double angka1;
    private final double angka2;
    private final char operator;

    // konstruktor
    public Kalkulator(double angka1, double angka2, char operator) {
        this.angka1 = angka1;
        this.angka2 = angka2;
        this.operator = operator;
    }

    // method operasi
    public double tambah() {
        return angka1 + angka2;
    }

    public double kurang() {
        return angka1 - angka2;
    }

    public double kali() {
        return angka1 * angka2;
    }

    public double bagi() {
        if (angka2 == 0) {
            System.out.println("Error: pembagian dengan nol!");
            return 0;
        }
        return angka1 / angka2;
    }

    // method tampil hasil
    public void tampilHasil() {
        double hasil = 0;

        switch (operator) {
            case '+':
                hasil = tambah();
                break;
            case '-':
                hasil = kurang();
                break;
            case '*':
                hasil = kali();
                break;
            case '/':
                hasil = bagi();
                break;
            default:
                System.out.println("Operator tidak dikenal!");
                return;
        }

        System.out.printf("Hasil: %.2f %c %.2f = %.2f\n", angka1, operator, angka2, hasil);
    }
}