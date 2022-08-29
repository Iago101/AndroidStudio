package br.edu.ifsp.arq.ads.dmos5.appaula3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class Tela2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();

        String nome = intent.getStringExtra("nome");
        int idade = intent.getIntExtra("idade", -1);

        Pessoa pessoa = (Pessoa) intent.getSerializableExtra("pessoa");

        Toast.makeText(this, "Nome: " + nome + "\nIdade: " + idade +
                "\nNome 2: " + pessoa.getNome() +
                        "\nIdade 2: " + pessoa.getIdade(),
                Toast.LENGTH_SHORT).show();


        Log.d("ciclo", getClassName() + ".onCreate() foi chamado.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ciclo", getClassName() + ".onStart() foi chamado.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ciclo", getClassName() + ".onResume() foi chamado.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ciclo", getClassName() + ".onPause() foi chamado.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ciclo", getClassName() + ".onStop() foi chamado.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ciclo", getClassName() + ".onRestart() foi chamado.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ciclo", getClassName() + ".onDestroy() foi chamado.");
    }

    private String getClassName() {
        String nomeClasse = getClass().getName();
        return nomeClasse.substring(nomeClasse.lastIndexOf("."));
    }
}