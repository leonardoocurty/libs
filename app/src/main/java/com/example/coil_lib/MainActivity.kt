
package com.example.coil_lib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.CircleCropTransformation
import com.example.coil_lib.Adapter.AdapterProduto
import com.example.coil_lib.model.Produto

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView_produtos = findViewById<RecyclerView>(R.id.recyclerView_produtos)
        recyclerView_produtos.layoutManager = LinearLayoutManager(this)
        recyclerView_produtos.setHasFixedSize(true)
        //Configurar Adapter
        val listaProdutos: MutableList<Produto> = mutableListOf()
        val adapterProduto = AdapterProduto(this, listaProdutos)
        recyclerView_produtos.adapter = adapterProduto

        val produto1 = Produto(
            R.drawable.pao,
            nome = "Pão Francês",
            descricao = "Feito de farinha de trigo, fermento biológico, sal, água, ovos e açúcar.",
            //preco = "R$ 12,99 / kg",
        )
        listaProdutos.add(produto1)

        val produto2 = Produto(
            R.drawable.bolo_chocolate,
            nome = "Bolo de Chocolate",
            descricao = "Bolo de chocolate confeitado, com chocolate derretido.",
           //preco = "R$ 32,00"
        )
        listaProdutos.add(produto2)

        val produto3 = Produto(
            R.drawable.torta_limao,
            nome = "Torta de Limão",
            descricao = "Torta de Limão com recheio cremoso de limão e Leite condensado, coberto com merengue",
            //preco = "R$ 36,00"
        )
        listaProdutos.add(produto3)

        val produto4 = Produto(
            R.drawable.torta_morango,
            nome = "Torta de Morango",
            descricao = "Torta recheada com creme de confeiteiro de Leite Moça e morangos",
            //preco = "R$ 38,00"
        )
        listaProdutos.add(produto4)

        val produto5 = Produto(
            R.drawable.cheesecake,
            nome = "Cheesecake de Chocolate",
            descricao = "Cheesecake de Chocolate feita com Cobertura de Chocolate ao Leite Garoto e Biscoito Negresco",
            //preco = "R$ 38,00"
        )
        listaProdutos.add(produto5)

        val produto6 = Produto(
            R.drawable.pudim,
            nome = "Pudim de Leite Condensado",
            descricao = "Pudim de Leite Moça feita com Leite Moça com calda de caramelo.",
            //preco = "R$ 25,00"
        )
        listaProdutos.add(produto6)


        /*var imageView1 = findViewById<ImageView>(R.id.image1)
        imageView1.load("https://fdr.com.br/wp-content/uploads/2022/03/pao-frances-1200x702.jpg"){
            //crossfade(true)
            //placeholder(R.drawable.image)
            transformations(CircleCropTransformation())
        }

        var imageView2 = findViewById<ImageView>(R.id.image2)
        imageView2.load("https://img.itdg.com.br/images/recipes/000/186/329/322500/322500_original.jpg"){
            //crossfade(true)
            //placeholder(R.drawable.image)
            transformations(CircleCropTransformation())
        }

        var imageView3 = findViewById<ImageView>(R.id.image3)
        imageView3.load("https://images.aws.nestle.recipes/resized/40b25559b85b265e885f55ec7c1e4d04_torta-lim%C3%A3o-receitas-nestle_1200_600.jpg"){
            //crossfade(true)
            //placeholder(R.drawable.image)
            transformations(CircleCropTransformation())
        }

        var imageView4 = findViewById<ImageView>(R.id.image4)
        imageView4.load("https://s2.glbimg.com/115DQucrWsNOUxf_ncmMUisprZI=/0x0:1080x819/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_e84042ef78cb4708aeebdf1c68c6cbd6/internal_photos/bs/2020/w/a/cB6VP5QoOByFKEuCleIQ/jonreceitas-109758346-416338779271002-5424220606850697813-n.jpg"){
            //crossfade(true)
            //placeholder(R.drawable.image)
            transformations(CircleCropTransformation())
        }

        var imageView5 = findViewById<ImageView>(R.id.image5)
        imageView5.load("https://www.teleculinaria.pt/wp-content/uploads/2018/09/cheesecake-de-chocolate-e-amendoa.jpg"){
            //crossfade(true)
            //placeholder(R.drawable.image)
            transformations(CircleCropTransformation())
        }

        var imageView6 = findViewById<ImageView>(R.id.image6)
        imageView6.load("https://receitasdedomingo.com.br/wp-content/uploads/2019/03/Torta-de-Morango.jpg"){
            //crossfade(true)
            //placeholder(R.drawable.image)
            transformations(CircleCropTransformation())
        }*/
    }
}