package com.univalle.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Double e,s;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getIntent().getExtras().getString("parametro");
        this.setTitle(getIntent().getExtras().getString("parametro"));
        String titu= getResources().getString(R.string.app_name);
        EditText en= findViewById(R.id.entrada);
        EditText sa= findViewById(R.id.salida);
        if(titu==getResources().getString(R.string.c2f))
        {
            try{
            e = Double.valueOf (en.toString());
            s = (e - 32) * 9/5;
            sa.setText (String.valueOf (s)+" F.");}
            catch (Exception ex){}
        }
        if(titu==getResources().getString(R.string.f2c))
        {
            try{
            e = Double.valueOf (en.toString());
            s = (e-32) * 5/9;
            sa.setText (String.valueOf (s)+" C.");
            }
            catch (Exception ex){}
        }


        if(titu==getResources().getString(R.string.m2k))
        {
            try{

            e = Double.valueOf (en.toString());
            s = e*1000;
            sa.setText (String.valueOf (s)+" CM.");
            }
            catch (Exception ex){}
        }
        if(titu==getResources().getString(R.string.k2m))
        {
            try{

            e = Double.valueOf (en.toString());
            s = e/1000;
            sa.setText (String.valueOf (s)+" KM.");
            }
            catch (Exception ex){}
        }


        if(titu==getResources().getString(R.string.m2c))
        {
            try{

            e = Double.valueOf (en.toString());
            s = e*100;
            sa.setText (String.valueOf (s)+" CM.");
            }
            catch (Exception ex){}
        }
        if(titu==getResources().getString(R.string.c2m))
        {
            try{

            e = Double.valueOf (en.toString());
            s = e/100;
            sa.setText (String.valueOf (s)+" M.");
            }
            catch (Exception ex){}
        }




    }
    public void ejecutar(View v1) {
        SharedPreferences preferencias=getSharedPreferences("datos",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=preferencias.edit();
        EditText et1 = findViewById(R.id.entrada);
        editor.putString("dato", et1.getText().toString());
        editor.commit();
        finish();
    }
}
