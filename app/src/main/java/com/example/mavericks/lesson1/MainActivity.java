package com.example.mavericks.lesson1;

import android.content.Intent;
import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView list;
    ArrayList<String> myContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myContacts = new ArrayList();
        myContacts.add("Tom");
        myContacts.add("Jerry");
        myContacts.add("Mario");

        list = findViewById(R.id.myContactsList);


        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, myContacts);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String name = myContacts.get(i);
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("contactName", name);

                startActivity(intent);



            }
        });




    }
}
