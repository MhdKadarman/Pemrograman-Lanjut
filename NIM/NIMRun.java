package NIM;

import java.util.Scanner;
public class NIMRun {
    public static void main(String[] args) {
        System.out.print("Silahkan Masukkan NIM Anda: ");
        Scanner input = new Scanner(System.in);
        String nim = input.nextLine();

        NIM Jenjang = new NIM();
        Jenjang.setJenjang(nim);
        System.out.println("Jenjang Pendidikan = " + Jenjang.getjenjangPendidikan());

        NIM tahun = new NIM();
        tahun.setTahun(nim);
        System.out.println("Tahun Angkatan = " + tahun.gettahunAngkatan());

        NIM FAkultas = new NIM();
        FAkultas.setFK(nim);
        System.out.println("Fakultas = " + FAkultas.getfakultas());

        NIM Jrsn = new NIM();
        Jrsn.setjrsn(nim);
        System.out.println("Jurusan = " + Jrsn.getjurusan());

        NIM Jeniskelamin = new NIM();
        Jeniskelamin.setJK(nim);
        System.out.println("Jenis Kelamin = " + Jeniskelamin.getjenisKelamin());

        NIM nomormahasiswa = new NIM();
        nomormahasiswa.setNoMahasiswa(nim);
        System.out.println("Nomor Mahasiswa = " + nomormahasiswa.getnomorMahasiswa());
    }
}
