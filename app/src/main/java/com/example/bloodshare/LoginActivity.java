package com.example.bloodshare;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Login Activity (Halaman login)
 *
 * Dikerjakan Pada: 28 April 2021
 * Deskripsi Pekerjaan: Membuat activity login dengan constraint layout serta custom tombol dengan drawable selector btn_outline_light
 *                      dan spannable text agar text Register bisa di klik/press
 * NIM: 10118052
 * Nama: Bagus Syibro Malisi
 * Kelas: IF-2
 */
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Menjadikan teks "Register" menjadi dapat di klik/press
        // Proses menggunakan bantuan SpannableString
        TextView regTextView = (TextView) findViewById(R.id.registerText);
        String regText = getString(R.string.register_text).toString();

        SpannableString spannableString = new SpannableString(regText);

        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Log.d("LoginAct", "Clicked");
                startIntent(RegisterActivity.class);
            }

            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                ds.setUnderlineText(false);
                ds.setColor(getColor(R.color.white));
                ds.setTypeface(Typeface.DEFAULT_BOLD);
            }
        };

        // poisisi kata "Register" pada string R.string.register_text
        final int startRegPos = 22;
        final int endRegPos = 30;

        spannableString.setSpan(clickableSpan,startRegPos, endRegPos, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        regTextView.setText(spannableString);
        regTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /**
     * Method untuk berpindah ke activity lain
     * @param activity
     */
    private void startIntent(Class<?> activity) {
        Intent intent = new Intent(this, activity);
        startActivity(intent);
    }
}