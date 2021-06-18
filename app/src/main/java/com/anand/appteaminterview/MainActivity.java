package com.anand.appteaminterview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Model> model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this,
                RecyclerView.VERTICAL,false));

        Model ob1,ob2,ob3,ob4,ob5,ob6,ob7,ob8,ob9,ob10;
        model = new ArrayList<>();
        ob1 = new Model(R.drawable.ic_thai,"11.30AM to 11PM","Good Thai"
                ,"20, Queen Street, NSW","Asian, Thai","4.8");
        ob2 = new Model(R.drawable.ic_sushi,"11.30AM to 11PM","Sushi Car"
                ,"19, Morningview Lane, IA","Asian, Japanese","4.3");
        ob3 = new Model(R.drawable.ic_rolls,"11.30AM to 11PM","Blacksmith Cafe"
                ,"29, Viking Drive, OH","Western","3.8");
        ob4 = new Model(R.drawable.ic_pizza,"11.30AM to 11PM","Pizza Box"
                ,"18, Marion Drive, NY","Western, Italian","4.5");
        ob5 = new Model(R.drawable.ic_burger,"11.30AM to 11PM","Big Smoke Burger"
                ,"74, Green Hill Road, PA","Western","3.2");
        ob6 = new Model(R.drawable.ic_toast,"11.30AM to 11PM","The Steam Room"
                ,"5, Cedar Lane, MA","Western","4.0");
        ob7 = new Model(R.drawable.ic_pasta,"11.30AM to 11PM","The Olive Garden"
                ,"96, Deans Lane, NY","Italian","3.7");
        ob8 = new Model(R.drawable.ic_pie,"11.30AM to 11PM","Boston Barista"
                ,"18, Elm Drive, AR","Western","3.3");
        ob9 = new Model(R.drawable.ic_tandoori,"11.30AM to 11PM","Taj Masala"
                ,"96, Langtown Road, IA","Asian, Indian","4.9");
        ob10 = new Model(R.drawable.ic_tacos,"Mexican","Del Taco"
                ,"8, Stroop Hill Road, GA","Asian, Thai","2.7");


        model.add(ob1);
        model.add(ob2);
        model.add(ob3);
        model.add(ob4);
        model.add(ob5);
        model.add(ob6);
        model.add(ob7);
        model.add(ob8);
        model.add(ob9);
        model.add(ob10);
        model.add(ob1);
        model.add(ob2);
        model.add(ob3);
        model.add(ob4);
        model.add(ob5);
        model.add(ob6);
        model.add(ob7);
        model.add(ob8);
        model.add(ob9);
        model.add(ob10);

        recyclerView.setAdapter(new Adapter(model));

    }
}