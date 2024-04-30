package com.example.lugaluga.view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lugaluga.R;
import com.example.lugaluga.model.Produto;

import java.util.List;

public class AdapterProduto extends RecyclerView.Adapter<AdapterProduto.ViewHolder> {

    private List<Produto> produtolist;

    public AdapterProduto(List<Produto> produtolist) {
        this.produtolist = produtolist;
    }

    @NonNull
    @Override
    public AdapterProduto.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View listaProdutos = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_produto, parent, false);

        return new ViewHolder(listaProdutos);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterProduto.ViewHolder holder, int position) {
        holder.nomeProd.setText(produtolist.get(position).getNome());
        holder.valorProd.setText(String.valueOf(produtolist.get(position).getValor()));
        holder.descProd.setText(produtolist.get(position).getDescricao());
    }


    @Override
    public int getItemCount() {
        return produtolist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView nomeProd, valorProd, descProd;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nomeProd = itemView.findViewById(R.id.tv_nomeProduto);
            valorProd = itemView.findViewById(R.id.tv_valorProd);
            descProd = itemView.findViewById(R.id.tv_descProd);

        }
    }
}
