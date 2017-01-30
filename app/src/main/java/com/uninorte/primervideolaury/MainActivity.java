package com.uninorte.primervideolaury;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nota1;
    EditText nota2;
    EditText nota3;
    EditText nota;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //recuperamos los objetos controles
        nota1=(EditText)findViewById(R.id.nota1);
        nota2=(EditText)findViewById(R.id.nota2);
        nota3=(EditText)findViewById(R.id.nota3);
        nota=(EditText)findViewById(R.id.nota);

    }



    public void onClicElboton(View view) {
        if (nota1.getText().length() == 0 || nota2.getText().length() == 0 || nota3.getText().length() == 0) {
            Toast.makeText(this, "Verifique que todas las casillas esten llenas", Toast.LENGTH_LONG).show();
        }

        else {
            double sum=0;
            //Log.d("AlApp", nota1.getText().toString());
            double n1 = Double.parseDouble(nota1.getText().toString());
            //Log.d("AlApp", ""+n1);
            double n2 = Double.parseDouble(nota2.getText().toString());
            double n3 = Double.parseDouble(nota3.getText().toString());
            sum = (3.5 - (n1 * 0.25 + n2 * 0.25 + n3*0.25))/0.25;

            Toast.makeText(this, "Para pasar la nota en 3,5 se necesita", Toast.LENGTH_LONG).show();
            nota.setText(String.valueOf(sum));
        }
    }
}

