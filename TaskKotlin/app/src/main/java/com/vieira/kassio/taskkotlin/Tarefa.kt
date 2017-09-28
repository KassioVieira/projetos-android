package com.vieira.kassio.taskkotlin

import android.os.AsyncTask
import android.widget.Button
import android.widget.TextView

/**
 * Created by kassio on 19/09/17.
 */

class Tarefa constructor(btn : Button, txt : TextView) : AsyncTask<Void, Integer, Integer>(){

     val btn : Button = btn
     val txt : TextView = txt

    override fun onPreExecute() {
        super.onPreExecute()
        btn.isEnabled = false
    }

    override fun onProgressUpdate(vararg values: Integer?) {
        super.onProgressUpdate(*values)
    }

    override fun onPostExecute(result: Integer?) {
        super.onPostExecute(result)
        btn.isEnabled = true
    }

    override fun doInBackground(vararg p0: Void?): Integer {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}