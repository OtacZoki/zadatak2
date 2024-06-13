package com.example.zadatak2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText evri;
    private EditText dolari;
    private EditText kursE;
    private  EditText kursD;
    private TextView EUD;
    private TextView DUD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        evri=(EditText) findViewById(R.id.editTextEvri);

        dolari=(EditText) findViewById(R.id.editTextDolari);

        kursE=(EditText) findViewById(R.id.editTextKursE);

        kursD=(EditText) findViewById(R.id.editTextKursD);

        EUD=(TextView) findViewById(R.id.textViewEuD);

        DUD=(TextView) findViewById(R.id.textViewDuD);


    }
    public void pretvoriEvro(View view){
        double iznosE=Double.parseDouble(evri.getText().toString());
        double kurs=Double.parseDouble(kursE.getText().toString());

        double rez=iznosE*kurs;

        EUD.setText("Dinari: " + String.valueOf(rez));

    }
    public void pretvoriDolar(View view){

        double iznosD=Double.parseDouble(dolari.getText().toString());

        double kurs=Double.parseDouble(kursD.getText().toString());

        double rez=iznosD*kurs;

        DUD.setText("Dinari: " + String.valueOf(rez));
    }
}