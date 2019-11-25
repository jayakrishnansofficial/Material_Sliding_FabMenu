package com.example.bottomactionbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
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
        Intent i;

        switch (v.getId()){
            case R.id.bank_card : i = new Intent(this,Bank.class); startActivity(i); break;
            case R.id.idea_card : i = new Intent(this,Ideas.class); startActivity(i); break;
            case R.id.add_card : i = new Intent(this,Add.class); startActivity(i); break;
            case R.id.link_card : i =new Intent(this,Links.class); startActivity(i); break;
            case R.id.wifi_card : i =   new Intent(this,Wifi.class); startActivity(i);  break;
            default: break;
        }

    }
}
