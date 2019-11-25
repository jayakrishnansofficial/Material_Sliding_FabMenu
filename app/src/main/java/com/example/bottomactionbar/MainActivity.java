package com.example.bottomactionbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView bankcard,ideacard,addcard,linkscard,wificard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bankcard = findViewById(R.id.bank_card);
        ideacard = findViewById(R.id.idea_card);
        addcard = findViewById(R.id.add_card);
        linkscard = findViewById(R.id.link_card);
        wificard = findViewById(R.id.wifi_card);

        bankcard.setOnClickListener(this);
        ideacard.setOnClickListener(this);
        addcard.setOnClickListener(this);
        linkscard.setOnClickListener(this);
        wificard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

    }
}
