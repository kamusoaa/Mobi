package com.example.kozjava.mobio_testapp.activities;

import android.content.Intent;
import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kozjava.mobio_testapp.R;
import com.example.kozjava.mobio_testapp.support.Model;

import java.util.ArrayList;

public class RecipesActivity extends AppCompatActivity implements View.OnClickListener {

    private Button craftButton;
    private Button charmButton;
    private Button potionButton;
    private Button beaconButton;
    private Button stoveButton;
    private Button anvilButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        craftButton = (Button)findViewById(R.id.craft_button);
        charmButton = (Button)findViewById(R.id.charms_button);
        potionButton = (Button)findViewById(R.id.potion_button);
        beaconButton = (Button)findViewById(R.id.beacon_button);
        stoveButton = (Button)findViewById(R.id.stove_button);
        anvilButton = (Button)findViewById(R.id.anvil_button);

        craftButton.setOnClickListener(this);
        charmButton.setOnClickListener(this);
        potionButton.setOnClickListener(this);
        beaconButton.setOnClickListener(this);
        stoveButton.setOnClickListener(this);
        anvilButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.craft_button :
                startListActivity("Крафт");
                break;
            case R.id.charms_button:
                startListActivity("Чары");
                break;
            case R.id.potion_button:
                startListActivity("Зелья");
                break;
            case R.id.beacon_button:
                startInfoActivity("Маяк");
                break;
            case R.id.stove_button:
                startInfoActivity("Плавка");
                break;
            case R.id.anvil_button:
                startInfoActivity("Починка");
                break;
        }
    }

    private void startListActivity(String title){
        Intent intent = new Intent(this, ListActivity.class);
        intent.putExtra("title", title);
        startActivity(intent);
    }

    private void startInfoActivity(String title){
        Intent intent = new Intent(this, InfoActivity.class);
        intent.putExtra("title", title);
        startActivity(intent);
    }
}
