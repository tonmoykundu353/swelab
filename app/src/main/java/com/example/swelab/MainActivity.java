 package com.example.swelab;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4;
    TextView textView;
    int i = 0,j=0,k=0,l=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);

        textView = findViewById(R.id.textView);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i+=1;

                if(i%2!=0)textView.setText("M name is  odd!") ;
                else textView.setText("my name is Even!");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                j+=1;

                if(j%2!=0)textView.setText("Rony odd!") ;
                else textView.setText("Rony Even!");

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                k+=1;

                if(k%2!=0)textView.setText("iqbal odd!") ;
                else textView.setText("iqbal Even!");

            }
        }); btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                l+=1;

                if(l%2!=0)textView.setText("tanjim odd!") ;
                else textView.setText("tanjim Even!");

            }
        });


    }
}