package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SpaceResultsActivity extends AppCompatActivity {
    private TextView mSpaceOutputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space_results);

        mSpaceOutputText = (TextView) findViewById(R.id.spaceOutputText);

        Intent intent = getIntent();
        String color = intent.getStringExtra("color");
        String noun1 = intent.getStringExtra("noun1");
        String noun2 = intent.getStringExtra("noun2");
        String noun3 = intent.getStringExtra("noun3");
        String famousPlace = intent.getStringExtra("famousPlace");
        String adj1 = intent.getStringExtra("adj1");
        String adj2 = intent.getStringExtra("adj2");
        String adj3 = intent.getStringExtra("adj3");
        String adj4 = intent.getStringExtra("adj4");
        String verb = intent.getStringExtra("verb");

        mSpaceOutputText.setText("Last night, I dreamed that I went surfing in outer space.\n\nI strapped my surfboard to my "+color+noun1+" and traveled to Saturn’s largest moon, Titan. When I got there, I found "+noun2+", rivers, and"+noun3+". It looked a little bit like "+famousPlace+"! But best of all, I found huge lakes full of a "+adj1+" liquid.\n\nI felt the "+adj2+" wind pick up and all of a sudden I saw waves. I couldn’t wait to jump in! I paddled through the lake and caught a "+adj3+" wave. As I surfed toward the"+adj4+"shore, I saw Saturn’s rings in the sky above me. I woke up and realized I was only "+verb+". But I still wondered if it might be possible to go surfing somewhere besides Earth someday.");
    }
}
