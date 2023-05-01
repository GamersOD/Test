package fr.example.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenue extends AppCompatActivity {

    Button bouton1;
    Button bouton2;
    Button bouton3;
    Button bouton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menue);

        this.bouton1 = findViewById(R.id.Mainmenue1);
        bouton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent geographiestart = new Intent(getApplicationContext(),Geographie.class);
                startActivity(geographiestart);
                finish();
            }
        });

        this.bouton2 = findViewById(R.id.Mainmenue2);
        bouton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Film_seriestart = new Intent(getApplicationContext(),Film_Serie.class);
                startActivity(Film_seriestart);
                finish();
            }
        });

        this.bouton3 = findViewById(R.id.Mainmenue3);
        bouton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Culture_generalestart = new Intent(getApplicationContext(),Culture_generale.class);
                startActivity(Culture_generalestart);
                finish();
            }
        });

        this.bouton4 = findViewById(R.id.Mainmenue4);
        bouton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Sportsstart = new Intent(getApplicationContext(),Sports.class);
                startActivity(Sportsstart);
                finish();
            }
        });
    }
}