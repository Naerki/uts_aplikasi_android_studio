package com.example.uts_aplikasi;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvWisata;
    private WisataAdapter adapter;
    private List<Wisata> listWisata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Menyembunyikan Action Bar bawaan agar tampilan lebih mirip desain
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        setContentView(R.layout.activity_main);

        // Inisialisasi RecyclerView
        rvWisata = findViewById(R.id.rv_wisata);
        rvWisata.setLayoutManager(new LinearLayoutManager(this));

        // Menambahkan data secara manual satu per satu agar mudah dikontrol
        listWisata = new ArrayList<>();
        listWisata.add(new Wisata("Jembatan Ampera", R.drawable.ampera));
        listWisata.add(new Wisata("Benteng Kuto Besak", R.drawable.bkb));
        listWisata.add(new Wisata("Pulau Kemaro", R.drawable.kemaro));
        listWisata.add(new Wisata("Museum Sultan Mahmud Badaruddin II", R.drawable.museum_smb));
        listWisata.add(new Wisata("Kampung Kapitan", R.drawable.kampung_kapitan));
        // Catatan: Jika ingin menambahkan baris duplikat Kampung Kapitan seperti di gambar,
        // cukup tambahkan satu baris kode manual lagi di bawah ini.

        // Menghubungkan data ke Adapter, lalu memasangnya ke RecyclerView
        adapter = new WisataAdapter(this, listWisata);
        rvWisata.setAdapter(adapter);
    }
}