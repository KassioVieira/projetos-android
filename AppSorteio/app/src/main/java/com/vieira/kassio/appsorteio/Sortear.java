package com.vieira.kassio.appsorteio;

import android.os.AsyncTask;
import android.os.SystemClock;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by kassio on 15/09/17.
 */

public class Sortear extends AsyncTask<Integer, Integer, Void> {

    Button btn;
    TextView txt;

    public Sortear(Button btn, TextView txt){
        this.btn = btn;
        this.txt = txt;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        btn.setEnabled(false);
    }

    @Override
    protected Void doInBackground(Integer... integers) {
        Random gerador = new Random();
        for(int i = 1; i<=10; i++){
            int a = gerador.nextInt(integers[0]+1);
            SystemClock.sleep(200);
            publishProgress(a);
        }

        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        txt.setText(String.valueOf(values[0]));
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        btn.setEnabled(true);
    }
}
