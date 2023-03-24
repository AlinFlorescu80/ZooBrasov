package com.example.zoobrasov;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public class Quiz extends AppCompatActivity implements View.OnClickListener{

    TextView toateIntrebarileTextView;
    TextView intrebariTextView;
    Button raspA, raspB, raspC, raspD;
    Button submitBtn;

    int scor = 0;
    int intrebariTotale = IntrebariRaspunsuri.intrebari.length;
    int intrebareCurentaIndex = 0;
    String raspunsSelectat = "";
    int count = 0;
    String raspunsAnterior="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        toateIntrebarileTextView = findViewById(R.id.intrebariTotale);
        intrebariTextView = findViewById(R.id.intrebari);
        raspA = findViewById(R.id.rasp_A);
        raspB = findViewById(R.id.rasp_B);
        raspC = findViewById(R.id.rasp_C);
        raspD = findViewById(R.id.rasp_D);
        submitBtn = findViewById(R.id.submitBtn);


        raspA.setOnClickListener(this);
        raspB.setOnClickListener(this);
        raspC.setOnClickListener(this);
        raspD.setOnClickListener(this);
        submitBtn.setOnClickListener(this);

        intrebariTextView.setText("Numar intrebari: " + count);
        count = intrebariTotale;
        intrebareNoua();


    }


    @Override
    public void onClick(View view) {

        raspA.setBackgroundColor(Color.WHITE);
        raspB.setBackgroundColor(Color.WHITE);
        raspC.setBackgroundColor(Color.WHITE);
        raspD.setBackgroundColor(Color.WHITE);


        Button clickedButton = (Button) view;

        if (clickedButton.getId() == R.id.submitBtn) {

            if (raspunsSelectat.equals(IntrebariRaspunsuri.raspunsCorect[intrebareCurentaIndex])) {
                scor++;
                intrebareCurentaIndex++;
                count--;
                intrebareNoua();
            raspunsAnterior=raspunsSelectat;
            }
             else if (!raspunsSelectat.equals(IntrebariRaspunsuri.raspunsCorect[intrebareCurentaIndex])&&!raspunsSelectat.equals("")&&!raspunsSelectat.equals(raspunsAnterior)){
                intrebareCurentaIndex++;
                count--;
                intrebareNoua();
                raspunsAnterior=raspunsSelectat;
                }
            else {

                Toast.makeText(Quiz.this, "Trebuie să selectezi un răspuns", Toast.LENGTH_SHORT).show();
            }


        } else {
            raspunsAnterior=raspunsSelectat;
            raspunsSelectat = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.CYAN);
        }
    }


    void intrebareNoua() {

        if (intrebareCurentaIndex == intrebariTotale) {
            count = intrebariTotale;
            terminaQuiz();
            return;
        }

        toateIntrebarileTextView.setText("Întrebari: " + count);
        intrebariTextView.setText(IntrebariRaspunsuri.intrebari[intrebareCurentaIndex]);
        raspA.setText(IntrebariRaspunsuri.alegeri[intrebareCurentaIndex][0]);
        raspB.setText(IntrebariRaspunsuri.alegeri[intrebareCurentaIndex][1]);
        raspC.setText(IntrebariRaspunsuri.alegeri[intrebareCurentaIndex][2]);
        raspD.setText(IntrebariRaspunsuri.alegeri[intrebareCurentaIndex][3]);

    }

    void terminaQuiz () {
        toateIntrebarileTextView.setText("Întrebari: 0");
        new AlertDialog.Builder(this)
                .setTitle("Felicitari!")
                .setMessage("Ai raspuns corect la " + scor +" intrebari")
                .setPositiveButton("Restart",((dialogInterface, i) -> restartQuiz()))
                .setCancelable(false)
                .show();



    }

    void restartQuiz(){
        scor = 0 ;
        intrebareCurentaIndex = 0;
        intrebareNoua();
    }

}

