package com.example.skytech.petagram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    ImageButton next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next = (ImageButton)findViewById(R.id.imgButton);


next.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this,favoritos.class);
        startActivity(intent);
    }
});


        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();
    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas() {
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.ardilla, "Ardilla", "5"));
        mascotas.add(new Mascota(R.drawable.hamster, "Hamster", "3"));
        mascotas.add(new Mascota(R.drawable.lemur, "Lemur", "4"));
        mascotas.add(new Mascota(R.drawable.obeja, "Obeja", "0"));
        mascotas.add(new Mascota(R.drawable.perro, "Perro", "14"));
        mascotas.add(new Mascota(R.drawable.pollo, "Pollo", "4"));
        mascotas.add(new Mascota(R.drawable.raton, "Raton", "2"));
        mascotas.add(new Mascota(R.drawable.vaca, "Vaca", "2"));

    }

}

