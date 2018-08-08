package com.example.a17010304.practicalquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spn;
    WebView wv;
    ArrayList<String> alWeb;
    ArrayAdapter<String> aaWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spn = findViewById(R.id.spinnerUrl);
        wv = findViewById(R.id.webPage);
        wv.setWebViewClient(new WebViewClient());


        alWeb = new ArrayList<>();
        aaWeb = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, alWeb);

        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                alWeb.clear();
                switch(i){
                    case 0:
                        String getFb = "https://www.facebook.com";
                        wv.loadUrl(getFb);
                        break;
                    case 1:
                        String getTwitter = "https://www.twitter.com";
                        wv.loadUrl(getTwitter);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
