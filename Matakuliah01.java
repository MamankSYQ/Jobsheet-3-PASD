import java.util.Scanner;
public class Matakuliah01 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    Scanner sc = new Scanner(System.in);

    public Matakuliah01(){

    } 

    public Matakuliah01 (String kode, String nama, int sks, int jumlahJam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    void tambahData(){
        System.out.print("Kode        : ");
            kode = sc.nextLine();
            System.out.print("Nama        : ");
            nama = sc.nextLine();
            System.out.print("SKS         : ");
            sks = sc.nextInt();
            System.out.print("Jumlah Jam  : ");
            jumlahJam = sc.nextInt();
            System.out.println("-------------------------------");
    }
    void cetakInfo(){
        System.out.println("Kode        : " + kode);
            System.out.println("Nama        : " + nama);
            System.out.println("Sks         : " + sks);
            System.out.println("Jumlah Jam  : " + jumlahJam);
            System.out.println("-------------------------------");
    }
}
