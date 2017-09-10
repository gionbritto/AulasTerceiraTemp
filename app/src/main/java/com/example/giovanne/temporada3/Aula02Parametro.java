package com.example.giovanne.temporada3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Aula02Parametro extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula02_parametro);


        Intent intent = getIntent();

        String texto = (String) intent.getSerializableExtra("texto");

        TextView textView = (TextView) findViewById(R.id.recieved_parameter);
        textView.setText(texto);



        intent.getExtras();
        Bundle recebeDados = new Bundle();
        String stringRecebe = recebeDados.getString("valorParametro");
        textView.setText(stringRecebe);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.aula02_parametro, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
