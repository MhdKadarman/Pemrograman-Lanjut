package NIM;

public class NIM {
    private String JenjangPendidikan;
    private String TahunAngkatan;
    private String Fakultas;
    private String Jurusan;
    private String JenisKelamin;
    private String NomorMahasiswa;


    public String Jenjang() {
        return JenjangPendidikan;
    }
    public void setJenjang(String JenjangPendidikan) {
        this.JenjangPendidikan = JenjangPendidikan;
    }

    public String getjenjangPendidikan() {
        char kodejenjang = JenjangPendidikan.charAt(0);
        if (kodejenjang == '1') {
            return "S1 (Sarjana)";
        } else if (kodejenjang == '2') {
            return "S2 (Magister)";
        } else if (kodejenjang == '3') {
            return "S3 (Doktor)";
        }
        return "Unknown";
    }

    public String Tahun() {
        return TahunAngkatan;
    }
    public void setTahun(String TahunAngkatan) {
        this.TahunAngkatan = TahunAngkatan;
    }

    public String gettahunAngkatan() {
        char kodetahun1 = TahunAngkatan.charAt(1);
        char kodetahun2 = TahunAngkatan.charAt(2);
        return "20" + kodetahun1 + kodetahun2;
    }

    public String FK() {
        return Fakultas;
    }
    public void setFK(String Fakultas) {
        this.Fakultas = Fakultas;
    }
    public String getfakultas() {
        char kodeFakultas = Fakultas.charAt(3);
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

    public String jrsn() {
        return Jurusan;
    }
    public void setjrsn(String Jurusan) {
        this.Jurusan = Jurusan;
    }
    public String getjurusan() {
        char kodejurusan1 = Jurusan.charAt(4);
        char kodejurusan2 = Jurusan.charAt(5);
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

    public String JK() {
        return JenisKelamin;
    }
    public void setJK(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }
    public String getjenisKelamin() {
        char kodejeniskelamin = JenisKelamin.charAt(6);
        if (kodejeniskelamin == '1') {
            return "Laki-Laki";
        } else if (kodejeniskelamin == '2') {
            return "Perempuan";
        }
        return "UNKNOWN";
    }

    public String NoMahasiswa() {
        return NomorMahasiswa;
    }
    public void setNoMahasiswa(String NomorMahasiswa) {
        this.NomorMahasiswa = NomorMahasiswa;
    }
    public String getnomorMahasiswa() {
        char kodemahasiswa1 = NomorMahasiswa.charAt(7);
        char kodemahasiswa2 = NomorMahasiswa.charAt(8);
        char kodemahasiswa3 = NomorMahasiswa.charAt(9);
        char kodemahasiswa4 = NomorMahasiswa.charAt(10);
        return "" + kodemahasiswa1 + kodemahasiswa2 + kodemahasiswa3 + kodemahasiswa4;
    }
}
