package GUI;

public class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getjenjangPendidikan() {
        char kodejenjang = nim.charAt(0);
        if (kodejenjang == '1') {
            return "S1 (Sarjana)";
        } else if (kodejenjang == '2') {
            return "S2 (Magister)";
        } else if (kodejenjang == '3') {
            return "S3 (Doktor)";
        }
        return "Unknown";
    }
    public String gettahunAngkatan() {
        char kodetahun1 = nim.charAt(1);
        char kodetahun2 = nim.charAt(2);
        return "20" + kodetahun1 + kodetahun2;
    }
    public String getfakultas() {
        char kodeFakultas = nim.charAt(3);
        if (kodeFakultas == '1') {
            return "Tarbiyah dan Keguruan";
        } else if (kodeFakultas == '2') {
            return "Syariah dan Hukum";
        } else if (kodeFakultas == '3') {
            return "Ushuluddin";
        } else if (kodeFakultas == '4') {
            return "Dakwah & Komunikasi";
        } else if (kodeFakultas == '5') {
            return "Sains dan Teknologi";
        } else if (kodeFakultas == '6') {
            return "Psikologi";
        } else if (kodeFakultas == '7') {
            return "Ekonomi dan Ilmu Sosial";
        } else if (kodeFakultas == '8') {
            return "Pertanian dan Peternakan";
        }
        return "Unknown";
    }
    public String getjurusan() {
        char kodejurusan1 = nim.charAt(4);
        char kodejurusan2 = nim.charAt(5);
        String sumkodejurusan = "" + kodejurusan1 + kodejurusan2;
        if (sumkodejurusan.equals("01")) {
            return "Teknik Informatika";
        } else if (sumkodejurusan.equals("02")) {
            return "Teknik Industri";
        } else if (sumkodejurusan.equals("03")) {
            return "Sistem Informasi";
        } else if (sumkodejurusan.equals("04")) {
            return " Matematika";
        } else if (sumkodejurusan.equals("05")) {
            return "Teknik Elektro";
        }
        return "Unknown";
    }
    public String getjenisKelamin() {
        char kodejeniskelamin = nim.charAt(6);
        if (kodejeniskelamin == '1') {
            return "Laki-Laki";
        } else if (kodejeniskelamin == '2') {
            return "Perempuan";
        }
        return "UNKNOWN";
    }
    public String getnomorMahasiswa() {
        char kodemahasiswa1 = nim.charAt(7);
        char kodemahasiswa2 = nim.charAt(8);
        char kodemahasiswa3 = nim.charAt(9);
        char kodemahasiswa4 = nim.charAt(10);
        return "" + kodemahasiswa1 + kodemahasiswa2 + kodemahasiswa3 + kodemahasiswa4;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "Nama = " + nama +
                ", NIM = " + nim  +
                ", Jenjang Pendidikan = " + getjenjangPendidikan() +
                ", Tahun Angkata = " + gettahunAngkatan() +
                ", Fakultas = " + getjurusan() +
                ", Jurusan = " + getjurusan() +
                ", Jenis Kelamin = " + getjenisKelamin() +
                ", Nomor Mahasiswa = " + getnomorMahasiswa() +
                '}';
    }
}
