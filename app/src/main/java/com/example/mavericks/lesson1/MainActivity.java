package com.example.mavericks.lesson1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView myText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.myBtn);
        myText = findViewById(R.id.myText);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myText.setText("IOS BEST");
            }
        });





    }

}
