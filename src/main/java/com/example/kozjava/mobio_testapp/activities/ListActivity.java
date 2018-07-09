package com.example.kozjava.mobio_testapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kozjava.mobio_testapp.support.Data;
import com.example.kozjava.mobio_testapp.support.ListAdapter;
import com.example.kozjava.mobio_testapp.support.Model;
import com.example.kozjava.mobio_testapp.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity  {

    private static final String redstone = "Редстоун";
    private static final String gameplay = "Геймплей";
    private static final String mobs = "Мобы";
    private static final String сharms = "Чары";
    private static final String potions = "Зелья";
    private static final String craft = "Крафт";
    private TextView label;
    private  ListView itemListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        itemListView = (ListView)findViewById(R.id.list);
        label = (TextView)findViewById(R.id.title);



        Intent intent = getIntent();
        switch (intent.getStringExtra("title")){
            case redstone :
                showData(redstone, Data.createRedstoneList());
                break;
            case gameplay:
                showData(gameplay, Data.createGameplayList());
                break;
            case mobs :
                showData(mobs, Data.createMobsList());
                break;
            case сharms:
                showData(сharms, Data.createCharmsList());
                break;
            case potions :
                showData(potions, Data.createPotionList());
                break;
            case craft:
                showData(craft, Data.createRecipesList());
                break;
        }

        itemListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    TextView modelDescription = (TextView)view.findViewById(R.id.modelDescription);
                    Intent intent = new Intent(ListActivity.this, InfoActivity.class);
                    intent.putExtra("title", modelDescription.getText());
                    startActivity(intent);
            }
        });

    }
    private void showData(String title, ArrayList<Model> model){
        label.setText(title);
        ListAdapter adapter = new ListAdapter(this, model);
        itemListView.setAdapter(adapter);
    }
}
