package com.example.pm1_tarea11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class activity_principal extends AppCompatActivity {
    EditText tx1, tx2;
    Button btm, bt1, bt2, bt3, bt4;
    TextView t1,t2,t3,t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        tx1 = (EditText) findViewById(R.id.txn1);
        tx2 = (EditText) findViewById(R.id.txn2);
        t1 = (TextView) findViewById(R.id.txsum);
        t2 = (TextView) findViewById(R.id.txres);
        t3 = (TextView) findViewById(R.id.txmul);
        t4 = (TextView) findViewById(R.id.txdiv);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);



        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor1= t1.getText().toString();
                String valor2=t2.getText().toString();

                int total = Integer.parseInt(valor1) + Integer.parseInt(valor2);

                String resul = String.valueOf(total);

                Intent intent = new Intent(getApplicationContext(),p2_activity.class);
                intent.putExtra("resultado", resul );

                startActivity(intent);


            }
        });


        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor1= t1.getText().toString();
                String valor2=t1.getText().toString();

                int total = Integer.parseInt(valor1) - Integer.parseInt(valor2);

                String resul = String.valueOf(total);

                Intent intent = new Intent(getApplicationContext(),p2_activity.class);
                intent.putExtra("resultado", resul );

                startActivity(intent);
            }
        });



        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor1= t1.getText().toString();
                String valor2=t2.getText().toString();

                int total = Integer.parseInt(valor1) * Integer.parseInt(valor2);

                String resul = String.valueOf(total);

                Intent intent = new Intent(getApplicationContext(),p2_activity.class);
                intent.putExtra("resultado", resul );

                startActivity(intent);
            }
        });



        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor1= t1.getText().toString();
                String valor2=t1.getText().toString();

                int total = Integer.parseInt(valor1) / Integer.parseInt(valor2);

                String resul = String.valueOf(total);

                Intent intent = new Intent(getApplicationContext(),p2_activity.class);
                intent.putExtra("resultado", resul );

                startActivity(intent);
            }
        });

    }
}
