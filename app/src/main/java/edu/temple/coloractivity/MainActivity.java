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
    // inital layout spinner layour view
    Spinner spinner;
    View layout;

    ArrayList<String> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        layout = findViewById(R.id.layoutview);

        items = new ArrayList<>();

        items.add("Selecte Color");
        items.add("BLACK");
        items.add("BLUE");
        items.add("CYAN");
        items.add("DKGRAY");
        items.add("GRAY");
        items.add("GREEN");
        items.add("LTGRAY");
        items.add("MAGENTA");
        items.add("RED");
        items.add("TRANSPARENT");



        final BaseAdapter coloradapter = new ColorAdapter(this, items);
        spinner.setAdapter(coloradapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                view.setBackgroundColor(Color.WHITE);
                if (spinner.getSelectedItem().toString().equals("BLACK")) {
                    layout.setBackgroundColor(Color.BLACK);
                } else if (spinner.getSelectedItem().toString().equals("BLUE")) {
                    layout.setBackgroundColor(Color.BLUE);
                } else if (spinner.getSelectedItem().toString().equals("CYAN")) {
                    layout.setBackgroundColor(Color.CYAN);
                } else if (spinner.getSelectedItem().toString().equals("DKGRAY")) {
                    layout.setBackgroundColor(Color.DKGRAY);
                } else if (spinner.getSelectedItem().toString().equals("GRAY")) {
                    layout.setBackgroundColor(Color.GRAY);
                }else if (spinner.getSelectedItem().toString().equals("GREEN")) {
                    layout.setBackgroundColor(Color.GREEN);
                }else if (spinner.getSelectedItem().toString().equals("LTGRAY")) {
                    layout.setBackgroundColor(Color.LTGRAY);
                }else if (spinner.getSelectedItem().toString().equals("MAGENTA")) {
                    layout.setBackgroundColor(Color.MAGENTA);
                }else if (spinner.getSelectedItem().toString().equals("RED")) {
                    layout.setBackgroundColor(Color.RED);
                }else if (spinner.getSelectedItem().toString().equals("TRANSPARENT")) {
                    layout.setBackgroundColor(Color.TRANSPARENT);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}