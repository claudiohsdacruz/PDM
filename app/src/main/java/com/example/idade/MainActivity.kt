package com.example.idade

import android.content.Intent
import android.icu.text.AlphabeticIndex
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var btCalcular: Button
    private lateinit var etNome: EditText
    private lateinit var etAno: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.btCalcular = findViewById(R.id.btnMainCalcular)
        this.btCalcular.setOnClickListener({clickButton(it)})

        this.etNome = findViewById(R.id.txtNome)
        this.etAno = findViewById(R.id.txtAno)


    }

    private fun clickButton(view: View){
        val nome: String = this.etNome.text.toString()
        val ano = this.etAno.text.toString().toInt()

        val pessoa = Pessoa(nome,ano)

        val intent = Intent(this,OutraActivity::class.java)
        intent.putExtra("PESSOA",pessoa)
        startActivity(intent)

    }

}