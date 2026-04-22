package com.example.uts_aplikasi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class WisataAdapter extends RecyclerView.Adapter<WisataAdapter.WisataViewHolder> {

    private Context context;
    private List<Wisata> listWisata;

    // Constructor Adapter
    public WisataAdapter(Context context, List<Wisata> listWisata) {
        this.context = context;
        this.listWisata = listWisata;
    }

    @NonNull
    @Override
    public WisataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Menghubungkan adapter dengan layout item_wisata.xml
        View view = LayoutInflater.from(context).inflate(R.layout.item_wisata, parent, false);
        return new WisataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WisataViewHolder holder, int position) {
        // Mengambil data satu per satu berdasarkan posisinya
        Wisata wisata = listWisata.get(position);

        // Memasukkan data ke dalam komponen UI
        holder.tvNamaWisata.setText(wisata.getNamaWisata());
        holder.imgThumbnail.setImageResource(wisata.getGambarWisata());

        // Membuat event klik secara eksplisit untuk menampilkan Toast
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Anda memilih: " + wisata.getNamaWisata(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listWisata.size();
    }

    // Class ViewHolder untuk mendeklarasikan komponen UI
    public class WisataViewHolder extends RecyclerView.ViewHolder {
        TextView tvNamaWisata;
        ImageView imgThumbnail;

        public WisataViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNamaWisata = itemView.findViewById(R.id.tv_nama_wisata);
            imgThumbnail = itemView.findViewById(R.id.img_thumbnail);
        }
    }
}