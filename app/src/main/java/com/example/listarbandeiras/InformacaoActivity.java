package com.example.listarbandeiras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class InformacaoActivity extends AppCompatActivity {

    public ImageView img;
    public ImageView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacao);

        Bundle args = getIntent().getExtras();
        int indicePais = args.getInt("id");
        Bandeira pais = Bandeira.bandeiras().get(indicePais);

        img = findViewById(R.id.bandeira);
        img.setImageResource(pais.getImgId());

        view = findViewById(R.id.imagem);
        view.setImageResource(pais.getImgDados());
    }
}