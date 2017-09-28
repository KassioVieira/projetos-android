package com.vieira.kassio.taskkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

     var valor : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        valor = edvalor.text.toString();

        btnContar.setOnClickListener {
            Tarefa(btnContar,txtnumber).execute();
        }
    }
}
