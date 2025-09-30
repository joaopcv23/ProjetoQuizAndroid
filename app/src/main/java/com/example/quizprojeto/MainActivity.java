package com.example.quizprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txvPergunta;

    RadioGroup rdgPrincipal;

    Button btnResponder;

    int pontuacao = 0;

    int indicePergunta = 0;

    String [] perguntas = {
            "p1", "p2", "p3, ",
            "p4", "p5"
    };

    int[] respostasCorretas= {
            R.id.rb_a,
                    R.id.rb_a,
        R.id.rb_b,
        R.id.rb_c,
        R.id.rb_d
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}