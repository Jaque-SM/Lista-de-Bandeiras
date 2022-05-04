package com.example.listarbandeiras;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class BandeiraAdapter extends BaseAdapter {

    private final Context context;
    private final List<Bandeira> bandeiras;

    public BandeiraAdapter(Context context, List<Bandeira> bands){
        this.context= context;
        this.bandeiras= bands;

    }
    @Override
    public int getCount() {
        return bandeiras!=null ? bandeiras.size():0;
    }

    @Override
    public Object getItem(int i) {
        return bandeiras.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
       View view= LayoutInflater.from(context).inflate(R.layout.adapter_bandeira, parent, false);
        TextView tex=view.findViewById(R.id.NomeBandeira);
        ImageView img=view.findViewById(R.id.imgBandeira);

        Bandeira ava=bandeiras.get(i);

        tex.setText(ava.getNome_pais());
        img.setImageResource(ava.getImgId());

        return view;
    }
}
