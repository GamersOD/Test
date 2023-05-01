package fr.example.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Geographie extends AppCompatActivity {

    ImageButton ibouton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geographie);

        this.ibouton1 = findViewById(R.id.imageButtonreturnGeo);
        ibouton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Mainmenuestart = new Intent(getApplicationContext(),MainMenue.class);
                startActivity(Mainmenuestart);
                finish();
            }
        });
    }
}