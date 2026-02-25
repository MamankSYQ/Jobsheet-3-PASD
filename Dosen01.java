import java.util.Scanner;
public class Dosen01 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Scanner sc = new Scanner(System.in);

    public Dosen01(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }
}
