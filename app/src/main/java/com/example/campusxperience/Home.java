package com.example.campusxperience;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    Button event_discovery;
    Button rsvp;
    Button event_promotion;
    Button event_reminders;
    Button rating;
    Button event_analytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        event_discovery = findViewById(R.id.event_discovery);
        rsvp = findViewById(R.id.rsvp);
        event_promotion = findViewById(R.id.event_promotion);
        event_reminders = findViewById(R.id.event_reminders);
        rating = findViewById(R.id.rating);
        event_analytics = findViewById(R.id.event_analytics);

        event_discovery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, eventDiscovery.class);
                startActivity(intent);
            }
        });

        rsvp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, rsvpTicketing.class);
                startActivity(intent);
            }
        });

        event_promotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, eventPromotion.class);
                startActivity(intent);
            }
        });

        event_reminders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, eventReminders.class);
                startActivity(intent);
            }
        });

        rating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, ratingsReview.class);
                startActivity(intent);
            }
        });

        event_analytics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, eventAnalytics.class);
                startActivity(intent);
            }
        });
    }
}