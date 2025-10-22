package com.example.androiduitesting;

import static android.content.Intent.getIntent;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {
    public static String CITY_NAME = "EXTRA_CITY_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView cityNameText = findViewById(R.id.text_city_name);
        Button backButton = findViewById(R.id.button_back);

        String city = getIntent().getStringExtra(CITY_NAME);
        if (city == null) {city = "";}
        cityNameText.setText(city);

        backButton.setOnClickListener(v -> finish()); // Finish the activity and return to MainActivity
    }
}
