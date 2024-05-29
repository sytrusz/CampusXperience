package com.example.campusxperience;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class rsvpTicketing extends AppCompatActivity {

    Button rsvp1;
    Button rsvp2;
    Button rsvp3;
    Button rsvp4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_rsvp_ticketing);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rsvp1 = findViewById(R.id.rsvp1);
        rsvp2 = findViewById(R.id.rsvp2);
        rsvp3 = findViewById(R.id.rsvp3);
        rsvp4 = findViewById(R.id.rsvp4);

        rsvp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(rsvpTicketing.this, rsvp1.class);
                startActivity(intent);
            }
        });

        rsvp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(rsvpTicketing.this, rsvp2.class);
                startActivity(intent);
            }
        });

        rsvp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(rsvpTicketing.this, rsvp3.class);
                startActivity(intent);
            }
        });

        rsvp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(rsvpTicketing.this, rsvp4.class);
                startActivity(intent);
            }
        });
    }
}