package br.edu.ifsp.arq.ads.dmos5.appaula3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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

    }
}