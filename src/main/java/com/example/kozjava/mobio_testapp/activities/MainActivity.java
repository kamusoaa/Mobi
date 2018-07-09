package com.example.kozjava.mobio_testapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.kozjava.mobio_testapp.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button recipeButton;
    private Button idButton;
    private Button redstoneButton;
    private Button gameplayButton;
    private Button mobsButton;
    private Button proButton;
    private AdView adView;
    private PublisherInterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this, "ca-app-pub-8354815120179967~8605303437");
        adView = (AdView)findViewById(R.id.adView);

        recipeButton = (Button)findViewById(R.id.recipe_button);
        idButton = (Button)findViewById(R.id.id_button);
        redstoneButton = (Button)findViewById(R.id.redstone_button);
        gameplayButton = (Button)findViewById(R.id.gameplay_button);
        mobsButton = (Button)findViewById(R.id.mobs_button);
        proButton = (Button)findViewById(R.id.pro_button);
        interstitialAd = new PublisherInterstitialAd(this);
        interstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                startRecipesActivity();
                requestNewInterstitial();
            }
        });
        requestNewInterstitial();

        recipeButton.setOnClickListener(this);
        idButton.setOnClickListener(this);
        redstoneButton.setOnClickListener(this);
        gameplayButton.setOnClickListener(this);
        mobsButton.setOnClickListener(this);
        proButton.setOnClickListener(this);

        AdRequest adRequest = new AdRequest.Builder()
                .build();
        adView.loadAd(adRequest);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.recipe_button:
                startRecipesActivity();
                break;
            case R.id.id_button:
                startInfoActivity("ID Предметов");
                break;
            case R.id.redstone_button:
                startListActivity("Редстоун");
                break;
            case R.id.gameplay_button:
                startListActivity("Геймплей");
                break;
            case R.id.mobs_button:
                startListActivity("Мобы");
                break;
            case R.id.pro_button:
                startRecipesActivity();
                break;
        }
    }

    private void startRecipesActivity(){
        if (interstitialAd.isLoaded())
            interstitialAd.show();
        else{
            Intent intent = new Intent(this, RecipesActivity.class);
            startActivity(intent);
        }
    }

    private void startListActivity(String param){
        Intent intent = new Intent(this, ListActivity.class);
        intent.putExtra("title", param);
        startActivity(intent);
    }
    private void startInfoActivity(String param){
        Intent intent = new Intent(this, InfoActivity.class);
        intent.putExtra("title", param);
        startActivity(intent);
    }
    private void requestNewInterstitial() {
        PublisherAdRequest adRequest = new PublisherAdRequest.Builder()
                .build();

        interstitialAd.loadAd(adRequest);
    }
}
