package TugasPBO; // nama package TugasPBO

public class dokter { // nama kelas dokter

    private String noPegawai, nama, alamat, tempatLahir; // Terdapat beberapa variabel data global yakni noPegawai, nama, alamat dan tempatLahir
    // dengan tipe data Private String, dimana tipe data ini untuk inputan huruf dan hanya bisa
    // di akses di kelas dokter saja variabelnya karena menggunakan "private".
    private int tanggalLahir; // Terdapat variabel data global yakni tanggalLahir dengan tipe data Private int, dimana tipe data ini untuk inputan 
    //angka/bil bulat dan hanya bisa di akses di kelas dokter saja variabelnya karena menggunakan "private'".

    public String getNoPegawai() { // Method untuk memanggil inputan noPegawai.
        return noPegawai; // Nilai pengembalian dari noPegawai.
    }

    public void setNoPegawai(String noPegawai) { // Method untuk menginputkan noPegawai yaitu bernama "DR1", dimana dengan nama metod public void setNoPegawai.
        this.noPegawai = "DR1";
    }

    public String getNama() { // Method untuk memanggil inputan nama dokter.
        return nama; // Nilai pengembalian dari nama dokter.
    }

    public void setNama(String nama) { // Method untuk menginputkan nama dokter yaitu bernama "Berkat", dimana dengan nama metod public void setNama.
        this.nama = "Berkat";
    }

    public String getAlamat() { // Method untuk memanggil inputan alamat dokter.
        return alamat; // Nilai pengembalian dari alamat dokter.
    }

    public void setAlamat(String alamat) { // Method untuk menginputkan alamat dokter yaitu bernama "Bogor", dimana dengan nama metod public void setAlamat.
        this.alamat = "Bogor";
    }

    public String getTempatLahir() { // Method untuk memanggil inputan tempat lahir dokter.
        return tempatLahir; // Nilai pengembalian dari tempat lahir dokter.
    }

    public void setTempatLahir(String tempatLahir) { // Method untuk menginputkan TempatLahir dokter yaitu bernama "Bogor", dimana dengan nama metod public void setTempatLahir.
        this.tempatLahir = "Bogor";
    }

    public int getTanggalLahir() {  // Method untuk memanggil inputan tenggal lahir dokter.
        return tanggalLahir; // Nilai pengembalian dari tanggal lahir dokter.
    }

    public void setTanggalLahir(int tanggalLahir) throws Exception { // Dalam metod setTanggalLahir terdapat parameter yaitu "tanggalLahir" dengan tipe data integer. Dengan menggunakan throws Exception yang berfungsi untuk mendeteksi kesalahan dari deklarasi isi dalam method.
        if (tanggalLahir > 0) { // Dimana dalam menentukan tanggal lahir memeiliki persyaratan yaitu tanggalLahir dokter harus lebih besar dari nol.
            if (tanggalLahir < 24) { // Kemudian didalamnya terdapat "if bersarang" yang berisi tanggal lahir lebih kecil dari 24.(karena tanggal dalam setiap bulan maks tanggal 23).
                this.tanggalLahir = 12; // tanggal lahir dokter adalah "bulan 12/Desember".
            }
        } else {
            throw new Exception("tanggal lahir lebih dari duapuluh empat"); // seandainya tanggal lahir yang di inputkan lebih dari "24" maka jawaban terdeteksi salah, sehingga akan mencetak keterangan "tanggal lahir lebih dari duapuluh empat".
        }
        throw new Exception("tnggal lahir dari duapuluh empat"); // seandainya tanggal lahir yang di inputkan "24", sehingga akan mencetak keterangan "tanggal lahir dari duapuluh empat".
    }

}
