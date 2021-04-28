package com.example.bloodshare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Almost Activity (Halaman almost)
 *
 * Dikerjakan Pada: 28 April 2021
 * Deskripsi Pekerjaan: Membuat activity almost dengan constraint layout dan di combione dengan linear layout
 *                      serta custom tombol dengan drawable selector btn_outline_light
 * NIM: 10118052
 * Nama: Bagus Syibro Malisi
 * Kelas: IF-2
 */
public class AlmostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost);
    }

    public void sendVerificationCode(View view) {
        Intent intent = new Intent(this, VerifyActivity.class);
        startActivity(intent);
    }
}