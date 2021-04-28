package com.example.bloodshare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Verify Activity (Halaman verify)
 *
 * Dikerjakan Pada: 28 April 2021
 * Deskripsi Pekerjaan: Membuat verify verify dengan menggunakan constraint layout serta button custom dan edit text beserta text view nya
 * NIM: 10118052
 * Nama: Bagus Syibro Malisi
 * Kelas: IF-2
 */
public class VerifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
    }

    public void submitCode(View view) {
        Intent intent = new Intent(this, com.example.bloodshare.MainActivity.class);
        startActivity(intent);
    }
}