package com.example.cartoon;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle A = getIntent().getExtras();
        CartooN C = (CartooN) A.getSerializable("cartoon");

        ImageView img = findViewById(R.id.imageView);
        TextView name = findViewById(R.id.dname);
        TextView rating = findViewById(R.id.drating);
        TextView season = findViewById(R.id.dseason);
        TextView episodes = findViewById(R.id.depisodes);
        TextView year = findViewById(R.id.dyear);
        WebView webView = findViewById(R.id.web);
        Button watch = findViewById(R.id.watching);

        img.setImageResource(C.getImage());
        name.setText(C.getName());
        rating.setText(C.getRating()+"");
        season.setText(C.getSeason()+"");
        episodes.setText(C.getEpisodes()+"");
        year.setText(C.getYear()+"");
//        webView.loadUrl(C.getWebView()+"");
        webView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl(C.getWebView()+"");
            }
        });
        watch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl(C.getWebView()+"");

            }
        });
    }
}