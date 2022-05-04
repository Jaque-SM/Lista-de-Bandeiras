package com.example.listarbandeiras;

import java.util.ArrayList;
import java.util.List;

public class Bandeira {

    private String nome_pais;
    private int imgId;
    private int imgDados;


    public Bandeira(String nome_pais, int imgId, int imgDados) {
        this.nome_pais = nome_pais;
        this.imgId=imgId;
        this.imgDados=imgDados;

    }
    public String getNome_pais() {
        return nome_pais;
    }

    public int getImgId() {
        return imgId;
    }

    public int getImgDados() {
        return imgDados;
    }

    //list que vai printar as bandeiras e seus respectivos paises:
    public static List<Bandeira> bandeiras() {

        List<Bandeira> bands = new ArrayList<Bandeira>();
        bands.add(new Bandeira("Afeganistão",R.drawable.afeganistao, R.drawable.dados_afeganistao));
        bands.add(new Bandeira("Arábia", R.drawable.arabia, R.drawable.dados_arabia));
        bands.add(new Bandeira("Alemanha", R.drawable.alemanha, R.drawable.dados_alemanha));
        bands.add(new Bandeira("Brazil", R.drawable.brazil, R.drawable.dados_brazil));
        bands.add(new Bandeira("Noruega", R.drawable.noruega, R.drawable.dados_noruega));
        bands.add(new Bandeira("Japão", R.drawable.japao, R.drawable.dados_japao));
        bands.add(new Bandeira("Reino Unido", R.drawable.reino_unido,R.drawable.dados_reino_unido));
        bands.add(new Bandeira("China", R.drawable.china, R.drawable.dados_china));
        bands.add(new Bandeira("Estados Unidos", R.drawable.eua, R.drawable.dados_eua));
        bands.add(new Bandeira("Israel", R.drawable.israel, R.drawable.dados_israel));
        bands.add(new Bandeira("Índia", R.drawable.india, R.drawable.dados_india));
        return  bands;
    }

}
