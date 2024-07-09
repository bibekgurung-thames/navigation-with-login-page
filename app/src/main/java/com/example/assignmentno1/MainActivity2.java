package com.example.assignmentno1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        Intent myintent = getIntent();
        String receivedValue = myintent.getStringExtra("bca");
        String received = myintent.getStringExtra("gender");

        textView = findViewById(R.id.home);
        textView.setText("Guten Morgen "+ receivedValue +
                " "+ received);

    }
}