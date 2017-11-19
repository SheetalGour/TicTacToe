package com.example.sheetalgour.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class GameActivity extends AppCompatActivity {
    private String currentplayer = "";
    private String computer = "";
    private String player1 = "";
    private List<String> gameState = new ArrayList<>(9);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        player1 = getIntent().getStringExtra("player");
        computer = getIntent().getStringExtra("computer");

        for (int i = 0; i < 9; i++) {
            gameState.add(i, "");

        }
        ((Button) findViewById(R.id.b0)).setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                userClicked(0);
            }
        });
        ((Button) findViewById(R.id.b1)).setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                userClicked(1);
            }
        });
        ((Button) findViewById(R.id.b2)).setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                userClicked(2);
            }
        });
        ((Button) findViewById(R.id.b3)).setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                userClicked(3);
            }
        });
        ((Button) findViewById(R.id.b4)).setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                userClicked(4);
            }
        });
        ((Button) findViewById(R.id.b5)).setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                userClicked(5);
            }
        });
        ((Button) findViewById(R.id.b6)).setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                userClicked(6);
            }
        });
        ((Button) findViewById(R.id.b7)).setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                userClicked(7);
            }
        });
        ((Button) findViewById(R.id.b8)).setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                userClicked(8);
            }

        });
    }
//

    private void updateSquares(int n, String text) {
        Button button = null;
        switch (n) {
            case 0:
                button = (Button) findViewById(R.id.b0);
                break;
            case 1:
                button = (Button) findViewById(R.id.b1);
                break;
            case 2:
                button = (Button) findViewById(R.id.b2);
                break;
            case 3:
                button = (Button) findViewById(R.id.b3);
                break;
            case 4:
                button = (Button) findViewById(R.id.b4);
                break;
            case 5:
                button = (Button) findViewById(R.id.b5);
                break;
            case 6:
                button = (Button) findViewById(R.id.b6);
                break;
            case 7:
                button = (Button) findViewById(R.id.b7);
                break;
            case 8:
                button = (Button) findViewById(R.id.b8);
                break;
        }
        button.setText(text);
    }

    public void userClicked(int n) {

        if (gameState.get(n).equals("")) {
            if (currentplayer == player1) {
                currentplayer = computer;

            } else {
                currentplayer = player1;
            }

            gameState.set(n, currentplayer);
            updateSquares(n, currentplayer);
        }
        if(gameState.get(0).equals(gameState.get(1)) && gameState.get(1).equals(gameState.get(2)) && gameState.get(0) != ""){
            String winner = gameState.get(0);
            Toast.makeText(GameActivity.this, "WINNER " + currentplayer, Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, MainActivity.class));
            

        }
        else if (gameState.get(3).equals(gameState.get(4)) && gameState.get(4).equals(gameState.get(5)) && gameState.get(3) != "") {
            String winner = gameState.get(3);
            Toast.makeText(GameActivity.this, "WINNER " + currentplayer, Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, MainActivity.class));
        }
        else if (gameState.get(6).equals(gameState.get(7)) && gameState.get(7).equals(gameState.get(8)) && gameState.get(6) != "") {
            String winner = gameState.get(6);
            Toast.makeText(GameActivity.this, "WINNER " + currentplayer, Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, MainActivity.class));
        }
        else if (gameState.get(0).equals(gameState.get(3)) && gameState.get(3).equals(gameState.get(6)) && gameState.get(0) != "") {
            String winner = gameState.get(0);
            Toast.makeText(GameActivity.this, "WINNER " + currentplayer, Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, MainActivity.class));
        }
        else if (gameState.get(1).equals(gameState.get(4)) && gameState.get(4).equals(gameState.get(7)) && gameState.get(1) != "") {
            String winner = gameState.get(1);
            Toast.makeText(GameActivity.this, "WINNER " + currentplayer, Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, MainActivity.class));


        }
        else if (gameState.get(2).equals(gameState.get(5)) && gameState.get(5).equals(gameState.get(8))&& gameState.get(2) != "") {
            String winner = gameState.get(2);
            Toast.makeText(GameActivity.this, "WINNER " + currentplayer, Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, MainActivity.class));

        }
        else if (gameState.get(0).equals(gameState.get(4)) && gameState.get(4).equals(gameState.get(8)) && gameState.get(0) != "") {
            String winner = gameState.get(0);
            Toast.makeText(GameActivity.this, "WINNER " + currentplayer, Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, MainActivity.class));

        }
        else if (gameState.get(2).equals(gameState.get(4)) && gameState.get(4).equals(gameState.get(6)) && gameState.get(2) != "") {
            String winner = gameState.get(2);
            Toast.makeText(GameActivity.this, "WINNER " + currentplayer, Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, MainActivity.class));

        } else if (!gameState.get(0).equals("") &&
                    !gameState.get(1).equals("") &&
                    !gameState.get(2).equals("") &&
                    !gameState.get(3).equals("") &&
                    !gameState.get(4).equals("") &&
                    !gameState.get(5).equals("") &&
                    !gameState.get(6).equals("") &&
                    !gameState.get(7).equals("") &&
                    !gameState.get(8).equals(""))
        {
            Toast.makeText(GameActivity.this, "TIE", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, MainActivity.class));


        }

// version 1

        //TODO: tic tac toe algorithm goes here

    };
}
//}
