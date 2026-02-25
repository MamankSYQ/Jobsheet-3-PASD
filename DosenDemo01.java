import java.util.Scanner;
public class DosenDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usia;
        String kode, nama;
        boolean jenisKelamin;
        Dosen01[] arrayOfDosen = new Dosen01[3];
        DataDosen01 data = new DataDosen01(); 

        for(int i = 0; i < arrayOfDosen.length; i++){
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode              : ");
            kode = sc.nextLine();
            System.out.print("Nama              : ");
            nama = sc.nextLine();
            System.out.println("True = Pria/False = Wanita");
            System.out.print("Jenis Kelamin     : ");
            jenisKelamin = sc.nextBoolean();
            System.out.print("Usia              : ");
            usia = sc.nextInt();
            sc.nextLine();
            System.out.println("-------------------------------");
            arrayOfDosen[i] = new Dosen01(kode, nama, jenisKelamin, usia);  
        }
        data.dataSemuaDosen(arrayOfDosen);
        data.jumlahDosenPerJenisKelamin(arrayOfDosen);
        data.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        data.dataDosenPalingTua(arrayOfDosen);
        data.dataDosenPalingMuda(arrayOfDosen);
    }
}
