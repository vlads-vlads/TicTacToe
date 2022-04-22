package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PlayerSetup1 extends AppCompatActivity {

    private EditText player1;
    private String computer = "computer";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_setup1);

        player1 = findViewById(R.id.editTextTextPersonName3);
    }

    public void submitButtonClick1(View view) {
        String player1name = player1.getText().toString();
        Intent intent = new Intent(this, GameDisplay.class);
        intent.putExtra("PLAYER_NAMES", new String [] {player1name, computer});
        startActivity(intent);
    }
}