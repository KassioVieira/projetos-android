package com.vieira.kassio.botoescores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    View v;
    Button verde, ciano, rosa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        v = (View)findViewById(R.id.vCores);
        verde = (Button)findViewById(R.id.btnVerde);
        ciano = (Button)findViewById(R.id.btnCiano);
        rosa = (Button)findViewById(R.id.btnRosa);

        verde.setOnClickListener(this);
        ciano.setOnClickListener(this);
        rosa.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnVerde){
            v.setBackgroundResource(R.color.colorPrimary);
        }else if(view.getId() == R.id.btnCiano){
            v.setBackgroundResource(R.color.colorCiano);
        }else if(view.getId() == R.id.btnRosa){
            v.setBackgroundResource(R.color.colorAccent);
        }
    }
}
