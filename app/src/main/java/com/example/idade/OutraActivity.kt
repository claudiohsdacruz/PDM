package com.example.idade

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.io.Serializable

class OutraActivity : AppCompatActivity() {
    private lateinit var tela: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_outra)

        this.tela = findViewById(R.id.textResultado)
        this.tela.setOnClickListener({clickTexto(it)})

        if (intent.hasExtra("PESSOA")) {
            val pessoa: Pessoa = intent.getSerializableExtra("PESSOA") as Pessoa
            this.tela.text = "${pessoa.nome}, você possui ${pessoa.idade()} anos."
        }else {
            this.tela.text = "Eita! Deu erro."
        }


    }

    private fun clickTexto(view: View){
        finish()
    }
}

