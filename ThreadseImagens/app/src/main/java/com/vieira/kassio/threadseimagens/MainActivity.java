package com.vieira.kassio.threadseimagens;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    ImageButton power;
    ImageView lampada, bateria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        power = (ImageButton) findViewById(R.id.btnPower);
        lampada = (ImageView) findViewById(R.id.imgLamp);
        bateria = (ImageView) findViewById(R.id.imageBatery);

        power.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        power.setBackgroundResource(R.drawable.power2);
        power.setEnabled(false);

        lampada.setBackgroundResource(R.drawable.acessa);
        bateria.setBackgroundResource(R.drawable.baterrycomplete);
        descarrega();
    }

    public void descarrega(){

        Thread thread = new Thread(new Runnable() {
            int contador = 0;
            @Override
            public void run() {

                for(int i = 0; i < 5; i++){
                    SystemClock.sleep(2000);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            trocaBateria(contador);
                        }
                    });
                    contador++;
                }
            }
        });

        thread.start();

    }

    public void trocaBateria(int v){
            switch (v){
                case 1:
                    bateria.setBackgroundResource(R.drawable.baterrygreen);
                    break;
                case 2:
                    bateria.setBackgroundResource(R.drawable.baterryelow);
                    break;
                case 3:
                    bateria.setBackgroundResource(R.drawable.baterryorange);
                    break;
                case 4:
                    bateria.setBackgroundResource(R.drawable.baterryred);
                    break;
                case 5:
                    power.setEnabled(true);
                    power.setBackgroundResource(R.drawable.power1);
                    lampada.setBackgroundResource(R.drawable.apagada);
                    bateria.setBackgroundResource(R.drawable.baterryloaded);
                    break;

            }
    }
}
