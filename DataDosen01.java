public class DataDosen01 {
    public void dataSemuaDosen(Dosen01[] arrayOfDosen){
       int no = 1;
        for (Dosen01 ds : arrayOfDosen){
            System.out.println("Data Dosen ke-" + no);
            System.out.println("Kode                : "+ds.kode);
            System.out.println("Nama                : "+ds.nama);
            System.out.println("Jenis Kelamin       : "+(ds.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia                : "+ds.usia);
            System.out.println("-------------------------------");
        }
    }
    public void jumlahDosenPerJenisKelamin(Dosen01[] arrayOfDosen){
        int jumlahPria = 0;
        int jumlahWanita = 0;

        for (Dosen01 ds : arrayOfDosen){
            if (ds.jenisKelamin == true){
                jumlahPria++;
            }
            else{
                jumlahWanita++;
            }
        }
        System.out.println("Jumlah dosen pria : "+jumlahPria);
        System.out.println("Jumlah dosen wanita : "+jumlahWanita);
    }
    public void rerataUsiaDosenPerJenisKelamin(Dosen01[] arrayOfDosen){
        int jumlahPria = 0;
        int jumlahWanita = 0;
        int totalUsiaDosenPria = 0;
        int totalUsiaDosenWanita = 0;
        double rerataUsiaDosenPria;
        double rerataUsiaDosenWanita;

        for (Dosen01 ds : arrayOfDosen){
            if (ds.jenisKelamin == true){
                jumlahPria++;
                totalUsiaDosenPria += ds.usia;
            }
            else{
                jumlahWanita++;
                totalUsiaDosenWanita += ds.usia;
            }
        }

        if (jumlahPria > 0){
            rerataUsiaDosenPria = (double) totalUsiaDosenPria / jumlahPria;
        }
        else{
            rerataUsiaDosenPria = 0;
        }

        if (jumlahWanita > 0){
            rerataUsiaDosenWanita = (double) totalUsiaDosenWanita / jumlahWanita;
        }
        else {
            rerataUsiaDosenWanita = 0;
        }

        System.out.println("Rata-rata usia dosen pria : "+rerataUsiaDosenPria);
        System.out.println("Rata-rata usia dosen wanita : "+rerataUsiaDosenWanita);
    }
    public void dataDosenPalingTua(Dosen01[] arrayOfDosen){
        Dosen01 tertua = arrayOfDosen[0];
        for (Dosen01 ds : arrayOfDosen){
            if (ds.usia > tertua.usia){
                tertua = ds;
            }
        }
        System.out.println("Dosen paling tua : ");
        System.out.println("Kode                : "+tertua.kode);
        System.out.println("Nama                : "+tertua.nama);
        System.out.println("Jenis Kelamin       : "+(tertua.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia                : "+tertua.usia);
        System.out.println("-------------------------------");
    }
    public void dataDosenPalingMuda(Dosen01[] arrayOfDosen){
        Dosen01 termuda = arrayOfDosen[0];
        for (Dosen01 ds : arrayOfDosen){
            if (ds.usia < termuda.usia){
                termuda = ds;
            }
        }
        System.out.println("Dosen paling Muda : ");
        System.out.println("Kode                : "+termuda.kode);
        System.out.println("Nama                : "+termuda.nama);
        System.out.println("Jenis Kelamin       : "+(termuda.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia                : "+termuda.usia);
        System.out.println("-------------------------------");
    }
}
