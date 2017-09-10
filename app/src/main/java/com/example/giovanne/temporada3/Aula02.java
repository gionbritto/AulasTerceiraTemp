package com.example.giovanne.temporada3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Aula02 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula02);

        Button ir = (Button) findViewById(R.id.btn_aula02_ir);
       final EditText textParameter = (EditText) findViewById(R.id.parameter_edit_text);

        Button ir2 = (Button) findViewById(R.id.btn_aula02_ir2);
        final EditText textParameterBundle = (EditText) findViewById(R.id.parameter_edit_text2);

       ir.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent= new Intent(Aula02.this, Aula02Parametro.class);
               intent.putExtra("texto",textParameter.getText().toString());
               startActivity(intent);
           }
       });

        ir2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Aula02.this, Aula02Parametro.class);
                Bundle bundle = new Bundle();
                bundle.putString("valorParametro", textParameter.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }


}
