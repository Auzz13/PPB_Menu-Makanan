package com.example.aplikasimenumakanan_arya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rec_Makanan;
    private ArrayList<Menu> listMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rec_Makanan = findViewById(R.id.rec_Makanan);
        initData();

        // memanggil class KulinerAdapter agar menu muncul
        rec_Makanan.setAdapter(new Desc_Kuliner(listMakanan));
        rec_Makanan.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData() {
        this.listMakanan = new ArrayList<>();
        listMakanan.add(new Menu("Ayam Geprek Keju",
                "Rp. 20.000",
                "Ayam Geprek adalah ayam dengan balutan tepung yang digoreng krispi dengan tambahan cabai dan bumbu lainnya dengan cara digeprek secara bersamaan yang disajikan dengan nasi hangat serta ditambah parutan keju, ayam geprek keju siap dinikmati.",
                R.drawable.ayamgeprekkeju));
        listMakanan.add(new Menu("Kari Ayam",
                "Rp. 17.500",
                "Kari Ayam adalah makanan dengan bahan dasar ayam yang diolah dengan bumbu kari, ayam kari sangat unik karena rasanya yang khas bumbu kari dan lebih nikmat jika disajikan dengan nasi hangat, sehingga dapat menambah selere makan.",
                R.drawable.kariayam));
        listMakanan.add(new Menu("Nasi Goreng Mercon",
                "Rp. 14.500",
                "Nasi Goreng Mercon adalah makanan dengan bahan dasar nasi yang digoreng dengan bumbu-bumbu rahasia dengan tambahan sambal atau cabai yang lasung digoreng secara bersamaan, nasi goreng mercon lebih nikmat bila disajikan jika masih hangat.",
                R.drawable.nasgormercon));
        listMakanan.add(new Menu("Pecel Lele",
                "Rp. 15.000",
                "Pecel Lele adalah makanan dengan bahan dasar lele yang di goreng garing hingga krispi dengan cocolan sambal dan tambahan lalapan, disajikan dengan nasi hangat agar menambah selera makan, sehingga menambah selera makan.",
                R.drawable.pecellele));
        listMakanan.add(new Menu("Salad Buah",
                "Rp. 12.000",
                "Salad Buah adalah makanan dengan bahan dasar buah yang berisi berbagai macam buah-buahan dengan tambahan mayonais khusus salad untuk sausnya, salad buah sangat bermanfaat bagi kesehatan tubuh karena berisi buah-buahan, salad buah lebih enak dengan disajikan dalam keadaan dingin.",
                R.drawable.saladbuah));
        listMakanan.add(new Menu("Tahu Bulat",
                "Rp. 500",
                "Tahu Bulat adalah makanan dengan bahan dasar biji kedelai yang diolah sedemikian rupa menjadi tahu, tahu bulat adalah varian tahu yang dibuat dengan bahan tambahan lainnya dan dibentuk bulat dengan rasa yang gurih.",
                R.drawable.tahubulat));
    }
}