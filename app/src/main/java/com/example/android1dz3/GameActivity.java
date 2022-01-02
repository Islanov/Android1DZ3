package com.example.android1dz3;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {
    ImageView imImage;
    Button btnImage1, btnImage2, btnImage3;
    Button btnOne, btnTwo, btnThree;
    boolean cold, window, water;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initialization();
        listeners();
    }

    private void initialization() {
        imImage = findViewById(R.id.im_image);
        btnOne = findViewById(R.id.btn_one);
        btnTwo = findViewById(R.id.btn_two);
        btnThree = findViewById(R.id.btn_three);
    }

    public void changeImage(View view) {
        switch (view.getId()) {
            case R.id.btn_image1:
                imImage.setImageResource(R.drawable.frige);
                cold = true;
                window = false;
                water = false;
                break;
            case R.id.btn_image2:
                imImage.setImageResource(R.drawable.television);
                cold = false;
                window = true;
                water = false;
                break;
            case R.id.btn_image3:
                imImage.setImageResource(R.drawable.washingmashine);
                cold = false;
                window = false;
                water = true;
                break;
        }

    }

    private void listeners() {
        btnOne.setOnClickListener(v -> {
            if (cold) {
                Toast.makeText(GameActivity.this, "Правильно", Toast.LENGTH_SHORT).show();
                btnOne.setAlpha(0f);
                btnOne.setTranslationY(50);
                btnOne.animate().alpha(1f).translationYBy(-50).setStartDelay(200).setDuration(1500);
            } else {
                Toast.makeText(GameActivity.this, "Не правильно", Toast.LENGTH_SHORT).show();
            }
        });
        btnTwo.setOnClickListener(v -> {
            if (window) {
                Toast.makeText(GameActivity.this, "Правильно", Toast.LENGTH_SHORT).show();
                btnTwo.setAlpha(0f);
                btnTwo.setTranslationY(50);
                btnTwo.animate().alpha(1f).translationYBy(-50).setStartDelay(200).setDuration(1500);
            } else {
                Toast.makeText(GameActivity.this, "Не правильно", Toast.LENGTH_SHORT).show();
            }
        });
        btnThree.setOnClickListener(v -> {
            if (water) {
                Toast.makeText(GameActivity.this, "Правильно", Toast.LENGTH_SHORT).show();
                btnThree.setAlpha(0f);
                btnThree.setTranslationY(50);
                btnThree.animate().alpha(1f).translationYBy(-50).setStartDelay(200).setDuration(1500);
            } else {
                Toast.makeText(GameActivity.this, "Не правильно", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
