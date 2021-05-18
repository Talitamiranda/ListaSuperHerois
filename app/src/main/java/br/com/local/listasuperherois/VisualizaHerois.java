package br.com.local.listasuperherois;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class VisualizaHerois extends AppCompatActivity {

    TextView txtHerois; // aqui são as variáveis
    ImageView imgHerois;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visualiza_herois);

        //txtHerois e img Herois tem que estar igual na variável a cima

        //mtxtHerois e mimgHerois tem que estar com o nome igual na vizualiza_herois.xml
        txtHerois = findViewById(R.id.mtxtHerois);
        imgHerois = findViewById(R.id.mimgHerois);

        //Receber o valor de outra janela
        Intent intent = getIntent();

        //Recebendo os valores pela variável declarada na janela de origem

        String nHerois = intent.getStringExtra("nomeHerois");
        int mHerois = intent.getIntExtra("imagemHerois",0);

        //Inserindo os valores nos componentes
        txtHerois.setText(nHerois);
        imgHerois.setImageResource(mHerois);
    }
}