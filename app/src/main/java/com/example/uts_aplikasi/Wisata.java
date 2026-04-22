package com.example.uts_aplikasi;

public class Wisata {
    private String namaWisata;
    private int gambarWisata;

    // Constructor untuk menginisialisasi data
    public Wisata(String namaWisata, int gambarWisata) {
        this.namaWisata = namaWisata;
        this.gambarWisata = gambarWisata;
    }

    // Getter untuk mengambil nama wisata
    public String getNamaWisata() {
        return namaWisata;
    }

    // Getter untuk mengambil gambar wisata
    public int getGambarWisata() {
        return gambarWisata;
    }
}