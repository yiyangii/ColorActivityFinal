package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    View layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> items = new ArrayList<String>();
        items.add("Color:");

        items.add("RED");
        items.add("YELLOW");
        items.add("GREEN");
        items.add("LIGHTGREY");
        items.add("BLUE");
        items.add("GRAY");

        spinner = findViewById(R.id.spinner);
        layout = findViewById(R.id.layout);

        final BaseAdapter adapter = new ColorAdapter(this,items);
        spinner.setAdapter(adapter);
        spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                view.setBackgroundColor(Color.WHITE);
                if(spinner.getSelectedItem().toString().equals(("RED"))){
                    layout.setBackgroundColor(Color.RED);
                }else if(spinner.getSelectedItem().toString().equals(("YELLOW"))){
                    layout.setBackgroundColor(Color.YELLOW);
                }else if(spinner.getSelectedItem().toString().equals(("GREEN"))){
                    layout.setBackgroundColor(Color.GREEN);
                }else if(spinner.getSelectedItem().toString().equals(("LIGHTGREY"))){
                    layout.setBackgroundColor(Color.LTGRAY);
                }else if(spinner.getSelectedItem().toString().equals(("BLUE"))){
                    layout.setBackgroundColor(Color.BLUE);
                }else if(spinner.getSelectedItem().toString().equals(("GRAY"))){
                    layout.setBackgroundColor(Color.GRAY);
                }
            }
        });

    }
}