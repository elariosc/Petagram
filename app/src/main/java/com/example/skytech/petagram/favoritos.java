package com.example.skytech.petagram;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by skytech on 29/05/2016.
 */
public class favoritos extends AppCompatActivity {
    ArrayList<Mascota> favoritos;
    private RecyclerView listaFavoritos;

    public void onCreate (Bundle savedIntanceState){
        super.onCreate(savedIntanceState);
        setContentView(R.layout.favoritos);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);




        listaFavoritos = (RecyclerView) findViewById(R.id.rvFavoritas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaFavoritos.setLayoutManager(llm);
        inicializarListaFavoritos();
        inicializarAdaptador2();
    }


    public void inicializarAdaptador2(){
        MascotaAdaptador adaptador = new MascotaAdaptador(favoritos);
        listaFavoritos.setAdapter(adaptador);
    }

    public void inicializarListaFavoritos() {
      favoritos = new ArrayList<Mascota>();

        favoritos.add(new Mascota(R.drawable.perro, "Perro", "14"));
        favoritos.add(new Mascota(R.drawable.ardilla, "Ardilla", "5"));
        favoritos.add(new Mascota(R.drawable.lemur, "Lemur", "4"));
        favoritos.add(new Mascota(R.drawable.pollo, "Pollo", "4"));
        favoritos.add(new Mascota(R.drawable.hamster, "Hamster", "3"));




    }
}
