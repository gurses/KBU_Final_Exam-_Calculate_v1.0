package com.example.gursesarmutcu.kbu_calculate_final_grade_v10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CalculateFinalGrade extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    EditText editText3;
    TextView textViewA1;
    TextView textViewA2;
    TextView textViewB1;
    TextView textViewB2;
    TextView textViewC;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_final_grade);

        editText1=findViewById(R.id.editText1);
        editText2=findViewById(R.id.editText2);
        editText3=findViewById(R.id.editText3);
        textViewA1=findViewById(R.id.textViewA1);
        textViewA2=findViewById(R.id.textViewA2);
        textViewB1=findViewById(R.id.textViewB1);
        textViewB2=findViewById(R.id.textViewB2);
        textViewC=findViewById(R.id.textViewC);
        textView2=findViewById(R.id.textView2);

    }

    public void finalHesapla(View view){

        int vize_notu=Integer.parseInt(editText1.getText().toString());

        double sonucA1=((90-(vize_notu*0.4))/0.6);
        double sonucA2=((80-(vize_notu*0.4))/0.6);
        double sonucB1=((70-(vize_notu*0.4))/0.6);
        double sonucB2=((65-(vize_notu*0.4))/0.6);
        double sonucC=((60-(vize_notu*0.4))/0.6);




        if (sonucA1>100){
            textViewA1.setText("A1 Alamazsın");
        }
        else
            textViewA1.setText("A1: "+ new DecimalFormat("##.##").format(sonucA1));


        if (sonucA2>100){
            textViewA2.setText("A2 Alamazsın");
        }
        else
            textViewA2.setText("A2: "+ new DecimalFormat("##.##").format(sonucA2));

        if (sonucB1>100){
            textViewB1.setText("B1 Alamazsın");
        }
        else
            textViewB1.setText("B1: "+ new DecimalFormat("##.##").format(sonucB1));

        if (sonucB2>100){
            textViewB2.setText("B2 Alamazsın");
        }
        else
            textViewB2.setText("B2: "+ new DecimalFormat("##.##").format(sonucB2));

        if (sonucB2>100){
            textViewB2.setText("Dersten Kaldın");
        }
        else
            textViewC.setText("C: "+ new DecimalFormat("##.##").format(sonucC));
    }


    public void ortHesapla(View view){

        int vize_notu=Integer.parseInt(editText2.getText().toString());
        int final_notu=Integer.parseInt(editText3.getText().toString());

        double sonuc=(vize_notu*0.4)+(final_notu*0.6);

        textView2.setText("Ortalaman: "+ new DecimalFormat("##.##").format(sonuc));

    }

}
