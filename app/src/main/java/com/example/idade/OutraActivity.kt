package com.example.idade

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView

class OutraActivity : AppCompatActivity() {
    private lateinit var tela: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_outra)

        this.tela = findViewById(R.id.textResultado)
        this.tela.setOnClickListener({clickTexto(it)})

        val msg:String? = intent.getStringExtra("MSG_RESULTADO")
        tela.text = msg


    }

    fun clickTexto(view: View){
        val intent = Intent(this,MainActivity::class.java)
        intent.putExtra("RETORNO","msg_retorno")
        startActivity(intent)
    }
}

