package com.example.giovanne.temporada3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        //Botoes para as activities das aulas
        Button aula01 = (Button) findViewById(R.id.implicit_intent);
        Button aula02 = (Button) findViewById(R.id.btn_aula02);

        //Acao botao aula01
        aula01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ImplicitIntent.class);
                startActivity(intent);
            }
        });

        //Acao botao aula 02
        aula02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Aula02.class);
                startActivity(intent);
            }
        });

    }



}
