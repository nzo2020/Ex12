package com.example.ex12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView tv, tv2, tv3, tv4, tv5, tv6;
    EditText etn, etn2, etn3;
    ImageView iv, iv2, iv3;
    Button bt, bt2, bt3, bt4;
    int num1, num2, num3, num4, sum1, sum2, sum3;
    int answer1, answer2, answer3;

    int counter = 0;
    public static Random rnd = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);

        etn = findViewById(R.id.etn);
        etn2 = findViewById(R.id.etn2);
        etn3 = findViewById(R.id.etn3);

        iv = findViewById(R.id.iv);
        iv2 = findViewById(R.id.iv2);
        iv3 = findViewById(R.id.iv3);

        bt = findViewById(R.id.bt);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);

        startGame();
    }

    public void startGame() {
        num1 = rnd.nextInt(89) + 10;
        num2 = rnd.nextInt(89) + 10;

        tv.setText(String.valueOf(num1));
        tv4.setText(String.valueOf(num2));

        etn.setVisibility(View.VISIBLE);
        bt2.setVisibility(View.VISIBLE);
    }

    public void clicked2(View view) {
        String st = etn.getText().toString();
        if (st.isEmpty()) {
            Toast.makeText(this, "Please enter the answer!", Toast.LENGTH_SHORT).show();
        } else {
            answer1 = Integer.parseInt(st);
            sum1 = num1 + num2;
            iv.setVisibility(View.VISIBLE);

            if (answer1 == sum1) {
                counter++;
                iv.setImageResource(R.drawable.vi);
            } else {
                iv.setImageResource(R.drawable.xi);
            }

            tv5.setText(String.valueOf(sum1));
            num3 = rnd.nextInt(89) + 10;
            tv2.setText(String.valueOf(num3));

            tv5.setVisibility(View.VISIBLE);
            tv2.setVisibility(View.VISIBLE);

            etn2.setVisibility(View.VISIBLE);
            bt3.setVisibility(View.VISIBLE);
        }
    }

    public void clicked3(View view) {
        sum2 = sum1 + num3;
        String st1 = etn2.getText().toString();

        if (st1.isEmpty()) {
            Toast.makeText(this, "Please enter the answer!", Toast.LENGTH_SHORT).show();
        } else {
            answer2 = Integer.parseInt(st1);
            iv2.setVisibility(View.VISIBLE);

            if (answer2 == sum2) {
                counter++;
                iv2.setImageResource(R.drawable.vi);
            } else {
                iv2.setImageResource(R.drawable.xi);
            }

            tv6.setText(String.valueOf(sum2));
            num4 = rnd.nextInt(89) + 10;
            tv3.setText(String.valueOf(num4));

            tv6.setVisibility(View.VISIBLE);
            tv3.setVisibility(View.VISIBLE);

            etn3.setVisibility(View.VISIBLE);
            bt4.setVisibility(View.VISIBLE);
        }
    }





    public void clicked4(View view) {
        sum3 = sum2 + num4;
        String st2 = etn3.getText().toString();

        if (st2.isEmpty()) {
            Toast.makeText(this, "Please enter the answer!", Toast.LENGTH_SHORT).show();
        } else {
            answer3 = Integer.parseInt(st2);
            iv3.setVisibility(View.VISIBLE);

            if (answer3 == sum3) {
                counter++;
                iv3.setImageResource(R.drawable.vi);
            } else {
                iv3.setImageResource(R.drawable.xi);
            }
        }

        switch (counter) {
            case 0:
                Toast.makeText(this, "Your score: 0%, 0/3", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(this, "Your score: 33%, 1/3", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this, "Your score: 66%, 2/3", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(this, "Your score: 100%, 3/3", Toast.LENGTH_SHORT).show();
                break;
        }

        bt.setVisibility(View.VISIBLE);
    }

    public void clicked(View view) {
        counter = 0;
        tv2.setVisibility(View.INVISIBLE);
        tv3.setVisibility(View.INVISIBLE);
        tv5.setVisibility(View.INVISIBLE);
        tv6.setVisibility(View.INVISIBLE);

        etn.setVisibility(View.INVISIBLE);
        etn2.setVisibility(View.INVISIBLE);
        etn3.setVisibility(View.INVISIBLE);

        iv.setVisibility(View.INVISIBLE);
        iv2.setVisibility(View.INVISIBLE);
        iv3.setVisibility(View.INVISIBLE);

        etn.setText("");
        etn2.setText("");
        etn3.setText("");

        bt.setVisibility(View.INVISIBLE);
        bt2.setVisibility(View.INVISIBLE);
        bt3.setVisibility(View.INVISIBLE);
        bt4.setVisibility(View.INVISIBLE);

        startGame();
    }
}
