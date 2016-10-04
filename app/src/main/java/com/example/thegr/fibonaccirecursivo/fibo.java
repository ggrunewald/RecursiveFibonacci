package com.example.thegr.fibonaccirecursivo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class fibo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibo);

        final Button button = (Button) findViewById(R.id.button_fibo);

        final TextView txtresultado = (TextView) findViewById(R.id.text_fibo_result);

        final EditText editindice = (EditText) findViewById(R.id.edit_fibo_index);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editindice.getText().length() == 0)
                {
                    Toast toast = Toast.makeText(getApplicationContext(), "Escolha um índice", Toast.LENGTH_SHORT);
                    toast.show();

                    return;
                }

                int max = Integer.parseInt(editindice.getText().toString());

                if(max <=0 || max >= 90)
                {
                    Toast toast = Toast.makeText(getApplicationContext(), "Escolha um índice entre 1 e 89", Toast.LENGTH_SHORT);
                    toast.show();

                    return;
                }
                else
                {
                    if(max == 1)
                    {
                        txtresultado.setText("O 1º elemento é 0");
                        return;
                    }
                    else
                    {
                        txtresultado.setText("O " + max + "º elemento é " + fibonacci(max));
                    }
                }
            }
        });
    }

    private int fibonacci(int max) {
        if(max <= 3)
            return 1;
        else
            return fibonacci(max - 1) + fibonacci(max - 2);
    }
}
