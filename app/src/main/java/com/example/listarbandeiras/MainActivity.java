package com.example.listarbandeiras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    //cria uma lista do tipo Bandeira instanciando obj da classe
    List<Bandeira> bands;
    ListView lvOpcoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //a lista de opcoes recebe o listview da interface
        this.lvOpcoes=findViewById(R.id.lista);

        //a lista de bandeiras recebe o metodo de dados das bandeiras
        //da classe Bandeira
        this.bands=Bandeira.bandeiras();

        //a lista do Listview vai setar cada um com a classe do Adptador
        this.lvOpcoes.setAdapter(new BandeiraAdapter(this, bands));

        //setando classe para ser usada aqui mesma
        this.lvOpcoes.setOnItemClickListener(this);

    }

    /*metodo de listar todos as bandeiras cm seus nomes e ao mesmo tempo
    mostrar ao serem clickados*/
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Bandeira aba=(Bandeira) adapterView.getAdapter().getItem(i);

        Intent tent = new Intent(this, InformacaoActivity.class);
        Bundle parametro = new Bundle();

        parametro.putInt("id",(int) l);
        tent.putExtras(parametro);
        startActivity(tent);



    }

}