package com.example.coil_lib

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.example.coil_lib.model.Produto

class ReceitaActivity : AppCompatActivity() {
    lateinit var botaoProximatela : ImageButton
    lateinit var nome : TextView
    lateinit var descricao : TextView
    lateinit var foto : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receita)

        botaoProximatela = findViewById(R.id.nomequalquer)
        botaoProximatela.setOnClickListener {
            IrparaProximaTela()
        }
        val produto : Produto = intent.getSerializableExtra("produto") as Produto
        nome = findViewById(R.id.nomeProduto)
        descricao = findViewById(R.id.descricaoProduto)
        foto = findViewById(R.id.fotoProduto)
        nome.text = produto.nome
        descricao.text = produto.nome
        //foto.  = produto.foto.toString()
    }


    private fun IrparaProximaTela(){
        val telaLembrete = Intent(this,MainActivity::class.java)
        startActivity(telaLembrete)
    }
}