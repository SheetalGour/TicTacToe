package com.example.sheetalgour.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
private String currentplayer = "";
private String computer = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button pressToStart = (Button)findViewById(R.id.press_to_start);
        pressToStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "GAME STAERTED", Toast.LENGTH_SHORT).show();
                if (!currentplayer.equals("") && !computer.equals("")) {
                    Intent start_game_intent = new Intent(MainActivity.this,GameActivity.class);
                    start_game_intent.putExtra("player", currentplayer);
                    start_game_intent.putExtra("computer",computer);
                    startActivity(start_game_intent);
                }
            }
        });



            Button ButtonX = (Button)findViewById(R.id.ButtonX);
            Button ButtonO = (Button)findViewById(R.id.ButtonO);
            ButtonX.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View view) {
                                               Toast.makeText(MainActivity.this, "Player X", Toast.LENGTH_SHORT).show();
                                              currentplayer = "X";
                                              computer = "O";

                                           }
                                       });
        ButtonO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Player O", Toast.LENGTH_SHORT).show();
                currentplayer = "O";
                computer = "X";

            }
        });



                    //TODO Store user choice in a variable
                    //TODO Setup computer variable
                    //TODO Draw a Grid


    }
}
