package com.example.i.letterheadmaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;

public class GridView extends AppCompatActivity {


    ArrayList<String> numberlist = new ArrayList<>();
    //ArrayList<Integer> icons = new ArrayList<>();

    android.widget.GridView grid;
    String[] web = {
            "Design1",
            "Design2",
            "Design3",
            "Design4",
            "Design5"

    };
    int[] imageId = {
            R.drawable.twolines,
            R.drawable.design2,
            R.drawable.design3,
            R.drawable.design4,
            R.drawable.design5

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        CustomGrid adapter = new CustomGrid(GridView.this, web, imageId);
        grid = (android.widget.GridView) findViewById(R.id.grid);
        grid.setAdapter(adapter);
        /*grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });*/

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent,
                                    View v, int position, long id) {

                String categorylower = web[position].toString();
               // String category = categorylower.substring(0, 1).toUpperCase() + categorylower.substring(1);
                // Send intent to SingleViewActivity

                if (categorylower.equals("Design1")){
                    Intent i = new Intent(getApplicationContext(), temp.class);
                    i.putExtra("design","d1");
                    startActivity(i);

                }
                else if(categorylower.equals("Design2")){
                    Intent i = new Intent(getApplicationContext(), temp.class);
                    i.putExtra("design","d2");
                    startActivity(i);
                }
                else if(categorylower.equals("Design3")){
                    Intent i = new Intent(getApplicationContext(), temp.class);
                    i.putExtra("design","d3");
                    startActivity(i);
                }
                else if(categorylower.equals("Design4")){
                    Intent i = new Intent(getApplicationContext(), temp.class);
                    i.putExtra("design","d4");
                    startActivity(i);
                }
                else {
                    Intent i = new Intent(getApplicationContext(), temp.class);
                    i.putExtra("design","d5");
                    startActivity(i);
                }


               // Intent i = new Intent(getApplicationContext(), Create.class);              //getApplicationContext()

                // Pass image index
                //i.putExtra("category", category);
                //startActivity(i);
            }
        });

    }

}

