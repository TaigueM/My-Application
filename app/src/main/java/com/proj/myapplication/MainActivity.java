package com.proj.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button1, button2, button3;
    private TextView txv;
    private boolean appearrule = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button1.setX(350);
        button1.setY(500);

        button2 = (Button) findViewById(R.id.buttonrule);
        button2.setX(350);
        button2.setY(750);

        button3 = (Button) findViewById(R.id.buttonHowto);
        button3.setX(350);
        button3.setY(1000);

        txv = (TextView) findViewById(R.id.textrules);
        txv.setX(35);
        txv.setY(1200);
        txv.setTextSize(15);


    button1.setOnClickListener( new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            openAct2();
        }
    });

        button2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (appearrule== false){
               txv.setText("Sudoku is played on a grid of 9*9 spaces. Within the Rows and Columns are"
               + " 9 'Squares' of 3*3 spaces. Each row, column and squares need to be filled oout"+
                       " with numbers 1-9, without repeating digits within the rows, columns and squares "+
                       "The play wins as a result of filling the board with this criteria");
                appearrule = true;}
                else{
                    txv.setText("");
                    appearrule = false;
                }
            }
        });

        button3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (appearrule== false){
                    txv.setText("A grid will be created at the start of the game. The 'Blue' coloured numbers are the set values of the board. "+
                            "The player can access the board by tapping on the blank or 'black' coloured numbers and the number will increase (up to 9) "+
                            "until the player is satisfied with the number provided. The game will provided commentary of whether the board is completely filled and whether it is correct or not. "+
                            "WHen the board is correct the player will be notified that the board is complete");
                    appearrule = true;}
                else{
                    txv.setText("");
                    appearrule = false;
                }
            }
        });



    }

    public void openAct2(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}