package com.example.lugaluga;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.example.lugaluga.model.Produto;
import com.example.lugaluga.view.adapter.AdapterProduto;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

     private RecyclerView recyclerView;

     private AdapterProduto adapterProduto;

     private List<Produto> produtoList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.ListaProduto);

        CriarListaProdutos();

        adapterProduto = new AdapterProduto(produtoList);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapterProduto);

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getApplicationContext(), recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {

            }

            @Override
            public void onLongItemClick(View view, int position) {

            }

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        }));
    }
    public void CriarListaProdutos(){

        Produto produto;


        produto = new Produto("Iphone 13", 200.00 , "Iphone 13 64gb", 100, "Disponível");
        produtoList.add(produto);
        produto = new Produto("Fone de Ouvido Sem Fio", 236.00 , "JBL,Fone de Ouvido Sem fio,Bluetooth", 30, "Disponível");
        produtoList.add(produto);
        produto = new Produto("Kit Carregador", 64.00 , "Kit Carregador Super Turbo 45 w Dupla Entrada", 80, "Disponível");
        produtoList.add(produto);
        produto = new Produto("Ipad Mini", 900.00 , "Apple Ipad Mini (Wi-Fi,64gb) Rosa", 10, "Disponível");
        produtoList.add(produto);
        produto = new Produto("Apple Watch", 850.00 , "Apple Watch SE GPS", 200, "Disponível");
        produtoList.add(produto);
        produto = new Produto("Carregador Portátil", 199.00 , "Carregador Portátil (Power Bank) Ultra Rápido ", 5, "Disponível");
        produtoList.add(produto);
        produto = new Produto("Notebook Lenovo", 950.00 , "Notebook Lenovo IdeaPad 256gb ", 900, "Disponível");
        produtoList.add(produto);
        produto = new Produto("Samsung Smart TV", 700.00 , "Samsung Smart TV QLED 50 4K", 100, "Disponível");
        produtoList.add(produto);
        produto = new Produto("Mouse Sem Fio", 88.00 , "Mouse Sem Fio com Bluetooth Recarregável ", 27, "Disponível");
        produtoList.add(produto);
        produto = new Produto("Teclado Gamer", 40.00 , "Teclado Gamer Semi Mecânico Multimídia", 50, "Disponível");
        produtoList.add(produto);
    }
}


