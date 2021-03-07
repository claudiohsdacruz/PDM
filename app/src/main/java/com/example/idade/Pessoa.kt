package com.example.idade

import android.widget.TextView

class Pessoa(nome: String, ano: Int) {
    var nome: String
    var ano: Int

    init {
        this.nome = nome
        this.ano = ano
    }

    fun idade(): Int{
        return 2021 - this.ano
    }
}