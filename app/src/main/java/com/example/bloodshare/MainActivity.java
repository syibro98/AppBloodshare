package com.example.bloodshare;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Main Activity (Halaman utama)
 *
 * Dikerjakan Pada: 28 April 2021
 * Deskripsi Pekerjaan: Membuat activity main dengan constraint layout yang dikombinasikan dengan linear serta app bar layout
 *                      Untuk membuat avatar, menggunakan shapeableimageview dan menu menggunakan cardview
 *                      dan custom button
 * NIM: 10118052
 * Nama: Bagus Syibro Malisi
 * Kelas: IF-2
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}