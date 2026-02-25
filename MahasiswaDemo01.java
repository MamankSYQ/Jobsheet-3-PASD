public class MahasiswaDemo01 {
    public static void main(String[] args) {
        Mahasiswa01[] arrayMahasiswa01 = new Mahasiswa01[3];
        arrayMahasiswa01[0] = new Mahasiswa01();
        arrayMahasiswa01[0].nim = "244107060033";
        arrayMahasiswa01[0].nama = "AGNES TITANIA KINANTI";
        arrayMahasiswa01[0].kelas = "SIB 1-E";
        arrayMahasiswa01[0].ipk = (float) 3.75;

        arrayMahasiswa01[1] = new Mahasiswa01();
        arrayMahasiswa01[1].nim = "2341720172";
        arrayMahasiswa01[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayMahasiswa01[1].kelas = "TI 2-A";
        arrayMahasiswa01[1].ipk = (float) 3.36;

        arrayMahasiswa01[2] = new Mahasiswa01();
        arrayMahasiswa01[2].nim = "244107023006";
        arrayMahasiswa01[2].nama = "DIRHAMAWAN PURTANTO";
        arrayMahasiswa01[2].kelas = "TI-2E";
        arrayMahasiswa01[2].ipk = (float) 3.80;

        System.out.println("NIM     : " + arrayMahasiswa01[0].nim);
        System.out.println("Nama    : " + arrayMahasiswa01[0].nama);
        System.out.println("Kelas   : " + arrayMahasiswa01[0].kelas);
        System.out.println("IPK     : " + arrayMahasiswa01[0].ipk);
        System.out.println("---------------------------------------");
        System.out.println("NIM     : " + arrayMahasiswa01[1].nim);
        System.out.println("Nama    : " + arrayMahasiswa01[1].nama);
        System.out.println("Kelas   : " + arrayMahasiswa01[1].kelas);
        System.out.println("IPK     : " + arrayMahasiswa01[1].ipk);
        System.out.println("---------------------------------------");
        System.out.println("NIM     : " + arrayMahasiswa01[2].nim);
        System.out.println("Nama    : " + arrayMahasiswa01[2].nama);
        System.out.println("Kelas   : " + arrayMahasiswa01[2].kelas);
        System.out.println("IPK     : " + arrayMahasiswa01[2].ipk);
        System.out.println("---------------------------------------");
    }
}
