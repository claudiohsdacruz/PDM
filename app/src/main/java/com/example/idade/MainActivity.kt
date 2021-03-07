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
    private lateinit var nome: EditText
    private lateinit var ano: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.btCalcular = findViewById(R.id.btnMainCalcular)
        this.btCalcular.setOnClickListener({clickButton(it)})

        this.nome = findViewById(R.id.txtNome)
        this.ano = findViewById(R.id.txtAno)


    }

    fun clickButton(view: View){
        //val pessoa = Pessoa(nome.toString(),ano.toString().toInt())
        //val idade = pessoa.idade()

        val intent = Intent(this,OutraActivity::class.java)
        intent.putExtra("MSG_RESULTADO","Teste Envio de Msg")
        //intent.putExtra("MSG_RESULTADO","${pessoa.nome} , você possui ${idade} anos!")
        startActivity(intent)

    }

}