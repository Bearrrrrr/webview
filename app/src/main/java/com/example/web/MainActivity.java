package com.example.web;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="fff" ;
    //    Bundle bundle ;
    WebView webView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = this.getIntent();
        String url=intent.getData().toString();
//        bundle = intent.getExtras();
        webView = (WebView)findViewById(R.id.webView1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setSupportZoom(true);
        if(url !=null){

            webView.loadUrl(url);
        }
//        webView.setWebViewClient(new WebViewClient());
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                webView.loadUrl(url);
                return true;
            }

        });




    }
}
