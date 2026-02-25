import java.util.Scanner;
public class MatakuliahDemo01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array;
        System.out.println("Masukkan jumlah mata kuliah : ");
        array = sc.nextInt();
        Matakuliah01[] arrayOfMatakuliah = new Matakuliah01[array];

        for(int i=0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new Matakuliah01();
            arrayOfMatakuliah[i].tambahData();
        }

        for(int i=0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}