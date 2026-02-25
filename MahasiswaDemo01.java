import java.util.Scanner;
public class MahasiswaDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa01[] arrayMahasiswa01 = new Mahasiswa01[3];
        String dummy;

        for(int i = 0; i < 3; i++){
            arrayMahasiswa01[i] = new Mahasiswa01();

            System.out.println("Masukkan Data Mahasiswa ke-"+(i+1));
            System.out.print("NIM : ");
            arrayMahasiswa01[i].nim = sc.nextLine();
            System.out.print("Nama : ");
            arrayMahasiswa01[i].nama = sc.nextLine();
            System.out.print("Kelas : ");
            arrayMahasiswa01[i].kelas = sc.nextLine();
            System.out.print("IPK : ");
            dummy = sc.nextLine();
            arrayMahasiswa01[i].ipk = Float.parseFloat(dummy);
            System.out.println("-----------------------------");
        }
        
        Mahasiswa01[] myArrayOfMahasiswa = new Mahasiswa01[3];
        myArrayOfMahasiswa[0].nim = "244107060033";
        myArrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        myArrayOfMahasiswa[0].kelas = "SIB-1E";
        myArrayOfMahasiswa[0].ipk = (float) 3.75;

        for(int i = 0; i < 3; i++){
            System.out.println("Data Mahasiswa ke-"+(i+1));
            arrayMahasiswa01[i].cetakInfo();
        }
    }
}
