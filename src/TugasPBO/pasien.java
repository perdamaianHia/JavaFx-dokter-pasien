package TugasPBO; // nama package TugasPBO

public class pasien { // nama kelas pasien

    private String nama, noRekamMedis, tempatLahir, alamat; // Terdapat beberapa variabel data global yakni nama, noRekamMedis, tempatLahir dan alamat
    // dengan tipe data Private String, dimana tipe data ini untuk inputan huruf dan hanya bisa
    // di akses di kelas pasien saja variabelnya karena menggunakan "private".

    private int tanggalLahir, tahunLahir, bulanLahir; // Terdapat beberapa variabel data global yakni tanggalLahir, tahunLahir dan bulanLahir
    // dengan tipe data Private integer, dimana tipe data ini untuk inputan huruf dan hanya bisa
    // di akses di kelas pasien saja variabelnya karena menggunakan "private".

    public String getNama() { // Method untuk memanggil inputan nama.
        return nama; // Nilai pengembalian dari method nama.
    }

    public void setNama(String nama) { // Method untuk menginputkan nama pasien yaitu bernama "John", dimana dengan nama metod public void setNama.
        this.nama = "John";
    }

    public String getNoRekamMedis() { // Method untuk memanggil inputan noRekamMedis.
        return noRekamMedis; // Nilai pengembalian dari noRekamMedis.
    }

    public void setNoRekamMedis(String noRekamMedis) { // Method untuk menginputkan noRekamMedis yaitu "01" dimana dengan nama metod public void setNoRekamMedis.
        this.noRekamMedis = "01";
    }

    public String getTempatLahir() { // Method untuk memanggil inputan tempatLahir.
        return tempatLahir; // Nilai pengembalian dari tempatLahir.
    }

    public void setTempatLahir(String tempatLahir) { // Method untuk menginputkan tempat lahir yaitu "Jakarta" dimana dengan nama metod public void setTempatLahir.
        this.tempatLahir = "Jakarta";
    }

    public String getAlamat() { // Method untuk memanggil inputan alamat pasien.
        return alamat; // Nilai pengembalian dari alamat pasien.
    }

    public void setAlamat(String alamat) {  // Method untuk menginputkan alamat dari pasien yaitu "Jakarta" dimana dengan nama metod public void setAlamat.
        this.alamat = "Jakarta";
    }

    public int getTanggalLahir() { // Method untuk memanggil inputan tanggalLahir.
        return tanggalLahir; // Nilai pengembalian dari tanggal lahir.
    }

    public void setTanggalLahir(int tanggalLahir) throws Exception { // Dalam metod setTanggalLahir terdapat parameter yaitu "tanggalLahir" dengan tipe data integer. Dengan menggunakan throws Exception yang berfungsi untuk mendeteksi kesalahan dari deklarasi isi dalam method.
        if (tanggalLahir > 0) { // Dimana dalam menentukan tanggal lahir memeiliki persyaratan yaitu tanggalLahir pasien harus lebih besar dari nol.
            if (tanggalLahir < 24) { // Kemudian didalamnya terdapat "if bersarang"  yang berisi tanggal lahir lebih kecil dari dua puluh empat. (karena maks tanggal dalam setiap bulan yaitu 23).
                this.tanggalLahir = 11; // tanggal lahir pasien adalah "11".
            }
        } else {
            throw new Exception("tanggal lahir lebih dari duapuluh empat"); // seandainya tanggal lahir yang di inputkan lebih dari "24" maka jawaban terdeteksi salah, sehingga akan mencetak keterangan "tanggal lahir lebih dari duapuluh empat".
        }
        throw new Exception("bulan lahir dari duapuluh empat"); // seandainya tanggal lahir yang di inputkan "24" maka jawaban terdeteksi, sehingga akan mencetak keterangan "bulan lahir dari duapuluh empat".

    }

    public int getTahunLahir() { // Method untuk memanggil inputan tahunLahir.
        return tahunLahir; // Nilai pengembalian dari tahun lahir.
    }

    public void setTahunLahir(int tahunLahir) throws Exception { // Dalam metod setTahunLahir terdapat parameter yaitu "tahunLahir" dengan tipe data integer. Dengan menggunakan throws Exception yang berfungsi untuk mendeteksi kesalahan dari deklarasi isi dalam method.
        if (tahunLahir > 0) { // Dimana dalam menentukan tanggal lahir memeiliki persyaratan yaitu tahunLahir pasien harus lebih besar dari nol.
            if (tahunLahir <= 2018) { // Kemudian didalamnya terdapat "if bersarang" yang berisi tahun lahir lebih kecil atau sama dengan dari 2018.(karena tahun sekarang yaitu 2018).
                this.tahunLahir = 2000; // tahun lahir pasien adalah "2000".
            }
        } else {
            throw new Exception("tahun lahir lebih dari dua ribu delapan belas"); // seandainya tahun lahir yang di inputkan lebih dari "2018" maka jawaban terdeteksi salah, sehingga akan mencetak keterangan "tahun lahir lebih dari dua ribu delapan belas".
        }
        throw new Exception("tahun lahir dari dua ribu delapan belas"); // seandainya tahun lahir yang di inputkan "2018", sehingga akan mencetak keterangan "bulan lahir dari duapuluh empat".
    }

    public int getBulanLahir() { // Method untuk memanggil inputan bulanLahir.
        return bulanLahir; // Nilai pengembalian dari bulan lahir.
    }

    public void setBulanLahir(int bulanLahir) throws java.lang.Exception { // Dalam metod setBulanLahir terdapat parameter yaitu "bulanLahir" dengan tipe data integer. Dengan menggunakan throws Exception yang berfungsi untuk mendeteksi kesalahan dari deklarasi isi dalam method.
        if (bulanLahir > 0) { // Dimana dalam menentukan bulan lahir memeiliki persyaratan yaitu bulanLahir pasien harus lebih besar dari nol.
            if (bulanLahir < 13) {  // Kemudian didalamnya terdapat "if bersarang" yang berisi bulan lahir lebih kecil dari 13.(karena bulan dalam setiap tahun maks bulan 12/Desember).
                this.bulanLahir = 1; // bulan lahir pasien adalah "bulan 1/Januari".
            }
        } else {
            throw new Exception("bulan lahir lebih dari tiga belas"); // seandainya bulan lahir yang di inputkan lebih dari "13" maka jawaban terdeteksi salah, sehingga akan mencetak keterangan "bulan lahir lebih dari tiga belas"".
        }
        throw new Exception("bulan lahir dari tiga belas"); // seandainya bulan lahir yang di inputkan "13", sehingga akan mencetak keterangan "bulan lahir dari tiga belas".
    }
}
