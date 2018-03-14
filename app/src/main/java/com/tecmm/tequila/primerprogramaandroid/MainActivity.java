package com.tecmm.tequila.primerprogramaandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int j;
    int i=0;
    boolean flag = true;
    TextView txtAviso, txtContador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.w("DEBUG", "Esta iniciando la aplicacion");
        Toast.makeText(this, "Mi aplicacion esta iniciando", Toast.LENGTH_LONG).show();

        txtAviso = (TextView) findViewById(R.id.txtAviso);
        txtContador = (TextView) findViewById(R.id.txtContador);


    }

    public void sumaContador(View v){
        //j++;
        //Log.e("Valor j", ""+j);
        if (flag){
            i++;
            this.txtContador.setText("" + i);
            if (i==7)
                this.txtAviso.setText("Ya casi llegamos");
            if (i==5)
                Log.e("Van 5", "Vamos bien");
            if (i==9)
                this.txtAviso.setText("Ya merito");
            if(i==10){
             flag = false;
             Log.e("Van 5", "Vamos bien");
            }


        }
        else{
            i--;
            this.txtContador.setText("" + i);
            if (i==5)
                Log.e("Van 5", "Vamos bien");
            if (i==3)
                this.txtAviso.setText("Muy bajo");
            if (i==2)
                this.txtAviso.setText("Bajito");
            if (i==0){
             flag = true;
             Log.e("Van 5", "Vamos bien");
            }
        }
    }
}
