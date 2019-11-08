package com.tkj17a.kel3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
public class MainActivity extends AppCompatActivity {

    //Mendefinisikan Variable LinearLayout, Digunakan sebagai Container/Penampung
    private LinearLayout KontenView;

    //Mendefinisikan View, digunakan untuk SubActivity
    private View page2,page3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        KontenView = findViewById(R.id.konten_view);
        //Menentukan Layout Resource dan ViewGroup yang akan kita gunakan
        page2 = getLayoutInflater().inflate(R.layout.activity_page2, KontenView, false);
        page3 = getLayoutInflater().inflate(R.layout.activity_pake3, KontenView, false);

        //Menampilkan View pada LinearLayout
        KontenView.addView(page2);
        KontenView.addView(page3);
    }
}
