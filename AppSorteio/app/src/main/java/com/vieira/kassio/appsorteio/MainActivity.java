package com.vieira.kassio.appsorteio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn;
    TextView txt;
    EditText ed;

    String participante;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btnSortear);
        txt = (TextView) findViewById(R.id.txtNumber);
        ed = (EditText) findViewById(R.id.edValor);

        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        participante = ed.getText().toString();
        if(!participante.isEmpty()){
            Sortear sortear = new Sortear(btn,txt);
            sortear.execute(Integer.parseInt(participante));
        }else{
            Toast.makeText(this,"Informe um valor",Toast.LENGTH_SHORT).show();
        }

    }
}
